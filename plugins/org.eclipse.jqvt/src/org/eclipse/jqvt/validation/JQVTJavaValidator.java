/**
 * Copyright 2013 Smart Services CRC Pty Ltd
 */
package org.eclipse.jqvt.validation;

import static org.eclipse.xtext.xbase.validation.IssueCodes.INCOMPATIBLE_TYPES;

import java.util.ArrayList;
import java.util.List;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.jqvt.jQVT.ObjectTemplate;
import org.eclipse.jqvt.jQVT.PropertyTemplateItem;
import org.eclipse.jqvt.jQVT.Relation;
import org.eclipse.jqvt.jQVT.Transformation;
import org.eclipse.jqvt.jvmmodel.DependencyProcessor;
import org.eclipse.jqvt.jvmmodel.FakeRelation;
import org.eclipse.jqvt.jvmmodel.ParamPair;
import org.eclipse.jqvt.jvmmodel.TopRelationSorter;
import org.eclipse.jqvt.util.JQVTUtils;
import org.eclipse.xtext.common.types.JvmTypeReference;
import org.eclipse.xtext.validation.Check;
import org.eclipse.xtext.validation.ValidationMessageAcceptor;
import org.eclipse.xtext.xbase.XExpression;
import org.eclipse.xtext.xbase.XFeatureCall;
import org.eclipse.xtext.xbase.XVariableDeclaration;
import org.eclipse.xtext.xbase.XbasePackage;
import org.eclipse.xtext.xbase.typesystem.references.LightweightTypeReference;

import com.google.inject.Inject;

/**
 * Validates the JQVT model
 */
@SuppressWarnings("restriction")
public class JQVTJavaValidator extends AbstractJQVTJavaValidator {

	static class ValidatingDependencyProcessor extends DependencyProcessor {
		public void validationException(String message, EObject source, EStructuralFeature feature, int index) throws ValidationException {
			throw new ValidationException(message, source, feature, index);
		}
	};

	@Inject
	JQVTUtils jQVTUtils;

	@Inject
	private ValidatingDependencyProcessor validatingDependencyProcessor;

	@Check
	public void checkRelationalValidationErrors(Relation relation) {
		try {
			validatingDependencyProcessor.sortSnippetsOfRelation(relation);
		} catch (ValidationException ve) {
			error(ve.getMessage(), ve.source, ve.feature, ve.index);
		}
	}

	@Check
	public void checkRelationCallArgumentConformance(XFeatureCall featureCall) {
		Relation relation = jQVTUtils.getReferredRelation(featureCall);
		if (relation != null) {
			for (ParamPair pair : jQVTUtils.getParamPairs(featureCall, null)) {
				LightweightTypeReference actualType = getActualType(pair.exp);
				LightweightTypeReference expectedType = toLightweightTypeReference(pair.domain.getRootTemplate().getType());
				if (!(actualType!=null && expectedType!=null && actualType.isAssignableFrom(expectedType) || actualType!=null && expectedType!=null && expectedType.isAssignableFrom(actualType)))
					error("Incompatible relation call argument. Expected " + getNameOfTypes(expectedType) + " but was " + canonicalName(actualType), pair.exp, null, ValidationMessageAcceptor.INSIGNIFICANT_INDEX, INCOMPATIBLE_TYPES);
			}
		}
	}

	@Override
	public void checkLocalUsageOfDeclared(XVariableDeclaration variableDeclaration) {
		// prevent super method check
	}

	@Check
	public void checkPropertyTemplateValueConformance(PropertyTemplateItem item) {
		XExpression value = item.getValue();
		if (value != null && item.getReferredProperty() != null) {
			JvmTypeReference expectedType = item.getReferredProperty().getReturnType();
			if (value instanceof ObjectTemplate) {
				ObjectTemplate ot = (ObjectTemplate) value;
				LightweightTypeReference actualType = toLightweightTypeReference(ot.getType());
				if (jQVTUtils.isMany(expectedType,item.getReferredProperty()))
					expectedType = jQVTUtils.getComponentType(expectedType);
				LightweightTypeReference expectedTypeLight = toLightweightTypeReference(expectedType);
				if (!(actualType!=null && expectedTypeLight!=null && expectedTypeLight.isAssignableFrom(actualType)))
					error("Incompatible RHS value of property template item. Expected " + getNameOfTypes(expectedTypeLight) + " but was " + canonicalName(actualType), ot, XbasePackage.eINSTANCE.getXVariableDeclaration_Type(), ValidationMessageAcceptor.INSIGNIFICANT_INDEX, INCOMPATIBLE_TYPES);
			} else {
				LightweightTypeReference actualType = getActualType(value);
				LightweightTypeReference expectedTypeLight = toLightweightTypeReference(expectedType);
				if (!(actualType!=null && expectedType!=null && actualType.isAssignableFrom(expectedTypeLight) || actualType!=null && expectedTypeLight!=null && expectedTypeLight.isAssignableFrom(actualType)))
					error("Incompatible RHS value of property template item. Expected " + getNameOfTypes(expectedTypeLight) + " but was " + canonicalName(actualType), value, null, ValidationMessageAcceptor.INSIGNIFICANT_INDEX, INCOMPATIBLE_TYPES);
			}
		}
	}

	@Check
	public void checkTopSortRelationErrors(Transformation trafo) {
		TopRelationSorter sorter = new TopRelationSorter() {
			public void validationException(String message, EObject source, EStructuralFeature feature, int index) throws ValidationException {
				throw new ValidationException(message, source, feature, index);
			}
		};
		String message = "Found the following circles: ";
		FakeRelation foundfk = null;
		for (Relation relation : sorter.getTopSortedTopRelations(trafo)) {
			if (relation instanceof FakeRelation) {
				message = message + relation.getName();
				foundfk = (FakeRelation) relation;
			}
		}

		if (foundfk != null) {
			List<Relation> flattened = new ArrayList<Relation>();
			flatten(foundfk, flattened);
			for (Relation r : flattened) {
				for (Relation relation : flattened) {
					for (XExpression expr : r.getWhen())
						if (sorter.mentionedRel(expr, relation))
							warning(message, expr, null, null);
					for (XExpression expr : r.getWhere())
						if (sorter.mentionedRel(expr, relation))
							warning(message, expr, null, null);

				}

			}
		}
	}

	private void flatten(FakeRelation fake, List<Relation> flattened) {
		for (Relation r : fake.getMembers())
			if (r instanceof FakeRelation)
				flatten((FakeRelation) r, flattened);
			else
				flattened.add(r);
	}

	@Override
	public void checkInnerExpressions(XExpression expr) {
		// do nothing, so that e.g. "Relation1(a,b) || Relation2(a,b)" does not produce error "doesn't cause any side effects"
	}

}
