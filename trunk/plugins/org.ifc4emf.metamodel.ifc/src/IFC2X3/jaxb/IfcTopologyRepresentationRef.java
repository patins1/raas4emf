package IFC2X3.jaxb;

import javax.xml.bind.annotation.*;
import org.eclipse.emf.ecore.jaxb.*;

import IFC2X3.IFC2X3Factory;
import IFC2X3.IfcTopologyRepresentation;

@XmlRootElement(name = "IfcTopologyRepresentationRefElement")
public class IfcTopologyRepresentationRef extends IFC2X3.jaxb.IfcShapeModelRef  {

	

	
	@Override
	public IfcTopologyRepresentation createInstance() {
		return IFC2X3Factory.eINSTANCE.createIfcTopologyRepresentation();
	}
	
	public static IfcTopologyRepresentationRef valueOf(String id) {
		IfcTopologyRepresentationRef result = new IfcTopologyRepresentationRef();
		result.setID(id);
		return result;
	}

	@Override
	public String toString() {
		return getID();
	}
	

}