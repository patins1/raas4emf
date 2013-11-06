package IFC2X3.jaxb;

import javax.xml.bind.annotation.*;
import org.eclipse.emf.ecore.jaxb.*;

import IFC2X3.IFC2X3Factory;
import IFC2X3.IfcStructuralLoadSingleDisplacement;

@XmlRootElement(name = "IfcStructuralLoadSingleDisplacementRefElement")
public class IfcStructuralLoadSingleDisplacementRef extends IFC2X3.jaxb.IfcStructuralLoadStaticRef  {

	

	
	@Override
	public IfcStructuralLoadSingleDisplacement createInstance() {
		return IFC2X3Factory.eINSTANCE.createIfcStructuralLoadSingleDisplacement();
	}
	
	public static IfcStructuralLoadSingleDisplacementRef valueOf(String id) {
		IfcStructuralLoadSingleDisplacementRef result = new IfcStructuralLoadSingleDisplacementRef();
		result.setID(id);
		return result;
	}

	@Override
	public String toString() {
		return getID();
	}
	

}