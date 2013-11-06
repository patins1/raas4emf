package IFC2X3.jaxb;

import javax.xml.bind.annotation.*;
import org.eclipse.emf.ecore.jaxb.*;

import IFC2X3.IFC2X3Factory;
import IFC2X3.IfcDimensionCalloutRelationship;

@XmlRootElement(name = "IfcDimensionCalloutRelationshipRefElement")
public class IfcDimensionCalloutRelationshipRef extends IFC2X3.jaxb.IfcDraughtingCalloutRelationshipRef  {

	

	
	@Override
	public IfcDimensionCalloutRelationship createInstance() {
		return IFC2X3Factory.eINSTANCE.createIfcDimensionCalloutRelationship();
	}
	
	public static IfcDimensionCalloutRelationshipRef valueOf(String id) {
		IfcDimensionCalloutRelationshipRef result = new IfcDimensionCalloutRelationshipRef();
		result.setID(id);
		return result;
	}

	@Override
	public String toString() {
		return getID();
	}
	

}