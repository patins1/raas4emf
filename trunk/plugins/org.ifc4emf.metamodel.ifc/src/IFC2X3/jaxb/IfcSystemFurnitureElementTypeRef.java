package IFC2X3.jaxb;

import javax.xml.bind.annotation.*;
import org.eclipse.emf.ecore.jaxb.*;

import IFC2X3.IFC2X3Factory;
import IFC2X3.IfcSystemFurnitureElementType;

@XmlRootElement(name = "IfcSystemFurnitureElementTypeRefElement")
public class IfcSystemFurnitureElementTypeRef extends IFC2X3.jaxb.IfcFurnishingElementTypeRef  {

	

	
	@Override
	public IfcSystemFurnitureElementType createInstance() {
		return IFC2X3Factory.eINSTANCE.createIfcSystemFurnitureElementType();
	}
	
	public static IfcSystemFurnitureElementTypeRef valueOf(String id) {
		IfcSystemFurnitureElementTypeRef result = new IfcSystemFurnitureElementTypeRef();
		result.setID(id);
		return result;
	}

	@Override
	public String toString() {
		return getID();
	}
	

}