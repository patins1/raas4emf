package IFC2X3.jaxb;

import javax.xml.bind.annotation.*;
import org.eclipse.emf.ecore.jaxb.*;

import IFC2X3.IFC2X3Factory;
import IFC2X3.IfcHatchLineDistanceSelect;

@XmlRootElement(name = "IfcHatchLineDistanceSelectRefElement")
public class IfcHatchLineDistanceSelectRef extends org.eclipse.emf.cdo.jaxb.CDOObjectRef  {

	

	
	@Override
	public IfcHatchLineDistanceSelect createInstance() {
		return IFC2X3Factory.eINSTANCE.createIfcHatchLineDistanceSelect();
	}
	
	public static IfcHatchLineDistanceSelectRef valueOf(String id) {
		IfcHatchLineDistanceSelectRef result = new IfcHatchLineDistanceSelectRef();
		result.setID(id);
		return result;
	}

	@Override
	public String toString() {
		return getID();
	}
	

}