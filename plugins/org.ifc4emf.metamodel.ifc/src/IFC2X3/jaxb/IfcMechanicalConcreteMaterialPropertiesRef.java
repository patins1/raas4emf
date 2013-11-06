package IFC2X3.jaxb;

import javax.xml.bind.annotation.*;
import org.eclipse.emf.ecore.jaxb.*;

import IFC2X3.IFC2X3Factory;
import IFC2X3.IfcMechanicalConcreteMaterialProperties;

@XmlRootElement(name = "IfcMechanicalConcreteMaterialPropertiesRefElement")
public class IfcMechanicalConcreteMaterialPropertiesRef extends IFC2X3.jaxb.IfcMechanicalMaterialPropertiesRef  {

	

	
	@Override
	public IfcMechanicalConcreteMaterialProperties createInstance() {
		return IFC2X3Factory.eINSTANCE.createIfcMechanicalConcreteMaterialProperties();
	}
	
	public static IfcMechanicalConcreteMaterialPropertiesRef valueOf(String id) {
		IfcMechanicalConcreteMaterialPropertiesRef result = new IfcMechanicalConcreteMaterialPropertiesRef();
		result.setID(id);
		return result;
	}

	@Override
	public String toString() {
		return getID();
	}
	

}