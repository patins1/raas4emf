package IFC2X3.jaxb;

import javax.xml.bind.annotation.*;
import org.eclipse.emf.ecore.jaxb.*;

import IFC2X3.IFC2X3Factory;
import IFC2X3.IfcRibPlateProfileProperties;

@XmlRootElement(name = "IfcRibPlateProfilePropertiesRefElement")
public class IfcRibPlateProfilePropertiesRef extends IFC2X3.jaxb.IfcProfilePropertiesRef  {

	

	
	@Override
	public IfcRibPlateProfileProperties createInstance() {
		return IFC2X3Factory.eINSTANCE.createIfcRibPlateProfileProperties();
	}
	
	public static IfcRibPlateProfilePropertiesRef valueOf(String id) {
		IfcRibPlateProfilePropertiesRef result = new IfcRibPlateProfilePropertiesRef();
		result.setID(id);
		return result;
	}

	@Override
	public String toString() {
		return getID();
	}
	

}