package IFC2X3.jaxb;

import javax.xml.bind.annotation.*;
import org.eclipse.emf.ecore.jaxb.*;

import IFC2X3.IFC2X3Factory;
import IFC2X3.IfcDuctFittingType;

@XmlRootElement(name = "IfcDuctFittingTypeRefElement")
public class IfcDuctFittingTypeRef extends IFC2X3.jaxb.IfcFlowFittingTypeRef  {

	

	
	@Override
	public IfcDuctFittingType createInstance() {
		return IFC2X3Factory.eINSTANCE.createIfcDuctFittingType();
	}
	
	public static IfcDuctFittingTypeRef valueOf(String id) {
		IfcDuctFittingTypeRef result = new IfcDuctFittingTypeRef();
		result.setID(id);
		return result;
	}

	@Override
	public String toString() {
		return getID();
	}
	

}