package IFC2X3.jaxb;

import javax.xml.bind.annotation.*;
import org.eclipse.emf.ecore.jaxb.*;

import IFC2X3.IFC2X3Factory;
import IFC2X3.IfcTankType;

@XmlRootElement(name = "IfcTankTypeRefElement")
public class IfcTankTypeRef extends IFC2X3.jaxb.IfcFlowStorageDeviceTypeRef  {

	

	
	@Override
	public IfcTankType createInstance() {
		return IFC2X3Factory.eINSTANCE.createIfcTankType();
	}
	
	public static IfcTankTypeRef valueOf(String id) {
		IfcTankTypeRef result = new IfcTankTypeRef();
		result.setID(id);
		return result;
	}

	@Override
	public String toString() {
		return getID();
	}
	

}