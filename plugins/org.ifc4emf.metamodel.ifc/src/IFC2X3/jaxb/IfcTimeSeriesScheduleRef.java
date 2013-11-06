package IFC2X3.jaxb;

import javax.xml.bind.annotation.*;
import org.eclipse.emf.ecore.jaxb.*;

import IFC2X3.IFC2X3Factory;
import IFC2X3.IfcTimeSeriesSchedule;

@XmlRootElement(name = "IfcTimeSeriesScheduleRefElement")
public class IfcTimeSeriesScheduleRef extends IFC2X3.jaxb.IfcControlRef  {

	

	
	@Override
	public IfcTimeSeriesSchedule createInstance() {
		return IFC2X3Factory.eINSTANCE.createIfcTimeSeriesSchedule();
	}
	
	public static IfcTimeSeriesScheduleRef valueOf(String id) {
		IfcTimeSeriesScheduleRef result = new IfcTimeSeriesScheduleRef();
		result.setID(id);
		return result;
	}

	@Override
	public String toString() {
		return getID();
	}
	

}