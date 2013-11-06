package IFC2X3.jaxb;

import javax.xml.bind.annotation.*;
import org.eclipse.emf.ecore.jaxb.*;

import IFC2X3.IFC2X3Factory;
import IFC2X3.IfcElectricalBaseProperties;

@XmlRootElement(name = "IfcElectricalBasePropertiesRefElement")
public class IfcElectricalBasePropertiesRef extends IFC2X3.jaxb.IfcEnergyPropertiesRef  {

	

	
	@Override
	public IfcElectricalBaseProperties createInstance() {
		return IFC2X3Factory.eINSTANCE.createIfcElectricalBaseProperties();
	}
	
	public static IfcElectricalBasePropertiesRef valueOf(String id) {
		IfcElectricalBasePropertiesRef result = new IfcElectricalBasePropertiesRef();
		result.setID(id);
		return result;
	}

	@Override
	public String toString() {
		return getID();
	}
	

}