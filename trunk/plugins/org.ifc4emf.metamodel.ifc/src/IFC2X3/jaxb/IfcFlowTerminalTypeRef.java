package IFC2X3.jaxb;

import javax.xml.bind.annotation.*;
import org.eclipse.emf.ecore.jaxb.*;

import IFC2X3.IFC2X3Factory;
import IFC2X3.IfcFlowTerminalType;

@XmlRootElement(name = "IfcFlowTerminalTypeRefElement")
public class IfcFlowTerminalTypeRef extends IFC2X3.jaxb.IfcDistributionFlowElementTypeRef  {

	

	
	@Override
	public IfcFlowTerminalType createInstance() {
		return IFC2X3Factory.eINSTANCE.createIfcFlowTerminalType();
	}
	
	public static IfcFlowTerminalTypeRef valueOf(String id) {
		IfcFlowTerminalTypeRef result = new IfcFlowTerminalTypeRef();
		result.setID(id);
		return result;
	}

	@Override
	public String toString() {
		return getID();
	}
	

}