package IFC2X3.jaxb;

import javax.xml.bind.annotation.*;
import org.eclipse.emf.ecore.jaxb.*;

import IFC2X3.IFC2X3Factory;
import IFC2X3.IfcProcess;

@XmlRootElement(name = "IfcProcessRefElement")
public class IfcProcessRef extends IFC2X3.jaxb.IfcObjectRef  {

	

	
	@Override
	public IfcProcess createInstance() {
		return IFC2X3Factory.eINSTANCE.createIfcProcess();
	}
	
	public static IfcProcessRef valueOf(String id) {
		IfcProcessRef result = new IfcProcessRef();
		result.setID(id);
		return result;
	}

	@Override
	public String toString() {
		return getID();
	}
	

}