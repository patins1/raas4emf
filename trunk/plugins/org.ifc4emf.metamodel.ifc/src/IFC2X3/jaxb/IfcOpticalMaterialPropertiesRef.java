package IFC2X3.jaxb;

import javax.xml.bind.annotation.*;
import org.eclipse.emf.ecore.jaxb.*;

import IFC2X3.IFC2X3Factory;
import IFC2X3.IfcOpticalMaterialProperties;

@XmlRootElement(name = "IfcOpticalMaterialPropertiesRefElement")
public class IfcOpticalMaterialPropertiesRef extends IFC2X3.jaxb.IfcMaterialPropertiesRef  {

	

	
	@Override
	public IfcOpticalMaterialProperties createInstance() {
		return IFC2X3Factory.eINSTANCE.createIfcOpticalMaterialProperties();
	}
	
	public static IfcOpticalMaterialPropertiesRef valueOf(String id) {
		IfcOpticalMaterialPropertiesRef result = new IfcOpticalMaterialPropertiesRef();
		result.setID(id);
		return result;
	}

	@Override
	public String toString() {
		return getID();
	}
	

}