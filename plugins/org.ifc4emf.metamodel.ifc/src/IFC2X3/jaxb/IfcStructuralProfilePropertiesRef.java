package IFC2X3.jaxb;

import javax.xml.bind.annotation.*;
import org.eclipse.emf.ecore.jaxb.*;

import IFC2X3.IFC2X3Factory;
import IFC2X3.IfcStructuralProfileProperties;

@XmlRootElement(name = "IfcStructuralProfilePropertiesRefElement")
public class IfcStructuralProfilePropertiesRef extends IFC2X3.jaxb.IfcGeneralProfilePropertiesRef  {

	

	
	@Override
	public IfcStructuralProfileProperties createInstance() {
		return IFC2X3Factory.eINSTANCE.createIfcStructuralProfileProperties();
	}
	
	public static IfcStructuralProfilePropertiesRef valueOf(String id) {
		IfcStructuralProfilePropertiesRef result = new IfcStructuralProfilePropertiesRef();
		result.setID(id);
		return result;
	}

	@Override
	public String toString() {
		return getID();
	}
	

}