package IFC2X3.jaxb;

import javax.xml.bind.annotation.*;
import org.eclipse.emf.ecore.jaxb.*;

import IFC2X3.IFC2X3Factory;
import IFC2X3.IfcBeam;

@XmlRootElement(name = "IfcBeamRefElement")
public class IfcBeamRef extends IFC2X3.jaxb.IfcBuildingElementRef  {

	

	
	@Override
	public IfcBeam createInstance() {
		return IFC2X3Factory.eINSTANCE.createIfcBeam();
	}
	
	public static IfcBeamRef valueOf(String id) {
		IfcBeamRef result = new IfcBeamRef();
		result.setID(id);
		return result;
	}

	@Override
	public String toString() {
		return getID();
	}
	

}