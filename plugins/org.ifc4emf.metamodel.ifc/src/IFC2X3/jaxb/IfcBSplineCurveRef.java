package IFC2X3.jaxb;

import javax.xml.bind.annotation.*;
import org.eclipse.emf.ecore.jaxb.*;

import IFC2X3.IFC2X3Factory;
import IFC2X3.IfcBSplineCurve;

@XmlRootElement(name = "IfcBSplineCurveRefElement")
public class IfcBSplineCurveRef extends IFC2X3.jaxb.IfcBoundedCurveRef  {

	

	
	@Override
	public IfcBSplineCurve createInstance() {
		return IFC2X3Factory.eINSTANCE.createIfcBSplineCurve();
	}
	
	public static IfcBSplineCurveRef valueOf(String id) {
		IfcBSplineCurveRef result = new IfcBSplineCurveRef();
		result.setID(id);
		return result;
	}

	@Override
	public String toString() {
		return getID();
	}
	

}