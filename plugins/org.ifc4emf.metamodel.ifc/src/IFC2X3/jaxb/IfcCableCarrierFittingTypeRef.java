package IFC2X3.jaxb;

import javax.xml.bind.annotation.*;
import org.eclipse.emf.ecore.jaxb.*;

import IFC2X3.IFC2X3Factory;
import IFC2X3.IfcCableCarrierFittingType;

@XmlRootElement(name = "IfcCableCarrierFittingTypeRefElement")
public class IfcCableCarrierFittingTypeRef extends IFC2X3.jaxb.IfcFlowFittingTypeRef  {

	

	
	@Override
	public IfcCableCarrierFittingType createInstance() {
		return IFC2X3Factory.eINSTANCE.createIfcCableCarrierFittingType();
	}
	
	public static IfcCableCarrierFittingTypeRef valueOf(String id) {
		IfcCableCarrierFittingTypeRef result = new IfcCableCarrierFittingTypeRef();
		result.setID(id);
		return result;
	}

	@Override
	public String toString() {
		return getID();
	}
	

}