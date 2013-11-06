package IFC2X3.jaxb;

import javax.xml.bind.annotation.*;
import org.eclipse.emf.ecore.jaxb.*;

import IFC2X3.IFC2X3Factory;
import IFC2X3.IfcPhysicalQuantity;

@XmlRootElement(name = "IfcPhysicalQuantityRefElement")
public class IfcPhysicalQuantityRef extends org.eclipse.emf.cdo.jaxb.CDOObjectRef  {

	

	
	@Override
	public IfcPhysicalQuantity createInstance() {
		return IFC2X3Factory.eINSTANCE.createIfcPhysicalQuantity();
	}
	
	public static IfcPhysicalQuantityRef valueOf(String id) {
		IfcPhysicalQuantityRef result = new IfcPhysicalQuantityRef();
		result.setID(id);
		return result;
	}

	@Override
	public String toString() {
		return getID();
	}
	

}