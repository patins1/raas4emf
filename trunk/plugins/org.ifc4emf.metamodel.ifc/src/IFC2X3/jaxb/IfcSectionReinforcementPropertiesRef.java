package IFC2X3.jaxb;

import javax.xml.bind.annotation.*;
import org.eclipse.emf.ecore.jaxb.*;

import IFC2X3.IFC2X3Factory;
import IFC2X3.IfcSectionReinforcementProperties;

@XmlRootElement(name = "IfcSectionReinforcementPropertiesRefElement")
public class IfcSectionReinforcementPropertiesRef extends org.eclipse.emf.cdo.jaxb.CDOObjectRef  {

	

	
	@Override
	public IfcSectionReinforcementProperties createInstance() {
		return IFC2X3Factory.eINSTANCE.createIfcSectionReinforcementProperties();
	}
	
	public static IfcSectionReinforcementPropertiesRef valueOf(String id) {
		IfcSectionReinforcementPropertiesRef result = new IfcSectionReinforcementPropertiesRef();
		result.setID(id);
		return result;
	}

	@Override
	public String toString() {
		return getID();
	}
	

}