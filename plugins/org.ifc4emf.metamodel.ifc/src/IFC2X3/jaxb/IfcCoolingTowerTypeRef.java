package IFC2X3.jaxb;

import javax.xml.bind.annotation.*;
import org.eclipse.emf.ecore.jaxb.*;

import IFC2X3.IFC2X3Factory;
import IFC2X3.IfcCoolingTowerType;

@XmlRootElement(name = "IfcCoolingTowerTypeRefElement")
public class IfcCoolingTowerTypeRef extends IFC2X3.jaxb.IfcEnergyConversionDeviceTypeRef  {

	

	
	@Override
	public IfcCoolingTowerType createInstance() {
		return IFC2X3Factory.eINSTANCE.createIfcCoolingTowerType();
	}
	
	public static IfcCoolingTowerTypeRef valueOf(String id) {
		IfcCoolingTowerTypeRef result = new IfcCoolingTowerTypeRef();
		result.setID(id);
		return result;
	}

	@Override
	public String toString() {
		return getID();
	}
	

}