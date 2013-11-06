package IFC2X3.jaxb;

import javax.xml.bind.annotation.*;
import org.eclipse.emf.ecore.jaxb.*;

import IFC2X3.IFC2X3Factory;
import IFC2X3.IfcDocumentInformationRelationship;

@XmlRootElement(name = "IfcDocumentInformationRelationshipRefElement")
public class IfcDocumentInformationRelationshipRef extends org.eclipse.emf.cdo.jaxb.CDOObjectRef  {

	

	
	@Override
	public IfcDocumentInformationRelationship createInstance() {
		return IFC2X3Factory.eINSTANCE.createIfcDocumentInformationRelationship();
	}
	
	public static IfcDocumentInformationRelationshipRef valueOf(String id) {
		IfcDocumentInformationRelationshipRef result = new IfcDocumentInformationRelationshipRef();
		result.setID(id);
		return result;
	}

	@Override
	public String toString() {
		return getID();
	}
	

}