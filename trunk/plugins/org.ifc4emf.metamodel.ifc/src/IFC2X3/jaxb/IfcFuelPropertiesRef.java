package IFC2X3.jaxb;

import javax.xml.bind.annotation.*;
import org.eclipse.emf.ecore.jaxb.*;

import IFC2X3.IFC2X3Factory;
import IFC2X3.IfcFuelProperties;

@XmlRootElement(name = "IfcFuelPropertiesRefElement")
public class IfcFuelPropertiesRef extends IFC2X3.jaxb.IfcMaterialPropertiesRef  {

	

	
	@Override
	public IfcFuelProperties createInstance() {
		return IFC2X3Factory.eINSTANCE.createIfcFuelProperties();
	}
	
	public static IfcFuelPropertiesRef valueOf(String id) {
		IfcFuelPropertiesRef result = new IfcFuelPropertiesRef();
		result.setID(id);
		return result;
	}

	@Override
	public String toString() {
		return getID();
	}
	

}