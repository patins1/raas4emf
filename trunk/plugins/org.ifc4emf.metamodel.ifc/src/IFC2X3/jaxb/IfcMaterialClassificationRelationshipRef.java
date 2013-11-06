package IFC2X3.jaxb;

import javax.xml.bind.annotation.*;
import org.eclipse.emf.ecore.jaxb.*;

import IFC2X3.IFC2X3Factory;
import IFC2X3.IfcMaterialClassificationRelationship;

@XmlRootElement(name = "IfcMaterialClassificationRelationshipRefElement")
public class IfcMaterialClassificationRelationshipRef extends org.eclipse.emf.cdo.jaxb.CDOObjectRef  {

	

	
	@Override
	public IfcMaterialClassificationRelationship createInstance() {
		return IFC2X3Factory.eINSTANCE.createIfcMaterialClassificationRelationship();
	}
	
	public static IfcMaterialClassificationRelationshipRef valueOf(String id) {
		IfcMaterialClassificationRelationshipRef result = new IfcMaterialClassificationRelationshipRef();
		result.setID(id);
		return result;
	}

	@Override
	public String toString() {
		return getID();
	}
	

}