package IFC2X3.jaxb;

import javax.xml.bind.annotation.*;
import org.eclipse.emf.ecore.jaxb.*;

import IFC2X3.IFC2X3Factory;
import IFC2X3.IfcReferencesValueDocument;

@XmlRootElement(name = "IfcReferencesValueDocumentRefElement")
public class IfcReferencesValueDocumentRef extends org.eclipse.emf.cdo.jaxb.CDOObjectRef  {

	

	
	@Override
	public IfcReferencesValueDocument createInstance() {
		return IFC2X3Factory.eINSTANCE.createIfcReferencesValueDocument();
	}
	
	public static IfcReferencesValueDocumentRef valueOf(String id) {
		IfcReferencesValueDocumentRef result = new IfcReferencesValueDocumentRef();
		result.setID(id);
		return result;
	}

	@Override
	public String toString() {
		return getID();
	}
	

}