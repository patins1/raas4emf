package IFC2X3.jaxb;

import javax.xml.bind.annotation.*;
import org.eclipse.emf.ecore.jaxb.*;

import IFC2X3.IFC2X3Factory;
import IFC2X3.IfcBuildingElementPart;

@XmlRootElement(name = "IfcBuildingElementPartRefElement")
public class IfcBuildingElementPartRef extends IFC2X3.jaxb.IfcBuildingElementComponentRef  {

	

	
	@Override
	public IfcBuildingElementPart createInstance() {
		return IFC2X3Factory.eINSTANCE.createIfcBuildingElementPart();
	}
	
	public static IfcBuildingElementPartRef valueOf(String id) {
		IfcBuildingElementPartRef result = new IfcBuildingElementPartRef();
		result.setID(id);
		return result;
	}

	@Override
	public String toString() {
		return getID();
	}
	

}