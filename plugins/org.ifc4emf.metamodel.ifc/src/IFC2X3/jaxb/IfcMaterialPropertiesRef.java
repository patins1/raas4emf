package IFC2X3.jaxb;

import javax.xml.bind.annotation.*;
import org.eclipse.emf.ecore.jaxb.*;

import IFC2X3.IFC2X3Factory;
import IFC2X3.IfcMaterialProperties;

@XmlRootElement(name = "IfcMaterialPropertiesRefElement")
public class IfcMaterialPropertiesRef extends org.eclipse.emf.cdo.jaxb.CDOObjectRef  {

	

	
	@Override
	public IfcMaterialProperties createInstance() {
		return IFC2X3Factory.eINSTANCE.createIfcMaterialProperties();
	}
	
	public static IfcMaterialPropertiesRef valueOf(String id) {
		IfcMaterialPropertiesRef result = new IfcMaterialPropertiesRef();
		result.setID(id);
		return result;
	}

	@Override
	public String toString() {
		return getID();
	}
	

}