package IFC2X3.jaxb;

import javax.xml.bind.annotation.*;
import org.eclipse.emf.ecore.jaxb.*;

import IFC2X3.IFC2X3Factory;
import IFC2X3.IfcFlowTreatmentDeviceType;

@XmlRootElement(name = "IfcFlowTreatmentDeviceTypeRefElement")
public class IfcFlowTreatmentDeviceTypeRef extends IFC2X3.jaxb.IfcDistributionFlowElementTypeRef  {

	

	
	@Override
	public IfcFlowTreatmentDeviceType createInstance() {
		return IFC2X3Factory.eINSTANCE.createIfcFlowTreatmentDeviceType();
	}
	
	public static IfcFlowTreatmentDeviceTypeRef valueOf(String id) {
		IfcFlowTreatmentDeviceTypeRef result = new IfcFlowTreatmentDeviceTypeRef();
		result.setID(id);
		return result;
	}

	@Override
	public String toString() {
		return getID();
	}
	

}