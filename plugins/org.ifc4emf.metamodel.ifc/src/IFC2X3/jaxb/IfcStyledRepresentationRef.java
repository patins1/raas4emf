package IFC2X3.jaxb;

import javax.xml.bind.annotation.*;
import org.eclipse.emf.ecore.jaxb.*;

import IFC2X3.IFC2X3Factory;
import IFC2X3.IfcStyledRepresentation;

@XmlRootElement(name = "IfcStyledRepresentationRefElement")
public class IfcStyledRepresentationRef extends IFC2X3.jaxb.IfcStyleModelRef  {

	

	
	@Override
	public IfcStyledRepresentation createInstance() {
		return IFC2X3Factory.eINSTANCE.createIfcStyledRepresentation();
	}
	
	public static IfcStyledRepresentationRef valueOf(String id) {
		IfcStyledRepresentationRef result = new IfcStyledRepresentationRef();
		result.setID(id);
		return result;
	}

	@Override
	public String toString() {
		return getID();
	}
	

}