package IFC2X3.jaxb;

import javax.xml.bind.annotation.*;
import org.eclipse.emf.ecore.jaxb.*;

import IFC2X3.IFC2X3Factory;
import IFC2X3.IfcConnectionPortGeometry;

@XmlRootElement(name = "IfcConnectionPortGeometryRefElement")
public class IfcConnectionPortGeometryRef extends IFC2X3.jaxb.IfcConnectionGeometryRef  {

	

	
	@Override
	public IfcConnectionPortGeometry createInstance() {
		return IFC2X3Factory.eINSTANCE.createIfcConnectionPortGeometry();
	}
	
	public static IfcConnectionPortGeometryRef valueOf(String id) {
		IfcConnectionPortGeometryRef result = new IfcConnectionPortGeometryRef();
		result.setID(id);
		return result;
	}

	@Override
	public String toString() {
		return getID();
	}
	

}