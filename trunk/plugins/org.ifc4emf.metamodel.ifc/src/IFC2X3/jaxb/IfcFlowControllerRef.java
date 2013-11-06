package IFC2X3.jaxb;

import javax.xml.bind.annotation.*;
import org.eclipse.emf.ecore.jaxb.*;

import IFC2X3.IFC2X3Factory;
import IFC2X3.IfcFlowController;

@XmlRootElement(name = "IfcFlowControllerRefElement")
public class IfcFlowControllerRef extends IFC2X3.jaxb.IfcDistributionFlowElementRef  {

	

	
	@Override
	public IfcFlowController createInstance() {
		return IFC2X3Factory.eINSTANCE.createIfcFlowController();
	}
	
	public static IfcFlowControllerRef valueOf(String id) {
		IfcFlowControllerRef result = new IfcFlowControllerRef();
		result.setID(id);
		return result;
	}

	@Override
	public String toString() {
		return getID();
	}
	

}