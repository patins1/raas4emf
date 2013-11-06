package IFC2X3.jaxb;

import javax.xml.bind.annotation.*;
import org.eclipse.emf.ecore.jaxb.*;

import IFC2X3.IFC2X3Factory;
import IFC2X3.IfcAlarmType;

@XmlRootElement(name = "IfcAlarmTypeRefElement")
public class IfcAlarmTypeRef extends IFC2X3.jaxb.IfcDistributionControlElementTypeRef  {

	

	
	@Override
	public IfcAlarmType createInstance() {
		return IFC2X3Factory.eINSTANCE.createIfcAlarmType();
	}
	
	public static IfcAlarmTypeRef valueOf(String id) {
		IfcAlarmTypeRef result = new IfcAlarmTypeRef();
		result.setID(id);
		return result;
	}

	@Override
	public String toString() {
		return getID();
	}
	

}