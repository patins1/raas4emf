package IFC2X3.jaxb;

import javax.xml.bind.annotation.*;
import org.eclipse.emf.ecore.jaxb.*;

import IFC2X3.IFC2X3Factory;
import IFC2X3.IfcRelAssociatesClassification;

@XmlRootElement(name = "IfcRelAssociatesClassificationRefElement")
public class IfcRelAssociatesClassificationRef extends IFC2X3.jaxb.IfcRelAssociatesRef  {

	

	
	@Override
	public IfcRelAssociatesClassification createInstance() {
		return IFC2X3Factory.eINSTANCE.createIfcRelAssociatesClassification();
	}
	
	public static IfcRelAssociatesClassificationRef valueOf(String id) {
		IfcRelAssociatesClassificationRef result = new IfcRelAssociatesClassificationRef();
		result.setID(id);
		return result;
	}

	@Override
	public String toString() {
		return getID();
	}
	

}