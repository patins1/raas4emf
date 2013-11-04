package MyPackage;

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
abstract public class EObjectRef {

	String id;
	
	public String getID() {
		return id;
	}

	public void setID(String id) {
		this.id = id;
	}
	
	abstract public EObject createInstance();
}
