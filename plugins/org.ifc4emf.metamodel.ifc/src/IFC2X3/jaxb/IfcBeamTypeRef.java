package IFC2X3.jaxb;

import javax.xml.bind.annotation.*;
import org.eclipse.emf.ecore.jaxb.*;

import IFC2X3.IFC2X3Factory;
import IFC2X3.IfcBeamType;

@XmlRootElement(name = "IfcBeamTypeRefElement")
public class IfcBeamTypeRef extends IFC2X3.jaxb.IfcBuildingElementTypeRef  {

	

	
	@Override
	public IfcBeamType createInstance() {
		return IFC2X3Factory.eINSTANCE.createIfcBeamType();
	}
	
	public static IfcBeamTypeRef valueOf(String id) {
		IfcBeamTypeRef result = new IfcBeamTypeRef();
		result.setID(id);
		return result;
	}

	@Override
	public String toString() {
		return getID();
	}
	

}