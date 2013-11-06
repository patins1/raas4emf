package IFC2X3.jaxb;

import javax.xml.bind.annotation.*;
import org.eclipse.emf.ecore.jaxb.*;

import IFC2X3.IFC2X3Factory;
import IFC2X3.IfcCurveStyle;

@XmlRootElement(name = "IfcCurveStyleRefElement")
public class IfcCurveStyleRef extends IFC2X3.jaxb.IfcPresentationStyleRef  {

	

	
	@Override
	public IfcCurveStyle createInstance() {
		return IFC2X3Factory.eINSTANCE.createIfcCurveStyle();
	}
	
	public static IfcCurveStyleRef valueOf(String id) {
		IfcCurveStyleRef result = new IfcCurveStyleRef();
		result.setID(id);
		return result;
	}

	@Override
	public String toString() {
		return getID();
	}
	

}