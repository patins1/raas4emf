package IFC2X3.jaxb;

import javax.xml.bind.annotation.*;
import org.eclipse.emf.ecore.jaxb.*;

import IFC2X3.IFC2X3Factory;
import IFC2X3.IfcFurnitureType;

@XmlRootElement(name = "IfcFurnitureTypeRefElement")
public class IfcFurnitureTypeRef extends IFC2X3.jaxb.IfcFurnishingElementTypeRef  {

	

	
	@Override
	public IfcFurnitureType createInstance() {
		return IFC2X3Factory.eINSTANCE.createIfcFurnitureType();
	}
	
	public static IfcFurnitureTypeRef valueOf(String id) {
		IfcFurnitureTypeRef result = new IfcFurnitureTypeRef();
		result.setID(id);
		return result;
	}

	@Override
	public String toString() {
		return getID();
	}
	

}