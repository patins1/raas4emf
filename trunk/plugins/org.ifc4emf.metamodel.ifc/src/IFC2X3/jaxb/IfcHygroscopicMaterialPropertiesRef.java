package IFC2X3.jaxb;

import javax.xml.bind.annotation.*;
import org.eclipse.emf.ecore.jaxb.*;

import IFC2X3.IFC2X3Factory;
import IFC2X3.IfcHygroscopicMaterialProperties;

@XmlRootElement(name = "IfcHygroscopicMaterialPropertiesRefElement")
public class IfcHygroscopicMaterialPropertiesRef extends IFC2X3.jaxb.IfcMaterialPropertiesRef  {

	

	
	@Override
	public IfcHygroscopicMaterialProperties createInstance() {
		return IFC2X3Factory.eINSTANCE.createIfcHygroscopicMaterialProperties();
	}
	
	public static IfcHygroscopicMaterialPropertiesRef valueOf(String id) {
		IfcHygroscopicMaterialPropertiesRef result = new IfcHygroscopicMaterialPropertiesRef();
		result.setID(id);
		return result;
	}

	@Override
	public String toString() {
		return getID();
	}
	

}