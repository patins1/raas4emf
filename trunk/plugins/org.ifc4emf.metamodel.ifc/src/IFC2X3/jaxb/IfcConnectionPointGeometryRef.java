package IFC2X3.jaxb;

import javax.xml.bind.annotation.*;
import org.eclipse.emf.ecore.jaxb.*;

import IFC2X3.IFC2X3Factory;
import IFC2X3.IfcConnectionPointGeometry;

@XmlRootElement(name = "IfcConnectionPointGeometryRefElement")
public class IfcConnectionPointGeometryRef extends IFC2X3.jaxb.IfcConnectionGeometryRef  {

	

	
	@Override
	public IfcConnectionPointGeometry createInstance() {
		return IFC2X3Factory.eINSTANCE.createIfcConnectionPointGeometry();
	}
	
	public static IfcConnectionPointGeometryRef valueOf(String id) {
		IfcConnectionPointGeometryRef result = new IfcConnectionPointGeometryRef();
		result.setID(id);
		return result;
	}

	@Override
	public String toString() {
		return getID();
	}
	

}