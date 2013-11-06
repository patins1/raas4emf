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
import org.eclipse.xtext.common.types.JvmDeclaredType;
import org.eclipse.xtext.common.types.JvmFeature;
import org.eclipse.xtext.common.types.JvmOperation;
import org.eclipse.xtext.common.types.JvmTypeReference;
import org.eclipse.xtext.naming.QualifiedName;
import org.eclipse.xtext.resource.EObjectDescription;
import org.eclipse.xtext.resource.IEObjectDescription;
import org.eclipse.xtext.scoping.IScope;
import org.eclipse.xtext.scoping.impl.AbstractScope;
import org.eclipse.xtext.xbase.scoping.batch.XbaseBatchScopeProvider;

/**
 * Scope provider for JQVT
 */
@SuppressWarnings("restriction")
public class JQVTBatchScopeProvider extends XbaseBatchScopeProvider {

	public static final QualifiedName TRANSFORMATION = QualifiedName.create("trafo");

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
								if (op.getSimpleName().startsWith("get"))
									result.add(EObjectDescription.create(QualifiedName.create(op.getSimpleName().substring(3)), op));
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
