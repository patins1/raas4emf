package IFC2X3.jaxb;

import javax.xml.bind.annotation.*;
import org.eclipse.emf.ecore.jaxb.*;

import IFC2X3.IFC2X3Factory;
import IFC2X3.IfcExternallyDefinedTextFont;

@XmlRootElement(name = "IfcExternallyDefinedTextFontRefElement")
public class IfcExternallyDefinedTextFontRef extends IFC2X3.jaxb.IfcTextFontSelectRef  {

	

	
	@Override
	public IfcExternallyDefinedTextFont createInstance() {
		return IFC2X3Factory.eINSTANCE.createIfcExternallyDefinedTextFont();
	}
	
	public static IfcExternallyDefinedTextFontRef valueOf(String id) {
		IfcExternallyDefinedTextFontRef result = new IfcExternallyDefinedTextFontRef();
		result.setID(id);
		return result;
	}

	@Override
	public String toString() {
		return getID();
	}
	

}