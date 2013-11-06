package IFC2X3.jaxb;

import javax.xml.bind.annotation.*;
import org.eclipse.emf.ecore.jaxb.*;

import IFC2X3.IFC2X3Factory;
import IFC2X3.IfcBoundedSurface;

@XmlRootElement(name = "IfcBoundedSurfaceRefElement")
public class IfcBoundedSurfaceRef extends IFC2X3.jaxb.IfcSurfaceRef  {

	

	
	@Override
	public IfcBoundedSurface createInstance() {
		return IFC2X3Factory.eINSTANCE.createIfcBoundedSurface();
	}
	
	public static IfcBoundedSurfaceRef valueOf(String id) {
		IfcBoundedSurfaceRef result = new IfcBoundedSurfaceRef();
		result.setID(id);
		return result;
	}

	@Override
	public String toString() {
		return getID();
	}
	

}