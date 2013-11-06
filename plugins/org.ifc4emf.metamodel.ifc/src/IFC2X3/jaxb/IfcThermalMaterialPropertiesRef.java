package IFC2X3.jaxb;

import javax.xml.bind.annotation.*;
import org.eclipse.emf.ecore.jaxb.*;

import IFC2X3.IFC2X3Factory;
import IFC2X3.IfcThermalMaterialProperties;

@XmlRootElement(name = "IfcThermalMaterialPropertiesRefElement")
public class IfcThermalMaterialPropertiesRef extends IFC2X3.jaxb.IfcMaterialPropertiesRef  {

	

	
	@Override
	public IfcThermalMaterialProperties createInstance() {
		return IFC2X3Factory.eINSTANCE.createIfcThermalMaterialProperties();
	}
	
	public static IfcThermalMaterialPropertiesRef valueOf(String id) {
		IfcThermalMaterialPropertiesRef result = new IfcThermalMaterialPropertiesRef();
		result.setID(id);
		return result;
	}

	@Override
	public String toString() {
		return getID();
	}
	

}