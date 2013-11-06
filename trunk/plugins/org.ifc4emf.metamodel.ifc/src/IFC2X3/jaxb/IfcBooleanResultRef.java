package IFC2X3.jaxb;

import javax.xml.bind.annotation.*;
import org.eclipse.emf.ecore.jaxb.*;

import IFC2X3.IFC2X3Factory;
import IFC2X3.IfcBooleanResult;

@XmlRootElement(name = "IfcBooleanResultRefElement")
public class IfcBooleanResultRef extends IFC2X3.jaxb.IfcBooleanOperandRef  {

	

	
	@Override
	public IfcBooleanResult createInstance() {
		return IFC2X3Factory.eINSTANCE.createIfcBooleanResult();
	}
	
	public static IfcBooleanResultRef valueOf(String id) {
		IfcBooleanResultRef result = new IfcBooleanResultRef();
		result.setID(id);
		return result;
	}

	@Override
	public String toString() {
		return getID();
	}
	

}