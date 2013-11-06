package IFC2X3.jaxb;

import javax.xml.bind.annotation.*;
import org.eclipse.emf.ecore.jaxb.*;

import IFC2X3.IFC2X3Factory;
import IFC2X3.IfcStructuralPointReaction;

@XmlRootElement(name = "IfcStructuralPointReactionRefElement")
public class IfcStructuralPointReactionRef extends IFC2X3.jaxb.IfcStructuralReactionRef  {

	

	
	@Override
	public IfcStructuralPointReaction createInstance() {
		return IFC2X3Factory.eINSTANCE.createIfcStructuralPointReaction();
	}
	
	public static IfcStructuralPointReactionRef valueOf(String id) {
		IfcStructuralPointReactionRef result = new IfcStructuralPointReactionRef();
		result.setID(id);
		return result;
	}

	@Override
	public String toString() {
		return getID();
	}
	

}