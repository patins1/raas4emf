package IFC2X3.jaxb;

import javax.xml.bind.annotation.*;
import org.eclipse.emf.ecore.jaxb.*;

import IFC2X3.IFC2X3Factory;
import IFC2X3.IfcWorkControl;

@XmlRootElement(name = "IfcWorkControlRefElement")
public class IfcWorkControlRef extends IFC2X3.jaxb.IfcControlRef  {

	

	
	@Override
	public IfcWorkControl createInstance() {
		return IFC2X3Factory.eINSTANCE.createIfcWorkControl();
	}
	
	public static IfcWorkControlRef valueOf(String id) {
		IfcWorkControlRef result = new IfcWorkControlRef();
		result.setID(id);
		return result;
	}

	@Override
	public String toString() {
		return getID();
	}
	

}