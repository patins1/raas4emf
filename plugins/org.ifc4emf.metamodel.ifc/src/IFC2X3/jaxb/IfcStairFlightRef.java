package IFC2X3.jaxb;

import javax.xml.bind.annotation.*;
import org.eclipse.emf.ecore.jaxb.*;

import IFC2X3.IFC2X3Factory;
import IFC2X3.IfcStairFlight;

@XmlRootElement(name = "IfcStairFlightRefElement")
public class IfcStairFlightRef extends IFC2X3.jaxb.IfcBuildingElementRef  {

	

	
	@Override
	public IfcStairFlight createInstance() {
		return IFC2X3Factory.eINSTANCE.createIfcStairFlight();
	}
	
	public static IfcStairFlightRef valueOf(String id) {
		IfcStairFlightRef result = new IfcStairFlightRef();
		result.setID(id);
		return result;
	}

	@Override
	public String toString() {
		return getID();
	}
	

}