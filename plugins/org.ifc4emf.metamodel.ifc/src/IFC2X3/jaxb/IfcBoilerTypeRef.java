package IFC2X3.jaxb;

import javax.xml.bind.annotation.*;
import org.eclipse.emf.ecore.jaxb.*;

import IFC2X3.IFC2X3Factory;
import IFC2X3.IfcBoilerType;

@XmlRootElement(name = "IfcBoilerTypeRefElement")
public class IfcBoilerTypeRef extends IFC2X3.jaxb.IfcEnergyConversionDeviceTypeRef  {

	

	
	@Override
	public IfcBoilerType createInstance() {
		return IFC2X3Factory.eINSTANCE.createIfcBoilerType();
	}
	
	public static IfcBoilerTypeRef valueOf(String id) {
		IfcBoilerTypeRef result = new IfcBoilerTypeRef();
		result.setID(id);
		return result;
	}

	@Override
	public String toString() {
		return getID();
	}
	

}