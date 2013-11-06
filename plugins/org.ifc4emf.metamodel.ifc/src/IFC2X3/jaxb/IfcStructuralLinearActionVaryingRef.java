package IFC2X3.jaxb;

import javax.xml.bind.annotation.*;
import org.eclipse.emf.ecore.jaxb.*;

import IFC2X3.IFC2X3Factory;
import IFC2X3.IfcStructuralLinearActionVarying;

@XmlRootElement(name = "IfcStructuralLinearActionVaryingRefElement")
public class IfcStructuralLinearActionVaryingRef extends IFC2X3.jaxb.IfcStructuralLinearActionRef  {

	

	
	@Override
	public IfcStructuralLinearActionVarying createInstance() {
		return IFC2X3Factory.eINSTANCE.createIfcStructuralLinearActionVarying();
	}
	
	public static IfcStructuralLinearActionVaryingRef valueOf(String id) {
		IfcStructuralLinearActionVaryingRef result = new IfcStructuralLinearActionVaryingRef();
		result.setID(id);
		return result;
	}

	@Override
	public String toString() {
		return getID();
	}
	

}