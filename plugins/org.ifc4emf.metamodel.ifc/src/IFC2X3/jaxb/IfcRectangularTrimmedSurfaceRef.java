package IFC2X3.jaxb;

import javax.xml.bind.annotation.*;
import org.eclipse.emf.ecore.jaxb.*;

import IFC2X3.IFC2X3Factory;
import IFC2X3.IfcRectangularTrimmedSurface;

@XmlRootElement(name = "IfcRectangularTrimmedSurfaceRefElement")
public class IfcRectangularTrimmedSurfaceRef extends IFC2X3.jaxb.IfcBoundedSurfaceRef  {

	

	
	@Override
	public IfcRectangularTrimmedSurface createInstance() {
		return IFC2X3Factory.eINSTANCE.createIfcRectangularTrimmedSurface();
	}
	
	public static IfcRectangularTrimmedSurfaceRef valueOf(String id) {
		IfcRectangularTrimmedSurfaceRef result = new IfcRectangularTrimmedSurfaceRef();
		result.setID(id);
		return result;
	}

	@Override
	public String toString() {
		return getID();
	}
	

}