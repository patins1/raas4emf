package IFC2X3.jaxb;

import javax.xml.bind.annotation.*;
import org.eclipse.emf.ecore.jaxb.*;

import IFC2X3.IFC2X3Factory;
import IFC2X3.IfcSpaceHeaterType;

@XmlRootElement(name = "IfcSpaceHeaterTypeRefElement")
public class IfcSpaceHeaterTypeRef extends IFC2X3.jaxb.IfcEnergyConversionDeviceTypeRef  {

	

	
	@Override
	public IfcSpaceHeaterType createInstance() {
		return IFC2X3Factory.eINSTANCE.createIfcSpaceHeaterType();
	}
	
	public static IfcSpaceHeaterTypeRef valueOf(String id) {
		IfcSpaceHeaterTypeRef result = new IfcSpaceHeaterTypeRef();
		result.setID(id);
		return result;
	}

	@Override
	public String toString() {
		return getID();
	}
	

}