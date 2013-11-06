package IFC2X3.jaxb;

import javax.xml.bind.annotation.*;
import org.eclipse.emf.ecore.jaxb.*;

import IFC2X3.IFC2X3Factory;
import IFC2X3.IfcCostItem;

@XmlRootElement(name = "IfcCostItemRefElement")
public class IfcCostItemRef extends IFC2X3.jaxb.IfcControlRef  {

	

	
	@Override
	public IfcCostItem createInstance() {
		return IFC2X3Factory.eINSTANCE.createIfcCostItem();
	}
	
	public static IfcCostItemRef valueOf(String id) {
		IfcCostItemRef result = new IfcCostItemRef();
		result.setID(id);
		return result;
	}

	@Override
	public String toString() {
		return getID();
	}
	

}