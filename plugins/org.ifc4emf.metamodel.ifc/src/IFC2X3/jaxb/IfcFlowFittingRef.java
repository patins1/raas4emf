package IFC2X3.jaxb;

import javax.xml.bind.annotation.*;
import org.eclipse.emf.ecore.jaxb.*;

import IFC2X3.IFC2X3Factory;
import IFC2X3.IfcFlowFitting;

@XmlRootElement(name = "IfcFlowFittingRefElement")
public class IfcFlowFittingRef extends IFC2X3.jaxb.IfcDistributionFlowElementRef  {

	

	
	@Override
	public IfcFlowFitting createInstance() {
		return IFC2X3Factory.eINSTANCE.createIfcFlowFitting();
	}
	
	public static IfcFlowFittingRef valueOf(String id) {
		IfcFlowFittingRef result = new IfcFlowFittingRef();
		result.setID(id);
		return result;
	}

	@Override
	public String toString() {
		return getID();
	}
	

}