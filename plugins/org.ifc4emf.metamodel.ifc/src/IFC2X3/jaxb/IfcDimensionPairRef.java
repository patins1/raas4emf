package IFC2X3.jaxb;

import javax.xml.bind.annotation.*;
import org.eclipse.emf.ecore.jaxb.*;

import IFC2X3.IFC2X3Factory;
import IFC2X3.IfcDimensionPair;

@XmlRootElement(name = "IfcDimensionPairRefElement")
public class IfcDimensionPairRef extends IFC2X3.jaxb.IfcDraughtingCalloutRelationshipRef  {

	

	
	@Override
	public IfcDimensionPair createInstance() {
		return IFC2X3Factory.eINSTANCE.createIfcDimensionPair();
	}
	
	public static IfcDimensionPairRef valueOf(String id) {
		IfcDimensionPairRef result = new IfcDimensionPairRef();
		result.setID(id);
		return result;
	}

	@Override
	public String toString() {
		return getID();
	}
	

}