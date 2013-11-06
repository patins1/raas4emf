package IFC2X3.jaxb;

import javax.xml.bind.annotation.*;
import org.eclipse.emf.ecore.jaxb.*;

import IFC2X3.IFC2X3Factory;
import IFC2X3.IfcRepresentation;

@XmlRootElement(name = "IfcRepresentationRefElement")
public class IfcRepresentationRef extends IFC2X3.jaxb.IfcLayeredItemRef  {

	

	
	@Override
	public IfcRepresentation createInstance() {
		return IFC2X3Factory.eINSTANCE.createIfcRepresentation();
	}
	
	public static IfcRepresentationRef valueOf(String id) {
		IfcRepresentationRef result = new IfcRepresentationRef();
		result.setID(id);
		return result;
	}

	@Override
	public String toString() {
		return getID();
	}
	

}