package IFC2X3.jaxb;

import javax.xml.bind.annotation.*;
import org.eclipse.emf.ecore.jaxb.*;

import IFC2X3.IFC2X3Factory;
import IFC2X3.IfcRelAssignsTasks;

@XmlRootElement(name = "IfcRelAssignsTasksRefElement")
public class IfcRelAssignsTasksRef extends IFC2X3.jaxb.IfcRelAssignsToControlRef  {

	

	
	@Override
	public IfcRelAssignsTasks createInstance() {
		return IFC2X3Factory.eINSTANCE.createIfcRelAssignsTasks();
	}
	
	public static IfcRelAssignsTasksRef valueOf(String id) {
		IfcRelAssignsTasksRef result = new IfcRelAssignsTasksRef();
		result.setID(id);
		return result;
	}

	@Override
	public String toString() {
		return getID();
	}
	

}