package IFC2X3.jaxb;

import javax.xml.bind.annotation.*;
import org.eclipse.emf.ecore.jaxb.*;

import IFC2X3.IFC2X3Factory;
import IFC2X3.IfcTextStyleFontModel;

@XmlRootElement(name = "IfcTextStyleFontModelRefElement")
public class IfcTextStyleFontModelRef extends IFC2X3.jaxb.IfcPreDefinedTextFontRef  {

	

	
	@Override
	public IfcTextStyleFontModel createInstance() {
		return IFC2X3Factory.eINSTANCE.createIfcTextStyleFontModel();
	}
	
	public static IfcTextStyleFontModelRef valueOf(String id) {
		IfcTextStyleFontModelRef result = new IfcTextStyleFontModelRef();
		result.setID(id);
		return result;
	}

	@Override
	public String toString() {
		return getID();
	}
	

}