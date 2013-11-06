package IFC2X3.jaxb;

import javax.xml.bind.annotation.*;
import org.eclipse.emf.ecore.jaxb.*;

import IFC2X3.IFC2X3Factory;
import IFC2X3.IfcRelAssignsToActor;

@XmlRootElement(name = "IfcRelAssignsToActorRefElement")
public class IfcRelAssignsToActorRef extends IFC2X3.jaxb.IfcRelAssignsRef  {

	

	
	@Override
	public IfcRelAssignsToActor createInstance() {
		return IFC2X3Factory.eINSTANCE.createIfcRelAssignsToActor();
	}
	
	public static IfcRelAssignsToActorRef valueOf(String id) {
		IfcRelAssignsToActorRef result = new IfcRelAssignsToActorRef();
		result.setID(id);
		return result;
	}

	@Override
	public String toString() {
		return getID();
	}
	

}