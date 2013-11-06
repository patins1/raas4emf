package IFC2X3.jaxb;

import javax.xml.bind.annotation.*;
import org.eclipse.emf.ecore.jaxb.*;

import IFC2X3.IFC2X3Factory;
import IFC2X3.IfcScheduleTimeControl;

@XmlRootElement(name = "IfcScheduleTimeControlRefElement")
public class IfcScheduleTimeControlRef extends IFC2X3.jaxb.IfcControlRef  {

	

	
	@Override
	public IfcScheduleTimeControl createInstance() {
		return IFC2X3Factory.eINSTANCE.createIfcScheduleTimeControl();
	}
	
	public static IfcScheduleTimeControlRef valueOf(String id) {
		IfcScheduleTimeControlRef result = new IfcScheduleTimeControlRef();
		result.setID(id);
		return result;
	}

	@Override
	public String toString() {
		return getID();
	}
	

}