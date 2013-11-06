package IFC2X3.jaxb;

import javax.xml.bind.annotation.*;
import org.eclipse.emf.ecore.jaxb.*;

import IFC2X3.IFC2X3Factory;
import IFC2X3.IfcCableSegmentType;

@XmlRootElement(name = "IfcCableSegmentTypeRefElement")
public class IfcCableSegmentTypeRef extends IFC2X3.jaxb.IfcFlowSegmentTypeRef  {

	

	
	@Override
	public IfcCableSegmentType createInstance() {
		return IFC2X3Factory.eINSTANCE.createIfcCableSegmentType();
	}
	
	public static IfcCableSegmentTypeRef valueOf(String id) {
		IfcCableSegmentTypeRef result = new IfcCableSegmentTypeRef();
		result.setID(id);
		return result;
	}

	@Override
	public String toString() {
		return getID();
	}
	

}