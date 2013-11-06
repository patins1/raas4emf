package IFC2X3.jaxb;

import javax.xml.bind.annotation.*;
import org.eclipse.emf.ecore.jaxb.*;

import IFC2X3.IFC2X3Factory;
import IFC2X3.IfcOffsetCurve3D;

@XmlRootElement(name = "IfcOffsetCurve3DRefElement")
public class IfcOffsetCurve3DRef extends IFC2X3.jaxb.IfcCurveRef  {

	

	
	@Override
	public IfcOffsetCurve3D createInstance() {
		return IFC2X3Factory.eINSTANCE.createIfcOffsetCurve3D();
	}
	
	public static IfcOffsetCurve3DRef valueOf(String id) {
		IfcOffsetCurve3DRef result = new IfcOffsetCurve3DRef();
		result.setID(id);
		return result;
	}

	@Override
	public String toString() {
		return getID();
	}
	

}