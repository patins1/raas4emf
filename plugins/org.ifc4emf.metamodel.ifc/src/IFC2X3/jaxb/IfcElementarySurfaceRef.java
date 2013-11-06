package IFC2X3.jaxb;

import javax.xml.bind.annotation.*;
import org.eclipse.emf.ecore.jaxb.*;

import IFC2X3.IFC2X3Factory;
import IFC2X3.IfcElementarySurface;

@XmlRootElement(name = "IfcElementarySurfaceRefElement")
public class IfcElementarySurfaceRef extends IFC2X3.jaxb.IfcSurfaceRef  {

	

	
	@Override
	public IfcElementarySurface createInstance() {
		return IFC2X3Factory.eINSTANCE.createIfcElementarySurface();
	}
	
	public static IfcElementarySurfaceRef valueOf(String id) {
		IfcElementarySurfaceRef result = new IfcElementarySurfaceRef();
		result.setID(id);
		return result;
	}

	@Override
	public String toString() {
		return getID();
	}
	

}