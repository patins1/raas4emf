package IFC2X3.jaxb;

import javax.xml.bind.annotation.*;
import org.eclipse.emf.ecore.jaxb.*;

import IFC2X3.IFC2X3Factory;
import IFC2X3.IfcBoxedHalfSpace;

@XmlRootElement(name = "IfcBoxedHalfSpaceRefElement")
public class IfcBoxedHalfSpaceRef extends IFC2X3.jaxb.IfcHalfSpaceSolidRef  {

	

	
	@Override
	public IfcBoxedHalfSpace createInstance() {
		return IFC2X3Factory.eINSTANCE.createIfcBoxedHalfSpace();
	}
	
	public static IfcBoxedHalfSpaceRef valueOf(String id) {
		IfcBoxedHalfSpaceRef result = new IfcBoxedHalfSpaceRef();
		result.setID(id);
		return result;
	}

	@Override
	public String toString() {
		return getID();
	}
	

}