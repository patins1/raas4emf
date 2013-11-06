package IFC2X3.jaxb;

import javax.xml.bind.annotation.*;
import org.eclipse.emf.ecore.jaxb.*;

import IFC2X3.IFC2X3Factory;
import IFC2X3.IfcCsgSolid;

@XmlRootElement(name = "IfcCsgSolidRefElement")
public class IfcCsgSolidRef extends IFC2X3.jaxb.IfcSolidModelRef  {

	

	
	@Override
	public IfcCsgSolid createInstance() {
		return IFC2X3Factory.eINSTANCE.createIfcCsgSolid();
	}
	
	public static IfcCsgSolidRef valueOf(String id) {
		IfcCsgSolidRef result = new IfcCsgSolidRef();
		result.setID(id);
		return result;
	}

	@Override
	public String toString() {
		return getID();
	}
	

}