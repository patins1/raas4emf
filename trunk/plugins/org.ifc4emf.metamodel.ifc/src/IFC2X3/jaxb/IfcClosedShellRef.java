package IFC2X3.jaxb;

import javax.xml.bind.annotation.*;
import org.eclipse.emf.ecore.jaxb.*;

import IFC2X3.IFC2X3Factory;
import IFC2X3.IfcClosedShell;

@XmlRootElement(name = "IfcClosedShellRefElement")
public class IfcClosedShellRef extends IFC2X3.jaxb.IfcShellRef  {

	

	
	@Override
	public IfcClosedShell createInstance() {
		return IFC2X3Factory.eINSTANCE.createIfcClosedShell();
	}
	
	public static IfcClosedShellRef valueOf(String id) {
		IfcClosedShellRef result = new IfcClosedShellRef();
		result.setID(id);
		return result;
	}

	@Override
	public String toString() {
		return getID();
	}
	

}