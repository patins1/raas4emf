package IFC2X3.jaxb;

import javax.xml.bind.annotation.*;
import org.eclipse.emf.ecore.jaxb.*;

import IFC2X3.IFC2X3Factory;
import IFC2X3.IfcMove;

@XmlRootElement(name = "IfcMoveRefElement")
public class IfcMoveRef extends IFC2X3.jaxb.IfcTaskRef  {

	

	
	@Override
	public IfcMove createInstance() {
		return IFC2X3Factory.eINSTANCE.createIfcMove();
	}
	
	public static IfcMoveRef valueOf(String id) {
		IfcMoveRef result = new IfcMoveRef();
		result.setID(id);
		return result;
	}

	@Override
	public String toString() {
		return getID();
	}
	

}