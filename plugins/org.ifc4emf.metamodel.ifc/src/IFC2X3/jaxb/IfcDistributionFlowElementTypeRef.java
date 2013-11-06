package IFC2X3.jaxb;

import javax.xml.bind.annotation.*;
import org.eclipse.emf.ecore.jaxb.*;

import IFC2X3.IFC2X3Factory;
import IFC2X3.IfcDistributionFlowElementType;

@XmlRootElement(name = "IfcDistributionFlowElementTypeRefElement")
public class IfcDistributionFlowElementTypeRef extends IFC2X3.jaxb.IfcDistributionElementTypeRef  {

	

	
	@Override
	public IfcDistributionFlowElementType createInstance() {
		return IFC2X3Factory.eINSTANCE.createIfcDistributionFlowElementType();
	}
	
	public static IfcDistributionFlowElementTypeRef valueOf(String id) {
		IfcDistributionFlowElementTypeRef result = new IfcDistributionFlowElementTypeRef();
		result.setID(id);
		return result;
	}

	@Override
	public String toString() {
		return getID();
	}
	

}