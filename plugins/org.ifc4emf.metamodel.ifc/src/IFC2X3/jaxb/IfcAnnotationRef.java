package IFC2X3.jaxb;

import javax.xml.bind.annotation.*;
import org.eclipse.emf.ecore.jaxb.*;

import IFC2X3.IFC2X3Factory;
import IFC2X3.IfcAnnotation;

@XmlRootElement(name = "IfcAnnotationRefElement")
public class IfcAnnotationRef extends IFC2X3.jaxb.IfcProductRef  {

	

	
	@Override
	public IfcAnnotation createInstance() {
		return IFC2X3Factory.eINSTANCE.createIfcAnnotation();
	}
	
	public static IfcAnnotationRef valueOf(String id) {
		IfcAnnotationRef result = new IfcAnnotationRef();
		result.setID(id);
		return result;
	}

	@Override
	public String toString() {
		return getID();
	}
	

}