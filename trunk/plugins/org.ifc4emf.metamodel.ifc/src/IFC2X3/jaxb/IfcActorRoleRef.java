package IFC2X3.jaxb;

import javax.xml.bind.annotation.*;
import org.eclipse.emf.ecore.jaxb.*;

import IFC2X3.IFC2X3Factory;
import IFC2X3.IfcActorRole;

@XmlRootElement(name = "IfcActorRoleRefElement")
public class IfcActorRoleRef extends org.eclipse.emf.cdo.jaxb.CDOObjectRef  {

	

	
	@Override
	public IfcActorRole createInstance() {
		return IFC2X3Factory.eINSTANCE.createIfcActorRole();
	}
	
	public static IfcActorRoleRef valueOf(String id) {
		IfcActorRoleRef result = new IfcActorRoleRef();
		result.setID(id);
		return result;
	}

	@Override
	public String toString() {
		return getID();
	}
	

}