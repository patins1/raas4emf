package IFC2X3.jaxb;

import javax.xml.bind.annotation.*;
import org.eclipse.emf.ecore.jaxb.*;

import IFC2X3.IFC2X3Factory;
import IFC2X3.IfcWindowLiningProperties;

@XmlRootElement(name = "IfcWindowLiningPropertiesRefElement")
public class IfcWindowLiningPropertiesRef extends IFC2X3.jaxb.IfcPropertySetDefinitionRef  {

	

	
	@Override
	public IfcWindowLiningProperties createInstance() {
		return IFC2X3Factory.eINSTANCE.createIfcWindowLiningProperties();
	}
	
	public static IfcWindowLiningPropertiesRef valueOf(String id) {
		IfcWindowLiningPropertiesRef result = new IfcWindowLiningPropertiesRef();
		result.setID(id);
		return result;
	}

	@Override
	public String toString() {
		return getID();
	}
	

}