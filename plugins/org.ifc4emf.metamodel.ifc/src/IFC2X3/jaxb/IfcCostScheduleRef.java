package IFC2X3.jaxb;

import javax.xml.bind.annotation.*;
import org.eclipse.emf.ecore.jaxb.*;

import IFC2X3.IFC2X3Factory;
import IFC2X3.IfcCostSchedule;

@XmlRootElement(name = "IfcCostScheduleRefElement")
public class IfcCostScheduleRef extends IFC2X3.jaxb.IfcControlRef  {

	

	
	@Override
	public IfcCostSchedule createInstance() {
		return IFC2X3Factory.eINSTANCE.createIfcCostSchedule();
	}
	
	public static IfcCostScheduleRef valueOf(String id) {
		IfcCostScheduleRef result = new IfcCostScheduleRef();
		result.setID(id);
		return result;
	}

	@Override
	public String toString() {
		return getID();
	}
	

}