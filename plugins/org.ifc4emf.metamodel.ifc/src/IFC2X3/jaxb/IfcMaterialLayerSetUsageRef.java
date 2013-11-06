package IFC2X3.jaxb;

import javax.xml.bind.annotation.*;
import org.eclipse.emf.ecore.jaxb.*;

import IFC2X3.IFC2X3Factory;
import IFC2X3.IfcMaterialLayerSetUsage;

@XmlRootElement(name = "IfcMaterialLayerSetUsageRefElement")
public class IfcMaterialLayerSetUsageRef extends IFC2X3.jaxb.IfcMaterialSelectRef  {

	

	
	@Override
	public IfcMaterialLayerSetUsage createInstance() {
		return IFC2X3Factory.eINSTANCE.createIfcMaterialLayerSetUsage();
	}
	
	public static IfcMaterialLayerSetUsageRef valueOf(String id) {
		IfcMaterialLayerSetUsageRef result = new IfcMaterialLayerSetUsageRef();
		result.setID(id);
		return result;
	}

	@Override
	public String toString() {
		return getID();
	}
	

}