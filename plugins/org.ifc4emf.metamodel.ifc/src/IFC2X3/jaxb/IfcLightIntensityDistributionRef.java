package IFC2X3.jaxb;

import javax.xml.bind.annotation.*;
import org.eclipse.emf.ecore.jaxb.*;

import IFC2X3.IFC2X3Factory;
import IFC2X3.IfcLightIntensityDistribution;

@XmlRootElement(name = "IfcLightIntensityDistributionRefElement")
public class IfcLightIntensityDistributionRef extends IFC2X3.jaxb.IfcLightDistributionDataSourceSelectRef  {

	

	
	@Override
	public IfcLightIntensityDistribution createInstance() {
		return IFC2X3Factory.eINSTANCE.createIfcLightIntensityDistribution();
	}
	
	public static IfcLightIntensityDistributionRef valueOf(String id) {
		IfcLightIntensityDistributionRef result = new IfcLightIntensityDistributionRef();
		result.setID(id);
		return result;
	}

	@Override
	public String toString() {
		return getID();
	}
	

}