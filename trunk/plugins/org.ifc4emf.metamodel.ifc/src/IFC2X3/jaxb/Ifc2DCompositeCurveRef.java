package IFC2X3.jaxb;

import javax.xml.bind.annotation.*;
import org.eclipse.emf.ecore.jaxb.*;

import IFC2X3.IFC2X3Factory;
import IFC2X3.Ifc2DCompositeCurve;

@XmlRootElement(name = "Ifc2DCompositeCurveRefElement")
public class Ifc2DCompositeCurveRef extends IFC2X3.jaxb.IfcCompositeCurveRef  {

	

	
	@Override
	public Ifc2DCompositeCurve createInstance() {
		return IFC2X3Factory.eINSTANCE.createIfc2DCompositeCurve();
	}
	
	public static Ifc2DCompositeCurveRef valueOf(String id) {
		Ifc2DCompositeCurveRef result = new Ifc2DCompositeCurveRef();
		result.setID(id);
		return result;
	}

	@Override
	public String toString() {
		return getID();
	}
	

}