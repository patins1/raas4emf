package IFC2X3.jaxb;

import javax.xml.bind.annotation.*;
import org.eclipse.emf.ecore.jaxb.*;

import IFC2X3.IFC2X3Factory;
import IFC2X3.IfcDocumentInformation;

@XmlRootElement(name = "IfcDocumentInformationRefElement")
public class IfcDocumentInformationRef extends IFC2X3.jaxb.IfcDocumentSelectRef  {

	

	
	@Override
	public IfcDocumentInformation createInstance() {
		return IFC2X3Factory.eINSTANCE.createIfcDocumentInformation();
	}
	
	public static IfcDocumentInformationRef valueOf(String id) {
		IfcDocumentInformationRef result = new IfcDocumentInformationRef();
		result.setID(id);
		return result;
	}

	@Override
	public String toString() {
		return getID();
	}
	

}