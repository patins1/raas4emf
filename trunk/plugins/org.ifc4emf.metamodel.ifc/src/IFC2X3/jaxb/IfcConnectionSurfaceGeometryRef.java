package IFC2X3.jaxb;

import javax.xml.bind.annotation.*;
import org.eclipse.emf.ecore.jaxb.*;

import IFC2X3.IFC2X3Factory;
import IFC2X3.IfcConnectionSurfaceGeometry;

@XmlRootElement(name = "IfcConnectionSurfaceGeometryRefElement")
public class IfcConnectionSurfaceGeometryRef extends IFC2X3.jaxb.IfcConnectionGeometryRef  {

	

	
	@Override
	public IfcConnectionSurfaceGeometry createInstance() {
		return IFC2X3Factory.eINSTANCE.createIfcConnectionSurfaceGeometry();
	}
	
	public static IfcConnectionSurfaceGeometryRef valueOf(String id) {
		IfcConnectionSurfaceGeometryRef result = new IfcConnectionSurfaceGeometryRef();
		result.setID(id);
		return result;
	}

	@Override
	public String toString() {
		return getID();
	}
	

}