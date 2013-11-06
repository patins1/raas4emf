/**
 * Copyright 2013 Smart Services CRC Pty Ltd
 */
package org.eclipse.jqvt.jvmmodel;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.jqvt.jQVT.ObjectTemplate;
import org.eclipse.jqvt.jQVT.PropertyTemplateItem;
import org.eclipse.jqvt.jQVT.Relation;
import org.eclipse.jqvt.jQVT.RelationDomain;
import org.eclipse.jqvt.jQVT.Transformation;
import org.eclipse.jqvt.util.JQVTUtils;
import org.eclipse.xtext.common.types.JvmTypeReference;
import org.eclipse.xtext.validation.ValidationMessageAcceptor;
import org.eclipse.xtext.xbase.XAssignment;
import org.eclipse.xtext.xbase.XBinaryOperation;
import org.eclipse.xtext.xbase.XExpression;
import org.eclipse.xtext.xbase.XFeatureCall;
import org.eclipse.xtext.xbase.XUnaryOperation;
import org.eclipse.xtext.xbase.XVariableDeclaration;
import org.eclipse.xtext.xbase.lib.IteratorExtensions;
import org.eclipse.xtext.xbase.typing.ITypeProvider;
import org.eclipse.xtext.xbase.typing.JvmOnlyTypeConformanceComputer;

import com.google.inject.Inject;

/**
 * Analyzes data dependencies between QVT snippets and calculates an ordering respecting data dependencies
 */
@SuppressWarnings("restriction")
public class DependencyProcessor {

	private static Map<EObject, DependencyInfo> dependencyMap = new HashMap<EObject, DependencyInfo>();

	@Inject
	private ITypeProvider _iTypeProvider;

	@Inject
	private JvmOnlyTypeConformanceComputer _jvmOnlyTypeConformanceComputer;

	@Inject
	JQVTUtils jQVTUtils;

	public void clearStaleDependencyInfos(Transformation trafo) {
		List<EObject> disposed = new ArrayList<EObject>();
		for (EObject eObject : dependencyMap.keySet()) {
			if (eObject.eResource() == null || eObject.eResource().getResourceSet() == null) {
				disposed.add(eObject);
			}
		}
		dependencyMap.keySet().removeAll(disposed);
	}

	public List<DependencyInfo> sortSnippetsOfRelation(final Relation relation) {
		Map<String, XVariableDeclaration> vars = getUniqueVars(relation);
		List<DependencyInfo> whenSnippets = new ArrayList<DependencyInfo>();
		List<DependencyInfo> whereSnippets = new ArrayList<DependencyInfo>();
		for (RelationDomain domain : relation.getDomains()) {
			if (!jQVTUtils.isTarget(domain))
				processTemplates((ObjectTemplate) domain.getRootTemplate(), whenSnippets, false, vars);
		}
		for (XExpression clause : relation.getWhen()) {
			whenSnippets.add(processExpression(clause, false));
		}
		for (RelationDomain domain : relation.getDomains()) {
			if (jQVTUtils.isTarget(domain))
				processTemplates((ObjectTemplate) domain.getRootTemplate(), whereSnippets, true, vars);
		}
		for (XExpression clause : relation.getWhere()) {
			whereSnippets.add(processExpression(clause, true));
		}
		List<DependencyInfo> sortedSnippets = new ArrayList<DependencyInfo>();
		Set<XVariableDeclaration> boundVariables = new HashSet<XVariableDeclaration>();
		Set<XVariableDeclaration> boundNonNullVariables = new HashSet<XVariableDeclaration>();
		sortSnippets(whenSnippets, boundVariables, boundNonNullVariables, sortedSnippets);
		sortSnippets(whereSnippets, boundVariables, boundNonNullVariables, sortedSnippets);
		for (DependencyInfo info : sortedSnippets)
			dependencyMap.put(info.snippet, info);
		return sortedSnippets;
	}

