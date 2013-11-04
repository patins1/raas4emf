package org.eclipse.emf.ecore.jaxb;

import org.eclipse.emf.ecore.EObject;

/**
 * Holds an identifier string to identify an {@link EObject} instances. Since
 * {@link EObject} actually not defines an attribute for such an identifier,
 * this class is declared abstract. Rationale: To serialize a "pointer" to an
 * EMF object in a SOAP message, this data structure is used. For every
 * metamodel class, a derived class of this class should exist for the concept
 * of "typed pointers".
 * 
 */
public interface EObjectRef {
	
	String getID();

	void setID(String id);

	EObject createInstance();
}
