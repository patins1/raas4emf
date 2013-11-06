package IFC2X3.jaxb;

import javax.xml.bind.annotation.*;
import org.eclipse.emf.ecore.jaxb.*;

import IFC2X3.IFC2X3Factory;
import IFC2X3.IfcSweptDiskSolid;

@XmlRootElement(name = "IfcSweptDiskSolidRefElement")
public class IfcSweptDiskSolidRef extends IFC2X3.jaxb.IfcSolidModelRef  {

	

	
	@Override
	public IfcSweptDiskSolid createInstance() {
		return IFC2X3Factory.eINSTANCE.createIfcSweptDiskSolid();
	}
	
	public static IfcSweptDiskSolidRef valueOf(String id) {
		IfcSweptDiskSolidRef result = new IfcSweptDiskSolidRef();
		result.setID(id);
		return result;
	}

	@Override
	public String toString() {
		return getID();
	}
	

}