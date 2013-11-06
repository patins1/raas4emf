package IFC2X3.jaxb;

import javax.xml.bind.annotation.*;
import org.eclipse.emf.ecore.jaxb.*;

import IFC2X3.IFC2X3Factory;
import IFC2X3.IfcGeneralProfileProperties;

@XmlRootElement(name = "IfcGeneralProfilePropertiesRefElement")
public class IfcGeneralProfilePropertiesRef extends IFC2X3.jaxb.IfcProfilePropertiesRef  {

	

	
	@Override
	public IfcGeneralProfileProperties createInstance() {
		return IFC2X3Factory.eINSTANCE.createIfcGeneralProfileProperties();
	}
	
	public static IfcGeneralProfilePropertiesRef valueOf(String id) {
		IfcGeneralProfilePropertiesRef result = new IfcGeneralProfilePropertiesRef();
		result.setID(id);
		return result;
	}

	@Override
	public String toString() {
		return getID();
	}
	

}