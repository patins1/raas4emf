package IFC2X3.jaxb;

import javax.xml.bind.annotation.*;
import org.eclipse.emf.ecore.jaxb.*;

import IFC2X3.IFC2X3Factory;
import IFC2X3.IfcFlowStorageDevice;

@XmlRootElement(name = "IfcFlowStorageDeviceRefElement")
public class IfcFlowStorageDeviceRef extends IFC2X3.jaxb.IfcDistributionFlowElementRef  {

	

	
	@Override
	public IfcFlowStorageDevice createInstance() {
		return IFC2X3Factory.eINSTANCE.createIfcFlowStorageDevice();
	}
	
	public static IfcFlowStorageDeviceRef valueOf(String id) {
		IfcFlowStorageDeviceRef result = new IfcFlowStorageDeviceRef();
		result.setID(id);
		return result;
	}

	@Override
	public String toString() {
		return getID();
	}
	

}