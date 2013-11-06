package IFC2X3.jaxb;

import javax.xml.bind.annotation.*;
import org.eclipse.emf.ecore.jaxb.*;

import IFC2X3.IFC2X3Factory;
import IFC2X3.IfcBuildingElement;

@XmlRootElement(name = "IfcBuildingElementRefElement")
public class IfcBuildingElementRef extends IFC2X3.jaxb.IfcElementRef  {

	

	
	@Override
	public IfcBuildingElement createInstance() {
		return IFC2X3Factory.eINSTANCE.createIfcBuildingElement();
	}
	
	public static IfcBuildingElementRef valueOf(String id) {
		IfcBuildingElementRef result = new IfcBuildingElementRef();
		result.setID(id);
		return result;
	}

	@Override
	public String toString() {
		return getID();
	}
	

}