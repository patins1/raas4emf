package IFC2X3.jaxb;

import javax.xml.bind.annotation.*;
import org.eclipse.emf.ecore.jaxb.*;

import IFC2X3.IFC2X3Factory;
import IFC2X3.IfcElementAssembly;

@XmlRootElement(name = "IfcElementAssemblyRefElement")
public class IfcElementAssemblyRef extends IFC2X3.jaxb.IfcElementRef  {

	

	
	@Override
	public IfcElementAssembly createInstance() {
		return IFC2X3Factory.eINSTANCE.createIfcElementAssembly();
	}
	
	public static IfcElementAssemblyRef valueOf(String id) {
		IfcElementAssemblyRef result = new IfcElementAssemblyRef();
		result.setID(id);
		return result;
	}

	@Override
	public String toString() {
		return getID();
	}
	

}