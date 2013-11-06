package IFC2X3.jaxb;

import javax.xml.bind.annotation.*;
import org.eclipse.emf.ecore.jaxb.*;

import IFC2X3.IFC2X3Factory;
import IFC2X3.IfcPointOnCurve;

@XmlRootElement(name = "IfcPointOnCurveRefElement")
public class IfcPointOnCurveRef extends IFC2X3.jaxb.IfcPointRef  {

	

	
	@Override
	public IfcPointOnCurve createInstance() {
		return IFC2X3Factory.eINSTANCE.createIfcPointOnCurve();
	}
	
	public static IfcPointOnCurveRef valueOf(String id) {
		IfcPointOnCurveRef result = new IfcPointOnCurveRef();
		result.setID(id);
		return result;
	}

	@Override
	public String toString() {
		return getID();
	}
	

}