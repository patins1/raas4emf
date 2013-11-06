package IFC2X3.jaxb;

import javax.xml.bind.annotation.*;
import org.eclipse.emf.ecore.jaxb.*;

import IFC2X3.IFC2X3Factory;
import IFC2X3.IfcStructuralActivity;

@XmlRootElement(name = "IfcStructuralActivityRefElement")
public class IfcStructuralActivityRef extends IFC2X3.jaxb.IfcProductRef  {

	

	
	@Override
	public IfcStructuralActivity createInstance() {
		return IFC2X3Factory.eINSTANCE.createIfcStructuralActivity();
	}
	
	public static IfcStructuralActivityRef valueOf(String id) {
		IfcStructuralActivityRef result = new IfcStructuralActivityRef();
		result.setID(id);
		return result;
	}

	@Override
	public String toString() {
		return getID();
	}
	

}