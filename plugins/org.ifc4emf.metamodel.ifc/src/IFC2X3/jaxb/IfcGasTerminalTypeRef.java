package IFC2X3.jaxb;

import javax.xml.bind.annotation.*;
import org.eclipse.emf.ecore.jaxb.*;

import IFC2X3.IFC2X3Factory;
import IFC2X3.IfcGasTerminalType;

@XmlRootElement(name = "IfcGasTerminalTypeRefElement")
public class IfcGasTerminalTypeRef extends IFC2X3.jaxb.IfcFlowTerminalTypeRef  {

	

	
	@Override
	public IfcGasTerminalType createInstance() {
		return IFC2X3Factory.eINSTANCE.createIfcGasTerminalType();
	}
	
	public static IfcGasTerminalTypeRef valueOf(String id) {
		IfcGasTerminalTypeRef result = new IfcGasTerminalTypeRef();
		result.setID(id);
		return result;
	}

	@Override
	public String toString() {
		return getID();
	}
	

}