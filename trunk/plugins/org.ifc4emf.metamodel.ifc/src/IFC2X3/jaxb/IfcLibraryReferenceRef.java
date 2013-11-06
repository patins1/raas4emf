package IFC2X3.jaxb;

import javax.xml.bind.annotation.*;
import org.eclipse.emf.ecore.jaxb.*;

import IFC2X3.IFC2X3Factory;
import IFC2X3.IfcLibraryReference;

@XmlRootElement(name = "IfcLibraryReferenceRefElement")
public class IfcLibraryReferenceRef extends IFC2X3.jaxb.IfcLibrarySelectRef  {

	

	
	@Override
	public IfcLibraryReference createInstance() {
		return IFC2X3Factory.eINSTANCE.createIfcLibraryReference();
	}
	
	public static IfcLibraryReferenceRef valueOf(String id) {
		IfcLibraryReferenceRef result = new IfcLibraryReferenceRef();
		result.setID(id);
		return result;
	}

	@Override
	public String toString() {
		return getID();
	}
	

}