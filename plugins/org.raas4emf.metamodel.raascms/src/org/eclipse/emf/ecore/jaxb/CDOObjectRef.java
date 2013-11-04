package org.eclipse.emf.ecore.jaxb;

import org.eclipse.emf.cdo.CDOObject;
import org.eclipse.emf.internal.cdo.CDOObjectImpl;

public class CDOObjectRef implements EObjectRef {
	
	String id;

	@Override
	public String getID() {
		return id;
	}

	@Override
	public void setID(String id) {
		this.id = id;

	}

	@Override
	public CDOObject createInstance() {
		return new CDOObjectImpl();
	}

}
