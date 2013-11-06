package IFC2X3.jaxb;

import javax.xml.bind.annotation.*;
import org.eclipse.emf.ecore.jaxb.*;

import IFC2X3.IFC2X3Factory;
import IFC2X3.IfcFlowFittingType;

@XmlRootElement(name = "IfcFlowFittingTypeRefElement")
public class IfcFlowFittingTypeRef extends IFC2X3.jaxb.IfcDistributionFlowElementTypeRef  {

	

	
	@Override
	public IfcFlowFittingType createInstance() {
		return IFC2X3Factory.eINSTANCE.createIfcFlowFittingType();
	}
	
	public static IfcFlowFittingTypeRef valueOf(String id) {
		IfcFlowFittingTypeRef result = new IfcFlowFittingTypeRef();
		result.setID(id);
		return result;
	}

	@Override
	public String toString() {
		return getID();
	}
	

}