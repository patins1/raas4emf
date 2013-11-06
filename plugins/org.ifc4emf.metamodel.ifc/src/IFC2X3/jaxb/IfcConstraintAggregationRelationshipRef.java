package IFC2X3.jaxb;

import javax.xml.bind.annotation.*;
import org.eclipse.emf.ecore.jaxb.*;

import IFC2X3.IFC2X3Factory;
import IFC2X3.IfcConstraintAggregationRelationship;

@XmlRootElement(name = "IfcConstraintAggregationRelationshipRefElement")
public class IfcConstraintAggregationRelationshipRef extends org.eclipse.emf.cdo.jaxb.CDOObjectRef  {

	

	
	@Override
	public IfcConstraintAggregationRelationship createInstance() {
		return IFC2X3Factory.eINSTANCE.createIfcConstraintAggregationRelationship();
	}
	
	public static IfcConstraintAggregationRelationshipRef valueOf(String id) {
		IfcConstraintAggregationRelationshipRef result = new IfcConstraintAggregationRelationshipRef();
		result.setID(id);
		return result;
	}

	@Override
	public String toString() {
		return getID();
	}
	

}