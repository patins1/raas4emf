package IFC2X3.jaxb;

import javax.xml.bind.annotation.*;
import org.eclipse.emf.ecore.jaxb.*;

import IFC2X3.IFC2X3Factory;
import IFC2X3.IfcPolyline;

@XmlRootElement(name = "IfcPolylineRefElement")
public class IfcPolylineRef extends IFC2X3.jaxb.IfcBoundedCurveRef  {

	

	
	@Override
	public IfcPolyline createInstance() {
		return IFC2X3Factory.eINSTANCE.createIfcPolyline();
	}
	
	public static IfcPolylineRef valueOf(String id) {
		IfcPolylineRef result = new IfcPolylineRef();
		result.setID(id);
		return result;
	}

	@Override
	public String toString() {
		return getID();
	}
	

}