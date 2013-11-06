package IFC2X3.jaxb;

import javax.xml.bind.annotation.*;
import org.eclipse.emf.ecore.jaxb.*;

import IFC2X3.IFC2X3Factory;
import IFC2X3.IfcDimensionCurve;

@XmlRootElement(name = "IfcDimensionCurveRefElement")
public class IfcDimensionCurveRef extends IFC2X3.jaxb.IfcAnnotationCurveOccurrenceRef  {

	

	
	@Override
	public IfcDimensionCurve createInstance() {
		return IFC2X3Factory.eINSTANCE.createIfcDimensionCurve();
	}
	
	public static IfcDimensionCurveRef valueOf(String id) {
		IfcDimensionCurveRef result = new IfcDimensionCurveRef();
		result.setID(id);
		return result;
	}

	@Override
	public String toString() {
		return getID();
	}
	

}