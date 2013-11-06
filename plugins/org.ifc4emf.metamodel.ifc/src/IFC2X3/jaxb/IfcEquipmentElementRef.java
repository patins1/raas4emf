package IFC2X3.jaxb;

import javax.xml.bind.annotation.*;
import org.eclipse.emf.ecore.jaxb.*;

import IFC2X3.IFC2X3Factory;
import IFC2X3.IfcEquipmentElement;

@XmlRootElement(name = "IfcEquipmentElementRefElement")
public class IfcEquipmentElementRef extends IFC2X3.jaxb.IfcElementRef  {

	

	
	@Override
	public IfcEquipmentElement createInstance() {
		return IFC2X3Factory.eINSTANCE.createIfcEquipmentElement();
	}
	
	public static IfcEquipmentElementRef valueOf(String id) {
		IfcEquipmentElementRef result = new IfcEquipmentElementRef();
		result.setID(id);
		return result;
	}

	@Override
	public String toString() {
		return getID();
	}
	

}