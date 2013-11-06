package IFC2X3.jaxb;

import javax.xml.bind.annotation.*;
import org.eclipse.emf.ecore.jaxb.*;

import IFC2X3.IFC2X3Factory;
import IFC2X3.IfcFlowMovingDevice;

@XmlRootElement(name = "IfcFlowMovingDeviceRefElement")
public class IfcFlowMovingDeviceRef extends IFC2X3.jaxb.IfcDistributionFlowElementRef  {

	

	
	@Override
	public IfcFlowMovingDevice createInstance() {
		return IFC2X3Factory.eINSTANCE.createIfcFlowMovingDevice();
	}
	
	public static IfcFlowMovingDeviceRef valueOf(String id) {
		IfcFlowMovingDeviceRef result = new IfcFlowMovingDeviceRef();
		result.setID(id);
		return result;
	}

	@Override
	public String toString() {
		return getID();
	}
	

}