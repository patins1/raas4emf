package IFC2X3.jaxb;

import javax.xml.bind.annotation.*;
import org.eclipse.emf.ecore.jaxb.*;

import IFC2X3.IFC2X3Factory;
import IFC2X3.IfcLocalTime;

@XmlRootElement(name = "IfcLocalTimeRefElement")
public class IfcLocalTimeRef extends IFC2X3.jaxb.IfcDateTimeSelectRef  {

	

	
	@Override
	public IfcLocalTime createInstance() {
		return IFC2X3Factory.eINSTANCE.createIfcLocalTime();
	}
	
	public static IfcLocalTimeRef valueOf(String id) {
		IfcLocalTimeRef result = new IfcLocalTimeRef();
		result.setID(id);
		return result;
	}

	@Override
	public String toString() {
		return getID();
	}
	

}