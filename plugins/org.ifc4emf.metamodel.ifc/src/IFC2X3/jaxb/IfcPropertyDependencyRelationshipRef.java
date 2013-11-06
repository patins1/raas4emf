package IFC2X3.jaxb;

import javax.xml.bind.annotation.*;
import org.eclipse.emf.ecore.jaxb.*;

import IFC2X3.IFC2X3Factory;
import IFC2X3.IfcPropertyDependencyRelationship;

@XmlRootElement(name = "IfcPropertyDependencyRelationshipRefElement")
public class IfcPropertyDependencyRelationshipRef extends org.eclipse.emf.cdo.jaxb.CDOObjectRef  {

	

	
	@Override
	public IfcPropertyDependencyRelationship createInstance() {
		return IFC2X3Factory.eINSTANCE.createIfcPropertyDependencyRelationship();
	}
	
	public static IfcPropertyDependencyRelationshipRef valueOf(String id) {
		IfcPropertyDependencyRelationshipRef result = new IfcPropertyDependencyRelationshipRef();
		result.setID(id);
		return result;
	}

	@Override
	public String toString() {
		return getID();
	}
	

}