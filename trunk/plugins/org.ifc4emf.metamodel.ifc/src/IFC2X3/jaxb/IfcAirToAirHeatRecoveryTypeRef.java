package IFC2X3.jaxb;

import javax.xml.bind.annotation.*;
import org.eclipse.emf.ecore.jaxb.*;

import IFC2X3.IFC2X3Factory;
import IFC2X3.IfcAirToAirHeatRecoveryType;

@XmlRootElement(name = "IfcAirToAirHeatRecoveryTypeRefElement")
public class IfcAirToAirHeatRecoveryTypeRef extends IFC2X3.jaxb.IfcEnergyConversionDeviceTypeRef  {

	

	
	@Override
	public IfcAirToAirHeatRecoveryType createInstance() {
		return IFC2X3Factory.eINSTANCE.createIfcAirToAirHeatRecoveryType();
	}
	
	public static IfcAirToAirHeatRecoveryTypeRef valueOf(String id) {
		IfcAirToAirHeatRecoveryTypeRef result = new IfcAirToAirHeatRecoveryTypeRef();
		result.setID(id);
		return result;
	}

	@Override
	public String toString() {
		return getID();
	}
	

}