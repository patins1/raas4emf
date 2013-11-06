package IFC2X3.jaxb;

import javax.xml.bind.annotation.*;
import org.eclipse.emf.ecore.jaxb.*;

import IFC2X3.IFC2X3Factory;
import IFC2X3.IfcRelOverridesProperties;

@XmlRootElement(name = "IfcRelOverridesPropertiesRefElement")
public class IfcRelOverridesPropertiesRef extends IFC2X3.jaxb.IfcRelDefinesByPropertiesRef  {

	

	
	@Override
	public IfcRelOverridesProperties createInstance() {
		return IFC2X3Factory.eINSTANCE.createIfcRelOverridesProperties();
	}
	
	public static IfcRelOverridesPropertiesRef valueOf(String id) {
		IfcRelOverridesPropertiesRef result = new IfcRelOverridesPropertiesRef();
		result.setID(id);
		return result;
	}

	@Override
	public String toString() {
		return getID();
	}
	

}