package IFC2X3.jaxb;

import javax.xml.bind.annotation.*;
import org.eclipse.emf.ecore.jaxb.*;

import IFC2X3.IFC2X3Factory;
import IFC2X3.IfcPreDefinedDimensionSymbol;

@XmlRootElement(name = "IfcPreDefinedDimensionSymbolRefElement")
public class IfcPreDefinedDimensionSymbolRef extends IFC2X3.jaxb.IfcPreDefinedSymbolRef  {

	

	
	@Override
	public IfcPreDefinedDimensionSymbol createInstance() {
		return IFC2X3Factory.eINSTANCE.createIfcPreDefinedDimensionSymbol();
	}
	
	public static IfcPreDefinedDimensionSymbolRef valueOf(String id) {
		IfcPreDefinedDimensionSymbolRef result = new IfcPreDefinedDimensionSymbolRef();
		result.setID(id);
		return result;
	}

	@Override
	public String toString() {
		return getID();
	}
	

}