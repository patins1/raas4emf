package IFC2X3.jaxb;

import javax.xml.bind.annotation.*;
import org.eclipse.emf.ecore.jaxb.*;

import IFC2X3.IFC2X3Factory;
import IFC2X3.IfcMechanicalMaterialProperties;

@XmlRootElement(name = "IfcMechanicalMaterialPropertiesRefElement")
public class IfcMechanicalMaterialPropertiesRef extends IFC2X3.jaxb.IfcMaterialPropertiesRef  {

	

	
	@Override
	public IfcMechanicalMaterialProperties createInstance() {
		return IFC2X3Factory.eINSTANCE.createIfcMechanicalMaterialProperties();
	}
	
	public static IfcMechanicalMaterialPropertiesRef valueOf(String id) {
		IfcMechanicalMaterialPropertiesRef result = new IfcMechanicalMaterialPropertiesRef();
		result.setID(id);
		return result;
	}

	@Override
	public String toString() {
		return getID();
	}
	

}