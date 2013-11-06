package IFC2X3.jaxb;

import javax.xml.bind.annotation.*;
import org.eclipse.emf.ecore.jaxb.*;

import IFC2X3.IFC2X3Factory;
import IFC2X3.IfcStructuralPointConnection;

@XmlRootElement(name = "IfcStructuralPointConnectionRefElement")
public class IfcStructuralPointConnectionRef extends IFC2X3.jaxb.IfcStructuralConnectionRef  {

	

	
	@Override
	public IfcStructuralPointConnection createInstance() {
		return IFC2X3Factory.eINSTANCE.createIfcStructuralPointConnection();
	}
	
	public static IfcStructuralPointConnectionRef valueOf(String id) {
		IfcStructuralPointConnectionRef result = new IfcStructuralPointConnectionRef();
		result.setID(id);
		return result;
	}

	@Override
	public String toString() {
		return getID();
	}
	

}