package IFC2X3.jaxb;

import javax.xml.bind.annotation.*;
import org.eclipse.emf.ecore.jaxb.*;

import IFC2X3.IFC2X3Factory;
import IFC2X3.IfcTubeBundleType;

@XmlRootElement(name = "IfcTubeBundleTypeRefElement")
public class IfcTubeBundleTypeRef extends IFC2X3.jaxb.IfcEnergyConversionDeviceTypeRef  {

	

	
	@Override
	public IfcTubeBundleType createInstance() {
		return IFC2X3Factory.eINSTANCE.createIfcTubeBundleType();
	}
	
	public static IfcTubeBundleTypeRef valueOf(String id) {
		IfcTubeBundleTypeRef result = new IfcTubeBundleTypeRef();
		result.setID(id);
		return result;
	}

	@Override
	public String toString() {
		return getID();
	}
	

}