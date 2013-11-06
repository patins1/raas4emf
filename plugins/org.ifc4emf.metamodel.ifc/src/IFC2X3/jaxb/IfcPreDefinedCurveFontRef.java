package IFC2X3.jaxb;

import javax.xml.bind.annotation.*;
import org.eclipse.emf.ecore.jaxb.*;

import IFC2X3.IFC2X3Factory;
import IFC2X3.IfcPreDefinedCurveFont;

@XmlRootElement(name = "IfcPreDefinedCurveFontRefElement")
public class IfcPreDefinedCurveFontRef extends IFC2X3.jaxb.IfcCurveStyleFontSelectRef  {

	

	
	@Override
	public IfcPreDefinedCurveFont createInstance() {
		return IFC2X3Factory.eINSTANCE.createIfcPreDefinedCurveFont();
	}
	
	public static IfcPreDefinedCurveFontRef valueOf(String id) {
		IfcPreDefinedCurveFontRef result = new IfcPreDefinedCurveFontRef();
		result.setID(id);
		return result;
	}

	@Override
	public String toString() {
		return getID();
	}
	

}