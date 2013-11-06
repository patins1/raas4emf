package IFC2X3.jaxb;

import javax.xml.bind.annotation.*;
import org.eclipse.emf.ecore.jaxb.*;

import IFC2X3.IFC2X3Factory;
import IFC2X3.IfcSwitchingDeviceType;

@XmlRootElement(name = "IfcSwitchingDeviceTypeRefElement")
public class IfcSwitchingDeviceTypeRef extends IFC2X3.jaxb.IfcFlowControllerTypeRef  {

	

	
	@Override
	public IfcSwitchingDeviceType createInstance() {
		return IFC2X3Factory.eINSTANCE.createIfcSwitchingDeviceType();
	}
	
	public static IfcSwitchingDeviceTypeRef valueOf(String id) {
		IfcSwitchingDeviceTypeRef result = new IfcSwitchingDeviceTypeRef();
		result.setID(id);
		return result;
	}

	@Override
	public String toString() {
		return getID();
	}
	

}