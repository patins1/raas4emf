package IFC2X3.jaxb;

import javax.xml.bind.annotation.*;
import org.eclipse.emf.ecore.jaxb.*;

import IFC2X3.IFC2X3Factory;
import IFC2X3.IfcRelAssignsToControl;

@XmlRootElement(name = "IfcRelAssignsToControlRefElement")
public class IfcRelAssignsToControlRef extends IFC2X3.jaxb.IfcRelAssignsRef  {

	

	
	@Override
	public IfcRelAssignsToControl createInstance() {
		return IFC2X3Factory.eINSTANCE.createIfcRelAssignsToControl();
	}
	
	public static IfcRelAssignsToControlRef valueOf(String id) {
		IfcRelAssignsToControlRef result = new IfcRelAssignsToControlRef();
		result.setID(id);
		return result;
	}

	@Override
	public String toString() {
		return getID();
	}
	

}