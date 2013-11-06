package IFC2X3.jaxb;

import javax.xml.bind.annotation.*;
import org.eclipse.emf.ecore.jaxb.*;

import IFC2X3.IFC2X3Factory;
import IFC2X3.IfcFaceSurface;

@XmlRootElement(name = "IfcFaceSurfaceRefElement")
public class IfcFaceSurfaceRef extends IFC2X3.jaxb.IfcSurfaceOrFaceSurfaceRef  {

	

	
	@Override
	public IfcFaceSurface createInstance() {
		return IFC2X3Factory.eINSTANCE.createIfcFaceSurface();
	}
	
	public static IfcFaceSurfaceRef valueOf(String id) {
		IfcFaceSurfaceRef result = new IfcFaceSurfaceRef();
		result.setID(id);
		return result;
	}

	@Override
	public String toString() {
		return getID();
	}
	

}