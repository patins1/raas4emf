package IFC2X3.jaxb;

import javax.xml.bind.annotation.*;
import org.eclipse.emf.ecore.jaxb.*;

import IFC2X3.IFC2X3Factory;
import IFC2X3.IfcStructuralItem;

@XmlRootElement(name = "IfcStructuralItemRefElement")
public class IfcStructuralItemRef extends IFC2X3.jaxb.IfcStructuralActivityAssignmentSelectRef  {

	

	
	@Override
	public IfcStructuralItem createInstance() {
		return IFC2X3Factory.eINSTANCE.createIfcStructuralItem();
	}
	
	public static IfcStructuralItemRef valueOf(String id) {
		IfcStructuralItemRef result = new IfcStructuralItemRef();
		result.setID(id);
		return result;
	}

	@Override
	public String toString() {
		return getID();
	}
	

}