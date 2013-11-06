package IFC2X3.jaxb;

import javax.xml.bind.annotation.*;
import org.eclipse.emf.ecore.jaxb.*;

import IFC2X3.IFC2X3Factory;
import IFC2X3.IfcGeneralMaterialProperties;

@XmlRootElement(name = "IfcGeneralMaterialPropertiesRefElement")
public class IfcGeneralMaterialPropertiesRef extends IFC2X3.jaxb.IfcMaterialPropertiesRef  {

	

	
	@Override
	public IfcGeneralMaterialProperties createInstance() {
		return IFC2X3Factory.eINSTANCE.createIfcGeneralMaterialProperties();
	}
	
	public static IfcGeneralMaterialPropertiesRef valueOf(String id) {
		IfcGeneralMaterialPropertiesRef result = new IfcGeneralMaterialPropertiesRef();
		result.setID(id);
		return result;
	}

	@Override
	public String toString() {
		return getID();
	}
	

}