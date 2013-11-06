package IFC2X3.jaxb;

import javax.xml.bind.annotation.*;
import org.eclipse.emf.ecore.jaxb.*;

import IFC2X3.IFC2X3Factory;
import IFC2X3.IfcOpenShell;

@XmlRootElement(name = "IfcOpenShellRefElement")
public class IfcOpenShellRef extends IFC2X3.jaxb.IfcShellRef  {

	

	
	@Override
	public IfcOpenShell createInstance() {
		return IFC2X3Factory.eINSTANCE.createIfcOpenShell();
	}
	
	public static IfcOpenShellRef valueOf(String id) {
		IfcOpenShellRef result = new IfcOpenShellRef();
		result.setID(id);
		return result;
	}

	@Override
	public String toString() {
		return getID();
	}
	

}