package IFC2X3.jaxb;

import javax.xml.bind.annotation.*;
import org.eclipse.emf.ecore.jaxb.*;

import IFC2X3.IFC2X3Factory;
import IFC2X3.IfcPreDefinedTextFont;

@XmlRootElement(name = "IfcPreDefinedTextFontRefElement")
public class IfcPreDefinedTextFontRef extends IFC2X3.jaxb.IfcTextFontSelectRef  {

	

	
	@Override
	public IfcPreDefinedTextFont createInstance() {
		return IFC2X3Factory.eINSTANCE.createIfcPreDefinedTextFont();
	}
	
	public static IfcPreDefinedTextFontRef valueOf(String id) {
		IfcPreDefinedTextFontRef result = new IfcPreDefinedTextFontRef();
		result.setID(id);
		return result;
	}

	@Override
	public String toString() {
		return getID();
	}
	

}