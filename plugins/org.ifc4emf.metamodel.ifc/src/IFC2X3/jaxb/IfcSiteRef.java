package IFC2X3.jaxb;

import javax.xml.bind.annotation.*;
import org.eclipse.emf.ecore.jaxb.*;

import IFC2X3.IFC2X3Factory;
import IFC2X3.IfcSite;

@XmlRootElement(name = "IfcSiteRefElement")
public class IfcSiteRef extends IFC2X3.jaxb.IfcSpatialStructureElementRef  {

	

	
	@Override
	public IfcSite createInstance() {
		return IFC2X3Factory.eINSTANCE.createIfcSite();
	}
	
	public static IfcSiteRef valueOf(String id) {
		IfcSiteRef result = new IfcSiteRef();
		result.setID(id);
		return result;
	}

	@Override
	public String toString() {
		return getID();
	}
	

}