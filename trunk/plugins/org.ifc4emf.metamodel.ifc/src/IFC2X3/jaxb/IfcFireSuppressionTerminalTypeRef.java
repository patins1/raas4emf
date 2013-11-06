package IFC2X3.jaxb;

import javax.xml.bind.annotation.*;
import org.eclipse.emf.ecore.jaxb.*;

import IFC2X3.IFC2X3Factory;
import IFC2X3.IfcFireSuppressionTerminalType;

@XmlRootElement(name = "IfcFireSuppressionTerminalTypeRefElement")
public class IfcFireSuppressionTerminalTypeRef extends IFC2X3.jaxb.IfcFlowTerminalTypeRef  {

	

	
	@Override
	public IfcFireSuppressionTerminalType createInstance() {
		return IFC2X3Factory.eINSTANCE.createIfcFireSuppressionTerminalType();
	}
	
	public static IfcFireSuppressionTerminalTypeRef valueOf(String id) {
		IfcFireSuppressionTerminalTypeRef result = new IfcFireSuppressionTerminalTypeRef();
		result.setID(id);
		return result;
	}

	@Override
	public String toString() {
		return getID();
	}
	

}