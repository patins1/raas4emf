package IFC2X3.jaxb;

import javax.xml.bind.annotation.*;
import org.eclipse.emf.ecore.jaxb.*;

import IFC2X3.IFC2X3Factory;
import IFC2X3.IfcAnnotationSurfaceOccurrence;

@XmlRootElement(name = "IfcAnnotationSurfaceOccurrenceRefElement")
public class IfcAnnotationSurfaceOccurrenceRef extends IFC2X3.jaxb.IfcAnnotationOccurrenceRef  {

	

	
	@Override
	public IfcAnnotationSurfaceOccurrence createInstance() {
		return IFC2X3Factory.eINSTANCE.createIfcAnnotationSurfaceOccurrence();
	}
	
	public static IfcAnnotationSurfaceOccurrenceRef valueOf(String id) {
		IfcAnnotationSurfaceOccurrenceRef result = new IfcAnnotationSurfaceOccurrenceRef();
		result.setID(id);
		return result;
	}

	@Override
	public String toString() {
		return getID();
	}
	

}