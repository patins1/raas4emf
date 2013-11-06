package IFC2X3.jaxb;

import javax.xml.bind.annotation.*;
import org.eclipse.emf.ecore.jaxb.*;

import IFC2X3.IFC2X3Factory;
import IFC2X3.IfcPumpType;

@XmlRootElement(name = "IfcPumpTypeRefElement")
public class IfcPumpTypeRef extends IFC2X3.jaxb.IfcFlowMovingDeviceTypeRef  {

	

	
	@Override
	public IfcPumpType createInstance() {
		return IFC2X3Factory.eINSTANCE.createIfcPumpType();
	}
	
	public static IfcPumpTypeRef valueOf(String id) {
		IfcPumpTypeRef result = new IfcPumpTypeRef();
		result.setID(id);
		return result;
	}

	@Override
	public String toString() {
		return getID();
	}
	

}