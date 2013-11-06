package IFC2X3.jaxb;

import javax.xml.bind.annotation.*;
import org.eclipse.emf.ecore.jaxb.*;

import IFC2X3.IFC2X3Factory;
import IFC2X3.IfcTask;

@XmlRootElement(name = "IfcTaskRefElement")
public class IfcTaskRef extends IFC2X3.jaxb.IfcProcessRef  {

	

	
	@Override
	public IfcTask createInstance() {
		return IFC2X3Factory.eINSTANCE.createIfcTask();
	}
	
	public static IfcTaskRef valueOf(String id) {
		IfcTaskRef result = new IfcTaskRef();
		result.setID(id);
		return result;
	}

	@Override
	public String toString() {
		return getID();
	}
	

}