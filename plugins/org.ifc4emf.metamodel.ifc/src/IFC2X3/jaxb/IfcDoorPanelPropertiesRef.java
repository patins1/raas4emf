package IFC2X3.jaxb;

import javax.xml.bind.annotation.*;
import org.eclipse.emf.ecore.jaxb.*;

import IFC2X3.IFC2X3Factory;
import IFC2X3.IfcDoorPanelProperties;

@XmlRootElement(name = "IfcDoorPanelPropertiesRefElement")
public class IfcDoorPanelPropertiesRef extends IFC2X3.jaxb.IfcPropertySetDefinitionRef  {

	

	
	@Override
	public IfcDoorPanelProperties createInstance() {
		return IFC2X3Factory.eINSTANCE.createIfcDoorPanelProperties();
	}
	
	public static IfcDoorPanelPropertiesRef valueOf(String id) {
		IfcDoorPanelPropertiesRef result = new IfcDoorPanelPropertiesRef();
		result.setID(id);
		return result;
	}

	@Override
	public String toString() {
		return getID();
	}
	

}