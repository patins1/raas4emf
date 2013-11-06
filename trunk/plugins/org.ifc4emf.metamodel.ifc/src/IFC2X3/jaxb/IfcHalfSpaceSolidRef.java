package IFC2X3.jaxb;

import javax.xml.bind.annotation.*;
import org.eclipse.emf.ecore.jaxb.*;

import IFC2X3.IFC2X3Factory;
import IFC2X3.IfcHalfSpaceSolid;

@XmlRootElement(name = "IfcHalfSpaceSolidRefElement")
public class IfcHalfSpaceSolidRef extends IFC2X3.jaxb.IfcBooleanOperandRef  {

	

	
	@Override
	public IfcHalfSpaceSolid createInstance() {
		return IFC2X3Factory.eINSTANCE.createIfcHalfSpaceSolid();
	}
	
	public static IfcHalfSpaceSolidRef valueOf(String id) {
		IfcHalfSpaceSolidRef result = new IfcHalfSpaceSolidRef();
		result.setID(id);
		return result;
	}

	@Override
	public String toString() {
		return getID();
	}
	

}