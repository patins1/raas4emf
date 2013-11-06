package IFC2X3.jaxb;

import javax.xml.bind.annotation.*;
import org.eclipse.emf.ecore.jaxb.*;

import IFC2X3.IFC2X3Factory;
import IFC2X3.IfcLoop;

@XmlRootElement(name = "IfcLoopRefElement")
public class IfcLoopRef extends IFC2X3.jaxb.IfcTopologicalRepresentationItemRef  {

	

	
	@Override
	public IfcLoop createInstance() {
		return IFC2X3Factory.eINSTANCE.createIfcLoop();
	}
	
	public static IfcLoopRef valueOf(String id) {
		IfcLoopRef result = new IfcLoopRef();
		result.setID(id);
		return result;
	}

	@Override
	public String toString() {
		return getID();
	}
	

}