package IFC2X3.jaxb;

import javax.xml.bind.annotation.*;
import org.eclipse.emf.ecore.jaxb.*;

import IFC2X3.IFC2X3Factory;
import IFC2X3.IfcSpaceProgram;

@XmlRootElement(name = "IfcSpaceProgramRefElement")
public class IfcSpaceProgramRef extends IFC2X3.jaxb.IfcControlRef  {

	

	
	@Override
	public IfcSpaceProgram createInstance() {
		return IFC2X3Factory.eINSTANCE.createIfcSpaceProgram();
	}
	
	public static IfcSpaceProgramRef valueOf(String id) {
		IfcSpaceProgramRef result = new IfcSpaceProgramRef();
		result.setID(id);
		return result;
	}

	@Override
	public String toString() {
		return getID();
	}
	

}