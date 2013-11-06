package IFC2X3.jaxb;

import javax.xml.bind.annotation.*;
import org.eclipse.emf.ecore.jaxb.*;

import IFC2X3.IFC2X3Factory;
import IFC2X3.IfcWorkSchedule;

@XmlRootElement(name = "IfcWorkScheduleRefElement")
public class IfcWorkScheduleRef extends IFC2X3.jaxb.IfcWorkControlRef  {

	

	
	@Override
	public IfcWorkSchedule createInstance() {
		return IFC2X3Factory.eINSTANCE.createIfcWorkSchedule();
	}
	
	public static IfcWorkScheduleRef valueOf(String id) {
		IfcWorkScheduleRef result = new IfcWorkScheduleRef();
		result.setID(id);
		return result;
	}

	@Override
	public String toString() {
		return getID();
	}
	

}