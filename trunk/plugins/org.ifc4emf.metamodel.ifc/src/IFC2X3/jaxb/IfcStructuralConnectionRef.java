package IFC2X3.jaxb;

import javax.xml.bind.annotation.*;
import org.eclipse.emf.ecore.jaxb.*;

import IFC2X3.IFC2X3Factory;
import IFC2X3.IfcStructuralConnection;

@XmlRootElement(name = "IfcStructuralConnectionRefElement")
public class IfcStructuralConnectionRef extends IFC2X3.jaxb.IfcStructuralItemRef  {

	

	
	@Override
	public IfcStructuralConnection createInstance() {
		return IFC2X3Factory.eINSTANCE.createIfcStructuralConnection();
	}
	
	public static IfcStructuralConnectionRef valueOf(String id) {
		IfcStructuralConnectionRef result = new IfcStructuralConnectionRef();
		result.setID(id);
		return result;
	}

	@Override
	public String toString() {
		return getID();
	}
	

}