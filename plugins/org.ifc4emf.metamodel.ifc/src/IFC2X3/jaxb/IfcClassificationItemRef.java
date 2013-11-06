package IFC2X3.jaxb;

import javax.xml.bind.annotation.*;
import org.eclipse.emf.ecore.jaxb.*;

import IFC2X3.IFC2X3Factory;
import IFC2X3.IfcClassificationItem;

@XmlRootElement(name = "IfcClassificationItemRefElement")
public class IfcClassificationItemRef extends org.eclipse.emf.cdo.jaxb.CDOObjectRef  {

	

	
	@Override
	public IfcClassificationItem createInstance() {
		return IFC2X3Factory.eINSTANCE.createIfcClassificationItem();
	}
	
	public static IfcClassificationItemRef valueOf(String id) {
		IfcClassificationItemRef result = new IfcClassificationItemRef();
		result.setID(id);
		return result;
	}

	@Override
	public String toString() {
		return getID();
	}
	

}