package IFC2X3.jaxb;

import javax.xml.bind.annotation.*;
import org.eclipse.emf.ecore.jaxb.*;

import IFC2X3.IFC2X3Factory;
import IFC2X3.IfcSpaceThermalLoadProperties;

@XmlRootElement(name = "IfcSpaceThermalLoadPropertiesRefElement")
public class IfcSpaceThermalLoadPropertiesRef extends IFC2X3.jaxb.IfcPropertySetDefinitionRef  {

	

	
	@Override
	public IfcSpaceThermalLoadProperties createInstance() {
		return IFC2X3Factory.eINSTANCE.createIfcSpaceThermalLoadProperties();
	}
	
	public static IfcSpaceThermalLoadPropertiesRef valueOf(String id) {
		IfcSpaceThermalLoadPropertiesRef result = new IfcSpaceThermalLoadPropertiesRef();
		result.setID(id);
		return result;
	}

	@Override
	public String toString() {
		return getID();
	}
	

}