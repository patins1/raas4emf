package IFC2X3.jaxb;

import javax.xml.bind.annotation.*;
import org.eclipse.emf.ecore.jaxb.*;

import IFC2X3.IFC2X3Factory;
import IFC2X3.IfcShapeAspect;

@XmlRootElement(name = "IfcShapeAspectRefElement")
public class IfcShapeAspectRef extends org.eclipse.emf.cdo.jaxb.CDOObjectRef  {

	

	
	@Override
	public IfcShapeAspect createInstance() {
		return IFC2X3Factory.eINSTANCE.createIfcShapeAspect();
	}
	
	public static IfcShapeAspectRef valueOf(String id) {
		IfcShapeAspectRef result = new IfcShapeAspectRef();
		result.setID(id);
		return result;
	}

	@Override
	public String toString() {
		return getID();
	}
	

}