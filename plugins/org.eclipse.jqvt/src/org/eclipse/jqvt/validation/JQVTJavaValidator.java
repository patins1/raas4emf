/**
 * Copyright 2013 Smart Services CRC Pty Ltd
 */
package org.eclipse.jqvt.validation;

import static org.eclipse.xtext.xbase.validation.IssueCodes.INCOMPATIBLE_TYPES;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.jqvt.jQVT.ObjectTemplate;
import org.eclipse.jqvt.jQVT.PropertyTemplateItem;
import org.eclipse.jqvt.jQVT.Relation;
import org.eclipse.jqvt.jvmmodel.DependencyProcessor;
import org.eclipse.jqvt.jvmmodel.ParamPair;
import org.eclipse.jqvt.util.JQVTUtils;
import org.eclipse.xtext.common.types.JvmTypeReference;
import org.eclipse.xtext.validation.Check;
import org.eclipse.xtext.validation.ValidationMessageAcceptor;
import org.eclipse.xtext.xbase.XExpression;
import org.eclipse.xtext.xbase.XFeatureCall;
import org.eclipse.xtext.xbase.XVariableDeclaration;
import org.eclipse.xtext.xbase.XbasePackage;
import org.eclipse.xtext.xbase.typing.ITypeProvider;
import org.eclipse.xtext.xbase.typing.JvmOnlyTypeConformanceComputer;

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
	private ITypeProvider _iTypeProvider;

	@Inject
	private JvmOnlyTypeConformanceComputer _jvmOnlyTypeConformanceComputer;

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
				JvmTypeReference actualType = _iTypeProvider.getType(pair.exp);
				JvmTypeReference expectedType = pair.domain.getRootTemplate().getType();
				if (!(this._jvmOnlyTypeConformanceComputer.isConformant(actualType, expectedType) || this._jvmOnlyTypeConformanceComputer.isConformant(expectedType, actualType)))
					error("Incompatible relation call argument. Expected " + getNameOfTypes(toLightweightTypeReference(expectedType)) + " but was " + canonicalName(toLightweightTypeReference(actualType)), pair.exp, null, ValidationMessageAcceptor.INSIGNIFICANT_INDEX, INCOMPATIBLE_TYPES);
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
				JvmTypeReference actualType = ot.getType();
				if (jQVTUtils.isMany(expectedType))
					expectedType = jQVTUtils.getComponentType(expectedType);
				if (!this._jvmOnlyTypeConformanceComputer.isConformant(expectedType, actualType))
					error("Incompatible RHS value of property template item. Expected " + getNameOfTypes(toLightweightTypeReference(expectedType)) + " but was " + canonicalName(toLightweightTypeReference(actualType)), ot, XbasePackage.eINSTANCE.getXVariableDeclaration_Type(), ValidationMessageAcceptor.INSIGNIFICANT_INDEX,
							INCOMPATIBLE_TYPES);
			} else {
				JvmTypeReference actualType = _iTypeProvider.getType(value);
				if (!(this._jvmOnlyTypeConformanceComputer.isConformant(actualType, expectedType) || this._jvmOnlyTypeConformanceComputer.isConformant(expectedType, actualType)))
					error("Incompatible RHS value of property template item. Expected " + getNameOfTypes(toLightweightTypeReference(expectedType)) + " but was " + canonicalName(toLightweightTypeReference(actualType)), value, null, ValidationMessageAcceptor.INSIGNIFICANT_INDEX, INCOMPATIBLE_TYPES);
			}
		}
	}

	@Override
	public void checkInnerExpressions(XExpression expr) {
		// do nothing, so that e.g. "Relation1(a,b) || Relation2(a,b)" does not produce error "doesn't cause any side effects"
	}

}
