package IFC2X3.jaxb;

import javax.xml.bind.annotation.*;
import org.eclipse.emf.ecore.jaxb.*;

import IFC2X3.IFC2X3Factory;
import IFC2X3.IfcElement;

@XmlRootElement(name = "IfcElementRefElement")
public class IfcElementRef extends IFC2X3.jaxb.IfcStructuralActivityAssignmentSelectRef  {

	

	
	@Override
	public IfcElement createInstance() {
		return IFC2X3Factory.eINSTANCE.createIfcElement();
	}
	
	public static IfcElementRef valueOf(String id) {
		IfcElementRef result = new IfcElementRef();
		result.setID(id);
		return result;
	}

	@Override
	public String toString() {
		return getID();
	}
	

}