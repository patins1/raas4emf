package IFC2X3.jaxb;

import javax.xml.bind.annotation.*;
import org.eclipse.emf.ecore.jaxb.*;

import IFC2X3.IFC2X3Factory;
import IFC2X3.IfcDistributionElement;

@XmlRootElement(name = "IfcDistributionElementRefElement")
public class IfcDistributionElementRef extends IFC2X3.jaxb.IfcElementRef  {

	

	
	@Override
	public IfcDistributionElement createInstance() {
		return IFC2X3Factory.eINSTANCE.createIfcDistributionElement();
	}
	
	public static IfcDistributionElementRef valueOf(String id) {
		IfcDistributionElementRef result = new IfcDistributionElementRef();
		result.setID(id);
		return result;
	}

	@Override
	public String toString() {
		return getID();
	}
	

}