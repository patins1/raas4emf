package IFC2X3.jaxb;

import javax.xml.bind.annotation.*;
import org.eclipse.emf.ecore.jaxb.*;

import IFC2X3.IFC2X3Factory;
import IFC2X3.IfcReinforcingElement;

@XmlRootElement(name = "IfcReinforcingElementRefElement")
public class IfcReinforcingElementRef extends IFC2X3.jaxb.IfcBuildingElementComponentRef  {

	

	
	@Override
	public IfcReinforcingElement createInstance() {
		return IFC2X3Factory.eINSTANCE.createIfcReinforcingElement();
	}
	
	public static IfcReinforcingElementRef valueOf(String id) {
		IfcReinforcingElementRef result = new IfcReinforcingElementRef();
		result.setID(id);
		return result;
	}

	@Override
	public String toString() {
		return getID();
	}
	

}