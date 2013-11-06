package IFC2X3.jaxb;

import javax.xml.bind.annotation.*;
import org.eclipse.emf.ecore.jaxb.*;

import IFC2X3.IFC2X3Factory;
import IFC2X3.IfcStructuralResultGroup;

@XmlRootElement(name = "IfcStructuralResultGroupRefElement")
public class IfcStructuralResultGroupRef extends IFC2X3.jaxb.IfcGroupRef  {

	

	
	@Override
	public IfcStructuralResultGroup createInstance() {
		return IFC2X3Factory.eINSTANCE.createIfcStructuralResultGroup();
	}
	
	public static IfcStructuralResultGroupRef valueOf(String id) {
		IfcStructuralResultGroupRef result = new IfcStructuralResultGroupRef();
		result.setID(id);
		return result;
	}

	@Override
	public String toString() {
		return getID();
	}
	

}