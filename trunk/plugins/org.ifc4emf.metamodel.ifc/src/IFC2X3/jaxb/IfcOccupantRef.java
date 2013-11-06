package IFC2X3.jaxb;

import javax.xml.bind.annotation.*;
import org.eclipse.emf.ecore.jaxb.*;

import IFC2X3.IFC2X3Factory;
import IFC2X3.IfcOccupant;

@XmlRootElement(name = "IfcOccupantRefElement")
public class IfcOccupantRef extends IFC2X3.jaxb.IfcActorRef  {

	

	
	@Override
	public IfcOccupant createInstance() {
		return IFC2X3Factory.eINSTANCE.createIfcOccupant();
	}
	
	public static IfcOccupantRef valueOf(String id) {
		IfcOccupantRef result = new IfcOccupantRef();
		result.setID(id);
		return result;
	}

	@Override
	public String toString() {
		return getID();
	}
	

}