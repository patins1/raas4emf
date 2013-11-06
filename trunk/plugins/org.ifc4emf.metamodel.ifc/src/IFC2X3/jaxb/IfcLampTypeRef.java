package IFC2X3.jaxb;

import javax.xml.bind.annotation.*;
import org.eclipse.emf.ecore.jaxb.*;

import IFC2X3.IFC2X3Factory;
import IFC2X3.IfcLampType;

@XmlRootElement(name = "IfcLampTypeRefElement")
public class IfcLampTypeRef extends IFC2X3.jaxb.IfcFlowTerminalTypeRef  {

	

	
	@Override
	public IfcLampType createInstance() {
		return IFC2X3Factory.eINSTANCE.createIfcLampType();
	}
	
	public static IfcLampTypeRef valueOf(String id) {
		IfcLampTypeRef result = new IfcLampTypeRef();
		result.setID(id);
		return result;
	}

	@Override
	public String toString() {
		return getID();
	}
	

}