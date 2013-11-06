package IFC2X3.jaxb;

import javax.xml.bind.annotation.*;
import org.eclipse.emf.ecore.jaxb.*;

import IFC2X3.IFC2X3Factory;
import IFC2X3.IfcDateAndTime;

@XmlRootElement(name = "IfcDateAndTimeRefElement")
public class IfcDateAndTimeRef extends IFC2X3.jaxb.IfcDateTimeSelectRef  {

	

	
	@Override
	public IfcDateAndTime createInstance() {
		return IFC2X3Factory.eINSTANCE.createIfcDateAndTime();
	}
	
	public static IfcDateAndTimeRef valueOf(String id) {
		IfcDateAndTimeRef result = new IfcDateAndTimeRef();
		result.setID(id);
		return result;
	}

	@Override
	public String toString() {
		return getID();
	}
	

}