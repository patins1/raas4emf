package IFC2X3.jaxb;

import javax.xml.bind.annotation.*;
import org.eclipse.emf.ecore.jaxb.*;

import IFC2X3.IFC2X3Factory;
import IFC2X3.IfcColourSpecification;

@XmlRootElement(name = "IfcColourSpecificationRefElement")
public class IfcColourSpecificationRef extends IFC2X3.jaxb.IfcColourRef  {

	

	
	@Override
	public IfcColourSpecification createInstance() {
		return IFC2X3Factory.eINSTANCE.createIfcColourSpecification();
	}
	
	public static IfcColourSpecificationRef valueOf(String id) {
		IfcColourSpecificationRef result = new IfcColourSpecificationRef();
		result.setID(id);
		return result;
	}

	@Override
	public String toString() {
		return getID();
	}
	

}