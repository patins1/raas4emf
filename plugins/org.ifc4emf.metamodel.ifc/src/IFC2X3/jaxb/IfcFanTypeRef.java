package IFC2X3.jaxb;

import javax.xml.bind.annotation.*;
import org.eclipse.emf.ecore.jaxb.*;

import IFC2X3.IFC2X3Factory;
import IFC2X3.IfcFanType;

@XmlRootElement(name = "IfcFanTypeRefElement")
public class IfcFanTypeRef extends IFC2X3.jaxb.IfcFlowMovingDeviceTypeRef  {

	

	
	@Override
	public IfcFanType createInstance() {
		return IFC2X3Factory.eINSTANCE.createIfcFanType();
	}
	
	public static IfcFanTypeRef valueOf(String id) {
		IfcFanTypeRef result = new IfcFanTypeRef();
		result.setID(id);
		return result;
	}

	@Override
	public String toString() {
		return getID();
	}
	

}