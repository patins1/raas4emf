package IFC2X3.jaxb;

import javax.xml.bind.annotation.*;
import org.eclipse.emf.ecore.jaxb.*;

import IFC2X3.IFC2X3Factory;
import IFC2X3.IfcPreDefinedColour;

@XmlRootElement(name = "IfcPreDefinedColourRefElement")
public class IfcPreDefinedColourRef extends IFC2X3.jaxb.IfcColourRef  {

	

	
	@Override
	public IfcPreDefinedColour createInstance() {
		return IFC2X3Factory.eINSTANCE.createIfcPreDefinedColour();
	}
	
	public static IfcPreDefinedColourRef valueOf(String id) {
		IfcPreDefinedColourRef result = new IfcPreDefinedColourRef();
		result.setID(id);
		return result;
	}

	@Override
	public String toString() {
		return getID();
	}
	

}