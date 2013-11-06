package IFC2X3.jaxb;

import javax.xml.bind.annotation.*;
import org.eclipse.emf.ecore.jaxb.*;

import IFC2X3.IFC2X3Factory;
import IFC2X3.IfcOutletType;

@XmlRootElement(name = "IfcOutletTypeRefElement")
public class IfcOutletTypeRef extends IFC2X3.jaxb.IfcFlowTerminalTypeRef  {

	

	
	@Override
	public IfcOutletType createInstance() {
		return IFC2X3Factory.eINSTANCE.createIfcOutletType();
	}
	
	public static IfcOutletTypeRef valueOf(String id) {
		IfcOutletTypeRef result = new IfcOutletTypeRef();
		result.setID(id);
		return result;
	}

	@Override
	public String toString() {
		return getID();
	}
	

}