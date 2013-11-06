package IFC2X3.jaxb;

import javax.xml.bind.annotation.*;
import org.eclipse.emf.ecore.jaxb.*;

import IFC2X3.IFC2X3Factory;
import IFC2X3.IfcElectricHeaterType;

@XmlRootElement(name = "IfcElectricHeaterTypeRefElement")
public class IfcElectricHeaterTypeRef extends IFC2X3.jaxb.IfcFlowTerminalTypeRef  {

	

	
	@Override
	public IfcElectricHeaterType createInstance() {
		return IFC2X3Factory.eINSTANCE.createIfcElectricHeaterType();
	}
	
	public static IfcElectricHeaterTypeRef valueOf(String id) {
		IfcElectricHeaterTypeRef result = new IfcElectricHeaterTypeRef();
		result.setID(id);
		return result;
	}

	@Override
	public String toString() {
		return getID();
	}
	

}