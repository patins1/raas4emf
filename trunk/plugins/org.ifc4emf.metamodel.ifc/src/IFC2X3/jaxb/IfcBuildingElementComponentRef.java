package IFC2X3.jaxb;

import javax.xml.bind.annotation.*;
import org.eclipse.emf.ecore.jaxb.*;

import IFC2X3.IFC2X3Factory;
import IFC2X3.IfcBuildingElementComponent;

@XmlRootElement(name = "IfcBuildingElementComponentRefElement")
public class IfcBuildingElementComponentRef extends IFC2X3.jaxb.IfcBuildingElementRef  {

	

	
	@Override
	public IfcBuildingElementComponent createInstance() {
		return IFC2X3Factory.eINSTANCE.createIfcBuildingElementComponent();
	}
	
	public static IfcBuildingElementComponentRef valueOf(String id) {
		IfcBuildingElementComponentRef result = new IfcBuildingElementComponentRef();
		result.setID(id);
		return result;
	}

	@Override
	public String toString() {
		return getID();
	}
	

}