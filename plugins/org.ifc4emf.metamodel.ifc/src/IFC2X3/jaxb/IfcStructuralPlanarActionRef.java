package IFC2X3.jaxb;

import javax.xml.bind.annotation.*;
import org.eclipse.emf.ecore.jaxb.*;

import IFC2X3.IFC2X3Factory;
import IFC2X3.IfcStructuralPlanarAction;

@XmlRootElement(name = "IfcStructuralPlanarActionRefElement")
public class IfcStructuralPlanarActionRef extends IFC2X3.jaxb.IfcStructuralActionRef  {

	

	
	@Override
	public IfcStructuralPlanarAction createInstance() {
		return IFC2X3Factory.eINSTANCE.createIfcStructuralPlanarAction();
	}
	
	public static IfcStructuralPlanarActionRef valueOf(String id) {
		IfcStructuralPlanarActionRef result = new IfcStructuralPlanarActionRef();
		result.setID(id);
		return result;
	}

	@Override
	public String toString() {
		return getID();
	}
	

}