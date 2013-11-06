package IFC2X3.jaxb;

import javax.xml.bind.annotation.*;
import org.eclipse.emf.ecore.jaxb.*;

import IFC2X3.IFC2X3Factory;
import IFC2X3.IfcBoundaryNodeConditionWarping;

@XmlRootElement(name = "IfcBoundaryNodeConditionWarpingRefElement")
public class IfcBoundaryNodeConditionWarpingRef extends IFC2X3.jaxb.IfcBoundaryNodeConditionRef  {

	

	
	@Override
	public IfcBoundaryNodeConditionWarping createInstance() {
		return IFC2X3Factory.eINSTANCE.createIfcBoundaryNodeConditionWarping();
	}
	
	public static IfcBoundaryNodeConditionWarpingRef valueOf(String id) {
		IfcBoundaryNodeConditionWarpingRef result = new IfcBoundaryNodeConditionWarpingRef();
		result.setID(id);
		return result;
	}

	@Override
	public String toString() {
		return getID();
	}
	

}