package IFC2X3.jaxb;

import javax.xml.bind.annotation.*;
import org.eclipse.emf.ecore.jaxb.*;

import IFC2X3.IFC2X3Factory;
import IFC2X3.IfcFlowStorageDeviceType;

@XmlRootElement(name = "IfcFlowStorageDeviceTypeRefElement")
public class IfcFlowStorageDeviceTypeRef extends IFC2X3.jaxb.IfcDistributionFlowElementTypeRef  {

	

	
	@Override
	public IfcFlowStorageDeviceType createInstance() {
		return IFC2X3Factory.eINSTANCE.createIfcFlowStorageDeviceType();
	}
	
	public static IfcFlowStorageDeviceTypeRef valueOf(String id) {
		IfcFlowStorageDeviceTypeRef result = new IfcFlowStorageDeviceTypeRef();
		result.setID(id);
		return result;
	}

	@Override
	public String toString() {
		return getID();
	}
	

}