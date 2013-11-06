package IFC2X3.jaxb;

import javax.xml.bind.annotation.*;
import org.eclipse.emf.ecore.jaxb.*;

import IFC2X3.IFC2X3Factory;
import IFC2X3.IfcRelAssociatesLibrary;

@XmlRootElement(name = "IfcRelAssociatesLibraryRefElement")
public class IfcRelAssociatesLibraryRef extends IFC2X3.jaxb.IfcRelAssociatesRef  {

	

	
	@Override
	public IfcRelAssociatesLibrary createInstance() {
		return IFC2X3Factory.eINSTANCE.createIfcRelAssociatesLibrary();
	}
	
	public static IfcRelAssociatesLibraryRef valueOf(String id) {
		IfcRelAssociatesLibraryRef result = new IfcRelAssociatesLibraryRef();
		result.setID(id);
		return result;
	}

	@Override
	public String toString() {
		return getID();
	}
	

}