package IFC2X3.jaxb;

import javax.xml.bind.annotation.*;
import org.eclipse.emf.ecore.jaxb.*;

import IFC2X3.IFC2X3Factory;
import IFC2X3.IfcCalendarDate;

@XmlRootElement(name = "IfcCalendarDateRefElement")
public class IfcCalendarDateRef extends IFC2X3.jaxb.IfcDateTimeSelectRef  {

	

	
	@Override
	public IfcCalendarDate createInstance() {
		return IFC2X3Factory.eINSTANCE.createIfcCalendarDate();
	}
	
	public static IfcCalendarDateRef valueOf(String id) {
		IfcCalendarDateRef result = new IfcCalendarDateRef();
		result.setID(id);
		return result;
	}

	@Override
	public String toString() {
		return getID();
	}
	

}