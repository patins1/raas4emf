package IFC2X3.jaxb;

import javax.xml.bind.annotation.*;
import org.eclipse.emf.ecore.jaxb.*;

import IFC2X3.IFC2X3Factory;
import IFC2X3.IfcRelAssignsToProjectOrder;

@XmlRootElement(name = "IfcRelAssignsToProjectOrderRefElement")
public class IfcRelAssignsToProjectOrderRef extends IFC2X3.jaxb.IfcRelAssignsToControlRef  {

	

	
	@Override
	public IfcRelAssignsToProjectOrder createInstance() {
		return IFC2X3Factory.eINSTANCE.createIfcRelAssignsToProjectOrder();
	}
	
	public static IfcRelAssignsToProjectOrderRef valueOf(String id) {
		IfcRelAssignsToProjectOrderRef result = new IfcRelAssignsToProjectOrderRef();
		result.setID(id);
		return result;
	}

	@Override
	public String toString() {
		return getID();
	}
	

}