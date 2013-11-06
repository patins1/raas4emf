package IFC2X3.jaxb;

import javax.xml.bind.annotation.*;
import org.eclipse.emf.ecore.jaxb.*;

import IFC2X3.IFC2X3Factory;
import IFC2X3.IfcPropertySetDefinition;

@XmlRootElement(name = "IfcPropertySetDefinitionRefElement")
public class IfcPropertySetDefinitionRef extends IFC2X3.jaxb.IfcPropertyDefinitionRef  {

	

	
	@Override
	public IfcPropertySetDefinition createInstance() {
		return IFC2X3Factory.eINSTANCE.createIfcPropertySetDefinition();
	}
	
	public static IfcPropertySetDefinitionRef valueOf(String id) {
		IfcPropertySetDefinitionRef result = new IfcPropertySetDefinitionRef();
		result.setID(id);
		return result;
	}

	@Override
	public String toString() {
		return getID();
	}
	

}