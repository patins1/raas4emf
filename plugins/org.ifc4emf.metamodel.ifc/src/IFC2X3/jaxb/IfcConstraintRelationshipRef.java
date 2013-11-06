package IFC2X3.jaxb;

import javax.xml.bind.annotation.*;
import org.eclipse.emf.ecore.jaxb.*;

import IFC2X3.IFC2X3Factory;
import IFC2X3.IfcConstraintRelationship;

@XmlRootElement(name = "IfcConstraintRelationshipRefElement")
public class IfcConstraintRelationshipRef extends org.eclipse.emf.cdo.jaxb.CDOObjectRef  {

	

	
	@Override
	public IfcConstraintRelationship createInstance() {
		return IFC2X3Factory.eINSTANCE.createIfcConstraintRelationship();
	}
	
	public static IfcConstraintRelationshipRef valueOf(String id) {
		IfcConstraintRelationshipRef result = new IfcConstraintRelationshipRef();
		result.setID(id);
		return result;
	}

	@Override
	public String toString() {
		return getID();
	}
	

}