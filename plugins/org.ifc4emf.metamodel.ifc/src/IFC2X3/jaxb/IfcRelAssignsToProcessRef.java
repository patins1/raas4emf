package IFC2X3.jaxb;

import javax.xml.bind.annotation.*;
import org.eclipse.emf.ecore.jaxb.*;

import IFC2X3.IFC2X3Factory;
import IFC2X3.IfcRelAssignsToProcess;

@XmlRootElement(name = "IfcRelAssignsToProcessRefElement")
public class IfcRelAssignsToProcessRef extends IFC2X3.jaxb.IfcRelAssignsRef  {

	

	
	@Override
	public IfcRelAssignsToProcess createInstance() {
		return IFC2X3Factory.eINSTANCE.createIfcRelAssignsToProcess();
	}
	
	public static IfcRelAssignsToProcessRef valueOf(String id) {
		IfcRelAssignsToProcessRef result = new IfcRelAssignsToProcessRef();
		result.setID(id);
		return result;
	}

	@Override
	public String toString() {
		return getID();
	}
	

}