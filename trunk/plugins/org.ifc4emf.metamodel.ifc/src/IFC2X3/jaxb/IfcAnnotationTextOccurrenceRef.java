package IFC2X3.jaxb;

import javax.xml.bind.annotation.*;
import org.eclipse.emf.ecore.jaxb.*;

import IFC2X3.IFC2X3Factory;
import IFC2X3.IfcAnnotationTextOccurrence;

@XmlRootElement(name = "IfcAnnotationTextOccurrenceRefElement")
public class IfcAnnotationTextOccurrenceRef extends IFC2X3.jaxb.IfcDraughtingCalloutElementRef  {

	

	
	@Override
	public IfcAnnotationTextOccurrence createInstance() {
		return IFC2X3Factory.eINSTANCE.createIfcAnnotationTextOccurrence();
	}
	
	public static IfcAnnotationTextOccurrenceRef valueOf(String id) {
		IfcAnnotationTextOccurrenceRef result = new IfcAnnotationTextOccurrenceRef();
		result.setID(id);
		return result;
	}

	@Override
	public String toString() {
		return getID();
	}
	

}