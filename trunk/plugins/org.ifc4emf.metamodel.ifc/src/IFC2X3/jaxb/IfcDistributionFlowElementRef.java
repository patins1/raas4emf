package IFC2X3.jaxb;

import javax.xml.bind.annotation.*;
import org.eclipse.emf.ecore.jaxb.*;

import IFC2X3.IFC2X3Factory;
import IFC2X3.IfcDistributionFlowElement;

@XmlRootElement(name = "IfcDistributionFlowElementRefElement")
public class IfcDistributionFlowElementRef extends IFC2X3.jaxb.IfcDistributionElementRef  {

	

	
	@Override
	public IfcDistributionFlowElement createInstance() {
		return IFC2X3Factory.eINSTANCE.createIfcDistributionFlowElement();
	}
	
	public static IfcDistributionFlowElementRef valueOf(String id) {
		IfcDistributionFlowElementRef result = new IfcDistributionFlowElementRef();
		result.setID(id);
		return result;
	}

	@Override
	public String toString() {
		return getID();
	}
	

}