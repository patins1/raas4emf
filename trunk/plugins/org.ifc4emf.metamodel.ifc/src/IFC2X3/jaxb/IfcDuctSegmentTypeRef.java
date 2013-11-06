package IFC2X3.jaxb;

import javax.xml.bind.annotation.*;
import org.eclipse.emf.ecore.jaxb.*;

import IFC2X3.IFC2X3Factory;
import IFC2X3.IfcDuctSegmentType;

@XmlRootElement(name = "IfcDuctSegmentTypeRefElement")
public class IfcDuctSegmentTypeRef extends IFC2X3.jaxb.IfcFlowSegmentTypeRef  {

	

	
	@Override
	public IfcDuctSegmentType createInstance() {
		return IFC2X3Factory.eINSTANCE.createIfcDuctSegmentType();
	}
	
	public static IfcDuctSegmentTypeRef valueOf(String id) {
		IfcDuctSegmentTypeRef result = new IfcDuctSegmentTypeRef();
		result.setID(id);
		return result;
	}

	@Override
	public String toString() {
		return getID();
	}
	

}