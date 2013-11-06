package IFC2X3.jaxb;

import javax.xml.bind.annotation.*;
import org.eclipse.emf.ecore.jaxb.*;

import IFC2X3.IFC2X3Factory;
import IFC2X3.IfcRelAssociatesDocument;

@XmlRootElement(name = "IfcRelAssociatesDocumentRefElement")
public class IfcRelAssociatesDocumentRef extends IFC2X3.jaxb.IfcRelAssociatesRef  {

	

	
	@Override
	public IfcRelAssociatesDocument createInstance() {
		return IFC2X3Factory.eINSTANCE.createIfcRelAssociatesDocument();
	}
	
	public static IfcRelAssociatesDocumentRef valueOf(String id) {
		IfcRelAssociatesDocumentRef result = new IfcRelAssociatesDocumentRef();
		result.setID(id);
		return result;
	}

	@Override
	public String toString() {
		return getID();
	}
	

}