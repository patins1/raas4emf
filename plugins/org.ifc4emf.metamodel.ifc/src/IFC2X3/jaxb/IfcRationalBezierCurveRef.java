package IFC2X3.jaxb;

import javax.xml.bind.annotation.*;
import org.eclipse.emf.ecore.jaxb.*;

import IFC2X3.IFC2X3Factory;
import IFC2X3.IfcRationalBezierCurve;

@XmlRootElement(name = "IfcRationalBezierCurveRefElement")
public class IfcRationalBezierCurveRef extends IFC2X3.jaxb.IfcBezierCurveRef  {

	

	
	@Override
	public IfcRationalBezierCurve createInstance() {
		return IFC2X3Factory.eINSTANCE.createIfcRationalBezierCurve();
	}
	
	public static IfcRationalBezierCurveRef valueOf(String id) {
		IfcRationalBezierCurveRef result = new IfcRationalBezierCurveRef();
		result.setID(id);
		return result;
	}

	@Override
	public String toString() {
		return getID();
	}
	

}