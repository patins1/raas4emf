package IFC2X3.jaxb;

import javax.xml.bind.annotation.*;
import org.eclipse.emf.ecore.jaxb.*;

import IFC2X3.IFC2X3Factory;
import IFC2X3.IfcRampFlightType;

@XmlRootElement(name = "IfcRampFlightTypeRefElement")
public class IfcRampFlightTypeRef extends IFC2X3.jaxb.IfcBuildingElementTypeRef  {

	

	
	@Override
	public IfcRampFlightType createInstance() {
		return IFC2X3Factory.eINSTANCE.createIfcRampFlightType();
	}
	
	public static IfcRampFlightTypeRef valueOf(String id) {
		IfcRampFlightTypeRef result = new IfcRampFlightTypeRef();
		result.setID(id);
		return result;
	}

	@Override
	public String toString() {
		return getID();
	}
	

}