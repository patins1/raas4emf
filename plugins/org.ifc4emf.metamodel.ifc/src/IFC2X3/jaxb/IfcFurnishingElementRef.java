package IFC2X3.jaxb;

import javax.xml.bind.annotation.*;
import org.eclipse.emf.ecore.jaxb.*;

import IFC2X3.IFC2X3Factory;
import IFC2X3.IfcFurnishingElement;

@XmlRootElement(name = "IfcFurnishingElementRefElement")
public class IfcFurnishingElementRef extends IFC2X3.jaxb.IfcElementRef  {

	

	
	@Override
	public IfcFurnishingElement createInstance() {
		return IFC2X3Factory.eINSTANCE.createIfcFurnishingElement();
	}
	
	public static IfcFurnishingElementRef valueOf(String id) {
		IfcFurnishingElementRef result = new IfcFurnishingElementRef();
		result.setID(id);
		return result;
	}

	@Override
	public String toString() {
		return getID();
	}
	

}