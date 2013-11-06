package IFC2X3.jaxb;

import javax.xml.bind.annotation.*;
import org.eclipse.emf.ecore.jaxb.*;

import IFC2X3.IFC2X3Factory;
import IFC2X3.IfcSphere;

@XmlRootElement(name = "IfcSphereRefElement")
public class IfcSphereRef extends IFC2X3.jaxb.IfcCsgPrimitive3DRef  {

	

	
	@Override
	public IfcSphere createInstance() {
		return IFC2X3Factory.eINSTANCE.createIfcSphere();
	}
	
	public static IfcSphereRef valueOf(String id) {
		IfcSphereRef result = new IfcSphereRef();
		result.setID(id);
		return result;
	}

	@Override
	public String toString() {
		return getID();
	}
	

}