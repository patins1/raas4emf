package IFC2X3.jaxb;

import javax.xml.bind.annotation.*;
import org.eclipse.emf.ecore.jaxb.*;

import IFC2X3.IFC2X3Factory;
import IFC2X3.IfcMechanicalSteelMaterialProperties;

@XmlRootElement(name = "IfcMechanicalSteelMaterialPropertiesRefElement")
public class IfcMechanicalSteelMaterialPropertiesRef extends IFC2X3.jaxb.IfcMechanicalMaterialPropertiesRef  {

	

	
	@Override
	public IfcMechanicalSteelMaterialProperties createInstance() {
		return IFC2X3Factory.eINSTANCE.createIfcMechanicalSteelMaterialProperties();
	}
	
	public static IfcMechanicalSteelMaterialPropertiesRef valueOf(String id) {
		IfcMechanicalSteelMaterialPropertiesRef result = new IfcMechanicalSteelMaterialPropertiesRef();
		result.setID(id);
		return result;
	}

	@Override
	public String toString() {
		return getID();
	}
	

}