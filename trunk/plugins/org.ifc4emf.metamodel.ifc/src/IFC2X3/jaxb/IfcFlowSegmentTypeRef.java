package IFC2X3.jaxb;

import javax.xml.bind.annotation.*;
import org.eclipse.emf.ecore.jaxb.*;

import IFC2X3.IFC2X3Factory;
import IFC2X3.IfcFlowSegmentType;

@XmlRootElement(name = "IfcFlowSegmentTypeRefElement")
public class IfcFlowSegmentTypeRef extends IFC2X3.jaxb.IfcDistributionFlowElementTypeRef  {

	

	
	@Override
	public IfcFlowSegmentType createInstance() {
		return IFC2X3Factory.eINSTANCE.createIfcFlowSegmentType();
	}
	
	public static IfcFlowSegmentTypeRef valueOf(String id) {
		IfcFlowSegmentTypeRef result = new IfcFlowSegmentTypeRef();
		result.setID(id);
		return result;
	}

	@Override
	public String toString() {
		return getID();
	}
	

}