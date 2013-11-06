package IFC2X3.jaxb;

import javax.xml.bind.annotation.*;
import org.eclipse.emf.ecore.jaxb.*;

import IFC2X3.IFC2X3Factory;
import IFC2X3.IfcAirTerminalBoxType;

@XmlRootElement(name = "IfcAirTerminalBoxTypeRefElement")
public class IfcAirTerminalBoxTypeRef extends IFC2X3.jaxb.IfcFlowControllerTypeRef  {

	

	
	@Override
	public IfcAirTerminalBoxType createInstance() {
		return IFC2X3Factory.eINSTANCE.createIfcAirTerminalBoxType();
	}
	
	public static IfcAirTerminalBoxTypeRef valueOf(String id) {
		IfcAirTerminalBoxTypeRef result = new IfcAirTerminalBoxTypeRef();
		result.setID(id);
		return result;
	}

	@Override
	public String toString() {
		return getID();
	}
	

}