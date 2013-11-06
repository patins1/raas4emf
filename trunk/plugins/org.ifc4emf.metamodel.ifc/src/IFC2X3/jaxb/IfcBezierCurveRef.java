package IFC2X3.jaxb;

import javax.xml.bind.annotation.*;
import org.eclipse.emf.ecore.jaxb.*;

import IFC2X3.IFC2X3Factory;
import IFC2X3.IfcBezierCurve;

@XmlRootElement(name = "IfcBezierCurveRefElement")
public class IfcBezierCurveRef extends IFC2X3.jaxb.IfcBSplineCurveRef  {

	

	
	@Override
	public IfcBezierCurve createInstance() {
		return IFC2X3Factory.eINSTANCE.createIfcBezierCurve();
	}
	
	public static IfcBezierCurveRef valueOf(String id) {
		IfcBezierCurveRef result = new IfcBezierCurveRef();
		result.setID(id);
		return result;
	}

	@Override
	public String toString() {
		return getID();
	}
	

}