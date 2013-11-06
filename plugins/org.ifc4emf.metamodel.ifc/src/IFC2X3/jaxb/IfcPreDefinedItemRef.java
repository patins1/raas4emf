package IFC2X3.jaxb;

import javax.xml.bind.annotation.*;
import org.eclipse.emf.ecore.jaxb.*;

import IFC2X3.IFC2X3Factory;
import IFC2X3.IfcPreDefinedItem;

@XmlRootElement(name = "IfcPreDefinedItemRefElement")
public class IfcPreDefinedItemRef extends org.eclipse.emf.cdo.jaxb.CDOObjectRef  {

	

	
	@Override
	public IfcPreDefinedItem createInstance() {
		return IFC2X3Factory.eINSTANCE.createIfcPreDefinedItem();
	}
	
	public static IfcPreDefinedItemRef valueOf(String id) {
		IfcPreDefinedItemRef result = new IfcPreDefinedItemRef();
		result.setID(id);
		return result;
	}

	@Override
	public String toString() {
		return getID();
	}
	

}