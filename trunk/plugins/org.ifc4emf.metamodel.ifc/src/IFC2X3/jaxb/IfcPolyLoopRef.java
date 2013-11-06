package IFC2X3.jaxb;

import javax.xml.bind.annotation.*;
import org.eclipse.emf.ecore.jaxb.*;

import IFC2X3.IFC2X3Factory;
import IFC2X3.IfcPolyLoop;

@XmlRootElement(name = "IfcPolyLoopRefElement")
public class IfcPolyLoopRef extends IFC2X3.jaxb.IfcLoopRef  {

	

	
	@Override
	public IfcPolyLoop createInstance() {
		return IFC2X3Factory.eINSTANCE.createIfcPolyLoop();
	}
	
	public static IfcPolyLoopRef valueOf(String id) {
		IfcPolyLoopRef result = new IfcPolyLoopRef();
		result.setID(id);
		return result;
	}

	@Override
	public String toString() {
		return getID();
	}
	

}