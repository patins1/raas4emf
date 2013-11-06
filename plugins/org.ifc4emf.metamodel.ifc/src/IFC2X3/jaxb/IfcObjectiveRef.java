package IFC2X3.jaxb;

import javax.xml.bind.annotation.*;
import org.eclipse.emf.ecore.jaxb.*;

import IFC2X3.IFC2X3Factory;
import IFC2X3.IfcObjective;

@XmlRootElement(name = "IfcObjectiveRefElement")
public class IfcObjectiveRef extends IFC2X3.jaxb.IfcConstraintRef  {

	

	
	@Override
	public IfcObjective createInstance() {
		return IFC2X3Factory.eINSTANCE.createIfcObjective();
	}
	
	public static IfcObjectiveRef valueOf(String id) {
		IfcObjectiveRef result = new IfcObjectiveRef();
		result.setID(id);
		return result;
	}

	@Override
	public String toString() {
		return getID();
	}
	

}