package IFC2X3.jaxb;

import javax.xml.bind.annotation.*;
import org.eclipse.emf.ecore.jaxb.*;

import IFC2X3.IFC2X3Factory;
import IFC2X3.IfcRevolvedAreaSolid;

@XmlRootElement(name = "IfcRevolvedAreaSolidRefElement")
public class IfcRevolvedAreaSolidRef extends IFC2X3.jaxb.IfcSweptAreaSolidRef  {

	

	
	@Override
	public IfcRevolvedAreaSolid createInstance() {
		return IFC2X3Factory.eINSTANCE.createIfcRevolvedAreaSolid();
	}
	
	public static IfcRevolvedAreaSolidRef valueOf(String id) {
		IfcRevolvedAreaSolidRef result = new IfcRevolvedAreaSolidRef();
		result.setID(id);
		return result;
	}

	@Override
	public String toString() {
		return getID();
	}
	

}