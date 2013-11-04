/**
 * Copyright 2013 Smart Services CRC Pty Ltd
 */
package org.raas4emf.cms.ui;

import org.eclipse.core.runtime.IAdapterFactory;

abstract public class AdapterFactoryTyped<A, Z> implements IAdapterFactory {

	abstract public Z getAdapterTyped(A adaptableObject, Class<Z> adapterType);

	@SuppressWarnings("rawtypes")
	@Override
	public Class[] getAdapterList() {
		throw new RuntimeException("not implemented");
	}

	@SuppressWarnings({ "unchecked", "rawtypes" })
	@Override
	public Object getAdapter(Object adaptableObject, Class adapterType) {
		return getAdapterTyped((A) adaptableObject, (Class<Z>) adapterType);
	}

}
