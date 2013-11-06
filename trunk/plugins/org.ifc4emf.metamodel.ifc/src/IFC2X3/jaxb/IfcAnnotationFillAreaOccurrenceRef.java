package IFC2X3.jaxb;

import javax.xml.bind.annotation.*;
import org.eclipse.emf.ecore.jaxb.*;

import IFC2X3.IFC2X3Factory;
import IFC2X3.IfcAnnotationFillAreaOccurrence;

@XmlRootElement(name = "IfcAnnotationFillAreaOccurrenceRefElement")
public class IfcAnnotationFillAreaOccurrenceRef extends IFC2X3.jaxb.IfcAnnotationOccurrenceRef  {

	

	
	@Override
	public IfcAnnotationFillAreaOccurrence createInstance() {
		return IFC2X3Factory.eINSTANCE.createIfcAnnotationFillAreaOccurrence();
	}
	
	public static IfcAnnotationFillAreaOccurrenceRef valueOf(String id) {
		IfcAnnotationFillAreaOccurrenceRef result = new IfcAnnotationFillAreaOccurrenceRef();
		result.setID(id);
		return result;
	}

	@Override
	public String toString() {
		return getID();
	}
	

}