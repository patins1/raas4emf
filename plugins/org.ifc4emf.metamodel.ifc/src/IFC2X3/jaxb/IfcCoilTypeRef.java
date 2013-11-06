package IFC2X3.jaxb;

import javax.xml.bind.annotation.*;
import org.eclipse.emf.ecore.jaxb.*;

import IFC2X3.IFC2X3Factory;
import IFC2X3.IfcCoilType;

@XmlRootElement(name = "IfcCoilTypeRefElement")
public class IfcCoilTypeRef extends IFC2X3.jaxb.IfcEnergyConversionDeviceTypeRef  {

	

	
	@Override
	public IfcCoilType createInstance() {
		return IFC2X3Factory.eINSTANCE.createIfcCoilType();
	}
	
	public static IfcCoilTypeRef valueOf(String id) {
		IfcCoilTypeRef result = new IfcCoilTypeRef();
		result.setID(id);
		return result;
	}

	@Override
	public String toString() {
		return getID();
	}
	

}