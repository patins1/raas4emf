package IFC2X3.jaxb;

import javax.xml.bind.annotation.*;
import org.eclipse.emf.ecore.jaxb.*;

import IFC2X3.IFC2X3Factory;
import IFC2X3.IfcProject;

@XmlRootElement(name = "IfcProjectRefElement")
public class IfcProjectRef extends IFC2X3.jaxb.IfcObjectRef  {

	

	
	@Override
	public IfcProject createInstance() {
		return IFC2X3Factory.eINSTANCE.createIfcProject();
	}
	
	public static IfcProjectRef valueOf(String id) {
		IfcProjectRef result = new IfcProjectRef();
		result.setID(id);
		return result;
	}

	@Override
	public String toString() {
		return getID();
	}
	

}