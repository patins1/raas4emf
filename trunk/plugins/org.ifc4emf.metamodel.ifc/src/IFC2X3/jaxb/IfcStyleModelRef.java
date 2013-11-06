package IFC2X3.jaxb;

import javax.xml.bind.annotation.*;
import org.eclipse.emf.ecore.jaxb.*;

import IFC2X3.IFC2X3Factory;
import IFC2X3.IfcStyleModel;

@XmlRootElement(name = "IfcStyleModelRefElement")
public class IfcStyleModelRef extends IFC2X3.jaxb.IfcRepresentationRef  {

	

	
	@Override
	public IfcStyleModel createInstance() {
		return IFC2X3Factory.eINSTANCE.createIfcStyleModel();
	}
	
	public static IfcStyleModelRef valueOf(String id) {
		IfcStyleModelRef result = new IfcStyleModelRef();
		result.setID(id);
		return result;
	}

	@Override
	public String toString() {
		return getID();
	}
	

}