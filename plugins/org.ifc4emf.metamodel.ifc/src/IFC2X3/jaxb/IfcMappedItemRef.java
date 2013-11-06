package IFC2X3.jaxb;

import javax.xml.bind.annotation.*;
import org.eclipse.emf.ecore.jaxb.*;

import IFC2X3.IFC2X3Factory;
import IFC2X3.IfcMappedItem;

@XmlRootElement(name = "IfcMappedItemRefElement")
public class IfcMappedItemRef extends IFC2X3.jaxb.IfcRepresentationItemRef  {

	

	
	@Override
	public IfcMappedItem createInstance() {
		return IFC2X3Factory.eINSTANCE.createIfcMappedItem();
	}
	
	public static IfcMappedItemRef valueOf(String id) {
		IfcMappedItemRef result = new IfcMappedItemRef();
		result.setID(id);
		return result;
	}

	@Override
	public String toString() {
		return getID();
	}
	

}