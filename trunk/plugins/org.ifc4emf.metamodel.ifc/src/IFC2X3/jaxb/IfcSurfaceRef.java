package IFC2X3.jaxb;

import javax.xml.bind.annotation.*;
import org.eclipse.emf.ecore.jaxb.*;

import IFC2X3.IFC2X3Factory;
import IFC2X3.IfcSurface;

@XmlRootElement(name = "IfcSurfaceRefElement")
public class IfcSurfaceRef extends IFC2X3.jaxb.IfcGeometricSetSelectRef  {

	

	
	@Override
	public IfcSurface createInstance() {
		return IFC2X3Factory.eINSTANCE.createIfcSurface();
	}
	
	public static IfcSurfaceRef valueOf(String id) {
		IfcSurfaceRef result = new IfcSurfaceRef();
		result.setID(id);
		return result;
	}

	@Override
	public String toString() {
		return getID();
	}
	

}