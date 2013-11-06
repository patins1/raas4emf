package IFC2X3.jaxb;

import javax.xml.bind.annotation.*;
import org.eclipse.emf.ecore.jaxb.*;

import IFC2X3.IFC2X3Factory;
import IFC2X3.IfcRelSequence;

@XmlRootElement(name = "IfcRelSequenceRefElement")
public class IfcRelSequenceRef extends IFC2X3.jaxb.IfcRelConnectsRef  {

	

	
	@Override
	public IfcRelSequence createInstance() {
		return IFC2X3Factory.eINSTANCE.createIfcRelSequence();
	}
	
	public static IfcRelSequenceRef valueOf(String id) {
		IfcRelSequenceRef result = new IfcRelSequenceRef();
		result.setID(id);
		return result;
	}

	@Override
	public String toString() {
		return getID();
	}
	

}