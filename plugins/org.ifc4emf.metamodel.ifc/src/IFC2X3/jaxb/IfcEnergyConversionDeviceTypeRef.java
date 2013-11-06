package IFC2X3.jaxb;

import javax.xml.bind.annotation.*;
import org.eclipse.emf.ecore.jaxb.*;

import IFC2X3.IFC2X3Factory;
import IFC2X3.IfcEnergyConversionDeviceType;

@XmlRootElement(name = "IfcEnergyConversionDeviceTypeRefElement")
public class IfcEnergyConversionDeviceTypeRef extends IFC2X3.jaxb.IfcDistributionFlowElementTypeRef  {

	

	
	@Override
	public IfcEnergyConversionDeviceType createInstance() {
		return IFC2X3Factory.eINSTANCE.createIfcEnergyConversionDeviceType();
	}
	
	public static IfcEnergyConversionDeviceTypeRef valueOf(String id) {
		IfcEnergyConversionDeviceTypeRef result = new IfcEnergyConversionDeviceTypeRef();
		result.setID(id);
		return result;
	}

	@Override
	public String toString() {
		return getID();
	}
	

}