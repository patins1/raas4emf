package IFC2X3.jaxb;

import javax.xml.bind.annotation.*;
import org.eclipse.emf.ecore.jaxb.*;

import IFC2X3.IFC2X3Factory;
import IFC2X3.IfcAnnotationCurveOccurrence;

@XmlRootElement(name = "IfcAnnotationCurveOccurrenceRefElement")
public class IfcAnnotationCurveOccurrenceRef extends IFC2X3.jaxb.IfcDraughtingCalloutElementRef  {

	

	
	@Override
	public IfcAnnotationCurveOccurrence createInstance() {
		return IFC2X3Factory.eINSTANCE.createIfcAnnotationCurveOccurrence();
	}
	
	public static IfcAnnotationCurveOccurrenceRef valueOf(String id) {
		IfcAnnotationCurveOccurrenceRef result = new IfcAnnotationCurveOccurrenceRef();
		result.setID(id);
		return result;
	}

	@Override
	public String toString() {
		return getID();
	}
	

}