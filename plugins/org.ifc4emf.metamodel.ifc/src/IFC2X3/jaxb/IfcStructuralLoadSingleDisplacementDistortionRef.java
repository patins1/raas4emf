package IFC2X3.jaxb;

import javax.xml.bind.annotation.*;
import org.eclipse.emf.ecore.jaxb.*;

import IFC2X3.IFC2X3Factory;
import IFC2X3.IfcStructuralLoadSingleDisplacementDistortion;

@XmlRootElement(name = "IfcStructuralLoadSingleDisplacementDistortionRefElement")
public class IfcStructuralLoadSingleDisplacementDistortionRef extends IFC2X3.jaxb.IfcStructuralLoadSingleDisplacementRef  {

	

	
	@Override
	public IfcStructuralLoadSingleDisplacementDistortion createInstance() {
		return IFC2X3Factory.eINSTANCE.createIfcStructuralLoadSingleDisplacementDistortion();
	}
	
	public static IfcStructuralLoadSingleDisplacementDistortionRef valueOf(String id) {
		IfcStructuralLoadSingleDisplacementDistortionRef result = new IfcStructuralLoadSingleDisplacementDistortionRef();
		result.setID(id);
		return result;
	}

	@Override
	public String toString() {
		return getID();
	}
	

}