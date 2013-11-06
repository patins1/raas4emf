package IFC2X3.jaxb;

import javax.xml.bind.annotation.*;
import org.eclipse.emf.ecore.jaxb.*;

import IFC2X3.IFC2X3Factory;
import IFC2X3.IfcExtrudedAreaSolid;

@XmlRootElement(name = "IfcExtrudedAreaSolidRefElement")
public class IfcExtrudedAreaSolidRef extends IFC2X3.jaxb.IfcSweptAreaSolidRef  {

	

	
	@Override
	public IfcExtrudedAreaSolid createInstance() {
		return IFC2X3Factory.eINSTANCE.createIfcExtrudedAreaSolid();
	}
	
	public static IfcExtrudedAreaSolidRef valueOf(String id) {
		IfcExtrudedAreaSolidRef result = new IfcExtrudedAreaSolidRef();
		result.setID(id);
		return result;
	}

	@Override
	public String toString() {
		return getID();
	}
	

}