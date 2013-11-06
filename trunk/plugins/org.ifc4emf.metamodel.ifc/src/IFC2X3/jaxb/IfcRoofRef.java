package IFC2X3.jaxb;

import javax.xml.bind.annotation.*;
import org.eclipse.emf.ecore.jaxb.*;

import IFC2X3.IFC2X3Factory;
import IFC2X3.IfcRoof;

@XmlRootElement(name = "IfcRoofRefElement")
public class IfcRoofRef extends IFC2X3.jaxb.IfcBuildingElementRef  {

	

	
	@Override
	public IfcRoof createInstance() {
		return IFC2X3Factory.eINSTANCE.createIfcRoof();
	}
	
	public static IfcRoofRef valueOf(String id) {
		IfcRoofRef result = new IfcRoofRef();
		result.setID(id);
		return result;
	}

	@Override
	public String toString() {
		return getID();
	}
	

}