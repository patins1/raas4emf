package IFC2X3.jaxb;

import javax.xml.bind.annotation.*;
import org.eclipse.emf.ecore.jaxb.*;

import IFC2X3.IFC2X3Factory;
import IFC2X3.IfcHumidifierType;

@XmlRootElement(name = "IfcHumidifierTypeRefElement")
public class IfcHumidifierTypeRef extends IFC2X3.jaxb.IfcEnergyConversionDeviceTypeRef  {

	

	
	@Override
	public IfcHumidifierType createInstance() {
		return IFC2X3Factory.eINSTANCE.createIfcHumidifierType();
	}
	
	public static IfcHumidifierTypeRef valueOf(String id) {
		IfcHumidifierTypeRef result = new IfcHumidifierTypeRef();
		result.setID(id);
		return result;
	}

	@Override
	public String toString() {
		return getID();
	}
	

}