package IFC2X3.jaxb;

import javax.xml.bind.annotation.*;
import org.eclipse.emf.ecore.jaxb.*;

import IFC2X3.IFC2X3Factory;
import IFC2X3.IfcDimensionCurveDirectedCallout;

@XmlRootElement(name = "IfcDimensionCurveDirectedCalloutRefElement")
public class IfcDimensionCurveDirectedCalloutRef extends IFC2X3.jaxb.IfcDraughtingCalloutRef  {

	

	
	@Override
	public IfcDimensionCurveDirectedCallout createInstance() {
		return IFC2X3Factory.eINSTANCE.createIfcDimensionCurveDirectedCallout();
	}
	
	public static IfcDimensionCurveDirectedCalloutRef valueOf(String id) {
		IfcDimensionCurveDirectedCalloutRef result = new IfcDimensionCurveDirectedCalloutRef();
		result.setID(id);
		return result;
	}

	@Override
	public String toString() {
		return getID();
	}
	

}