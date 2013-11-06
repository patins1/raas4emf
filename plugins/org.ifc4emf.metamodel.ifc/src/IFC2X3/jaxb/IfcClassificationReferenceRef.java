package IFC2X3.jaxb;

import javax.xml.bind.annotation.*;
import org.eclipse.emf.ecore.jaxb.*;

import IFC2X3.IFC2X3Factory;
import IFC2X3.IfcClassificationReference;

@XmlRootElement(name = "IfcClassificationReferenceRefElement")
public class IfcClassificationReferenceRef extends IFC2X3.jaxb.IfcClassificationNotationSelectRef  {

	

	
	@Override
	public IfcClassificationReference createInstance() {
		return IFC2X3Factory.eINSTANCE.createIfcClassificationReference();
	}
	
	public static IfcClassificationReferenceRef valueOf(String id) {
		IfcClassificationReferenceRef result = new IfcClassificationReferenceRef();
		result.setID(id);
		return result;
	}

	@Override
	public String toString() {
		return getID();
	}
	

}