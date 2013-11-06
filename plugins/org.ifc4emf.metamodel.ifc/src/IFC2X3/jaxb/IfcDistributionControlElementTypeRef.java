package IFC2X3.jaxb;

import javax.xml.bind.annotation.*;
import org.eclipse.emf.ecore.jaxb.*;

import IFC2X3.IFC2X3Factory;
import IFC2X3.IfcDistributionControlElementType;

@XmlRootElement(name = "IfcDistributionControlElementTypeRefElement")
public class IfcDistributionControlElementTypeRef extends IFC2X3.jaxb.IfcDistributionElementTypeRef  {

	

	
	@Override
	public IfcDistributionControlElementType createInstance() {
		return IFC2X3Factory.eINSTANCE.createIfcDistributionControlElementType();
	}
	
	public static IfcDistributionControlElementTypeRef valueOf(String id) {
		IfcDistributionControlElementTypeRef result = new IfcDistributionControlElementTypeRef();
		result.setID(id);
		return result;
	}

	@Override
	public String toString() {
		return getID();
	}
	

}