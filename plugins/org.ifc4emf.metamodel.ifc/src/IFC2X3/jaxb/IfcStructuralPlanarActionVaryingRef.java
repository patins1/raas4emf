package IFC2X3.jaxb;

import javax.xml.bind.annotation.*;
import org.eclipse.emf.ecore.jaxb.*;

import IFC2X3.IFC2X3Factory;
import IFC2X3.IfcStructuralPlanarActionVarying;

@XmlRootElement(name = "IfcStructuralPlanarActionVaryingRefElement")
public class IfcStructuralPlanarActionVaryingRef extends IFC2X3.jaxb.IfcStructuralPlanarActionRef  {

	

	
	@Override
	public IfcStructuralPlanarActionVarying createInstance() {
		return IFC2X3Factory.eINSTANCE.createIfcStructuralPlanarActionVarying();
	}
	
	public static IfcStructuralPlanarActionVaryingRef valueOf(String id) {
		IfcStructuralPlanarActionVaryingRef result = new IfcStructuralPlanarActionVaryingRef();
		result.setID(id);
		return result;
	}

	@Override
	public String toString() {
		return getID();
	}
	

}