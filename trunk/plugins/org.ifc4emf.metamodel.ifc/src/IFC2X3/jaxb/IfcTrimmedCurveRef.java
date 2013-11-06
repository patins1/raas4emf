package IFC2X3.jaxb;

import javax.xml.bind.annotation.*;
import org.eclipse.emf.ecore.jaxb.*;

import IFC2X3.IFC2X3Factory;
import IFC2X3.IfcTrimmedCurve;

@XmlRootElement(name = "IfcTrimmedCurveRefElement")
public class IfcTrimmedCurveRef extends IFC2X3.jaxb.IfcBoundedCurveRef  {

	

	
	@Override
	public IfcTrimmedCurve createInstance() {
		return IFC2X3Factory.eINSTANCE.createIfcTrimmedCurve();
	}
	
	public static IfcTrimmedCurveRef valueOf(String id) {
		IfcTrimmedCurveRef result = new IfcTrimmedCurveRef();
		result.setID(id);
		return result;
	}

	@Override
	public String toString() {
		return getID();
	}
	

}