package IFC2X3.jaxb;

import javax.xml.bind.annotation.*;
import org.eclipse.emf.ecore.jaxb.*;

import IFC2X3.IFC2X3Factory;
import IFC2X3.IfcBuildingElementProxy;

@XmlRootElement(name = "IfcBuildingElementProxyRefElement")
public class IfcBuildingElementProxyRef extends IFC2X3.jaxb.IfcBuildingElementRef  {

	

	
	@Override
	public IfcBuildingElementProxy createInstance() {
		return IFC2X3Factory.eINSTANCE.createIfcBuildingElementProxy();
	}
	
	public static IfcBuildingElementProxyRef valueOf(String id) {
		IfcBuildingElementProxyRef result = new IfcBuildingElementProxyRef();
		result.setID(id);
		return result;
	}

	@Override
	public String toString() {
		return getID();
	}
	

}