package IFC2X3.jaxb;

import javax.xml.bind.annotation.*;
import org.eclipse.emf.ecore.jaxb.*;

import IFC2X3.IFC2X3Factory;
import IFC2X3.IfcHeatExchangerType;

@XmlRootElement(name = "IfcHeatExchangerTypeRefElement")
public class IfcHeatExchangerTypeRef extends IFC2X3.jaxb.IfcEnergyConversionDeviceTypeRef  {

	

	
	@Override
	public IfcHeatExchangerType createInstance() {
		return IFC2X3Factory.eINSTANCE.createIfcHeatExchangerType();
	}
	
	public static IfcHeatExchangerTypeRef valueOf(String id) {
		IfcHeatExchangerTypeRef result = new IfcHeatExchangerTypeRef();
		result.setID(id);
		return result;
	}

	@Override
	public String toString() {
		return getID();
	}
	

}