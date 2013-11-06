package IFC2X3.jaxb;

import javax.xml.bind.annotation.*;
import org.eclipse.emf.ecore.jaxb.*;

import IFC2X3.IFC2X3Factory;
import IFC2X3.IfcWallStandardCase;

@XmlRootElement(name = "IfcWallStandardCaseRefElement")
public class IfcWallStandardCaseRef extends IFC2X3.jaxb.IfcWallRef  {

	

	
	@Override
	public IfcWallStandardCase createInstance() {
		return IFC2X3Factory.eINSTANCE.createIfcWallStandardCase();
	}
	
	public static IfcWallStandardCaseRef valueOf(String id) {
		IfcWallStandardCaseRef result = new IfcWallStandardCaseRef();
		result.setID(id);
		return result;
	}

	@Override
	public String toString() {
		return getID();
	}
	

}