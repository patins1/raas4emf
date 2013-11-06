package IFC2X3.jaxb;

import javax.xml.bind.annotation.*;
import org.eclipse.emf.ecore.jaxb.*;

import IFC2X3.IFC2X3Factory;
import IFC2X3.IfcActionRequest;

@XmlRootElement(name = "IfcActionRequestRefElement")
public class IfcActionRequestRef extends IFC2X3.jaxb.IfcControlRef  {

	

	
	@Override
	public IfcActionRequest createInstance() {
		return IFC2X3Factory.eINSTANCE.createIfcActionRequest();
	}
	
	public static IfcActionRequestRef valueOf(String id) {
		IfcActionRequestRef result = new IfcActionRequestRef();
		result.setID(id);
		return result;
	}

	@Override
	public String toString() {
		return getID();
	}
	

}