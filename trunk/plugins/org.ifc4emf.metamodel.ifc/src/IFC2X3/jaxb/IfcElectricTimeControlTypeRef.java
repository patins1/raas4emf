package IFC2X3.jaxb;

import javax.xml.bind.annotation.*;
import org.eclipse.emf.ecore.jaxb.*;

import IFC2X3.IFC2X3Factory;
import IFC2X3.IfcElectricTimeControlType;

@XmlRootElement(name = "IfcElectricTimeControlTypeRefElement")
public class IfcElectricTimeControlTypeRef extends IFC2X3.jaxb.IfcFlowControllerTypeRef  {

	

	
	@Override
	public IfcElectricTimeControlType createInstance() {
		return IFC2X3Factory.eINSTANCE.createIfcElectricTimeControlType();
	}
	
	public static IfcElectricTimeControlTypeRef valueOf(String id) {
		IfcElectricTimeControlTypeRef result = new IfcElectricTimeControlTypeRef();
		result.setID(id);
		return result;
	}

	@Override
	public String toString() {
		return getID();
	}
	

}