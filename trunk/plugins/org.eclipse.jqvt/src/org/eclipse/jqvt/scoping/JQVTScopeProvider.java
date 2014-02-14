/**
 * Copyright 2013 Smart Services CRC Pty Ltd
 */
package org.eclipse.jqvt.scoping;

import java.util.ArrayList;
import java.util.List;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.jqvt.jQVT.JQVTPackage;
import org.eclipse.jqvt.jQVT.ObjectTemplate;
import org.eclipse.jqvt.jQVT.PropertyTemplateItem;
import org.eclipse.jqvt.util.JQVTUtils;
import org.eclipse.xtext.common.types.JvmDeclaredType;
import org.eclipse.xtext.common.types.JvmFeature;
import org.eclipse.xtext.common.types.JvmIdentifiableElement;
import org.eclipse.xtext.common.types.JvmOperation;
import org.eclipse.xtext.common.types.JvmTypeReference;
import org.eclipse.xtext.naming.QualifiedName;
import org.eclipse.xtext.resource.EObjectDescription;
import org.eclipse.xtext.resource.IEObjectDescription;
import org.eclipse.xtext.scoping.IScope;
import org.eclipse.xtext.scoping.impl.AbstractScope;
import org.eclipse.xtext.xbase.XFeatureCall;
import org.eclipse.xtext.xbase.XbaseFactory;
import org.eclipse.xtext.xbase.scoping.XbaseScopeProvider;
import org.eclipse.xtext.xbase.typing.ITypeProvider;

import com.google.inject.Inject;

/**
 * Scope provider for JQVT
 */
@SuppressWarnings("restriction")
public class JQVTScopeProvider extends XbaseScopeProvider {

	@Inject
	private ITypeProvider typeProvider;

	public static final QualifiedName TRANSFORMATION = QualifiedName.create("trafo");

	@Override
	protected void addFeatureCallScopes(EObject featureCall, IScope localVariableScope, IJvmFeatureScopeAcceptor featureScopeDescriptions) {
		// addFeatureCallScopes(featureCall, localVariableScope, TRANSFORMATION, 0, featureScopeDescriptions);
		JvmIdentifiableElement jvmDeclaredType = getContextType(featureCall);
		if (jvmDeclaredType instanceof JvmDeclaredType) {
			for (JvmFeature implicitReceiver : ((JvmDeclaredType) jvmDeclaredType).findAllFeaturesByName("trafo")) {
				JvmTypeReference receiverType = typeProvider.getTypeForIdentifiable(implicitReceiver);
				if (receiverType != null) {
					XFeatureCall receiver = XbaseFactory.eINSTANCE.createXFeatureCall();
					receiver.setFeature((JvmIdentifiableElement) implicitReceiver);
					addFeatureScopes(receiverType, featureCall, getContextType(featureCall), receiver, null, 0, featureScopeDescriptions);
				}
			}
		}
		super.addFeatureCallScopes(featureCall, localVariableScope, featureScopeDescriptions);
	}

	public IScope getScope(final EObject context, EReference reference) {
		if (context instanceof PropertyTemplateItem && reference == JQVTPackage.eINSTANCE.getPropertyTemplateItem_ReferredProperty()) {
			PropertyTemplateItem propertyTemplateItem = (PropertyTemplateItem) context;
			ObjectTemplate tpl = (ObjectTemplate) propertyTemplateItem.eContainer();
			JvmTypeReference typeReference = tpl.getType();
			if (typeReference != null && typeReference.getType() instanceof JvmDeclaredType) {

				final JvmDeclaredType jvmDeclaredType = (JvmDeclaredType) typeReference.getType();
				return new AbstractScope(IScope.NULLSCOPE, true) {

					@Override
					protected Iterable<IEObjectDescription> getAllLocalElements() {
						List<IEObjectDescription> result = new ArrayList<IEObjectDescription>();
						for (JvmFeature feature : jvmDeclaredType.getAllFeatures()) {
							if (feature instanceof JvmOperation) {
								final JvmOperation op = (JvmOperation) feature;
								String propertyName = JQVTUtils.toPropertyName(op);
								if (propertyName != null)
									result.add(EObjectDescription.create(QualifiedName.create(propertyName), op));
							}
						}
						return result;
					}

				};
			}
		}
		return super.getScope(context, reference);
	}
}
