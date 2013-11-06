package IFC2X3.jaxb;

import javax.xml.bind.annotation.*;
import org.eclipse.emf.ecore.jaxb.*;

import IFC2X3.IFC2X3Factory;
import IFC2X3.IfcCovering;

@XmlRootElement(name = "IfcCoveringRefElement")
public class IfcCoveringRef extends IFC2X3.jaxb.IfcBuildingElementRef  {

	

	
	@Override
	public IfcCovering createInstance() {
		return IFC2X3Factory.eINSTANCE.createIfcCovering();
	}
	
	public static IfcCoveringRef valueOf(String id) {
		IfcCoveringRef result = new IfcCoveringRef();
		result.setID(id);
		return result;
	}

	@Override
	public String toString() {
		return getID();
	}
	

}