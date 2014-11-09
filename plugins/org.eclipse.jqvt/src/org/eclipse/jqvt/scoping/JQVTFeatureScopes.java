/**
 * Copyright 2013 Smart Services CRC Pty Ltd
 */
package org.eclipse.jqvt.scoping;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.common.types.JvmDeclaredType;
import org.eclipse.xtext.common.types.JvmFeature;
import org.eclipse.xtext.common.types.JvmIdentifiableElement;
import org.eclipse.xtext.naming.QualifiedName;
import org.eclipse.xtext.resource.IEObjectDescription;
import org.eclipse.xtext.scoping.IScope;
import org.eclipse.xtext.xbase.XFeatureCall;
import org.eclipse.xtext.xbase.XbaseFactory;
import org.eclipse.xtext.xbase.scoping.batch.FeatureScopes;
import org.eclipse.xtext.xbase.scoping.batch.IFeatureScopeSession;
import org.eclipse.xtext.xbase.typesystem.IResolvedTypes;
import org.eclipse.xtext.xbase.typesystem.references.LightweightTypeReference;

import com.google.inject.Inject;

@SuppressWarnings("restriction")
public class JQVTFeatureScopes extends FeatureScopes {

	static QualifiedName TRANSFORMATION = QualifiedName.create("trafo");

	@Inject(optional = true)
	private XbaseFactory xbaseFactory = XbaseFactory.eINSTANCE;

	protected IScope createImplicitFeatureCallScope(EObject featureCall, IScope parent, IFeatureScopeSession session, IResolvedTypes resolvedTypes) {
		IScope result = super.createImplicitFeatureCallScope(featureCall, parent, session, resolvedTypes);
		result = createImplicitFeatureCallScopeOnField(TRANSFORMATION, featureCall, session, resolvedTypes, result);
		return result;
	}

	protected IScope createImplicitFeatureCallScopeOnField(QualifiedName fieldName, EObject featureCall, IFeatureScopeSession session, IResolvedTypes resolvedTypes, IScope parent) {
		IEObjectDescription thisDescription = session.getLocalElement(THIS);
		if (thisDescription != null) {
			JvmIdentifiableElement jvmDeclaredType = (JvmIdentifiableElement) thisDescription.getEObjectOrProxy();
			for (JvmFeature feature : ((JvmDeclaredType) jvmDeclaredType).findAllFeaturesByName(fieldName.toString())) {
				final JvmIdentifiableElement fieldElement = (JvmIdentifiableElement) feature;
				LightweightTypeReference type = resolvedTypes.getActualType(fieldElement);
				if (type != null && !type.isUnknown()) {
					XFeatureCall implicitReceiver = xbaseFactory.createXFeatureCall();
					implicitReceiver.setFeature(fieldElement);
					return createFeatureScopeForTypeRef(implicitReceiver, type, true, featureCall, session, fieldElement, parent, true/*hope TRUE is correct here..*/);
				}
			}
		}
		return parent;
	}

}
