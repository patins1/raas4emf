package IFC2X3.jaxb;

import javax.xml.bind.annotation.*;
import org.eclipse.emf.ecore.jaxb.*;

import IFC2X3.IFC2X3Factory;
import IFC2X3.IfcFlowSegment;

@XmlRootElement(name = "IfcFlowSegmentRefElement")
public class IfcFlowSegmentRef extends IFC2X3.jaxb.IfcDistributionFlowElementRef  {

	

	
	@Override
	public IfcFlowSegment createInstance() {
		return IFC2X3Factory.eINSTANCE.createIfcFlowSegment();
	}
	
	public static IfcFlowSegmentRef valueOf(String id) {
		IfcFlowSegmentRef result = new IfcFlowSegmentRef();
		result.setID(id);
		return result;
	}

	@Override
	public String toString() {
		return getID();
	}
	

}