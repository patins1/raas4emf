package IFC2X3.jaxb;

import javax.xml.bind.annotation.*;
import org.eclipse.emf.ecore.jaxb.*;

import IFC2X3.IFC2X3Factory;
import IFC2X3.IfcFlowTerminal;

@XmlRootElement(name = "IfcFlowTerminalRefElement")
public class IfcFlowTerminalRef extends IFC2X3.jaxb.IfcDistributionFlowElementRef  {

	

	
	@Override
	public IfcFlowTerminal createInstance() {
		return IFC2X3Factory.eINSTANCE.createIfcFlowTerminal();
	}
	
	public static IfcFlowTerminalRef valueOf(String id) {
		IfcFlowTerminalRef result = new IfcFlowTerminalRef();
		result.setID(id);
		return result;
	}

	@Override
	public String toString() {
		return getID();
	}
	

}