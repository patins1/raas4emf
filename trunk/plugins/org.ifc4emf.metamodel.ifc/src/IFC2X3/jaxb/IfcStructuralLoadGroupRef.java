package IFC2X3.jaxb;

import javax.xml.bind.annotation.*;
import org.eclipse.emf.ecore.jaxb.*;

import IFC2X3.IFC2X3Factory;
import IFC2X3.IfcStructuralLoadGroup;

@XmlRootElement(name = "IfcStructuralLoadGroupRefElement")
public class IfcStructuralLoadGroupRef extends IFC2X3.jaxb.IfcGroupRef  {

	

	
	@Override
	public IfcStructuralLoadGroup createInstance() {
		return IFC2X3Factory.eINSTANCE.createIfcStructuralLoadGroup();
	}
	
	public static IfcStructuralLoadGroupRef valueOf(String id) {
		IfcStructuralLoadGroupRef result = new IfcStructuralLoadGroupRef();
		result.setID(id);
		return result;
	}

	@Override
	public String toString() {
		return getID();
	}
	

}