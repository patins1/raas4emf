package IFC2X3.jaxb;

import javax.xml.bind.annotation.*;
import org.eclipse.emf.ecore.jaxb.*;

import IFC2X3.IFC2X3Factory;
import IFC2X3.IfcCurveStyleFontAndScaling;

@XmlRootElement(name = "IfcCurveStyleFontAndScalingRefElement")
public class IfcCurveStyleFontAndScalingRef extends IFC2X3.jaxb.IfcCurveFontOrScaledCurveFontSelectRef  {

	

	
	@Override
	public IfcCurveStyleFontAndScaling createInstance() {
		return IFC2X3Factory.eINSTANCE.createIfcCurveStyleFontAndScaling();
	}
	
	public static IfcCurveStyleFontAndScalingRef valueOf(String id) {
		IfcCurveStyleFontAndScalingRef result = new IfcCurveStyleFontAndScalingRef();
		result.setID(id);
		return result;
	}

	@Override
	public String toString() {
		return getID();
	}
	

}