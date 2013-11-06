package IFC2X3.jaxb;

import javax.xml.bind.annotation.*;
import org.eclipse.emf.ecore.jaxb.*;

import IFC2X3.IFC2X3Factory;
import IFC2X3.IfcSystem;

@XmlRootElement(name = "IfcSystemRefElement")
public class IfcSystemRef extends IFC2X3.jaxb.IfcGroupRef  {

	

	
	@Override
	public IfcSystem createInstance() {
		return IFC2X3Factory.eINSTANCE.createIfcSystem();
	}
	
	public static IfcSystemRef valueOf(String id) {
		IfcSystemRef result = new IfcSystemRef();
		result.setID(id);
		return result;
	}

	@Override
	public String toString() {
		return getID();
	}
	

}