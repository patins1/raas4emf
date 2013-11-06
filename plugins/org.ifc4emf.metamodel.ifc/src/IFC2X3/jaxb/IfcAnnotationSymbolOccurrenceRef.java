package IFC2X3.jaxb;

import javax.xml.bind.annotation.*;
import org.eclipse.emf.ecore.jaxb.*;

import IFC2X3.IFC2X3Factory;
import IFC2X3.IfcAnnotationSymbolOccurrence;

@XmlRootElement(name = "IfcAnnotationSymbolOccurrenceRefElement")
public class IfcAnnotationSymbolOccurrenceRef extends IFC2X3.jaxb.IfcDraughtingCalloutElementRef  {

	

	
	@Override
	public IfcAnnotationSymbolOccurrence createInstance() {
		return IFC2X3Factory.eINSTANCE.createIfcAnnotationSymbolOccurrence();
	}
	
	public static IfcAnnotationSymbolOccurrenceRef valueOf(String id) {
		IfcAnnotationSymbolOccurrenceRef result = new IfcAnnotationSymbolOccurrenceRef();
		result.setID(id);
		return result;
	}

	@Override
	public String toString() {
		return getID();
	}
	

}