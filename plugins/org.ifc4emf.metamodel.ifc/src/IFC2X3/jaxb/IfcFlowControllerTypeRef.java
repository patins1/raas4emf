package IFC2X3.jaxb;

import javax.xml.bind.annotation.*;
import org.eclipse.emf.ecore.jaxb.*;

import IFC2X3.IFC2X3Factory;
import IFC2X3.IfcFlowControllerType;

@XmlRootElement(name = "IfcFlowControllerTypeRefElement")
public class IfcFlowControllerTypeRef extends IFC2X3.jaxb.IfcDistributionFlowElementTypeRef  {

	

	
	@Override
	public IfcFlowControllerType createInstance() {
		return IFC2X3Factory.eINSTANCE.createIfcFlowControllerType();
	}
	
	public static IfcFlowControllerTypeRef valueOf(String id) {
		IfcFlowControllerTypeRef result = new IfcFlowControllerTypeRef();
		result.setID(id);
		return result;
	}

	@Override
	public String toString() {
		return getID();
	}
	

}