	private void sortSnippets(List<DependencyInfo> unsortedSnippets, Set<XVariableDeclaration> boundVariables, Set<XVariableDeclaration> boundNonNullVariables, List<DependencyInfo> sortedSnippets) {
		while (!unsortedSnippets.isEmpty()) {
			List<DependencyInfo> candidates = new ArrayList<DependencyInfo>();
			if (candidates.isEmpty()) {
				// select snippets which, if a variable is bound to null, can re-bind the variable, so that other snippets can use a non-null value;
				// otherwise, the other snippets would evaluate against variable values (namely null values) which can change later, which is inconsistent behavior
				// Preference Rule 1
				for (DependencyInfo info : unsortedSnippets) {
					if (boundVariables.containsAll(info.getReadWithoutWrite()) && !info.getWrite().isEmpty() && boundVariables.containsAll(info.getWrite()) && !boundNonNullVariables.containsAll(info.getWrite())) {
						candidates.add(info);
						break;
					}
				}
			}
			if (candidates.isEmpty()) {
				// select snippets with higher selectivity, which is normally the case when no variables are bound
				// Preference Rule 4
				for (DependencyInfo info : unsortedSnippets) {
					if (boundVariables.containsAll(info.getReadWithoutWrite()) && (info.getWrite().isEmpty() || boundNonNullVariables.containsAll(info.getWrite()) && info.getRead().containsAll(info.getWrite()))) {
						candidates.add(info);
						break;
					}
				}
			}
			if (candidates.isEmpty()) {
				// select snippets which fulfill all mandatory data dependencies, but are no target object templates (Preference Rule 5)
				for (DependencyInfo info : unsortedSnippets) {
					if (!(info.isTarget && info.snippet instanceof ObjectTemplate) && boundVariables.containsAll(info.getReadWithoutWrite()) && satisfyOtherPreferences(unsortedSnippets, info)) {
						candidates.add(info);
						break;
					}
				}
			}
			if (candidates.isEmpty()) {
				// finally select snippets which fulfill all mandatory data dependencies, but are target object templates
				for (DependencyInfo info : unsortedSnippets) {
					if ((info.isTarget && info.snippet instanceof ObjectTemplate) && boundVariables.containsAll(info.getReadWithoutWrite()) && satisfyOtherPreferences(unsortedSnippets, info)) {
						candidates.add(info);
						break;
					}
				}
			}
			if (candidates.isEmpty()) {
				DependencyInfo info = unsortedSnippets.get(0);
				for (XVariableDeclaration var : info.getRead())
					if (!boundVariables.contains(var))
						validationException(var.getName() + " is not initialized", info.snippet, null);
				sortedSnippets.addAll(unsortedSnippets);
				return;
			}
			for (DependencyInfo candidate : candidates) {
				for (XVariableDeclaration XVariableDeclaration : candidate.getWrite()) {
					if (!candidate.getRead().contains(XVariableDeclaration) && boundVariables.contains(XVariableDeclaration)) {
						validationException(XVariableDeclaration.getName() + " cannot be initialized twice!", candidate.snippet, null);
					}
				}
				candidate.calcActualBindings(boundVariables, boundNonNullVariables);
				boundVariables.addAll(candidate.getWrite());
				boundNonNullVariables.addAll(candidate.getWriteNonNull());
				sortedSnippets.add(candidate);
			}
			unsortedSnippets.removeAll(candidates);
		}
	}

	private boolean satisfyOtherPreferences(List<DependencyInfo> unsortedSnippets, DependencyInfo info) {
		if (!info.getWrite().isEmpty() && info.getRead().containsAll(info.getWrite()))
			for (DependencyInfo info2 : unsortedSnippets) {
				// prevent validation error "cannot be bound twice"
				// Preference Rule 2
				if (info2.getWrite().equals(info.getWrite()) && !info2.getRead().containsAll(info2.getWrite())) {
					return false;
				}
				// binding to a subtype has precedence
				// Preference Rule 3
				for (XVariableDeclaration var : info2.getWrite()) {
					JvmTypeReference type = info.getWrittenType(var);
					JvmTypeReference type2 = info2.getWrittenType(var);
					if (type != null && type2 != null && _jvmOnlyTypeConformanceComputer.isConformant(type, type2) && !_jvmOnlyTypeConformanceComputer.isConformant(type2, type)) {
						return false;
					}
				}
			}
		return true;
	}

	public void validationException(String message, EObject source, EStructuralFeature feature, int index) {
		// do nothing as default
	}

	public void validationException(String message, EObject source, EStructuralFeature feature) {
		validationException(message, source, feature, ValidationMessageAcceptor.INSIGNIFICANT_INDEX);
	}

