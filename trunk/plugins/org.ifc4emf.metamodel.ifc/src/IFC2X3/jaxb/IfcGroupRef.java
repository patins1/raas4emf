package IFC2X3.jaxb;

import javax.xml.bind.annotation.*;
import org.eclipse.emf.ecore.jaxb.*;

import IFC2X3.IFC2X3Factory;
import IFC2X3.IfcGroup;

@XmlRootElement(name = "IfcGroupRefElement")
public class IfcGroupRef extends IFC2X3.jaxb.IfcObjectRef  {

	

	
	@Override
	public IfcGroup createInstance() {
		return IFC2X3Factory.eINSTANCE.createIfcGroup();
	}
	
	public static IfcGroupRef valueOf(String id) {
		IfcGroupRef result = new IfcGroupRef();
		result.setID(id);
		return result;
	}

	@Override
	public String toString() {
		return getID();
	}
	

}