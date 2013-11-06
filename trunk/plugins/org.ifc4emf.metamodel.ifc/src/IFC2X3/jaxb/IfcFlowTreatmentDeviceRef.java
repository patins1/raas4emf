package IFC2X3.jaxb;

import javax.xml.bind.annotation.*;
import org.eclipse.emf.ecore.jaxb.*;

import IFC2X3.IFC2X3Factory;
import IFC2X3.IfcFlowTreatmentDevice;

@XmlRootElement(name = "IfcFlowTreatmentDeviceRefElement")
public class IfcFlowTreatmentDeviceRef extends IFC2X3.jaxb.IfcDistributionFlowElementRef  {

	

	
	@Override
	public IfcFlowTreatmentDevice createInstance() {
		return IFC2X3Factory.eINSTANCE.createIfcFlowTreatmentDevice();
	}
	
	public static IfcFlowTreatmentDeviceRef valueOf(String id) {
		IfcFlowTreatmentDeviceRef result = new IfcFlowTreatmentDeviceRef();
		result.setID(id);
		return result;
	}

	@Override
	public String toString() {
		return getID();
	}
	

}