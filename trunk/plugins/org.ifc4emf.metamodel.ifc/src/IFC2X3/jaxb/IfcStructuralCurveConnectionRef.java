package IFC2X3.jaxb;

import javax.xml.bind.annotation.*;
import org.eclipse.emf.ecore.jaxb.*;

import IFC2X3.IFC2X3Factory;
import IFC2X3.IfcStructuralCurveConnection;

@XmlRootElement(name = "IfcStructuralCurveConnectionRefElement")
public class IfcStructuralCurveConnectionRef extends IFC2X3.jaxb.IfcStructuralConnectionRef  {

	

	
	@Override
	public IfcStructuralCurveConnection createInstance() {
		return IFC2X3Factory.eINSTANCE.createIfcStructuralCurveConnection();
	}
	
	public static IfcStructuralCurveConnectionRef valueOf(String id) {
		IfcStructuralCurveConnectionRef result = new IfcStructuralCurveConnectionRef();
		result.setID(id);
		return result;
	}

	@Override
	public String toString() {
		return getID();
	}
	

}