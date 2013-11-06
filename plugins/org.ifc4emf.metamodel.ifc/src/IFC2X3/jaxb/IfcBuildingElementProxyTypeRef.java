package IFC2X3.jaxb;

import javax.xml.bind.annotation.*;
import org.eclipse.emf.ecore.jaxb.*;

import IFC2X3.IFC2X3Factory;
import IFC2X3.IfcBuildingElementProxyType;

@XmlRootElement(name = "IfcBuildingElementProxyTypeRefElement")
public class IfcBuildingElementProxyTypeRef extends IFC2X3.jaxb.IfcBuildingElementTypeRef  {

	

	
	@Override
	public IfcBuildingElementProxyType createInstance() {
		return IFC2X3Factory.eINSTANCE.createIfcBuildingElementProxyType();
	}
	
	public static IfcBuildingElementProxyTypeRef valueOf(String id) {
		IfcBuildingElementProxyTypeRef result = new IfcBuildingElementProxyTypeRef();
		result.setID(id);
		return result;
	}

	@Override
	public String toString() {
		return getID();
	}
	

}