package IFC2X3.jaxb;

import javax.xml.bind.annotation.*;
import org.eclipse.emf.ecore.jaxb.*;

import IFC2X3.IFC2X3Factory;
import IFC2X3.IfcCurveStyleFont;

@XmlRootElement(name = "IfcCurveStyleFontRefElement")
public class IfcCurveStyleFontRef extends IFC2X3.jaxb.IfcCurveStyleFontSelectRef  {

	

	
	@Override
	public IfcCurveStyleFont createInstance() {
		return IFC2X3Factory.eINSTANCE.createIfcCurveStyleFont();
	}
	
	public static IfcCurveStyleFontRef valueOf(String id) {
		IfcCurveStyleFontRef result = new IfcCurveStyleFontRef();
		result.setID(id);
		return result;
	}

	@Override
	public String toString() {
		return getID();
	}
	

}