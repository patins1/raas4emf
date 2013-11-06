package IFC2X3.jaxb;

import javax.xml.bind.annotation.*;
import org.eclipse.emf.ecore.jaxb.*;

import IFC2X3.IFC2X3Factory;
import IFC2X3.IfcPolygonalBoundedHalfSpace;

@XmlRootElement(name = "IfcPolygonalBoundedHalfSpaceRefElement")
public class IfcPolygonalBoundedHalfSpaceRef extends IFC2X3.jaxb.IfcHalfSpaceSolidRef  {

	

	
	@Override
	public IfcPolygonalBoundedHalfSpace createInstance() {
		return IFC2X3Factory.eINSTANCE.createIfcPolygonalBoundedHalfSpace();
	}
	
	public static IfcPolygonalBoundedHalfSpaceRef valueOf(String id) {
		IfcPolygonalBoundedHalfSpaceRef result = new IfcPolygonalBoundedHalfSpaceRef();
		result.setID(id);
		return result;
	}

	@Override
	public String toString() {
		return getID();
	}
	

}