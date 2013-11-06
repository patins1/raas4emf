package IFC2X3.jaxb;

import javax.xml.bind.annotation.*;
import org.eclipse.emf.ecore.jaxb.*;

import IFC2X3.IFC2X3Factory;
import IFC2X3.IfcStructuralAction;

@XmlRootElement(name = "IfcStructuralActionRefElement")
public class IfcStructuralActionRef extends IFC2X3.jaxb.IfcStructuralActivityRef  {

	

	
	@Override
	public IfcStructuralAction createInstance() {
		return IFC2X3Factory.eINSTANCE.createIfcStructuralAction();
	}
	
	public static IfcStructuralActionRef valueOf(String id) {
		IfcStructuralActionRef result = new IfcStructuralActionRef();
		result.setID(id);
		return result;
	}

	@Override
	public String toString() {
		return getID();
	}
	

}