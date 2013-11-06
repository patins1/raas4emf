package IFC2X3.jaxb;

import javax.xml.bind.annotation.*;
import org.eclipse.emf.ecore.jaxb.*;

import IFC2X3.IFC2X3Factory;
import IFC2X3.IfcSweptSurface;

@XmlRootElement(name = "IfcSweptSurfaceRefElement")
public class IfcSweptSurfaceRef extends IFC2X3.jaxb.IfcSurfaceRef  {

	

	
	@Override
	public IfcSweptSurface createInstance() {
		return IFC2X3Factory.eINSTANCE.createIfcSweptSurface();
	}
	
	public static IfcSweptSurfaceRef valueOf(String id) {
		IfcSweptSurfaceRef result = new IfcSweptSurfaceRef();
		result.setID(id);
		return result;
	}

	@Override
	public String toString() {
		return getID();
	}
	

}