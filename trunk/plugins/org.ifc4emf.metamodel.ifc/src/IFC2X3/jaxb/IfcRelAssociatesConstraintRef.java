package IFC2X3.jaxb;

import javax.xml.bind.annotation.*;
import org.eclipse.emf.ecore.jaxb.*;

import IFC2X3.IFC2X3Factory;
import IFC2X3.IfcRelAssociatesConstraint;

@XmlRootElement(name = "IfcRelAssociatesConstraintRefElement")
public class IfcRelAssociatesConstraintRef extends IFC2X3.jaxb.IfcRelAssociatesRef  {

	

	
	@Override
	public IfcRelAssociatesConstraint createInstance() {
		return IFC2X3Factory.eINSTANCE.createIfcRelAssociatesConstraint();
	}
	
	public static IfcRelAssociatesConstraintRef valueOf(String id) {
		IfcRelAssociatesConstraintRef result = new IfcRelAssociatesConstraintRef();
		result.setID(id);
		return result;
	}

	@Override
	public String toString() {
		return getID();
	}
	

}