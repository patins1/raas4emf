package IFC2X3.jaxb;

import javax.xml.bind.annotation.*;
import org.eclipse.emf.ecore.jaxb.*;

import IFC2X3.IFC2X3Factory;
import IFC2X3.IfcConnectionGeometry;

@XmlRootElement(name = "IfcConnectionGeometryRefElement")
public class IfcConnectionGeometryRef extends org.eclipse.emf.cdo.jaxb.CDOObjectRef  {

	

	
	@Override
	public IfcConnectionGeometry createInstance() {
		return IFC2X3Factory.eINSTANCE.createIfcConnectionGeometry();
	}
	
	public static IfcConnectionGeometryRef valueOf(String id) {
		IfcConnectionGeometryRef result = new IfcConnectionGeometryRef();
		result.setID(id);
		return result;
	}

	@Override
	public String toString() {
		return getID();
	}
	

}