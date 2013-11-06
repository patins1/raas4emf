package IFC2X3.jaxb;

import javax.xml.bind.annotation.*;
import org.eclipse.emf.ecore.jaxb.*;

import IFC2X3.IFC2X3Factory;
import IFC2X3.IfcTextStyleWithBoxCharacteristics;

@XmlRootElement(name = "IfcTextStyleWithBoxCharacteristicsRefElement")
public class IfcTextStyleWithBoxCharacteristicsRef extends IFC2X3.jaxb.IfcTextStyleSelectRef  {

	

	
	@Override
	public IfcTextStyleWithBoxCharacteristics createInstance() {
		return IFC2X3Factory.eINSTANCE.createIfcTextStyleWithBoxCharacteristics();
	}
	
	public static IfcTextStyleWithBoxCharacteristicsRef valueOf(String id) {
		IfcTextStyleWithBoxCharacteristicsRef result = new IfcTextStyleWithBoxCharacteristicsRef();
		result.setID(id);
		return result;
	}

	@Override
	public String toString() {
		return getID();
	}
	

}