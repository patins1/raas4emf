package IFC2X3.jaxb;

import javax.xml.bind.annotation.*;
import org.eclipse.emf.ecore.jaxb.*;

import IFC2X3.IFC2X3Factory;
import IFC2X3.IfcSanitaryTerminalType;

@XmlRootElement(name = "IfcSanitaryTerminalTypeRefElement")
public class IfcSanitaryTerminalTypeRef extends IFC2X3.jaxb.IfcFlowTerminalTypeRef  {

	

	
	@Override
	public IfcSanitaryTerminalType createInstance() {
		return IFC2X3Factory.eINSTANCE.createIfcSanitaryTerminalType();
	}
	
	public static IfcSanitaryTerminalTypeRef valueOf(String id) {
		IfcSanitaryTerminalTypeRef result = new IfcSanitaryTerminalTypeRef();
		result.setID(id);
		return result;
	}

	@Override
	public String toString() {
		return getID();
	}
	

}