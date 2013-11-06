package IFC2X3.jaxb;

import javax.xml.bind.annotation.*;
import org.eclipse.emf.ecore.jaxb.*;

import IFC2X3.IFC2X3Factory;
import IFC2X3.IfcStructuralSteelProfileProperties;

@XmlRootElement(name = "IfcStructuralSteelProfilePropertiesRefElement")
public class IfcStructuralSteelProfilePropertiesRef extends IFC2X3.jaxb.IfcStructuralProfilePropertiesRef  {

	

	
	@Override
	public IfcStructuralSteelProfileProperties createInstance() {
		return IFC2X3Factory.eINSTANCE.createIfcStructuralSteelProfileProperties();
	}
	
	public static IfcStructuralSteelProfilePropertiesRef valueOf(String id) {
		IfcStructuralSteelProfilePropertiesRef result = new IfcStructuralSteelProfilePropertiesRef();
		result.setID(id);
		return result;
	}

	@Override
	public String toString() {
		return getID();
	}
	

}