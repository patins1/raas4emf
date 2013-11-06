package IFC2X3.jaxb;

import javax.xml.bind.annotation.*;
import org.eclipse.emf.ecore.jaxb.*;

import IFC2X3.IFC2X3Factory;
import IFC2X3.IfcDocumentReference;

@XmlRootElement(name = "IfcDocumentReferenceRefElement")
public class IfcDocumentReferenceRef extends IFC2X3.jaxb.IfcDocumentSelectRef  {

	

	
	@Override
	public IfcDocumentReference createInstance() {
		return IFC2X3Factory.eINSTANCE.createIfcDocumentReference();
	}
	
	public static IfcDocumentReferenceRef valueOf(String id) {
		IfcDocumentReferenceRef result = new IfcDocumentReferenceRef();
		result.setID(id);
		return result;
	}

	@Override
	public String toString() {
		return getID();
	}
	

}