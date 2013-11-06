package IFC2X3.jaxb;

import javax.xml.bind.annotation.*;
import org.eclipse.emf.ecore.jaxb.*;

import IFC2X3.IFC2X3Factory;
import IFC2X3.IfcElementComponentType;

@XmlRootElement(name = "IfcElementComponentTypeRefElement")
public class IfcElementComponentTypeRef extends IFC2X3.jaxb.IfcElementTypeRef  {

	

	
	@Override
	public IfcElementComponentType createInstance() {
		return IFC2X3Factory.eINSTANCE.createIfcElementComponentType();
	}
	
	public static IfcElementComponentTypeRef valueOf(String id) {
		IfcElementComponentTypeRef result = new IfcElementComponentTypeRef();
		result.setID(id);
		return result;
	}

	@Override
	public String toString() {
		return getID();
	}
	

}