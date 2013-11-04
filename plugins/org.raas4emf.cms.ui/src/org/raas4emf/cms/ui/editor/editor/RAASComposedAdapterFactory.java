/**
 * Copyright 2013 Smart Services CRC Pty Ltd
 */
package org.raas4emf.cms.ui.editor.editor;

import org.eclipse.emf.edit.domain.AdapterFactoryEditingDomain;
import org.eclipse.emf.edit.domain.EditingDomain;
import org.eclipse.emf.edit.domain.IEditingDomainProvider;
import org.eclipse.emf.edit.provider.ComposedAdapterFactory;
import org.eclipse.emf.edit.provider.ComposedAdapterFactory.Descriptor.Registry;

public class RAASComposedAdapterFactory extends ComposedAdapterFactory implements IEditingDomainProvider {

	private AdapterFactoryEditingDomain editingDomain;

	public RAASComposedAdapterFactory(Registry instance) {
		super(instance);
	}

	public RAASComposedAdapterFactory(ComposedAdapterFactory adapterFactory, AdapterFactoryEditingDomain editingDomain) {
		super(adapterFactory);
		this.editingDomain = editingDomain;
	}

	@Override
	public EditingDomain getEditingDomain() {
		return editingDomain;
	}

	public void setEditingDomain(AdapterFactoryEditingDomain editingDomain) {
		this.editingDomain = editingDomain;
	}

}
