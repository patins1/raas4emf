package IFC2X3.jaxb;

import javax.xml.bind.annotation.*;
import org.eclipse.emf.ecore.jaxb.*;

import IFC2X3.IFC2X3Factory;
import IFC2X3.IfcCurveStyleFontPattern;

@XmlRootElement(name = "IfcCurveStyleFontPatternRefElement")
public class IfcCurveStyleFontPatternRef extends org.eclipse.emf.cdo.jaxb.CDOObjectRef  {

	

	
	@Override
	public IfcCurveStyleFontPattern createInstance() {
		return IFC2X3Factory.eINSTANCE.createIfcCurveStyleFontPattern();
	}
	
	public static IfcCurveStyleFontPatternRef valueOf(String id) {
		IfcCurveStyleFontPatternRef result = new IfcCurveStyleFontPatternRef();
		result.setID(id);
		return result;
	}

	@Override
	public String toString() {
		return getID();
	}
	

}