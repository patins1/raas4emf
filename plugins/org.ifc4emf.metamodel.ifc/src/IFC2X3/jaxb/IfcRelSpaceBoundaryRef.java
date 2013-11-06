package IFC2X3.jaxb;

import javax.xml.bind.annotation.*;
import org.eclipse.emf.ecore.jaxb.*;

import IFC2X3.IFC2X3Factory;
import IFC2X3.IfcRelSpaceBoundary;

@XmlRootElement(name = "IfcRelSpaceBoundaryRefElement")
public class IfcRelSpaceBoundaryRef extends IFC2X3.jaxb.IfcRelConnectsRef  {

	

	
	@Override
	public IfcRelSpaceBoundary createInstance() {
		return IFC2X3Factory.eINSTANCE.createIfcRelSpaceBoundary();
	}
	
	public static IfcRelSpaceBoundaryRef valueOf(String id) {
		IfcRelSpaceBoundaryRef result = new IfcRelSpaceBoundaryRef();
		result.setID(id);
		return result;
	}

	@Override
	public String toString() {
		return getID();
	}
	

}