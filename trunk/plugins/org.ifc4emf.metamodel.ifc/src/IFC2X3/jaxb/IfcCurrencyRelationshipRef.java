package IFC2X3.jaxb;

import javax.xml.bind.annotation.*;
import org.eclipse.emf.ecore.jaxb.*;

import IFC2X3.IFC2X3Factory;
import IFC2X3.IfcCurrencyRelationship;

@XmlRootElement(name = "IfcCurrencyRelationshipRefElement")
public class IfcCurrencyRelationshipRef extends org.eclipse.emf.cdo.jaxb.CDOObjectRef  {

	

	
	@Override
	public IfcCurrencyRelationship createInstance() {
		return IFC2X3Factory.eINSTANCE.createIfcCurrencyRelationship();
	}
	
	public static IfcCurrencyRelationshipRef valueOf(String id) {
		IfcCurrencyRelationshipRef result = new IfcCurrencyRelationshipRef();
		result.setID(id);
		return result;
	}

	@Override
	public String toString() {
		return getID();
	}
	

}