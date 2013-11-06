package IFC2X3.jaxb;

import javax.xml.bind.annotation.*;
import org.eclipse.emf.ecore.jaxb.*;

import IFC2X3.IFC2X3Factory;
import IFC2X3.IfcTypeObject;

@XmlRootElement(name = "IfcTypeObjectRefElement")
public class IfcTypeObjectRef extends IFC2X3.jaxb.IfcObjectDefinitionRef  {

	

	
	@Override
	public IfcTypeObject createInstance() {
		return IFC2X3Factory.eINSTANCE.createIfcTypeObject();
	}
	
	public static IfcTypeObjectRef valueOf(String id) {
		IfcTypeObjectRef result = new IfcTypeObjectRef();
		result.setID(id);
		return result;
	}

	@Override
	public String toString() {
		return getID();
	}
	

}