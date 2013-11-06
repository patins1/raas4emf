package IFC2X3.jaxb;

import javax.xml.bind.annotation.*;
import org.eclipse.emf.ecore.jaxb.*;

import IFC2X3.IFC2X3Factory;
import IFC2X3.IfcBoundedCurve;

@XmlRootElement(name = "IfcBoundedCurveRefElement")
public class IfcBoundedCurveRef extends IFC2X3.jaxb.IfcCurveOrEdgeCurveRef  {

	

	
	@Override
	public IfcBoundedCurve createInstance() {
		return IFC2X3Factory.eINSTANCE.createIfcBoundedCurve();
	}
	
	public static IfcBoundedCurveRef valueOf(String id) {
		IfcBoundedCurveRef result = new IfcBoundedCurveRef();
		result.setID(id);
		return result;
	}

	@Override
	public String toString() {
		return getID();
	}
	

}