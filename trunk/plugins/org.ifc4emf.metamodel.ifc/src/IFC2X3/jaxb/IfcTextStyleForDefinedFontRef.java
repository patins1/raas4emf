package IFC2X3.jaxb;

import javax.xml.bind.annotation.*;
import org.eclipse.emf.ecore.jaxb.*;

import IFC2X3.IFC2X3Factory;
import IFC2X3.IfcTextStyleForDefinedFont;

@XmlRootElement(name = "IfcTextStyleForDefinedFontRefElement")
public class IfcTextStyleForDefinedFontRef extends IFC2X3.jaxb.IfcCharacterStyleSelectRef  {

	

	
	@Override
	public IfcTextStyleForDefinedFont createInstance() {
		return IFC2X3Factory.eINSTANCE.createIfcTextStyleForDefinedFont();
	}
	
	public static IfcTextStyleForDefinedFontRef valueOf(String id) {
		IfcTextStyleForDefinedFontRef result = new IfcTextStyleForDefinedFontRef();
		result.setID(id);
		return result;
	}

	@Override
	public String toString() {
		return getID();
	}
	

}