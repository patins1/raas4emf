package IFC2X3.jaxb;

import javax.xml.bind.annotation.*;
import org.eclipse.emf.ecore.jaxb.*;

import IFC2X3.IFC2X3Factory;
import IFC2X3.IfcSizeSelect;

@XmlRootElement(name = "IfcSizeSelectRefElement")
public class IfcSizeSelectRef extends org.eclipse.emf.cdo.jaxb.CDOObjectRef  {

	

	
	@Override
	public IfcSizeSelect createInstance() {
		return IFC2X3Factory.eINSTANCE.createIfcSizeSelect();
	}
	
	public static IfcSizeSelectRef valueOf(String id) {
		IfcSizeSelectRef result = new IfcSizeSelectRef();
		result.setID(id);
		return result;
	}

	@Override
	public String toString() {
		return getID();
	}
	

}