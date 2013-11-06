package org.eclipse.emf.cdo.jaxb;

import javax.xml.bind.annotation.adapters.XmlAdapter;

import org.eclipse.emf.ecore.EObject;

public class CDOObjectImplAdapter<ValueType extends EObject, BoundType extends EObject> extends XmlAdapter<ValueType, BoundType> {
	@Override
	public BoundType unmarshal(ValueType v) throws Exception {
		return (BoundType) v;
	}

	@Override
	@SuppressWarnings("unchecked")
	public ValueType marshal(BoundType v) throws Exception {
		return (ValueType) v;
	}
}
