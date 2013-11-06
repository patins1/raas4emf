package IFC2X3.jaxb;

import javax.xml.bind.annotation.*;
import org.eclipse.emf.ecore.jaxb.*;

import IFC2X3.IFC2X3Factory;
import IFC2X3.IfcSweptAreaSolid;

@XmlRootElement(name = "IfcSweptAreaSolidRefElement")
public class IfcSweptAreaSolidRef extends IFC2X3.jaxb.IfcSolidModelRef  {

	

	
	@Override
	public IfcSweptAreaSolid createInstance() {
		return IFC2X3Factory.eINSTANCE.createIfcSweptAreaSolid();
	}
	
	public static IfcSweptAreaSolidRef valueOf(String id) {
		IfcSweptAreaSolidRef result = new IfcSweptAreaSolidRef();
		result.setID(id);
		return result;
	}

	@Override
	public String toString() {
		return getID();
	}
	

}