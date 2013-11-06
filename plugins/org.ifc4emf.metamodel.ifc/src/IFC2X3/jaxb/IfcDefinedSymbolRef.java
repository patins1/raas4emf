package IFC2X3.jaxb;

import javax.xml.bind.annotation.*;
import org.eclipse.emf.ecore.jaxb.*;

import IFC2X3.IFC2X3Factory;
import IFC2X3.IfcDefinedSymbol;

@XmlRootElement(name = "IfcDefinedSymbolRefElement")
public class IfcDefinedSymbolRef extends IFC2X3.jaxb.IfcGeometricRepresentationItemRef  {

	

	
	@Override
	public IfcDefinedSymbol createInstance() {
		return IFC2X3Factory.eINSTANCE.createIfcDefinedSymbol();
	}
	
	public static IfcDefinedSymbolRef valueOf(String id) {
		IfcDefinedSymbolRef result = new IfcDefinedSymbolRef();
		result.setID(id);
		return result;
	}

	@Override
	public String toString() {
		return getID();
	}
	

}