package IFC2X3.jaxb;

import javax.xml.bind.annotation.*;
import org.eclipse.emf.ecore.jaxb.*;

import IFC2X3.IFC2X3Factory;
import IFC2X3.IfcRelSchedulesCostItems;

@XmlRootElement(name = "IfcRelSchedulesCostItemsRefElement")
public class IfcRelSchedulesCostItemsRef extends IFC2X3.jaxb.IfcRelAssignsToControlRef  {

	

	
	@Override
	public IfcRelSchedulesCostItems createInstance() {
		return IFC2X3Factory.eINSTANCE.createIfcRelSchedulesCostItems();
	}
	
	public static IfcRelSchedulesCostItemsRef valueOf(String id) {
		IfcRelSchedulesCostItemsRef result = new IfcRelSchedulesCostItemsRef();
		result.setID(id);
		return result;
	}

	@Override
	public String toString() {
		return getID();
	}
	

}