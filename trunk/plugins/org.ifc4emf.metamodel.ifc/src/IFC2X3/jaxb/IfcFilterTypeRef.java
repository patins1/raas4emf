package IFC2X3.jaxb;

import javax.xml.bind.annotation.*;
import org.eclipse.emf.ecore.jaxb.*;

import IFC2X3.IFC2X3Factory;
import IFC2X3.IfcFilterType;

@XmlRootElement(name = "IfcFilterTypeRefElement")
public class IfcFilterTypeRef extends IFC2X3.jaxb.IfcFlowTreatmentDeviceTypeRef  {

	

	
	@Override
	public IfcFilterType createInstance() {
		return IFC2X3Factory.eINSTANCE.createIfcFilterType();
	}
	
	public static IfcFilterTypeRef valueOf(String id) {
		IfcFilterTypeRef result = new IfcFilterTypeRef();
		result.setID(id);
		return result;
	}

	@Override
	public String toString() {
		return getID();
	}
	

}