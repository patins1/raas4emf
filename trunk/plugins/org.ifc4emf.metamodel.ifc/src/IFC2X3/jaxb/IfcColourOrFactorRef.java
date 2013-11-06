package IFC2X3.jaxb;

import javax.xml.bind.annotation.*;
import org.eclipse.emf.ecore.jaxb.*;

import IFC2X3.IFC2X3Factory;
import IFC2X3.IfcColourOrFactor;

@XmlRootElement(name = "IfcColourOrFactorRefElement")
public class IfcColourOrFactorRef extends org.eclipse.emf.cdo.jaxb.CDOObjectRef  {

	

	
	@Override
	public IfcColourOrFactor createInstance() {
		return IFC2X3Factory.eINSTANCE.createIfcColourOrFactor();
	}
	
	public static IfcColourOrFactorRef valueOf(String id) {
		IfcColourOrFactorRef result = new IfcColourOrFactorRef();
		result.setID(id);
		return result;
	}

	@Override
	public String toString() {
		return getID();
	}
	

}