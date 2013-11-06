package IFC2X3.jaxb;

import javax.xml.bind.annotation.*;
import org.eclipse.emf.ecore.jaxb.*;

import IFC2X3.IFC2X3Factory;
import IFC2X3.IfcDoorLiningProperties;

@XmlRootElement(name = "IfcDoorLiningPropertiesRefElement")
public class IfcDoorLiningPropertiesRef extends IFC2X3.jaxb.IfcPropertySetDefinitionRef  {

	

	
	@Override
	public IfcDoorLiningProperties createInstance() {
		return IFC2X3Factory.eINSTANCE.createIfcDoorLiningProperties();
	}
	
	public static IfcDoorLiningPropertiesRef valueOf(String id) {
		IfcDoorLiningPropertiesRef result = new IfcDoorLiningPropertiesRef();
		result.setID(id);
		return result;
	}

	@Override
	public String toString() {
		return getID();
	}
	

}