package IFC2X3.jaxb;

import javax.xml.bind.annotation.*;
import org.eclipse.emf.ecore.jaxb.*;

import IFC2X3.IFC2X3Factory;
import IFC2X3.IfcPipeFittingType;

@XmlRootElement(name = "IfcPipeFittingTypeRefElement")
public class IfcPipeFittingTypeRef extends IFC2X3.jaxb.IfcFlowFittingTypeRef  {

	

	
	@Override
	public IfcPipeFittingType createInstance() {
		return IFC2X3Factory.eINSTANCE.createIfcPipeFittingType();
	}
	
	public static IfcPipeFittingTypeRef valueOf(String id) {
		IfcPipeFittingTypeRef result = new IfcPipeFittingTypeRef();
		result.setID(id);
		return result;
	}

	@Override
	public String toString() {
		return getID();
	}
	

}