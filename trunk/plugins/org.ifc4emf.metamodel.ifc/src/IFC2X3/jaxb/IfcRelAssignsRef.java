package IFC2X3.jaxb;

import javax.xml.bind.annotation.*;
import org.eclipse.emf.ecore.jaxb.*;

import IFC2X3.IFC2X3Factory;
import IFC2X3.IfcRelAssigns;

@XmlRootElement(name = "IfcRelAssignsRefElement")
public class IfcRelAssignsRef extends IFC2X3.jaxb.IfcRelationshipRef  {

	

	
	@Override
	public IfcRelAssigns createInstance() {
		return IFC2X3Factory.eINSTANCE.createIfcRelAssigns();
	}
	
	public static IfcRelAssignsRef valueOf(String id) {
		IfcRelAssignsRef result = new IfcRelAssignsRef();
		result.setID(id);
		return result;
	}

	@Override
	public String toString() {
		return getID();
	}
	

}