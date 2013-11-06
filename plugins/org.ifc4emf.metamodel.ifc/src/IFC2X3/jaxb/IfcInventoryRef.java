package IFC2X3.jaxb;

import javax.xml.bind.annotation.*;
import org.eclipse.emf.ecore.jaxb.*;

import IFC2X3.IFC2X3Factory;
import IFC2X3.IfcInventory;

@XmlRootElement(name = "IfcInventoryRefElement")
public class IfcInventoryRef extends IFC2X3.jaxb.IfcGroupRef  {

	

	
	@Override
	public IfcInventory createInstance() {
		return IFC2X3Factory.eINSTANCE.createIfcInventory();
	}
	
	public static IfcInventoryRef valueOf(String id) {
		IfcInventoryRef result = new IfcInventoryRef();
		result.setID(id);
		return result;
	}

	@Override
	public String toString() {
		return getID();
	}
	

}