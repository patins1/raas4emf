package IFC2X3.jaxb;

import javax.xml.bind.annotation.*;
import org.eclipse.emf.ecore.jaxb.*;

import IFC2X3.IFC2X3Factory;
import IFC2X3.IfcEnergyConversionDevice;

@XmlRootElement(name = "IfcEnergyConversionDeviceRefElement")
public class IfcEnergyConversionDeviceRef extends IFC2X3.jaxb.IfcDistributionFlowElementRef  {

	

	
	@Override
	public IfcEnergyConversionDevice createInstance() {
		return IFC2X3Factory.eINSTANCE.createIfcEnergyConversionDevice();
	}
	
	public static IfcEnergyConversionDeviceRef valueOf(String id) {
		IfcEnergyConversionDeviceRef result = new IfcEnergyConversionDeviceRef();
		result.setID(id);
		return result;
	}

	@Override
	public String toString() {
		return getID();
	}
	

}