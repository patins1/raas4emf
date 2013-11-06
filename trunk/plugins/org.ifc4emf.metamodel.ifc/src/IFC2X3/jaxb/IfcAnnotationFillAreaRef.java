package IFC2X3.jaxb;

import javax.xml.bind.annotation.*;
import org.eclipse.emf.ecore.jaxb.*;

import IFC2X3.IFC2X3Factory;
import IFC2X3.IfcAnnotationFillArea;

@XmlRootElement(name = "IfcAnnotationFillAreaRefElement")
public class IfcAnnotationFillAreaRef extends IFC2X3.jaxb.IfcGeometricRepresentationItemRef  {

	

	
	@Override
	public IfcAnnotationFillArea createInstance() {
		return IFC2X3Factory.eINSTANCE.createIfcAnnotationFillArea();
	}
	
	public static IfcAnnotationFillAreaRef valueOf(String id) {
		IfcAnnotationFillAreaRef result = new IfcAnnotationFillAreaRef();
		result.setID(id);
		return result;
	}

	@Override
	public String toString() {
		return getID();
	}
	

}