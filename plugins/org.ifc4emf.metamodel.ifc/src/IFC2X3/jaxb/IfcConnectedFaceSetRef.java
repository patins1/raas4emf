package IFC2X3.jaxb;

import javax.xml.bind.annotation.*;
import org.eclipse.emf.ecore.jaxb.*;

import IFC2X3.IFC2X3Factory;
import IFC2X3.IfcConnectedFaceSet;

@XmlRootElement(name = "IfcConnectedFaceSetRefElement")
public class IfcConnectedFaceSetRef extends IFC2X3.jaxb.IfcTopologicalRepresentationItemRef  {

	

	
	@Override
	public IfcConnectedFaceSet createInstance() {
		return IFC2X3Factory.eINSTANCE.createIfcConnectedFaceSet();
	}
	
	public static IfcConnectedFaceSetRef valueOf(String id) {
		IfcConnectedFaceSetRef result = new IfcConnectedFaceSetRef();
		result.setID(id);
		return result;
	}

	@Override
	public String toString() {
		return getID();
	}
	

}