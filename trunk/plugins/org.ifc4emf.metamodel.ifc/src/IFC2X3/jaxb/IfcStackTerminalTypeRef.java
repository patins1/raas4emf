package IFC2X3.jaxb;

import javax.xml.bind.annotation.*;
import org.eclipse.emf.ecore.jaxb.*;

import IFC2X3.IFC2X3Factory;
import IFC2X3.IfcStackTerminalType;

@XmlRootElement(name = "IfcStackTerminalTypeRefElement")
public class IfcStackTerminalTypeRef extends IFC2X3.jaxb.IfcFlowTerminalTypeRef  {

	

	
	@Override
	public IfcStackTerminalType createInstance() {
		return IFC2X3Factory.eINSTANCE.createIfcStackTerminalType();
	}
	
	public static IfcStackTerminalTypeRef valueOf(String id) {
		IfcStackTerminalTypeRef result = new IfcStackTerminalTypeRef();
		result.setID(id);
		return result;
	}

	@Override
	public String toString() {
		return getID();
	}
	

}