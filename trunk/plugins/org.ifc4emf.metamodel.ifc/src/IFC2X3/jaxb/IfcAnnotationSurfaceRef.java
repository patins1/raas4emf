package IFC2X3.jaxb;

import javax.xml.bind.annotation.*;
import org.eclipse.emf.ecore.jaxb.*;

import IFC2X3.IFC2X3Factory;
import IFC2X3.IfcAnnotationSurface;

@XmlRootElement(name = "IfcAnnotationSurfaceRefElement")
public class IfcAnnotationSurfaceRef extends IFC2X3.jaxb.IfcGeometricRepresentationItemRef  {

	

	
	@Override
	public IfcAnnotationSurface createInstance() {
		return IFC2X3Factory.eINSTANCE.createIfcAnnotationSurface();
	}
	
	public static IfcAnnotationSurfaceRef valueOf(String id) {
		IfcAnnotationSurfaceRef result = new IfcAnnotationSurfaceRef();
		result.setID(id);
		return result;
	}

	@Override
	public String toString() {
		return getID();
	}
	

}