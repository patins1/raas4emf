package IFC2X3.jaxb;

import javax.xml.bind.annotation.*;
import org.eclipse.emf.ecore.jaxb.*;

import IFC2X3.IFC2X3Factory;
import IFC2X3.IfcChillerType;

@XmlRootElement(name = "IfcChillerTypeRefElement")
public class IfcChillerTypeRef extends IFC2X3.jaxb.IfcEnergyConversionDeviceTypeRef  {

	

	
	@Override
	public IfcChillerType createInstance() {
		return IFC2X3Factory.eINSTANCE.createIfcChillerType();
	}
	
	public static IfcChillerTypeRef valueOf(String id) {
		IfcChillerTypeRef result = new IfcChillerTypeRef();
		result.setID(id);
		return result;
	}

	@Override
	public String toString() {
		return getID();
	}
	

}