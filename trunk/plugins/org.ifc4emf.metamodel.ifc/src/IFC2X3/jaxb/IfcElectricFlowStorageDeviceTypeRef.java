package IFC2X3.jaxb;

import javax.xml.bind.annotation.*;
import org.eclipse.emf.ecore.jaxb.*;

import IFC2X3.IFC2X3Factory;
import IFC2X3.IfcElectricFlowStorageDeviceType;

@XmlRootElement(name = "IfcElectricFlowStorageDeviceTypeRefElement")
public class IfcElectricFlowStorageDeviceTypeRef extends IFC2X3.jaxb.IfcFlowStorageDeviceTypeRef  {

	

	
	@Override
	public IfcElectricFlowStorageDeviceType createInstance() {
		return IFC2X3Factory.eINSTANCE.createIfcElectricFlowStorageDeviceType();
	}
	
	public static IfcElectricFlowStorageDeviceTypeRef valueOf(String id) {
		IfcElectricFlowStorageDeviceTypeRef result = new IfcElectricFlowStorageDeviceTypeRef();
		result.setID(id);
		return result;
	}

	@Override
	public String toString() {
		return getID();
	}
	

}