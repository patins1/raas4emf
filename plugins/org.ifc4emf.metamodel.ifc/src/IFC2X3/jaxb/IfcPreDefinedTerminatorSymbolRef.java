package IFC2X3.jaxb;

import javax.xml.bind.annotation.*;
import org.eclipse.emf.ecore.jaxb.*;

import IFC2X3.IFC2X3Factory;
import IFC2X3.IfcPreDefinedTerminatorSymbol;

@XmlRootElement(name = "IfcPreDefinedTerminatorSymbolRefElement")
public class IfcPreDefinedTerminatorSymbolRef extends IFC2X3.jaxb.IfcPreDefinedSymbolRef  {

	

	
	@Override
	public IfcPreDefinedTerminatorSymbol createInstance() {
		return IFC2X3Factory.eINSTANCE.createIfcPreDefinedTerminatorSymbol();
	}
	
	public static IfcPreDefinedTerminatorSymbolRef valueOf(String id) {
		IfcPreDefinedTerminatorSymbolRef result = new IfcPreDefinedTerminatorSymbolRef();
		result.setID(id);
		return result;
	}

	@Override
	public String toString() {
		return getID();
	}
	

}