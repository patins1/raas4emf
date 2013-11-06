package IFC2X3.jaxb;

import javax.xml.bind.annotation.*;
import org.eclipse.emf.ecore.jaxb.*;

import IFC2X3.IFC2X3Factory;
import IFC2X3.IfcUnitaryEquipmentType;

@XmlRootElement(name = "IfcUnitaryEquipmentTypeRefElement")
public class IfcUnitaryEquipmentTypeRef extends IFC2X3.jaxb.IfcEnergyConversionDeviceTypeRef  {

	

	
	@Override
	public IfcUnitaryEquipmentType createInstance() {
		return IFC2X3Factory.eINSTANCE.createIfcUnitaryEquipmentType();
	}
	
	public static IfcUnitaryEquipmentTypeRef valueOf(String id) {
		IfcUnitaryEquipmentTypeRef result = new IfcUnitaryEquipmentTypeRef();
		result.setID(id);
		return result;
	}

	@Override
	public String toString() {
		return getID();
	}
	

}