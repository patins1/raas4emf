package IFC2X3.jaxb;

import javax.xml.bind.annotation.*;
import org.eclipse.emf.ecore.jaxb.*;

import IFC2X3.IFC2X3Factory;
import IFC2X3.IfcExternallyDefinedSymbol;

@XmlRootElement(name = "IfcExternallyDefinedSymbolRefElement")
public class IfcExternallyDefinedSymbolRef extends IFC2X3.jaxb.IfcDefinedSymbolSelectRef  {

	

	
	@Override
	public IfcExternallyDefinedSymbol createInstance() {
		return IFC2X3Factory.eINSTANCE.createIfcExternallyDefinedSymbol();
	}
	
	public static IfcExternallyDefinedSymbolRef valueOf(String id) {
		IfcExternallyDefinedSymbolRef result = new IfcExternallyDefinedSymbolRef();
		result.setID(id);
		return result;
	}

	@Override
	public String toString() {
		return getID();
	}
	

}