package IFC2X3.jaxb;

import javax.xml.bind.annotation.*;
import org.eclipse.emf.ecore.jaxb.*;

import IFC2X3.IFC2X3Factory;
import IFC2X3.IfcCrewResource;

@XmlRootElement(name = "IfcCrewResourceRefElement")
public class IfcCrewResourceRef extends IFC2X3.jaxb.IfcConstructionResourceRef  {

	

	
	@Override
	public IfcCrewResource createInstance() {
		return IFC2X3Factory.eINSTANCE.createIfcCrewResource();
	}
	
	public static IfcCrewResourceRef valueOf(String id) {
		IfcCrewResourceRef result = new IfcCrewResourceRef();
		result.setID(id);
		return result;
	}

	@Override
	public String toString() {
		return getID();
	}
	

}