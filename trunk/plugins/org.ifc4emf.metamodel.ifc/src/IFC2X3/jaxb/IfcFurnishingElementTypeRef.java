package IFC2X3.jaxb;

import javax.xml.bind.annotation.*;
import org.eclipse.emf.ecore.jaxb.*;

import IFC2X3.IFC2X3Factory;
import IFC2X3.IfcFurnishingElementType;

@XmlRootElement(name = "IfcFurnishingElementTypeRefElement")
public class IfcFurnishingElementTypeRef extends IFC2X3.jaxb.IfcElementTypeRef  {

	

	
	@Override
	public IfcFurnishingElementType createInstance() {
		return IFC2X3Factory.eINSTANCE.createIfcFurnishingElementType();
	}
	
	public static IfcFurnishingElementTypeRef valueOf(String id) {
		IfcFurnishingElementTypeRef result = new IfcFurnishingElementTypeRef();
		result.setID(id);
		return result;
	}

	@Override
	public String toString() {
		return getID();
	}
	

}