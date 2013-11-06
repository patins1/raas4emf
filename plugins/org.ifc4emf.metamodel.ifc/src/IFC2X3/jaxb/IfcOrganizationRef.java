package IFC2X3.jaxb;

import javax.xml.bind.annotation.*;
import org.eclipse.emf.ecore.jaxb.*;

import IFC2X3.IFC2X3Factory;
import IFC2X3.IfcOrganization;

@XmlRootElement(name = "IfcOrganizationRefElement")
public class IfcOrganizationRef extends IFC2X3.jaxb.IfcActorSelectRef  {

	

	
	@Override
	public IfcOrganization createInstance() {
		return IFC2X3Factory.eINSTANCE.createIfcOrganization();
	}
	
	public static IfcOrganizationRef valueOf(String id) {
		IfcOrganizationRef result = new IfcOrganizationRef();
		result.setID(id);
		return result;
	}

	@Override
	public String toString() {
		return getID();
	}
	

}