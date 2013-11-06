package IFC2X3.jaxb;

import javax.xml.bind.annotation.*;
import org.eclipse.emf.ecore.jaxb.*;

import IFC2X3.IFC2X3Factory;
import IFC2X3.IfcOffsetCurve2D;

@XmlRootElement(name = "IfcOffsetCurve2DRefElement")
public class IfcOffsetCurve2DRef extends IFC2X3.jaxb.IfcCurveRef  {

	

	
	@Override
	public IfcOffsetCurve2D createInstance() {
		return IFC2X3Factory.eINSTANCE.createIfcOffsetCurve2D();
	}
	
	public static IfcOffsetCurve2DRef valueOf(String id) {
		IfcOffsetCurve2DRef result = new IfcOffsetCurve2DRef();
		result.setID(id);
		return result;
	}

	@Override
	public String toString() {
		return getID();
	}
	

}