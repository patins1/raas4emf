package IFC2X3.jaxb;

import javax.xml.bind.annotation.*;
import org.eclipse.emf.ecore.jaxb.*;

import IFC2X3.IFC2X3Factory;
import IFC2X3.IfcElectricApplianceType;

@XmlRootElement(name = "IfcElectricApplianceTypeRefElement")
public class IfcElectricApplianceTypeRef extends IFC2X3.jaxb.IfcFlowTerminalTypeRef  {

	

	
	@Override
	public IfcElectricApplianceType createInstance() {
		return IFC2X3Factory.eINSTANCE.createIfcElectricApplianceType();
	}
	
	public static IfcElectricApplianceTypeRef valueOf(String id) {
		IfcElectricApplianceTypeRef result = new IfcElectricApplianceTypeRef();
		result.setID(id);
		return result;
	}

	@Override
	public String toString() {
		return getID();
	}
	

}