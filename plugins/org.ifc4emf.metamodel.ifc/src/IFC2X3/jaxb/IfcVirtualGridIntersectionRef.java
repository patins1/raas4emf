package IFC2X3.jaxb;

import javax.xml.bind.annotation.*;
import org.eclipse.emf.ecore.jaxb.*;

import IFC2X3.IFC2X3Factory;
import IFC2X3.IfcVirtualGridIntersection;

@XmlRootElement(name = "IfcVirtualGridIntersectionRefElement")
public class IfcVirtualGridIntersectionRef extends org.eclipse.emf.cdo.jaxb.CDOObjectRef  {

	

	
	@Override
	public IfcVirtualGridIntersection createInstance() {
		return IFC2X3Factory.eINSTANCE.createIfcVirtualGridIntersection();
	}
	
	public static IfcVirtualGridIntersectionRef valueOf(String id) {
		IfcVirtualGridIntersectionRef result = new IfcVirtualGridIntersectionRef();
		result.setID(id);
		return result;
	}

	@Override
	public String toString() {
		return getID();
	}
	

}