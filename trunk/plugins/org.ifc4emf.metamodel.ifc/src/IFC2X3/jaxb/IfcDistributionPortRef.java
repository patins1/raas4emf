package IFC2X3.jaxb;

import javax.xml.bind.annotation.*;
import org.eclipse.emf.ecore.jaxb.*;

import IFC2X3.IFC2X3Factory;
import IFC2X3.IfcDistributionPort;

@XmlRootElement(name = "IfcDistributionPortRefElement")
public class IfcDistributionPortRef extends IFC2X3.jaxb.IfcPortRef  {

	

	
	@Override
	public IfcDistributionPort createInstance() {
		return IFC2X3Factory.eINSTANCE.createIfcDistributionPort();
	}
	
	public static IfcDistributionPortRef valueOf(String id) {
		IfcDistributionPortRef result = new IfcDistributionPortRef();
		result.setID(id);
		return result;
	}

	@Override
	public String toString() {
		return getID();
	}
	

}