package IFC2X3.jaxb;

import javax.xml.bind.annotation.*;
import org.eclipse.emf.ecore.jaxb.*;

import IFC2X3.IFC2X3Factory;
import IFC2X3.IfcConstraintClassificationRelationship;

@XmlRootElement(name = "IfcConstraintClassificationRelationshipRefElement")
public class IfcConstraintClassificationRelationshipRef extends org.eclipse.emf.cdo.jaxb.CDOObjectRef  {

	

	
	@Override
	public IfcConstraintClassificationRelationship createInstance() {
		return IFC2X3Factory.eINSTANCE.createIfcConstraintClassificationRelationship();
	}
	
	public static IfcConstraintClassificationRelationshipRef valueOf(String id) {
		IfcConstraintClassificationRelationshipRef result = new IfcConstraintClassificationRelationshipRef();
		result.setID(id);
		return result;
	}

	@Override
	public String toString() {
		return getID();
	}
	

}