package IFC2X3.jaxb;

import javax.xml.bind.annotation.*;
import org.eclipse.emf.ecore.jaxb.*;

import IFC2X3.IFC2X3Factory;
import IFC2X3.IfcFlowInstrumentType;

@XmlRootElement(name = "IfcFlowInstrumentTypeRefElement")
public class IfcFlowInstrumentTypeRef extends IFC2X3.jaxb.IfcDistributionControlElementTypeRef  {

	

	
	@Override
	public IfcFlowInstrumentType createInstance() {
		return IFC2X3Factory.eINSTANCE.createIfcFlowInstrumentType();
	}
	
	public static IfcFlowInstrumentTypeRef valueOf(String id) {
		IfcFlowInstrumentTypeRef result = new IfcFlowInstrumentTypeRef();
		result.setID(id);
		return result;
	}

	@Override
	public String toString() {
		return getID();
	}
	

}