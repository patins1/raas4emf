package IFC2X3.jaxb;

import javax.xml.bind.annotation.*;
import org.eclipse.emf.ecore.jaxb.*;

import IFC2X3.IFC2X3Factory;
import IFC2X3.IfcPlane;

@XmlRootElement(name = "IfcPlaneRefElement")
public class IfcPlaneRef extends IFC2X3.jaxb.IfcElementarySurfaceRef  {

	

	
	@Override
	public IfcPlane createInstance() {
		return IFC2X3Factory.eINSTANCE.createIfcPlane();
	}
	
	public static IfcPlaneRef valueOf(String id) {
		IfcPlaneRef result = new IfcPlaneRef();
		result.setID(id);
		return result;
	}

	@Override
	public String toString() {
		return getID();
	}
	

}