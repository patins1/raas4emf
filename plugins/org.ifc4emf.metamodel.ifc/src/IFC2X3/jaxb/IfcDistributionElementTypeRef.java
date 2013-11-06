package IFC2X3.jaxb;

import javax.xml.bind.annotation.*;
import org.eclipse.emf.ecore.jaxb.*;

import IFC2X3.IFC2X3Factory;
import IFC2X3.IfcDistributionElementType;

@XmlRootElement(name = "IfcDistributionElementTypeRefElement")
public class IfcDistributionElementTypeRef extends IFC2X3.jaxb.IfcElementTypeRef  {

	

	
	@Override
	public IfcDistributionElementType createInstance() {
		return IFC2X3Factory.eINSTANCE.createIfcDistributionElementType();
	}
	
	public static IfcDistributionElementTypeRef valueOf(String id) {
		IfcDistributionElementTypeRef result = new IfcDistributionElementTypeRef();
		result.setID(id);
		return result;
	}

	@Override
	public String toString() {
		return getID();
	}
	

}