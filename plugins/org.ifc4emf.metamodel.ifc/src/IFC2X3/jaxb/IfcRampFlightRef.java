package IFC2X3.jaxb;

import javax.xml.bind.annotation.*;
import org.eclipse.emf.ecore.jaxb.*;

import IFC2X3.IFC2X3Factory;
import IFC2X3.IfcRampFlight;

@XmlRootElement(name = "IfcRampFlightRefElement")
public class IfcRampFlightRef extends IFC2X3.jaxb.IfcBuildingElementRef  {

	

	
	@Override
	public IfcRampFlight createInstance() {
		return IFC2X3Factory.eINSTANCE.createIfcRampFlight();
	}
	
	public static IfcRampFlightRef valueOf(String id) {
		IfcRampFlightRef result = new IfcRampFlightRef();
		result.setID(id);
		return result;
	}

	@Override
	public String toString() {
		return getID();
	}
	

}