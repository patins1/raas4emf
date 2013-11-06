package IFC2X3.jaxb;

import javax.xml.bind.annotation.*;
import org.eclipse.emf.ecore.jaxb.*;

import IFC2X3.IFC2X3Factory;
import IFC2X3.IfcJunctionBoxType;

@XmlRootElement(name = "IfcJunctionBoxTypeRefElement")
public class IfcJunctionBoxTypeRef extends IFC2X3.jaxb.IfcFlowFittingTypeRef  {

	

	
	@Override
	public IfcJunctionBoxType createInstance() {
		return IFC2X3Factory.eINSTANCE.createIfcJunctionBoxType();
	}
	
	public static IfcJunctionBoxTypeRef valueOf(String id) {
		IfcJunctionBoxTypeRef result = new IfcJunctionBoxTypeRef();
		result.setID(id);
		return result;
	}

	@Override
	public String toString() {
		return getID();
	}
	

}