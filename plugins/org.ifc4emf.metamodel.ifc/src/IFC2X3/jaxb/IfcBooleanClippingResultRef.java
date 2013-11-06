package IFC2X3.jaxb;

import javax.xml.bind.annotation.*;
import org.eclipse.emf.ecore.jaxb.*;

import IFC2X3.IFC2X3Factory;
import IFC2X3.IfcBooleanClippingResult;

@XmlRootElement(name = "IfcBooleanClippingResultRefElement")
public class IfcBooleanClippingResultRef extends IFC2X3.jaxb.IfcBooleanResultRef  {

	

	
	@Override
	public IfcBooleanClippingResult createInstance() {
		return IFC2X3Factory.eINSTANCE.createIfcBooleanClippingResult();
	}
	
	public static IfcBooleanClippingResultRef valueOf(String id) {
		IfcBooleanClippingResultRef result = new IfcBooleanClippingResultRef();
		result.setID(id);
		return result;
	}

	@Override
	public String toString() {
		return getID();
	}
	

}