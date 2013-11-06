package IFC2X3.jaxb;

import javax.xml.bind.annotation.*;
import org.eclipse.emf.ecore.jaxb.*;

import IFC2X3.IFC2X3Factory;
import IFC2X3.IfcActor;

@XmlRootElement(name = "IfcActorRefElement")
public class IfcActorRef extends IFC2X3.jaxb.IfcObjectRef  {

	

	
	@Override
	public IfcActor createInstance() {
		return IFC2X3Factory.eINSTANCE.createIfcActor();
	}
	
	public static IfcActorRef valueOf(String id) {
		IfcActorRef result = new IfcActorRef();
		result.setID(id);
		return result;
	}

	@Override
	public String toString() {
		return getID();
	}
	

}