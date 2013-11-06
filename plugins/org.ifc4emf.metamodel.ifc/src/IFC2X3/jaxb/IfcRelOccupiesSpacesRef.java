package IFC2X3.jaxb;

import javax.xml.bind.annotation.*;
import org.eclipse.emf.ecore.jaxb.*;

import IFC2X3.IFC2X3Factory;
import IFC2X3.IfcRelOccupiesSpaces;

@XmlRootElement(name = "IfcRelOccupiesSpacesRefElement")
public class IfcRelOccupiesSpacesRef extends IFC2X3.jaxb.IfcRelAssignsToActorRef  {

	

	
	@Override
	public IfcRelOccupiesSpaces createInstance() {
		return IFC2X3Factory.eINSTANCE.createIfcRelOccupiesSpaces();
	}
	
	public static IfcRelOccupiesSpacesRef valueOf(String id) {
		IfcRelOccupiesSpacesRef result = new IfcRelOccupiesSpacesRef();
		result.setID(id);
		return result;
	}

	@Override
	public String toString() {
		return getID();
	}
	

}