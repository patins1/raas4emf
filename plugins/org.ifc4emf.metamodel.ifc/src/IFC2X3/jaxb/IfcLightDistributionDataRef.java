package IFC2X3.jaxb;

import javax.xml.bind.annotation.*;
import org.eclipse.emf.ecore.jaxb.*;

import IFC2X3.IFC2X3Factory;
import IFC2X3.IfcLightDistributionData;

@XmlRootElement(name = "IfcLightDistributionDataRefElement")
public class IfcLightDistributionDataRef extends org.eclipse.emf.cdo.jaxb.CDOObjectRef  {

	

	
	@Override
	public IfcLightDistributionData createInstance() {
		return IFC2X3Factory.eINSTANCE.createIfcLightDistributionData();
	}
	
	public static IfcLightDistributionDataRef valueOf(String id) {
		IfcLightDistributionDataRef result = new IfcLightDistributionDataRef();
		result.setID(id);
		return result;
	}

	@Override
	public String toString() {
		return getID();
	}
	

}