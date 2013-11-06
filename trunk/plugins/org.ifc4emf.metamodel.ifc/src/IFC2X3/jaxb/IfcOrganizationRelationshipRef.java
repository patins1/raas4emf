package IFC2X3.jaxb;

import javax.xml.bind.annotation.*;
import org.eclipse.emf.ecore.jaxb.*;

import IFC2X3.IFC2X3Factory;
import IFC2X3.IfcOrganizationRelationship;

@XmlRootElement(name = "IfcOrganizationRelationshipRefElement")
public class IfcOrganizationRelationshipRef extends org.eclipse.emf.cdo.jaxb.CDOObjectRef  {

	

	
	@Override
	public IfcOrganizationRelationship createInstance() {
		return IFC2X3Factory.eINSTANCE.createIfcOrganizationRelationship();
	}
	
	public static IfcOrganizationRelationshipRef valueOf(String id) {
		IfcOrganizationRelationshipRef result = new IfcOrganizationRelationshipRef();
		result.setID(id);
		return result;
	}

	@Override
	public String toString() {
		return getID();
	}
	

}