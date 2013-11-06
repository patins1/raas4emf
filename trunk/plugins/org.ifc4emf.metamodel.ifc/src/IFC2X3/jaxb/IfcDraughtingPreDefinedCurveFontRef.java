package IFC2X3.jaxb;

import javax.xml.bind.annotation.*;
import org.eclipse.emf.ecore.jaxb.*;

import IFC2X3.IFC2X3Factory;
import IFC2X3.IfcDraughtingPreDefinedCurveFont;

@XmlRootElement(name = "IfcDraughtingPreDefinedCurveFontRefElement")
public class IfcDraughtingPreDefinedCurveFontRef extends IFC2X3.jaxb.IfcPreDefinedCurveFontRef  {

	

	
	@Override
	public IfcDraughtingPreDefinedCurveFont createInstance() {
		return IFC2X3Factory.eINSTANCE.createIfcDraughtingPreDefinedCurveFont();
	}
	
	public static IfcDraughtingPreDefinedCurveFontRef valueOf(String id) {
		IfcDraughtingPreDefinedCurveFontRef result = new IfcDraughtingPreDefinedCurveFontRef();
		result.setID(id);
		return result;
	}

	@Override
	public String toString() {
		return getID();
	}
	

}