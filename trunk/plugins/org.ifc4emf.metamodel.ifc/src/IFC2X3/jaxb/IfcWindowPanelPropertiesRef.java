package IFC2X3.jaxb;

import javax.xml.bind.annotation.*;
import org.eclipse.emf.ecore.jaxb.*;

import IFC2X3.IFC2X3Factory;
import IFC2X3.IfcWindowPanelProperties;

@XmlRootElement(name = "IfcWindowPanelPropertiesRefElement")
public class IfcWindowPanelPropertiesRef extends IFC2X3.jaxb.IfcPropertySetDefinitionRef  {

	

	
	@Override
	public IfcWindowPanelProperties createInstance() {
		return IFC2X3Factory.eINSTANCE.createIfcWindowPanelProperties();
	}
	
	public static IfcWindowPanelPropertiesRef valueOf(String id) {
		IfcWindowPanelPropertiesRef result = new IfcWindowPanelPropertiesRef();
		result.setID(id);
		return result;
	}

	@Override
	public String toString() {
		return getID();
	}
	

}