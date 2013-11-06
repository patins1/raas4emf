package IFC2X3.jaxb;

import javax.xml.bind.annotation.*;
import org.eclipse.emf.ecore.jaxb.*;

import IFC2X3.IFC2X3Factory;
import IFC2X3.IfcServiceLife;

@XmlRootElement(name = "IfcServiceLifeRefElement")
public class IfcServiceLifeRef extends IFC2X3.jaxb.IfcControlRef  {

	

	
	@Override
	public IfcServiceLife createInstance() {
		return IFC2X3Factory.eINSTANCE.createIfcServiceLife();
	}
	
	public static IfcServiceLifeRef valueOf(String id) {
		IfcServiceLifeRef result = new IfcServiceLifeRef();
		result.setID(id);
		return result;
	}

	@Override
	public String toString() {
		return getID();
	}
	

}