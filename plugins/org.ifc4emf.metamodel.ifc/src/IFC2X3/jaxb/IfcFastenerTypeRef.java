package IFC2X3.jaxb;

import javax.xml.bind.annotation.*;
import org.eclipse.emf.ecore.jaxb.*;

import IFC2X3.IFC2X3Factory;
import IFC2X3.IfcFastenerType;

@XmlRootElement(name = "IfcFastenerTypeRefElement")
public class IfcFastenerTypeRef extends IFC2X3.jaxb.IfcElementComponentTypeRef  {

	

	
	@Override
	public IfcFastenerType createInstance() {
		return IFC2X3Factory.eINSTANCE.createIfcFastenerType();
	}
	
	public static IfcFastenerTypeRef valueOf(String id) {
		IfcFastenerTypeRef result = new IfcFastenerTypeRef();
		result.setID(id);
		return result;
	}

	@Override
	public String toString() {
		return getID();
	}
	

}