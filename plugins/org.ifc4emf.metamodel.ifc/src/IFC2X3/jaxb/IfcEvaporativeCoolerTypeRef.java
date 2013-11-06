package IFC2X3.jaxb;

import javax.xml.bind.annotation.*;
import org.eclipse.emf.ecore.jaxb.*;

import IFC2X3.IFC2X3Factory;
import IFC2X3.IfcEvaporativeCoolerType;

@XmlRootElement(name = "IfcEvaporativeCoolerTypeRefElement")
public class IfcEvaporativeCoolerTypeRef extends IFC2X3.jaxb.IfcEnergyConversionDeviceTypeRef  {

	

	
	@Override
	public IfcEvaporativeCoolerType createInstance() {
		return IFC2X3Factory.eINSTANCE.createIfcEvaporativeCoolerType();
	}
	
	public static IfcEvaporativeCoolerTypeRef valueOf(String id) {
		IfcEvaporativeCoolerTypeRef result = new IfcEvaporativeCoolerTypeRef();
		result.setID(id);
		return result;
	}

	@Override
	public String toString() {
		return getID();
	}
	

}