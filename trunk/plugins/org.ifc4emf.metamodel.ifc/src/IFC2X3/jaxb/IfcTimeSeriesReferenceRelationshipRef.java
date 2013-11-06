package IFC2X3.jaxb;

import javax.xml.bind.annotation.*;
import org.eclipse.emf.ecore.jaxb.*;

import IFC2X3.IFC2X3Factory;
import IFC2X3.IfcTimeSeriesReferenceRelationship;

@XmlRootElement(name = "IfcTimeSeriesReferenceRelationshipRefElement")
public class IfcTimeSeriesReferenceRelationshipRef extends org.eclipse.emf.cdo.jaxb.CDOObjectRef  {

	

	
	@Override
	public IfcTimeSeriesReferenceRelationship createInstance() {
		return IFC2X3Factory.eINSTANCE.createIfcTimeSeriesReferenceRelationship();
	}
	
	public static IfcTimeSeriesReferenceRelationshipRef valueOf(String id) {
		IfcTimeSeriesReferenceRelationshipRef result = new IfcTimeSeriesReferenceRelationshipRef();
		result.setID(id);
		return result;
	}

	@Override
	public String toString() {
		return getID();
	}
	

}