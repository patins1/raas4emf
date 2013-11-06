package IFC2X3.jaxb;

import javax.xml.bind.annotation.*;
import org.eclipse.emf.ecore.jaxb.*;

import IFC2X3.IFC2X3Factory;
import IFC2X3.IfcDoor;

@XmlRootElement(name = "IfcDoorRefElement")
public class IfcDoorRef extends IFC2X3.jaxb.IfcBuildingElementRef  {

	

	
	@Override
	public IfcDoor createInstance() {
		return IFC2X3Factory.eINSTANCE.createIfcDoor();
	}
	
	public static IfcDoorRef valueOf(String id) {
		IfcDoorRef result = new IfcDoorRef();
		result.setID(id);
		return result;
	}

	@Override
	public String toString() {
		return getID();
	}
	

}