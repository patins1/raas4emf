package IFC2X3.jaxb;

import javax.xml.bind.annotation.*;
import org.eclipse.emf.ecore.jaxb.*;

import IFC2X3.IFC2X3Factory;
import IFC2X3.IfcDerivedUnitElement;

@XmlRootElement(name = "IfcDerivedUnitElementRefElement")
public class IfcDerivedUnitElementRef extends org.eclipse.emf.cdo.jaxb.CDOObjectRef  {

	

	
	@Override
	public IfcDerivedUnitElement createInstance() {
		return IFC2X3Factory.eINSTANCE.createIfcDerivedUnitElement();
	}
	
	public static IfcDerivedUnitElementRef valueOf(String id) {
		IfcDerivedUnitElementRef result = new IfcDerivedUnitElementRef();
		result.setID(id);
		return result;
	}

	@Override
	public String toString() {
		return getID();
	}
	

}