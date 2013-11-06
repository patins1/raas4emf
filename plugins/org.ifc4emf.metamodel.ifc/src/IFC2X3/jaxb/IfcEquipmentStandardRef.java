package IFC2X3.jaxb;

import javax.xml.bind.annotation.*;
import org.eclipse.emf.ecore.jaxb.*;

import IFC2X3.IFC2X3Factory;
import IFC2X3.IfcEquipmentStandard;

@XmlRootElement(name = "IfcEquipmentStandardRefElement")
public class IfcEquipmentStandardRef extends IFC2X3.jaxb.IfcControlRef  {

	

	
	@Override
	public IfcEquipmentStandard createInstance() {
		return IFC2X3Factory.eINSTANCE.createIfcEquipmentStandard();
	}
	
	public static IfcEquipmentStandardRef valueOf(String id) {
		IfcEquipmentStandardRef result = new IfcEquipmentStandardRef();
		result.setID(id);
		return result;
	}

	@Override
	public String toString() {
		return getID();
	}
	

}