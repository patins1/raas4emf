package IFC2X3.jaxb;

import javax.xml.bind.annotation.*;
import org.eclipse.emf.ecore.jaxb.*;

import IFC2X3.IFC2X3Factory;
import IFC2X3.IfcReinforcementDefinitionProperties;

@XmlRootElement(name = "IfcReinforcementDefinitionPropertiesRefElement")
public class IfcReinforcementDefinitionPropertiesRef extends IFC2X3.jaxb.IfcPropertySetDefinitionRef  {

	

	
	@Override
	public IfcReinforcementDefinitionProperties createInstance() {
		return IFC2X3Factory.eINSTANCE.createIfcReinforcementDefinitionProperties();
	}
	
	public static IfcReinforcementDefinitionPropertiesRef valueOf(String id) {
		IfcReinforcementDefinitionPropertiesRef result = new IfcReinforcementDefinitionPropertiesRef();
		result.setID(id);
		return result;
	}

	@Override
	public String toString() {
		return getID();
	}
	

}