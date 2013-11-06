package IFC2X3.jaxb;

import javax.xml.bind.annotation.*;
import org.eclipse.emf.ecore.jaxb.*;

import IFC2X3.IFC2X3Factory;
import IFC2X3.IfcFace;

@XmlRootElement(name = "IfcFaceRefElement")
public class IfcFaceRef extends IFC2X3.jaxb.IfcTopologicalRepresentationItemRef  {

	

	
	@Override
	public IfcFace createInstance() {
		return IFC2X3Factory.eINSTANCE.createIfcFace();
	}
	
	public static IfcFaceRef valueOf(String id) {
		IfcFaceRef result = new IfcFaceRef();
		result.setID(id);
		return result;
	}

	@Override
	public String toString() {
		return getID();
	}
	

}