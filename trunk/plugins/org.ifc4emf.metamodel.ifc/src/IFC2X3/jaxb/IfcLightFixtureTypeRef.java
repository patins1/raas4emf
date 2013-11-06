package IFC2X3.jaxb;

import javax.xml.bind.annotation.*;
import org.eclipse.emf.ecore.jaxb.*;

import IFC2X3.IFC2X3Factory;
import IFC2X3.IfcLightFixtureType;

@XmlRootElement(name = "IfcLightFixtureTypeRefElement")
public class IfcLightFixtureTypeRef extends IFC2X3.jaxb.IfcFlowTerminalTypeRef  {

	

	
	@Override
	public IfcLightFixtureType createInstance() {
		return IFC2X3Factory.eINSTANCE.createIfcLightFixtureType();
	}
	
	public static IfcLightFixtureTypeRef valueOf(String id) {
		IfcLightFixtureTypeRef result = new IfcLightFixtureTypeRef();
		result.setID(id);
		return result;
	}

	@Override
	public String toString() {
		return getID();
	}
	

}