package IFC2X3.jaxb;

import javax.xml.bind.annotation.*;
import org.eclipse.emf.ecore.jaxb.*;

import IFC2X3.IFC2X3Factory;
import IFC2X3.IfcTextLiteralWithExtent;

@XmlRootElement(name = "IfcTextLiteralWithExtentRefElement")
public class IfcTextLiteralWithExtentRef extends IFC2X3.jaxb.IfcTextLiteralRef  {

	

	
	@Override
	public IfcTextLiteralWithExtent createInstance() {
		return IFC2X3Factory.eINSTANCE.createIfcTextLiteralWithExtent();
	}
	
	public static IfcTextLiteralWithExtentRef valueOf(String id) {
		IfcTextLiteralWithExtentRef result = new IfcTextLiteralWithExtentRef();
		result.setID(id);
		return result;
	}

	@Override
	public String toString() {
		return getID();
	}
	

}