	private DependencyInfo processExpression(XExpression expression, boolean isTarget) {
		if (expression instanceof XAssignment) {
			XAssignment xAssignment = (XAssignment) expression;
			XVariableDeclaration var = jQVTUtils.asVar(xAssignment);
			if (var != null) {
				DependencyInfo info = new DependencyInfo(expression, isTarget);
				info.write(var, _iTypeProvider.getType(xAssignment.getValue()));
				info.andWith(processExpression(xAssignment.getValue(), isTarget));
				return info;
			}
		}
		if (expression instanceof XFeatureCall) {
			XFeatureCall call = (XFeatureCall) expression;
			Relation relation = jQVTUtils.getReferredRelation(call);
			if (relation != null) {
				DependencyInfo info = new DependencyInfo(expression, isTarget);
				for (ParamPair pair : jQVTUtils.getParamPairs(call, false)) {
					processSubExpressions(pair.exp, info);
				}
				for (ParamPair pair : jQVTUtils.getParamPairs(call, true)) {
					XVariableDeclaration varDecl = jQVTUtils.asVar(pair.exp);
					if (varDecl != null && !info.isRead(varDecl) && !info.isWrite(varDecl)) {
						info.readOrWrite(varDecl, pair.domain.getRootTemplate().getType(), true);
					} else
						processSubExpressions(pair.exp, info);
				}
				return info;
			}
		}
		if (expression instanceof XBinaryOperation) {
			XBinaryOperation xBinaryOperation = (XBinaryOperation) expression;
			if ("||".equals(xBinaryOperation.getConcreteSyntaxFeatureName())) {
				DependencyInfo infoLeft = processExpression(xBinaryOperation.getLeftOperand(), isTarget);
				DependencyInfo infoRight = processExpression(xBinaryOperation.getRightOperand(), isTarget);
				infoLeft.orWith(infoRight);
				return new DependencyInfo(expression, infoLeft);
			}
		}
		if (expression instanceof XUnaryOperation) {
			XUnaryOperation xUnaryOperation = (XUnaryOperation) expression;
			if ("!".equals(xUnaryOperation.getConcreteSyntaxFeatureName())) {
				DependencyInfo info = processExpression(xUnaryOperation.getOperand(), isTarget);
				info.discardBindings();
				return new DependencyInfo(expression, info);
			}
		}
		DependencyInfo info = new DependencyInfo(expression, isTarget);
		if (expression != null)
			processSubExpressions(expression, info);
		return info;
	}

	private void processSubExpressions(XExpression value, DependencyInfo info) {
		processSupExpression(value, info);
		for (EObject eObjet : IteratorExtensions.toIterable(value.eAllContents())) {
			processSupExpression(eObjet, info);
		}
	}

	private void processSupExpression(EObject eObjet, DependencyInfo info) {
		XVariableDeclaration var = jQVTUtils.asVar(eObjet);
		if (var != null) {
			info.read(var);
		}
	}

	private XVariableDeclaration processTemplates(ObjectTemplate objectTemplate, List<DependencyInfo> result, boolean isTarget, Map<String, XVariableDeclaration> vars) {
		XVariableDeclaration var = vars.get(objectTemplate.getName());
		if (var == objectTemplate) {
			DependencyInfo info = new DependencyInfo(objectTemplate, isTarget);
			result.add(info);
			if (isTarget) {
				info.readOrWrite(var, var.getType(), true);
			} else if (jQVTUtils.isRootTemplate(var)) {
				info.writeNonNull(var, var.getType());
			}
		}
		for (PropertyTemplateItem prop : objectTemplate.getPart()) {
			DependencyInfo propInfo = new DependencyInfo(prop, isTarget);
			result.add(propInfo);
			propInfo.read(var);
			XVariableDeclaration innerVarDecl;
			if (prop.getValue() instanceof ObjectTemplate) {
				ObjectTemplate innerObjectTemplate = (ObjectTemplate) prop.getValue();
				innerVarDecl = processTemplates(innerObjectTemplate, result, isTarget, vars);
				if (isTarget) {
					propInfo.read(innerVarDecl);
				} else {
					propInfo.writeNonNull(innerVarDecl, innerVarDecl.getType());
				}
			} else if ((innerVarDecl = jQVTUtils.asVar(prop.getValue())) != null) {
				if (isTarget) {
					propInfo.read(innerVarDecl);
				} else {
					propInfo.readOrWrite(innerVarDecl, innerVarDecl.getType(), false);
				}
			} else if (prop.getValue() != null) {
				propInfo.orWith(processExpression(prop.getValue(), isTarget));
			}
		}
		return var;
	}

	public Map<String, XVariableDeclaration> getUniqueVars(Relation relation) {
		Map<String, XVariableDeclaration> varDecls = new HashMap<String, XVariableDeclaration>();
		for (XVariableDeclaration var : jQVTUtils.getAllVarDecls(relation)) {
			XVariableDeclaration result = varDecls.get(var.getName());
			if (result != null) {
				if (result instanceof ObjectTemplate && var instanceof ObjectTemplate) {
					if (result.getType() != null && var.getType() != null && result.getType().getType() != var.getType().getType()) {
						validationException(var.getName() + " redeclared with different type!", var, null);
					}
					if (jQVTUtils.isRootTemplate(var) && !jQVTUtils.isSourceDomain(result))
						varDecls.put(var.getName(), var);
				} else
					validationException(var.getName() + " declared twice!", var, null);
			} else
				varDecls.put(var.getName(), var);
		}
		return varDecls;
	}

	public DependencyInfo getDependencyInfo(EObject eObject) {
		return dependencyMap.get(eObject);
	}

	/**
	 * @deprecated Use TopRelationSorter
	 * @param transformation
	 * @return
	 */
	public List<Relation> getSortedRelations(final Transformation transformation) {
		return transformation.getRules();
	}

}
