package IFC2X3.jaxb;

import javax.xml.bind.annotation.*;
import org.eclipse.emf.ecore.jaxb.*;

import IFC2X3.IFC2X3Factory;
import IFC2X3.IfcDraughtingCallout;

@XmlRootElement(name = "IfcDraughtingCalloutRefElement")
public class IfcDraughtingCalloutRef extends IFC2X3.jaxb.IfcGeometricRepresentationItemRef  {

	

	
	@Override
	public IfcDraughtingCallout createInstance() {
		return IFC2X3Factory.eINSTANCE.createIfcDraughtingCallout();
	}
	
	public static IfcDraughtingCalloutRef valueOf(String id) {
		IfcDraughtingCalloutRef result = new IfcDraughtingCalloutRef();
		result.setID(id);
		return result;
	}

	@Override
	public String toString() {
		return getID();
	}
	

}