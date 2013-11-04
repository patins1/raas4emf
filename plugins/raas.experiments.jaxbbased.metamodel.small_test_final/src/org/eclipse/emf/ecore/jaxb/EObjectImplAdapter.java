package org.eclipse.emf.ecore.jaxb;

import javax.xml.bind.annotation.adapters.XmlAdapter;

import org.eclipse.emf.ecore.EObject;

/**
 * Maps an extension to an {@link EObject} interface to its EMF implementation
 * class implementing this extension. Rationale: Since JAXB cannot map Java
 * interfaces to XML, an interface is mapped to an Java class, for this case to
 * its EMF implementation class. For every metamodel class, there should exist
 * an extension of this class with the corresponding specialized type
 * parameters.
 * 
 * @param <BoundType>
 * @param <ValueType>
 */
public class EObjectImplAdapter<ValueType extends EObject, BoundType extends EObject> extends XmlAdapter<ValueType, BoundType> {
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
