package IFC2X3.jaxb;

import javax.xml.bind.annotation.*;
import org.eclipse.emf.ecore.jaxb.*;

import IFC2X3.IFC2X3Factory;
import IFC2X3.IfcAirTerminalType;

@XmlRootElement(name = "IfcAirTerminalTypeRefElement")
public class IfcAirTerminalTypeRef extends IFC2X3.jaxb.IfcFlowTerminalTypeRef  {

	

	
	@Override
	public IfcAirTerminalType createInstance() {
		return IFC2X3Factory.eINSTANCE.createIfcAirTerminalType();
	}
	
	public static IfcAirTerminalTypeRef valueOf(String id) {
		IfcAirTerminalTypeRef result = new IfcAirTerminalTypeRef();
		result.setID(id);
		return result;
	}

	@Override
	public String toString() {
		return getID();
	}
	

}