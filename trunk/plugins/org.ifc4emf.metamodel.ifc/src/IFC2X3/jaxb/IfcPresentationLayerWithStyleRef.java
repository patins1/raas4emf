package IFC2X3.jaxb;

import javax.xml.bind.annotation.*;
import org.eclipse.emf.ecore.jaxb.*;

import IFC2X3.IFC2X3Factory;
import IFC2X3.IfcPresentationLayerWithStyle;

@XmlRootElement(name = "IfcPresentationLayerWithStyleRefElement")
public class IfcPresentationLayerWithStyleRef extends IFC2X3.jaxb.IfcPresentationLayerAssignmentRef  {

	

	
	@Override
	public IfcPresentationLayerWithStyle createInstance() {
		return IFC2X3Factory.eINSTANCE.createIfcPresentationLayerWithStyle();
	}
	
	public static IfcPresentationLayerWithStyleRef valueOf(String id) {
		IfcPresentationLayerWithStyleRef result = new IfcPresentationLayerWithStyleRef();
		result.setID(id);
		return result;
	}

	@Override
	public String toString() {
		return getID();
	}
	

}