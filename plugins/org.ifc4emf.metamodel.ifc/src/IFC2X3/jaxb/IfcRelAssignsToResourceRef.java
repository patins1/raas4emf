package IFC2X3.jaxb;

import javax.xml.bind.annotation.*;
import org.eclipse.emf.ecore.jaxb.*;

import IFC2X3.IFC2X3Factory;
import IFC2X3.IfcRelAssignsToResource;

@XmlRootElement(name = "IfcRelAssignsToResourceRefElement")
public class IfcRelAssignsToResourceRef extends IFC2X3.jaxb.IfcRelAssignsRef  {

	

	
	@Override
	public IfcRelAssignsToResource createInstance() {
		return IFC2X3Factory.eINSTANCE.createIfcRelAssignsToResource();
	}
	
	public static IfcRelAssignsToResourceRef valueOf(String id) {
		IfcRelAssignsToResourceRef result = new IfcRelAssignsToResourceRef();
		result.setID(id);
		return result;
	}

	@Override
	public String toString() {
		return getID();
	}
	

}