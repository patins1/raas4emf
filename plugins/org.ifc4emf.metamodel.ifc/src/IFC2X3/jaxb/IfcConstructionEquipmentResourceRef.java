package IFC2X3.jaxb;

import javax.xml.bind.annotation.*;
import org.eclipse.emf.ecore.jaxb.*;

import IFC2X3.IFC2X3Factory;
import IFC2X3.IfcConstructionEquipmentResource;

@XmlRootElement(name = "IfcConstructionEquipmentResourceRefElement")
public class IfcConstructionEquipmentResourceRef extends IFC2X3.jaxb.IfcConstructionResourceRef  {

	

	
	@Override
	public IfcConstructionEquipmentResource createInstance() {
		return IFC2X3Factory.eINSTANCE.createIfcConstructionEquipmentResource();
	}
	
	public static IfcConstructionEquipmentResourceRef valueOf(String id) {
		IfcConstructionEquipmentResourceRef result = new IfcConstructionEquipmentResourceRef();
		result.setID(id);
		return result;
	}

	@Override
	public String toString() {
		return getID();
	}
	

}