package IFC2X3.jaxb;

import javax.xml.bind.annotation.*;
import org.eclipse.emf.ecore.jaxb.*;

import IFC2X3.IFC2X3Factory;
import IFC2X3.IfcObjectDefinition;

@XmlRootElement(name = "IfcObjectDefinitionRefElement")
public class IfcObjectDefinitionRef extends IFC2X3.jaxb.IfcRootRef  {

	

	
	@Override
	public IfcObjectDefinition createInstance() {
		return IFC2X3Factory.eINSTANCE.createIfcObjectDefinition();
	}
	
	public static IfcObjectDefinitionRef valueOf(String id) {
		IfcObjectDefinitionRef result = new IfcObjectDefinitionRef();
		result.setID(id);
		return result;
	}

	@Override
	public String toString() {
		return getID();
	}
	

}