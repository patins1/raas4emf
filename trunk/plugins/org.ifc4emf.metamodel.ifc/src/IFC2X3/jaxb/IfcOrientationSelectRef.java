package IFC2X3.jaxb;

import javax.xml.bind.annotation.*;
import org.eclipse.emf.ecore.jaxb.*;

import IFC2X3.IFC2X3Factory;
import IFC2X3.IfcOrientationSelect;

@XmlRootElement(name = "IfcOrientationSelectRefElement")
public class IfcOrientationSelectRef extends org.eclipse.emf.cdo.jaxb.CDOObjectRef  {

	

	
	@Override
	public IfcOrientationSelect createInstance() {
		return IFC2X3Factory.eINSTANCE.createIfcOrientationSelect();
	}
	
	public static IfcOrientationSelectRef valueOf(String id) {
		IfcOrientationSelectRef result = new IfcOrientationSelectRef();
		result.setID(id);
		return result;
	}

	@Override
	public String toString() {
		return getID();
	}
	

}