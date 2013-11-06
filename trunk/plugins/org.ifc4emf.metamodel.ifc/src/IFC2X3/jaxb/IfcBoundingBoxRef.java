package IFC2X3.jaxb;

import javax.xml.bind.annotation.*;
import org.eclipse.emf.ecore.jaxb.*;

import IFC2X3.IFC2X3Factory;
import IFC2X3.IfcBoundingBox;

@XmlRootElement(name = "IfcBoundingBoxRefElement")
public class IfcBoundingBoxRef extends IFC2X3.jaxb.IfcGeometricRepresentationItemRef  {

	

	
	@Override
	public IfcBoundingBox createInstance() {
		return IFC2X3Factory.eINSTANCE.createIfcBoundingBox();
	}
	
	public static IfcBoundingBoxRef valueOf(String id) {
		IfcBoundingBoxRef result = new IfcBoundingBoxRef();
		result.setID(id);
		return result;
	}

	@Override
	public String toString() {
		return getID();
	}
	

}