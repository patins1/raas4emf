package IFC2X3.jaxb;

import javax.xml.bind.annotation.*;
import org.eclipse.emf.ecore.jaxb.*;

import IFC2X3.IFC2X3Factory;
import IFC2X3.IfcClassification;

@XmlRootElement(name = "IfcClassificationRefElement")
public class IfcClassificationRef extends org.eclipse.emf.cdo.jaxb.CDOObjectRef  {

	

	
	@Override
	public IfcClassification createInstance() {
		return IFC2X3Factory.eINSTANCE.createIfcClassification();
	}
	
	public static IfcClassificationRef valueOf(String id) {
		IfcClassificationRef result = new IfcClassificationRef();
		result.setID(id);
		return result;
	}

	@Override
	public String toString() {
		return getID();
	}
	

}