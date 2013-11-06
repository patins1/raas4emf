package IFC2X3.jaxb;

import javax.xml.bind.annotation.*;
import org.eclipse.emf.ecore.jaxb.*;

import IFC2X3.IFC2X3Factory;
import IFC2X3.IfcTransformerType;

@XmlRootElement(name = "IfcTransformerTypeRefElement")
public class IfcTransformerTypeRef extends IFC2X3.jaxb.IfcEnergyConversionDeviceTypeRef  {

	

	
	@Override
	public IfcTransformerType createInstance() {
		return IFC2X3Factory.eINSTANCE.createIfcTransformerType();
	}
	
	public static IfcTransformerTypeRef valueOf(String id) {
		IfcTransformerTypeRef result = new IfcTransformerTypeRef();
		result.setID(id);
		return result;
	}

	@Override
	public String toString() {
		return getID();
	}
	

}