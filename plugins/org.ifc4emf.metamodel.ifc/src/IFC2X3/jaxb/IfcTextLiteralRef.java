package IFC2X3.jaxb;

import javax.xml.bind.annotation.*;
import org.eclipse.emf.ecore.jaxb.*;

import IFC2X3.IFC2X3Factory;
import IFC2X3.IfcTextLiteral;

@XmlRootElement(name = "IfcTextLiteralRefElement")
public class IfcTextLiteralRef extends IFC2X3.jaxb.IfcGeometricRepresentationItemRef  {

	

	
	@Override
	public IfcTextLiteral createInstance() {
		return IFC2X3Factory.eINSTANCE.createIfcTextLiteral();
	}
	
	public static IfcTextLiteralRef valueOf(String id) {
		IfcTextLiteralRef result = new IfcTextLiteralRef();
		result.setID(id);
		return result;
	}

	@Override
	public String toString() {
		return getID();
	}
	

}