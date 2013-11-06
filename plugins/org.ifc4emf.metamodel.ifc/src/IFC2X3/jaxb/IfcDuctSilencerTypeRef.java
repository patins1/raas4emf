package IFC2X3.jaxb;

import javax.xml.bind.annotation.*;
import org.eclipse.emf.ecore.jaxb.*;

import IFC2X3.IFC2X3Factory;
import IFC2X3.IfcDuctSilencerType;

@XmlRootElement(name = "IfcDuctSilencerTypeRefElement")
public class IfcDuctSilencerTypeRef extends IFC2X3.jaxb.IfcFlowTreatmentDeviceTypeRef  {

	

	
	@Override
	public IfcDuctSilencerType createInstance() {
		return IFC2X3Factory.eINSTANCE.createIfcDuctSilencerType();
	}
	
	public static IfcDuctSilencerTypeRef valueOf(String id) {
		IfcDuctSilencerTypeRef result = new IfcDuctSilencerTypeRef();
		result.setID(id);
		return result;
	}

	@Override
	public String toString() {
		return getID();
	}
	

}