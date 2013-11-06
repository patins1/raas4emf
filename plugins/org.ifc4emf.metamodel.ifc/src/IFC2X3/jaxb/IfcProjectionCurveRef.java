package IFC2X3.jaxb;

import javax.xml.bind.annotation.*;
import org.eclipse.emf.ecore.jaxb.*;

import IFC2X3.IFC2X3Factory;
import IFC2X3.IfcProjectionCurve;

@XmlRootElement(name = "IfcProjectionCurveRefElement")
public class IfcProjectionCurveRef extends IFC2X3.jaxb.IfcAnnotationCurveOccurrenceRef  {

	

	
	@Override
	public IfcProjectionCurve createInstance() {
		return IFC2X3Factory.eINSTANCE.createIfcProjectionCurve();
	}
	
	public static IfcProjectionCurveRef valueOf(String id) {
		IfcProjectionCurveRef result = new IfcProjectionCurveRef();
		result.setID(id);
		return result;
	}

	@Override
	public String toString() {
		return getID();
	}
	

}