package IFC2X3.jaxb;

import javax.xml.bind.annotation.*;
import org.eclipse.emf.ecore.jaxb.*;

import IFC2X3.IFC2X3Factory;
import IFC2X3.IfcWaterProperties;

@XmlRootElement(name = "IfcWaterPropertiesRefElement")
public class IfcWaterPropertiesRef extends IFC2X3.jaxb.IfcMaterialPropertiesRef  {

	

	
	@Override
	public IfcWaterProperties createInstance() {
		return IFC2X3Factory.eINSTANCE.createIfcWaterProperties();
	}
	
	public static IfcWaterPropertiesRef valueOf(String id) {
		IfcWaterPropertiesRef result = new IfcWaterPropertiesRef();
		result.setID(id);
		return result;
	}

	@Override
	public String toString() {
		return getID();
	}
	

}