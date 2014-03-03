package org.raas4emf.cms.ui.views;

import java.util.ArrayList;
import java.util.List;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.util.ResourceLocator;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ReflectiveItemProvider;
import org.eclipse.emf.edit.provider.ReflectiveItemProviderAdapterFactory;

public class ReadonlyReflectiveItemProviderAdapterFactory extends ReflectiveItemProviderAdapterFactory {

	public ReadonlyReflectiveItemProviderAdapterFactory() {
		super();
		reflectiveItemProviderAdapter = new ReflectiveItemProvider(this) {
			/**
			 * Changed original method just to call our createItemPropertyDescriptor()
			 */
			@Override
			public List<IItemPropertyDescriptor> getPropertyDescriptors(Object object) {
				// if (itemPropertyDescriptors == null)
				{
					itemPropertyDescriptors = new ArrayList<IItemPropertyDescriptor>();

					for (EStructuralFeature eFeature : ((EObject) object).eClass().getEAllStructuralFeatures()) {
						if (!(eFeature instanceof EReference) || !((EReference) eFeature).isContainment()) {
							itemPropertyDescriptors.add(createItemPropertyDescriptor(((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(), null, getFeatureText(eFeature), getResourceLocator().getString("_UI_Property_description", new Object[] { getFeatureText(eFeature), eFeature.getEType().getName() }), eFeature,
									eFeature.isChangeable(), false, false, ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null));
						}
					}
				}
				return itemPropertyDescriptors;
			}

			@Override
			protected ItemPropertyDescriptor createItemPropertyDescriptor(AdapterFactory adapterFactory, ResourceLocator resourceLocator, String displayName, String description, EStructuralFeature feature, boolean isSettable, boolean multiLine, boolean sortChoices, Object staticImage, String category, String[] filterFlags) {
				return new ItemPropertyDescriptor(adapterFactory, resourceLocator, displayName, description, feature, isSettable, multiLine, sortChoices, staticImage, category, filterFlags) {

					@Override
					public boolean canSetProperty(Object object) {
						return false;
					}

				};
			}

		};

	}
}
