package IFC2X3.jaxb;

import javax.xml.bind.annotation.*;
import org.eclipse.emf.ecore.jaxb.*;

import IFC2X3.IFC2X3Factory;
import IFC2X3.IfcProtectiveDeviceType;

@XmlRootElement(name = "IfcProtectiveDeviceTypeRefElement")
public class IfcProtectiveDeviceTypeRef extends IFC2X3.jaxb.IfcFlowControllerTypeRef  {

	

	
	@Override
	public IfcProtectiveDeviceType createInstance() {
		return IFC2X3Factory.eINSTANCE.createIfcProtectiveDeviceType();
	}
	
	public static IfcProtectiveDeviceTypeRef valueOf(String id) {
		IfcProtectiveDeviceTypeRef result = new IfcProtectiveDeviceTypeRef();
		result.setID(id);
		return result;
	}

	@Override
	public String toString() {
		return getID();
	}
	

}