package IFC2X3.jaxb;

import javax.xml.bind.annotation.*;
import org.eclipse.emf.ecore.jaxb.*;

import IFC2X3.IFC2X3Factory;
import IFC2X3.IfcCurveBoundedPlane;

@XmlRootElement(name = "IfcCurveBoundedPlaneRefElement")
public class IfcCurveBoundedPlaneRef extends IFC2X3.jaxb.IfcBoundedSurfaceRef  {

	

	
	@Override
	public IfcCurveBoundedPlane createInstance() {
		return IFC2X3Factory.eINSTANCE.createIfcCurveBoundedPlane();
	}
	
	public static IfcCurveBoundedPlaneRef valueOf(String id) {
		IfcCurveBoundedPlaneRef result = new IfcCurveBoundedPlaneRef();
		result.setID(id);
		return result;
	}

	@Override
	public String toString() {
		return getID();
	}
	

}