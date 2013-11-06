package IFC2X3.jaxb;

import javax.xml.bind.annotation.*;
import org.eclipse.emf.ecore.jaxb.*;

import IFC2X3.IFC2X3Factory;
import IFC2X3.IfcDraughtingPreDefinedTextFont;

@XmlRootElement(name = "IfcDraughtingPreDefinedTextFontRefElement")
public class IfcDraughtingPreDefinedTextFontRef extends IFC2X3.jaxb.IfcPreDefinedTextFontRef  {

	

	
	@Override
	public IfcDraughtingPreDefinedTextFont createInstance() {
		return IFC2X3Factory.eINSTANCE.createIfcDraughtingPreDefinedTextFont();
	}
	
	public static IfcDraughtingPreDefinedTextFontRef valueOf(String id) {
		IfcDraughtingPreDefinedTextFontRef result = new IfcDraughtingPreDefinedTextFontRef();
		result.setID(id);
		return result;
	}

	@Override
	public String toString() {
		return getID();
	}
	

}