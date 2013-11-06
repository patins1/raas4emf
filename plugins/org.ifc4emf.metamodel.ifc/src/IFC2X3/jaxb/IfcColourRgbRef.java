package IFC2X3.jaxb;

import javax.xml.bind.annotation.*;
import org.eclipse.emf.ecore.jaxb.*;

import IFC2X3.IFC2X3Factory;
import IFC2X3.IfcColourRgb;

@XmlRootElement(name = "IfcColourRgbRefElement")
public class IfcColourRgbRef extends IFC2X3.jaxb.IfcColourSpecificationRef  {

	

	
	@Override
	public IfcColourRgb createInstance() {
		return IFC2X3Factory.eINSTANCE.createIfcColourRgb();
	}
	
	public static IfcColourRgbRef valueOf(String id) {
		IfcColourRgbRef result = new IfcColourRgbRef();
		result.setID(id);
		return result;
	}

	@Override
	public String toString() {
		return getID();
	}
	

}