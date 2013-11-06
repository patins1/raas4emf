package IFC2X3.jaxb;

import javax.xml.bind.annotation.*;
import org.eclipse.emf.ecore.jaxb.*;

import IFC2X3.IFC2X3Factory;
import IFC2X3.IfcCableCarrierSegmentType;

@XmlRootElement(name = "IfcCableCarrierSegmentTypeRefElement")
public class IfcCableCarrierSegmentTypeRef extends IFC2X3.jaxb.IfcFlowSegmentTypeRef  {

	

	
	@Override
	public IfcCableCarrierSegmentType createInstance() {
		return IFC2X3Factory.eINSTANCE.createIfcCableCarrierSegmentType();
	}
	
	public static IfcCableCarrierSegmentTypeRef valueOf(String id) {
		IfcCableCarrierSegmentTypeRef result = new IfcCableCarrierSegmentTypeRef();
		result.setID(id);
		return result;
	}

	@Override
	public String toString() {
		return getID();
	}
	

}