package IFC2X3.jaxb;

import javax.xml.bind.annotation.*;
import org.eclipse.emf.ecore.jaxb.*;

import IFC2X3.IFC2X3Factory;
import IFC2X3.IfcPropertyConstraintRelationship;

@XmlRootElement(name = "IfcPropertyConstraintRelationshipRefElement")
public class IfcPropertyConstraintRelationshipRef extends org.eclipse.emf.cdo.jaxb.CDOObjectRef  {

	

	
	@Override
	public IfcPropertyConstraintRelationship createInstance() {
		return IFC2X3Factory.eINSTANCE.createIfcPropertyConstraintRelationship();
	}
	
	public static IfcPropertyConstraintRelationshipRef valueOf(String id) {
		IfcPropertyConstraintRelationshipRef result = new IfcPropertyConstraintRelationshipRef();
		result.setID(id);
		return result;
	}

	@Override
	public String toString() {
		return getID();
	}
	

}