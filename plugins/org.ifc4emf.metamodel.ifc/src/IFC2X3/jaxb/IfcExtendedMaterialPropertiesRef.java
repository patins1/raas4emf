package IFC2X3.jaxb;

import javax.xml.bind.annotation.*;
import org.eclipse.emf.ecore.jaxb.*;

import IFC2X3.IFC2X3Factory;
import IFC2X3.IfcExtendedMaterialProperties;

@XmlRootElement(name = "IfcExtendedMaterialPropertiesRefElement")
public class IfcExtendedMaterialPropertiesRef extends IFC2X3.jaxb.IfcMaterialPropertiesRef  {

	

	
	@Override
	public IfcExtendedMaterialProperties createInstance() {
		return IFC2X3Factory.eINSTANCE.createIfcExtendedMaterialProperties();
	}
	
	public static IfcExtendedMaterialPropertiesRef valueOf(String id) {
		IfcExtendedMaterialPropertiesRef result = new IfcExtendedMaterialPropertiesRef();
		result.setID(id);
		return result;
	}

	@Override
	public String toString() {
		return getID();
	}
	

}