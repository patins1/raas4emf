package IFC2X3.jaxb;

import javax.xml.bind.annotation.*;
import org.eclipse.emf.ecore.jaxb.*;

import IFC2X3.IFC2X3Factory;
import IFC2X3.IfcLibraryInformation;

@XmlRootElement(name = "IfcLibraryInformationRefElement")
public class IfcLibraryInformationRef extends IFC2X3.jaxb.IfcLibrarySelectRef  {

	

	
	@Override
	public IfcLibraryInformation createInstance() {
		return IFC2X3Factory.eINSTANCE.createIfcLibraryInformation();
	}
	
	public static IfcLibraryInformationRef valueOf(String id) {
		IfcLibraryInformationRef result = new IfcLibraryInformationRef();
		result.setID(id);
		return result;
	}

	@Override
	public String toString() {
		return getID();
	}
	

}