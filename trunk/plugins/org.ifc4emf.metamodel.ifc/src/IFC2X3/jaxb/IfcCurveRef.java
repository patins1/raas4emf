package IFC2X3.jaxb;

import javax.xml.bind.annotation.*;
import org.eclipse.emf.ecore.jaxb.*;

import IFC2X3.IFC2X3Factory;
import IFC2X3.IfcCurve;

@XmlRootElement(name = "IfcCurveRefElement")
public class IfcCurveRef extends IFC2X3.jaxb.IfcGeometricSetSelectRef  {

	

	
	@Override
	public IfcCurve createInstance() {
		return IFC2X3Factory.eINSTANCE.createIfcCurve();
	}
	
	public static IfcCurveRef valueOf(String id) {
		IfcCurveRef result = new IfcCurveRef();
		result.setID(id);
		return result;
	}

	@Override
	public String toString() {
		return getID();
	}
	

}