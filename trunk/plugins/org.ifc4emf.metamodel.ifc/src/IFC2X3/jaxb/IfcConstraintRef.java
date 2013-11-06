package IFC2X3.jaxb;

import javax.xml.bind.annotation.*;
import org.eclipse.emf.ecore.jaxb.*;

import IFC2X3.IFC2X3Factory;
import IFC2X3.IfcConstraint;

@XmlRootElement(name = "IfcConstraintRefElement")
public class IfcConstraintRef extends org.eclipse.emf.cdo.jaxb.CDOObjectRef  {

	

	
	@Override
	public IfcConstraint createInstance() {
		return IFC2X3Factory.eINSTANCE.createIfcConstraint();
	}
	
	public static IfcConstraintRef valueOf(String id) {
		IfcConstraintRef result = new IfcConstraintRef();
		result.setID(id);
		return result;
	}

	@Override
	public String toString() {
		return getID();
	}
	

}