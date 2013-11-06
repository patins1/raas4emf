package IFC2X3.jaxb;

import javax.xml.bind.annotation.*;
import org.eclipse.emf.ecore.jaxb.*;

import IFC2X3.IFC2X3Factory;
import IFC2X3.IfcCompositeCurve;

@XmlRootElement(name = "IfcCompositeCurveRefElement")
public class IfcCompositeCurveRef extends IFC2X3.jaxb.IfcBoundedCurveRef  {

	

	
	@Override
	public IfcCompositeCurve createInstance() {
		return IFC2X3Factory.eINSTANCE.createIfcCompositeCurve();
	}
	
	public static IfcCompositeCurveRef valueOf(String id) {
		IfcCompositeCurveRef result = new IfcCompositeCurveRef();
		result.setID(id);
		return result;
	}

	@Override
	public String toString() {
		return getID();
	}
	

}