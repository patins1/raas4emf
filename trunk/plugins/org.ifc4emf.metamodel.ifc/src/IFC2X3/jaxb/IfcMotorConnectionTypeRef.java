package IFC2X3.jaxb;

import javax.xml.bind.annotation.*;
import org.eclipse.emf.ecore.jaxb.*;

import IFC2X3.IFC2X3Factory;
import IFC2X3.IfcMotorConnectionType;

@XmlRootElement(name = "IfcMotorConnectionTypeRefElement")
public class IfcMotorConnectionTypeRef extends IFC2X3.jaxb.IfcEnergyConversionDeviceTypeRef  {

	

	
	@Override
	public IfcMotorConnectionType createInstance() {
		return IFC2X3Factory.eINSTANCE.createIfcMotorConnectionType();
	}
	
	public static IfcMotorConnectionTypeRef valueOf(String id) {
		IfcMotorConnectionTypeRef result = new IfcMotorConnectionTypeRef();
		result.setID(id);
		return result;
	}

	@Override
	public String toString() {
		return getID();
	}
	

}