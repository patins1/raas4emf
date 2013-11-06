package IFC2X3.jaxb;

import javax.xml.bind.annotation.*;
import org.eclipse.emf.ecore.jaxb.*;

import IFC2X3.IFC2X3Factory;
import IFC2X3.IfcElectricMotorType;

@XmlRootElement(name = "IfcElectricMotorTypeRefElement")
public class IfcElectricMotorTypeRef extends IFC2X3.jaxb.IfcEnergyConversionDeviceTypeRef  {

	

	
	@Override
	public IfcElectricMotorType createInstance() {
		return IFC2X3Factory.eINSTANCE.createIfcElectricMotorType();
	}
	
	public static IfcElectricMotorTypeRef valueOf(String id) {
		IfcElectricMotorTypeRef result = new IfcElectricMotorTypeRef();
		result.setID(id);
		return result;
	}

	@Override
	public String toString() {
		return getID();
	}
	

}