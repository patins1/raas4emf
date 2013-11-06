package IFC2X3.jaxb;

import javax.xml.bind.annotation.*;
import org.eclipse.emf.ecore.jaxb.*;

import IFC2X3.IFC2X3Factory;
import IFC2X3.IfcPlanarBox;

@XmlRootElement(name = "IfcPlanarBoxRefElement")
public class IfcPlanarBoxRef extends IFC2X3.jaxb.IfcPlanarExtentRef  {

	

	
	@Override
	public IfcPlanarBox createInstance() {
		return IFC2X3Factory.eINSTANCE.createIfcPlanarBox();
	}
	
	public static IfcPlanarBoxRef valueOf(String id) {
		IfcPlanarBoxRef result = new IfcPlanarBoxRef();
		result.setID(id);
		return result;
	}

	@Override
	public String toString() {
		return getID();
	}
	

}