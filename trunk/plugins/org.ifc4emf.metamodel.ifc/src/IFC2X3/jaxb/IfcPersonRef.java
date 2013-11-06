package IFC2X3.jaxb;

import javax.xml.bind.annotation.*;
import org.eclipse.emf.ecore.jaxb.*;

import IFC2X3.IFC2X3Factory;
import IFC2X3.IfcPerson;

@XmlRootElement(name = "IfcPersonRefElement")
public class IfcPersonRef extends IFC2X3.jaxb.IfcActorSelectRef  {

	

	
	@Override
	public IfcPerson createInstance() {
		return IFC2X3Factory.eINSTANCE.createIfcPerson();
	}
	
	public static IfcPersonRef valueOf(String id) {
		IfcPersonRef result = new IfcPersonRef();
		result.setID(id);
		return result;
	}

	@Override
	public String toString() {
		return getID();
	}
	

}