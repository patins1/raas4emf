/**
 * Copyright 2013 Smart Services CRC Pty Ltd
 */
package au.com.smartservicescrc.raas.codegen.jaxb.classes;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

import org.eclipse.jdt.core.dom.AST;
import org.eclipse.jdt.core.dom.Annotation;
import org.eclipse.jdt.core.dom.ArrayInitializer;
import org.eclipse.jdt.core.dom.BodyDeclaration;
import org.eclipse.jdt.core.dom.BooleanLiteral;
import org.eclipse.jdt.core.dom.ChildListPropertyDescriptor;
import org.eclipse.jdt.core.dom.CompilationUnit;
import org.eclipse.jdt.core.dom.Expression;
import org.eclipse.jdt.core.dom.IExtendedModifier;
import org.eclipse.jdt.core.dom.MarkerAnnotation;
import org.eclipse.jdt.core.dom.MemberValuePair;
import org.eclipse.jdt.core.dom.NormalAnnotation;
import org.eclipse.jdt.core.dom.SimpleType;
import org.eclipse.jdt.core.dom.SingleMemberAnnotation;
import org.eclipse.jdt.core.dom.StringLiteral;
import org.eclipse.jdt.core.dom.Type;
import org.eclipse.jdt.core.dom.TypeLiteral;

/**
 * Holds all information for one proposal of a JAXB annotation which can be applied to the source code
 */
public class JaxbProposal {
	private String label;
	private final BodyDeclaration declaration;
	private ClassLiteral jaxbAnnotation;
	private Map<String, Object> pairs = new HashMap<String, Object>();

	public JaxbProposal(BodyDeclaration decl) {
		this.declaration = decl;
	}

	public AST getAst() {
		return declaration.getAST();
	}

	public CompilationUnit getRoot() {
		return (CompilationUnit) declaration.getRoot();
	}

	/**
	 * @return a list with same-named annotations existing in the source code
	 */
	public List<Annotation> getExistingAnnotations() {
		List<Annotation> result = new ArrayList<Annotation>();
		for (IExtendedModifier extMod : (List<IExtendedModifier>) declaration.modifiers()) {
			if (extMod instanceof Annotation) {
				Annotation annotation = (Annotation) extMod;
				if (jaxbAnnotation.getName().equals(annotation.getTypeName().getFullyQualifiedName())) {
					result.add(annotation);
				}
			}
		}
		return result;
	}

	/**
	 * Determines if the proposal should be added to the code (<code>true</code> ) or if it is not already included in the code (<code>false</code>)
	 * 
	 * @return
	 */
	public boolean isRelevant() {
		List<Annotation> existingAnnotations = getExistingAnnotations();
		if (existingAnnotations.isEmpty()) {
			return true;
		}
		for (Annotation annotation : existingAnnotations) {
			if (pairs.isEmpty()) {
				if (!(annotation instanceof MarkerAnnotation)) {
					return true;
				}
			} else {
				for (Map.Entry<String, Object> entry : pairs.entrySet()) {
					String name = entry.getKey();
					Expression expression = null;
					if (annotation instanceof SingleMemberAnnotation) {
						SingleMemberAnnotation singleMemberAnnotation = (SingleMemberAnnotation) annotation;
						expression = singleMemberAnnotation.getValue();
					} else if (annotation instanceof NormalAnnotation) {
						NormalAnnotation normalAnnotation = (NormalAnnotation) annotation;
						for (MemberValuePair pair : (List<MemberValuePair>) normalAnnotation.values()) {
							if (name.equals(pair.getName().getFullyQualifiedName())) {
								expression = pair.getValue();
							}
						}
					}
					Object value = expToValue(expression);
					if (!asSet(entry.getValue()).equals(asSet(value))) {
						return true;
					}
				}
			}
		}
		return false;
	}

	private Set<Object> asSet(Object value) {
		if (value instanceof Set) {
			return (Set<Object>) value;
		}
		return new HashSet<Object>(Arrays.asList(value));
	}

	public Object expToValue(Expression expression) {
		if (expression instanceof StringLiteral) {
			StringLiteral stringLiteral2 = (StringLiteral) expression;
			return stringLiteral2.getLiteralValue();
		} else if (expression instanceof BooleanLiteral) {
			BooleanLiteral booleanLiteral = (BooleanLiteral) expression;
			return booleanLiteral.booleanValue();
		} else if (expression instanceof TypeLiteral) {
			TypeLiteral typeLiteral = (TypeLiteral) expression;
			Type type = typeLiteral.getType();
			if (type instanceof SimpleType) {
				SimpleType simpleType = (SimpleType) type;
				if (simpleType.resolveBinding() != null) {
					return new ClassLiteral(simpleType.resolveBinding().getQualifiedName());
				}
			}
		} else if (expression instanceof ArrayInitializer) {
			ArrayInitializer a = (ArrayInitializer) expression;
			Set<Object> newValues = new HashSet<Object>();
			for (Expression item : (List<Expression>) a.expressions()) {
				newValues.add(expToValue(item));
			}
			return newValues;
		}
		return expression;
	}

	public ChildListPropertyDescriptor getModifiersProperty() {
		return declaration.getModifiersProperty();
	}

	public String getLabel() {
		return this.label;
	}

	public void setLabel(String label) {
		this.label = label;
	}

	public ClassLiteral getAnnotation() {
		return this.jaxbAnnotation;
	}

	public void setAnnotation(String marker) {
		this.jaxbAnnotation = new ClassLiteral(marker);
	}

	public BodyDeclaration getDeclaration() {
		return this.declaration;
	}

	public Map<String, Object> getPairs() {
		return this.pairs;
	}

	public void put(String string, Object classLiteral) {
		pairs.put(string, classLiteral);
	}
}
