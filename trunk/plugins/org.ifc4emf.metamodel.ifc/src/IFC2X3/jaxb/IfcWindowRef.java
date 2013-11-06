package IFC2X3.jaxb;

import javax.xml.bind.annotation.*;
import org.eclipse.emf.ecore.jaxb.*;

import IFC2X3.IFC2X3Factory;
import IFC2X3.IfcWindow;

@XmlRootElement(name = "IfcWindowRefElement")
public class IfcWindowRef extends IFC2X3.jaxb.IfcBuildingElementRef  {

	

	
	@Override
	public IfcWindow createInstance() {
		return IFC2X3Factory.eINSTANCE.createIfcWindow();
	}
	
	public static IfcWindowRef valueOf(String id) {
		IfcWindowRef result = new IfcWindowRef();
		result.setID(id);
		return result;
	}

	@Override
	public String toString() {
		return getID();
	}
	

}