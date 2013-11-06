package IFC2X3.jaxb;

import javax.xml.bind.annotation.*;
import org.eclipse.emf.ecore.jaxb.*;

import IFC2X3.IFC2X3Factory;
import IFC2X3.IfcResource;

@XmlRootElement(name = "IfcResourceRefElement")
public class IfcResourceRef extends IFC2X3.jaxb.IfcObjectRef  {

	

	
	@Override
	public IfcResource createInstance() {
		return IFC2X3Factory.eINSTANCE.createIfcResource();
	}
	
	public static IfcResourceRef valueOf(String id) {
		IfcResourceRef result = new IfcResourceRef();
		result.setID(id);
		return result;
	}

	@Override
	public String toString() {
		return getID();
	}
	

}