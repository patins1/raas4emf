package IFC2X3.jaxb;

import javax.xml.bind.annotation.*;
import org.eclipse.emf.ecore.jaxb.*;

import IFC2X3.IFC2X3Factory;
import IFC2X3.IfcStructuralLinearAction;

@XmlRootElement(name = "IfcStructuralLinearActionRefElement")
public class IfcStructuralLinearActionRef extends IFC2X3.jaxb.IfcStructuralActionRef  {

	

	
	@Override
	public IfcStructuralLinearAction createInstance() {
		return IFC2X3Factory.eINSTANCE.createIfcStructuralLinearAction();
	}
	
	public static IfcStructuralLinearActionRef valueOf(String id) {
		IfcStructuralLinearActionRef result = new IfcStructuralLinearActionRef();
		result.setID(id);
		return result;
	}

	@Override
	public String toString() {
		return getID();
	}
	

}