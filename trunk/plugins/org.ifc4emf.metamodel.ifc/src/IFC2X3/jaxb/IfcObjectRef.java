package IFC2X3.jaxb;

import javax.xml.bind.annotation.*;
import org.eclipse.emf.ecore.jaxb.*;

import IFC2X3.IFC2X3Factory;
import IFC2X3.IfcObject;

@XmlRootElement(name = "IfcObjectRefElement")
public class IfcObjectRef extends IFC2X3.jaxb.IfcObjectDefinitionRef  {

	

	
	@Override
	public IfcObject createInstance() {
		return IFC2X3Factory.eINSTANCE.createIfcObject();
	}
	
	public static IfcObjectRef valueOf(String id) {
		IfcObjectRef result = new IfcObjectRef();
		result.setID(id);
		return result;
	}

	@Override
	public String toString() {
		return getID();
	}
	

}