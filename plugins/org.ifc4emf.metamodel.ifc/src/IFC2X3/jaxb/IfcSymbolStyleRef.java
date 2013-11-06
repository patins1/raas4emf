package IFC2X3.jaxb;

import javax.xml.bind.annotation.*;
import org.eclipse.emf.ecore.jaxb.*;

import IFC2X3.IFC2X3Factory;
import IFC2X3.IfcSymbolStyle;

@XmlRootElement(name = "IfcSymbolStyleRefElement")
public class IfcSymbolStyleRef extends IFC2X3.jaxb.IfcPresentationStyleRef  {

	

	
	@Override
	public IfcSymbolStyle createInstance() {
		return IFC2X3Factory.eINSTANCE.createIfcSymbolStyle();
	}
	
	public static IfcSymbolStyleRef valueOf(String id) {
		IfcSymbolStyleRef result = new IfcSymbolStyleRef();
		result.setID(id);
		return result;
	}

	@Override
	public String toString() {
		return getID();
	}
	

}