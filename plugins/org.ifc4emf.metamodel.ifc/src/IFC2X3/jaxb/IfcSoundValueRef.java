package IFC2X3.jaxb;

import javax.xml.bind.annotation.*;
import org.eclipse.emf.ecore.jaxb.*;

import IFC2X3.IFC2X3Factory;
import IFC2X3.IfcSoundValue;

@XmlRootElement(name = "IfcSoundValueRefElement")
public class IfcSoundValueRef extends IFC2X3.jaxb.IfcPropertySetDefinitionRef  {

	

	
	@Override
	public IfcSoundValue createInstance() {
		return IFC2X3Factory.eINSTANCE.createIfcSoundValue();
	}
	
	public static IfcSoundValueRef valueOf(String id) {
		IfcSoundValueRef result = new IfcSoundValueRef();
		result.setID(id);
		return result;
	}

	@Override
	public String toString() {
		return getID();
	}
	

}