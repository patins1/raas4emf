package IFC2X3.jaxb;

import javax.xml.bind.annotation.*;
import org.eclipse.emf.ecore.jaxb.*;

import IFC2X3.IFC2X3Factory;
import IFC2X3.IfcDraughtingCalloutRelationship;

@XmlRootElement(name = "IfcDraughtingCalloutRelationshipRefElement")
public class IfcDraughtingCalloutRelationshipRef extends org.eclipse.emf.cdo.jaxb.CDOObjectRef  {

	

	
	@Override
	public IfcDraughtingCalloutRelationship createInstance() {
		return IFC2X3Factory.eINSTANCE.createIfcDraughtingCalloutRelationship();
	}
	
	public static IfcDraughtingCalloutRelationshipRef valueOf(String id) {
		IfcDraughtingCalloutRelationshipRef result = new IfcDraughtingCalloutRelationshipRef();
		result.setID(id);
		return result;
	}

	@Override
	public String toString() {
		return getID();
	}
	

}