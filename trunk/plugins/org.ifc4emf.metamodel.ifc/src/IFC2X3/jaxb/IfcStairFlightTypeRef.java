package IFC2X3.jaxb;

import javax.xml.bind.annotation.*;
import org.eclipse.emf.ecore.jaxb.*;

import IFC2X3.IFC2X3Factory;
import IFC2X3.IfcStairFlightType;

@XmlRootElement(name = "IfcStairFlightTypeRefElement")
public class IfcStairFlightTypeRef extends IFC2X3.jaxb.IfcBuildingElementTypeRef  {

	

	
	@Override
	public IfcStairFlightType createInstance() {
		return IFC2X3Factory.eINSTANCE.createIfcStairFlightType();
	}
	
	public static IfcStairFlightTypeRef valueOf(String id) {
		IfcStairFlightTypeRef result = new IfcStairFlightTypeRef();
		result.setID(id);
		return result;
	}

	@Override
	public String toString() {
		return getID();
	}
	

}