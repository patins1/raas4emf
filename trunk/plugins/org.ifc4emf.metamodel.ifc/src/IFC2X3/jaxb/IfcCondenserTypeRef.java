package IFC2X3.jaxb;

import javax.xml.bind.annotation.*;
import org.eclipse.emf.ecore.jaxb.*;

import IFC2X3.IFC2X3Factory;
import IFC2X3.IfcCondenserType;

@XmlRootElement(name = "IfcCondenserTypeRefElement")
public class IfcCondenserTypeRef extends IFC2X3.jaxb.IfcEnergyConversionDeviceTypeRef  {

	

	
	@Override
	public IfcCondenserType createInstance() {
		return IFC2X3Factory.eINSTANCE.createIfcCondenserType();
	}
	
	public static IfcCondenserTypeRef valueOf(String id) {
		IfcCondenserTypeRef result = new IfcCondenserTypeRef();
		result.setID(id);
		return result;
	}

	@Override
	public String toString() {
		return getID();
	}
	

}