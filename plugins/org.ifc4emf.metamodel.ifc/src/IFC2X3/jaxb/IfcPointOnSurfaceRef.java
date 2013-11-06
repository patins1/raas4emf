package IFC2X3.jaxb;

import javax.xml.bind.annotation.*;
import org.eclipse.emf.ecore.jaxb.*;

import IFC2X3.IFC2X3Factory;
import IFC2X3.IfcPointOnSurface;

@XmlRootElement(name = "IfcPointOnSurfaceRefElement")
public class IfcPointOnSurfaceRef extends IFC2X3.jaxb.IfcPointRef  {

	

	
	@Override
	public IfcPointOnSurface createInstance() {
		return IFC2X3Factory.eINSTANCE.createIfcPointOnSurface();
	}
	
	public static IfcPointOnSurfaceRef valueOf(String id) {
		IfcPointOnSurfaceRef result = new IfcPointOnSurfaceRef();
		result.setID(id);
		return result;
	}

	@Override
	public String toString() {
		return getID();
	}
	

}