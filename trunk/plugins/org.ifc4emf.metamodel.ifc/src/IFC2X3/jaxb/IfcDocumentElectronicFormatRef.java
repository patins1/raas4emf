package IFC2X3.jaxb;

import javax.xml.bind.annotation.*;
import org.eclipse.emf.ecore.jaxb.*;

import IFC2X3.IFC2X3Factory;
import IFC2X3.IfcDocumentElectronicFormat;

@XmlRootElement(name = "IfcDocumentElectronicFormatRefElement")
public class IfcDocumentElectronicFormatRef extends org.eclipse.emf.cdo.jaxb.CDOObjectRef  {

	

	
	@Override
	public IfcDocumentElectronicFormat createInstance() {
		return IFC2X3Factory.eINSTANCE.createIfcDocumentElectronicFormat();
	}
	
	public static IfcDocumentElectronicFormatRef valueOf(String id) {
		IfcDocumentElectronicFormatRef result = new IfcDocumentElectronicFormatRef();
		result.setID(id);
		return result;
	}

	@Override
	public String toString() {
		return getID();
	}
	

}