package IFC2X3.jaxb;

import javax.xml.bind.annotation.*;
import org.eclipse.emf.ecore.jaxb.*;

import IFC2X3.IFC2X3Factory;
import IFC2X3.IfcShapeRepresentation;

@XmlRootElement(name = "IfcShapeRepresentationRefElement")
public class IfcShapeRepresentationRef extends IFC2X3.jaxb.IfcShapeModelRef  {

	

	
	@Override
	public IfcShapeRepresentation createInstance() {
		return IFC2X3Factory.eINSTANCE.createIfcShapeRepresentation();
	}
	
	public static IfcShapeRepresentationRef valueOf(String id) {
		IfcShapeRepresentationRef result = new IfcShapeRepresentationRef();
		result.setID(id);
		return result;
	}

	@Override
	public String toString() {
		return getID();
	}
	

}