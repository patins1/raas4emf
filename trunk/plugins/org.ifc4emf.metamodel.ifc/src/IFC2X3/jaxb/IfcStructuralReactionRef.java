package IFC2X3.jaxb;

import javax.xml.bind.annotation.*;
import org.eclipse.emf.ecore.jaxb.*;

import IFC2X3.IFC2X3Factory;
import IFC2X3.IfcStructuralReaction;

@XmlRootElement(name = "IfcStructuralReactionRefElement")
public class IfcStructuralReactionRef extends IFC2X3.jaxb.IfcStructuralActivityRef  {

	

	
	@Override
	public IfcStructuralReaction createInstance() {
		return IFC2X3Factory.eINSTANCE.createIfcStructuralReaction();
	}
	
	public static IfcStructuralReactionRef valueOf(String id) {
		IfcStructuralReactionRef result = new IfcStructuralReactionRef();
		result.setID(id);
		return result;
	}

	@Override
	public String toString() {
		return getID();
	}
	

}