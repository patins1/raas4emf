package IFC2X3.jaxb;

import javax.xml.bind.annotation.*;
import org.eclipse.emf.ecore.jaxb.*;

import IFC2X3.IFC2X3Factory;
import IFC2X3.IfcElectricGeneratorType;

@XmlRootElement(name = "IfcElectricGeneratorTypeRefElement")
public class IfcElectricGeneratorTypeRef extends IFC2X3.jaxb.IfcEnergyConversionDeviceTypeRef  {

	

	
	@Override
	public IfcElectricGeneratorType createInstance() {
		return IFC2X3Factory.eINSTANCE.createIfcElectricGeneratorType();
	}
	
	public static IfcElectricGeneratorTypeRef valueOf(String id) {
		IfcElectricGeneratorTypeRef result = new IfcElectricGeneratorTypeRef();
		result.setID(id);
		return result;
	}

	@Override
	public String toString() {
		return getID();
	}
	

}