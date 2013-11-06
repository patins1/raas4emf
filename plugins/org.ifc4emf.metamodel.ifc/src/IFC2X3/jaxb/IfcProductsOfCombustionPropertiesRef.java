package IFC2X3.jaxb;

import javax.xml.bind.annotation.*;
import org.eclipse.emf.ecore.jaxb.*;

import IFC2X3.IFC2X3Factory;
import IFC2X3.IfcProductsOfCombustionProperties;

@XmlRootElement(name = "IfcProductsOfCombustionPropertiesRefElement")
public class IfcProductsOfCombustionPropertiesRef extends IFC2X3.jaxb.IfcMaterialPropertiesRef  {

	

	
	@Override
	public IfcProductsOfCombustionProperties createInstance() {
		return IFC2X3Factory.eINSTANCE.createIfcProductsOfCombustionProperties();
	}
	
	public static IfcProductsOfCombustionPropertiesRef valueOf(String id) {
		IfcProductsOfCombustionPropertiesRef result = new IfcProductsOfCombustionPropertiesRef();
		result.setID(id);
		return result;
	}

	@Override
	public String toString() {
		return getID();
	}
	

}