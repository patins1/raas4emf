package IFC2X3.jaxb;

import javax.xml.bind.annotation.*;
import org.eclipse.emf.ecore.jaxb.*;

import IFC2X3.IFC2X3Factory;
import IFC2X3.IfcProcedure;

@XmlRootElement(name = "IfcProcedureRefElement")
public class IfcProcedureRef extends IFC2X3.jaxb.IfcProcessRef  {

	

	
	@Override
	public IfcProcedure createInstance() {
		return IFC2X3Factory.eINSTANCE.createIfcProcedure();
	}
	
	public static IfcProcedureRef valueOf(String id) {
		IfcProcedureRef result = new IfcProcedureRef();
		result.setID(id);
		return result;
	}

	@Override
	public String toString() {
		return getID();
	}
	

}