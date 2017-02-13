/**
 * Copyright 2013 Smart Services CRC Pty Ltd
 */

package au.com.smartservicescrc.raas.codegen.jaxb.quickfix;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import org.eclipse.core.runtime.CoreException;
import org.eclipse.emf.codegen.ecore.genmodel.GenClass;
import org.eclipse.jdt.core.dom.AST;
import org.eclipse.jdt.core.dom.ASTNode;
import org.eclipse.jdt.core.dom.AbstractTypeDeclaration;
import org.eclipse.jdt.core.dom.Annotation;
import org.eclipse.jdt.core.dom.ArrayInitializer;
import org.eclipse.jdt.core.dom.CompilationUnit;
import org.eclipse.jdt.core.dom.Expression;
import org.eclipse.jdt.core.dom.MemberValuePair;
import org.eclipse.jdt.core.dom.NormalAnnotation;
import org.eclipse.jdt.core.dom.SimpleType;
import org.eclipse.jdt.core.dom.SingleMemberAnnotation;
import org.eclipse.jdt.core.dom.StringLiteral;
import org.eclipse.jdt.core.dom.TypeDeclaration;
import org.eclipse.jdt.core.dom.TypeLiteral;
import org.eclipse.jdt.core.dom.rewrite.ASTRewrite;
import org.eclipse.jdt.core.dom.rewrite.ImportRewrite;
import org.eclipse.jdt.internal.corext.fix.CompilationUnitRewriteOperationsFix;
import org.eclipse.jdt.internal.corext.fix.LinkedProposalModel;
import org.eclipse.jdt.internal.corext.refactoring.structure.CompilationUnitRewrite;
import org.eclipse.jdt.ui.cleanup.ICleanUpFix;
import org.eclipse.text.edits.TextEditGroup;

import au.com.smartservicescrc.raas.codegen.jaxb.classes.ClassLiteral;
import au.com.smartservicescrc.raas.codegen.jaxb.classes.JaxbAnnosUI;
import au.com.smartservicescrc.raas.codegen.jaxb.classes.JaxbGenInfo;
import au.com.smartservicescrc.raas.codegen.jaxb.classes.JaxbProposal;

@SuppressWarnings("restriction")
public class JaxbCodeFix extends CompilationUnitRewriteOperationsFix {
	public static final class JaxbAnnotationOperation extends CompilationUnitRewriteOperation {
		public final JaxbProposal proposal;

		public JaxbAnnotationOperation(JaxbProposal proposal) {
			this.proposal = proposal;
		}

		/**
		 * {@inheritDoc}
		 */
		@Override
		public void rewriteAST(CompilationUnitRewrite cuRewrite, LinkedProposalModel linkedProposalPositions) throws CoreException {
			ImportRewrite imports = cuRewrite.getImportRewrite();
			AST ast = cuRewrite.getAST();
			ASTRewrite rewrite = cuRewrite.getASTRewrite();
			Annotation annot;
			if (proposal.getPairs().size() == 0) {
				annot = ast.newMarkerAnnotation();
			} else if (proposal.getPairs().size() == 1 && proposal.getPairs().get("value") != null) {
				SingleMemberAnnotation sannot = ast.newSingleMemberAnnotation();
				Object value = proposal.getPairs().get("value");
				sannot.setValue(valueToExp(ast, value, imports));
				annot = sannot;
			} else {
				NormalAnnotation nannot = ast.newNormalAnnotation();
				for (String name : proposal.getPairs().keySet()) {
					MemberValuePair pair = ast.newMemberValuePair();
					pair.setName(ast.newSimpleName(name));
					Object value = proposal.getPairs().get(name);
					Expression exp = valueToExp(ast, value, imports);
					pair.setValue(exp);
					nannot.values().add(pair);
				}
				annot = nannot;
			}
			annot.setTypeName(ast.newName(proposal.getAnnotation().getName()));
			TextEditGroup textEditGroup = createTextEditGroup(proposal.getLabel(), cuRewrite);
			boolean inserted = false;
			for (ASTNode existingAnno : proposal.getExistingAnnotations()) {
				if (!inserted) {
					rewrite.getListRewrite(proposal.getDeclaration(), proposal.getModifiersProperty()).replace(existingAnno, annot, textEditGroup);
					inserted = true;
				} else {
					rewrite.getListRewrite(proposal.getDeclaration(), proposal.getModifiersProperty()).remove(existingAnno, textEditGroup);
				}
			}
			if (!inserted) {
				rewrite.getListRewrite(proposal.getDeclaration(), proposal.getModifiersProperty()).insertFirst(annot, textEditGroup);
			}
			imports.addImport(proposal.getAnnotation().getQualifiedName());
		}

		private Expression valueToExp(AST ast, Object value, ImportRewrite imports) {
			if (value instanceof String) {
				StringLiteral s = ast.newStringLiteral();
				s.setLiteralValue((String) value);
				return s;
			} else if (value instanceof Boolean) {
				return ast.newBooleanLiteral((Boolean) value);
			} else if (value instanceof ClassLiteral) {
				ClassLiteral cl = (ClassLiteral) value;
				TypeLiteral tl = ast.newTypeLiteral();
				SimpleType st = ast.newSimpleType(ast.newName(cl.getName()));
				tl.setType(st);
				imports.addImport(cl.getQualifiedName());
				return tl;
			} else if (value instanceof Collection) {
				Collection list = (Collection) value;
				ArrayInitializer a = ast.newArrayInitializer();
				for (Object item : list) {
					a.expressions().add(valueToExp(ast, item, imports));
				}
				return a;
			} else {
				throw new RuntimeException("unexpected value " + value);
			}
		}
	}

	public JaxbCodeFix(String name, CompilationUnit compilationUnit, CompilationUnitRewriteOperation[] fixRewriteOperations) {
		super(name, compilationUnit, fixRewriteOperations);
	}

	public static ICleanUpFix createCleanUp(CompilationUnit root, List<AbstractTypeDeclaration> tlts, JaxbGenInfo jaxbGenInfo) throws CoreException {
		if (tlts.size() == 0) {
			return null;
		}
		ArrayList<JaxbAnnotationOperation> operations = new ArrayList<JaxbAnnotationOperation>();
		for (AbstractTypeDeclaration problem : tlts) {
			if (!(problem instanceof TypeDeclaration)) {
				continue;
			}
			TypeDeclaration decl = (TypeDeclaration) problem;
			GenClass genClass = jaxbGenInfo.getGenClass(((CompilationUnit) decl.getParent()).getPackage().getName() + "." + decl.getName().getIdentifier());
			if (genClass == null) {
				continue;
			}
			JaxbAnnosUI jaxbAnnosUI = new JaxbAnnosUI();
			jaxbAnnosUI.fetchProposalStructures(genClass, (TypeDeclaration) problem);
			for (JaxbProposal proposal : jaxbAnnosUI.getProposals()) {
				if (proposal.getRoot() != root) {
					continue;
				}
				JaxbAnnotationOperation operation = new JaxbAnnotationOperation(proposal);
				operations.add(operation);
			}
		}
		if (operations.size() == 0) {
			return null;
		}
		String label = "JAXB augmentation";
		return new JaxbCodeFix(label, root, operations.toArray(new CompilationUnitRewriteOperation[operations.size()]));
	}
}
