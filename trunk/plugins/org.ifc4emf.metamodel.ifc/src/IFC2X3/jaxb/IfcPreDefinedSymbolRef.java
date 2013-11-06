package IFC2X3.jaxb;

import javax.xml.bind.annotation.*;
import org.eclipse.emf.ecore.jaxb.*;

import IFC2X3.IFC2X3Factory;
import IFC2X3.IfcPreDefinedSymbol;

@XmlRootElement(name = "IfcPreDefinedSymbolRefElement")
public class IfcPreDefinedSymbolRef extends IFC2X3.jaxb.IfcDefinedSymbolSelectRef  {

	

	
	@Override
	public IfcPreDefinedSymbol createInstance() {
		return IFC2X3Factory.eINSTANCE.createIfcPreDefinedSymbol();
	}
	
	public static IfcPreDefinedSymbolRef valueOf(String id) {
		IfcPreDefinedSymbolRef result = new IfcPreDefinedSymbolRef();
		result.setID(id);
		return result;
	}

	@Override
	public String toString() {
		return getID();
	}
	

}