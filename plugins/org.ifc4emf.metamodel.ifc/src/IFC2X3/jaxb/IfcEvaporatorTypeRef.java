package IFC2X3.jaxb;

import javax.xml.bind.annotation.*;
import org.eclipse.emf.ecore.jaxb.*;

import IFC2X3.IFC2X3Factory;
import IFC2X3.IfcEvaporatorType;

@XmlRootElement(name = "IfcEvaporatorTypeRefElement")
public class IfcEvaporatorTypeRef extends IFC2X3.jaxb.IfcEnergyConversionDeviceTypeRef  {

	

	
	@Override
	public IfcEvaporatorType createInstance() {
		return IFC2X3Factory.eINSTANCE.createIfcEvaporatorType();
	}
	
	public static IfcEvaporatorTypeRef valueOf(String id) {
		IfcEvaporatorTypeRef result = new IfcEvaporatorTypeRef();
		result.setID(id);
		return result;
	}

	@Override
	public String toString() {
		return getID();
	}
	

}