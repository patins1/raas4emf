package IFC2X3.jaxb;

import javax.xml.bind.annotation.*;
import org.eclipse.emf.ecore.jaxb.*;

import IFC2X3.IFC2X3Factory;
import IFC2X3.IfcRelNests;

@XmlRootElement(name = "IfcRelNestsRefElement")
public class IfcRelNestsRef extends IFC2X3.jaxb.IfcRelDecomposesRef  {

	

	
	@Override
	public IfcRelNests createInstance() {
		return IFC2X3Factory.eINSTANCE.createIfcRelNests();
	}
	
	public static IfcRelNestsRef valueOf(String id) {
		IfcRelNestsRef result = new IfcRelNestsRef();
		result.setID(id);
		return result;
	}

	@Override
	public String toString() {
		return getID();
	}
	

}