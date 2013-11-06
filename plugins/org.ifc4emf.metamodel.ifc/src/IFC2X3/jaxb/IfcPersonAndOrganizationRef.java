package IFC2X3.jaxb;

import javax.xml.bind.annotation.*;
import org.eclipse.emf.ecore.jaxb.*;

import IFC2X3.IFC2X3Factory;
import IFC2X3.IfcPersonAndOrganization;

@XmlRootElement(name = "IfcPersonAndOrganizationRefElement")
public class IfcPersonAndOrganizationRef extends IFC2X3.jaxb.IfcActorSelectRef  {

	

	
	@Override
	public IfcPersonAndOrganization createInstance() {
		return IFC2X3Factory.eINSTANCE.createIfcPersonAndOrganization();
	}
	
	public static IfcPersonAndOrganizationRef valueOf(String id) {
		IfcPersonAndOrganizationRef result = new IfcPersonAndOrganizationRef();
		result.setID(id);
		return result;
	}

	@Override
	public String toString() {
		return getID();
	}
	

}