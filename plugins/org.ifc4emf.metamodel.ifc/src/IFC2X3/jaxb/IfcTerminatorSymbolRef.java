package IFC2X3.jaxb;

import javax.xml.bind.annotation.*;
import org.eclipse.emf.ecore.jaxb.*;

import IFC2X3.IFC2X3Factory;
import IFC2X3.IfcTerminatorSymbol;

@XmlRootElement(name = "IfcTerminatorSymbolRefElement")
public class IfcTerminatorSymbolRef extends IFC2X3.jaxb.IfcAnnotationSymbolOccurrenceRef  {

	

	
	@Override
	public IfcTerminatorSymbol createInstance() {
		return IFC2X3Factory.eINSTANCE.createIfcTerminatorSymbol();
	}
	
	public static IfcTerminatorSymbolRef valueOf(String id) {
		IfcTerminatorSymbolRef result = new IfcTerminatorSymbolRef();
		result.setID(id);
		return result;
	}

	@Override
	public String toString() {
		return getID();
	}
	

}