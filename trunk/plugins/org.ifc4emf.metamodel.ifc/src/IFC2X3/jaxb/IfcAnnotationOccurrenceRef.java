package IFC2X3.jaxb;

import javax.xml.bind.annotation.*;
import org.eclipse.emf.ecore.jaxb.*;

import IFC2X3.IFC2X3Factory;
import IFC2X3.IfcAnnotationOccurrence;

@XmlRootElement(name = "IfcAnnotationOccurrenceRefElement")
public class IfcAnnotationOccurrenceRef extends IFC2X3.jaxb.IfcStyledItemRef  {

	

	
	@Override
	public IfcAnnotationOccurrence createInstance() {
		return IFC2X3Factory.eINSTANCE.createIfcAnnotationOccurrence();
	}
	
	public static IfcAnnotationOccurrenceRef valueOf(String id) {
		IfcAnnotationOccurrenceRef result = new IfcAnnotationOccurrenceRef();
		result.setID(id);
		return result;
	}

	@Override
	public String toString() {
		return getID();
	}
	

}