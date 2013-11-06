package IFC2X3.jaxb;

import javax.xml.bind.annotation.*;
import org.eclipse.emf.ecore.jaxb.*;

import IFC2X3.IFC2X3Factory;
import IFC2X3.IfcReinforcementBarProperties;

@XmlRootElement(name = "IfcReinforcementBarPropertiesRefElement")
public class IfcReinforcementBarPropertiesRef extends org.eclipse.emf.cdo.jaxb.CDOObjectRef  {

	

	
	@Override
	public IfcReinforcementBarProperties createInstance() {
		return IFC2X3Factory.eINSTANCE.createIfcReinforcementBarProperties();
	}
	
	public static IfcReinforcementBarPropertiesRef valueOf(String id) {
		IfcReinforcementBarPropertiesRef result = new IfcReinforcementBarPropertiesRef();
		result.setID(id);
		return result;
	}

	@Override
	public String toString() {
		return getID();
	}
	

}