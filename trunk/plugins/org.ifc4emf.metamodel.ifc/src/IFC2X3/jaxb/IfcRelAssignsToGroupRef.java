package IFC2X3.jaxb;

import javax.xml.bind.annotation.*;
import org.eclipse.emf.ecore.jaxb.*;

import IFC2X3.IFC2X3Factory;
import IFC2X3.IfcRelAssignsToGroup;

@XmlRootElement(name = "IfcRelAssignsToGroupRefElement")
public class IfcRelAssignsToGroupRef extends IFC2X3.jaxb.IfcRelAssignsRef  {

	

	
	@Override
	public IfcRelAssignsToGroup createInstance() {
		return IFC2X3Factory.eINSTANCE.createIfcRelAssignsToGroup();
	}
	
	public static IfcRelAssignsToGroupRef valueOf(String id) {
		IfcRelAssignsToGroupRef result = new IfcRelAssignsToGroupRef();
		result.setID(id);
		return result;
	}

	@Override
	public String toString() {
		return getID();
	}
	

}