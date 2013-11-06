package IFC2X3.jaxb;

import javax.xml.bind.annotation.*;
import org.eclipse.emf.ecore.jaxb.*;

import IFC2X3.IFC2X3Factory;
import IFC2X3.IfcWasteTerminalType;

@XmlRootElement(name = "IfcWasteTerminalTypeRefElement")
public class IfcWasteTerminalTypeRef extends IFC2X3.jaxb.IfcFlowTerminalTypeRef  {

	

	
	@Override
	public IfcWasteTerminalType createInstance() {
		return IFC2X3Factory.eINSTANCE.createIfcWasteTerminalType();
	}
	
	public static IfcWasteTerminalTypeRef valueOf(String id) {
		IfcWasteTerminalTypeRef result = new IfcWasteTerminalTypeRef();
		result.setID(id);
		return result;
	}

	@Override
	public String toString() {
		return getID();
	}
	

}