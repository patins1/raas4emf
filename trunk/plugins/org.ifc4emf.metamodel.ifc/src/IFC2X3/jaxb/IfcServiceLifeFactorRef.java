package IFC2X3.jaxb;

import javax.xml.bind.annotation.*;
import org.eclipse.emf.ecore.jaxb.*;

import IFC2X3.IFC2X3Factory;
import IFC2X3.IfcServiceLifeFactor;

@XmlRootElement(name = "IfcServiceLifeFactorRefElement")
public class IfcServiceLifeFactorRef extends IFC2X3.jaxb.IfcPropertySetDefinitionRef  {

	

	
	@Override
	public IfcServiceLifeFactor createInstance() {
		return IFC2X3Factory.eINSTANCE.createIfcServiceLifeFactor();
	}
	
	public static IfcServiceLifeFactorRef valueOf(String id) {
		IfcServiceLifeFactorRef result = new IfcServiceLifeFactorRef();
		result.setID(id);
		return result;
	}

	@Override
	public String toString() {
		return getID();
	}
	

}