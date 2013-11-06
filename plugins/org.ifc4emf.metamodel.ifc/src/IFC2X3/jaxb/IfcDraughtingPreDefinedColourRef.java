package IFC2X3.jaxb;

import javax.xml.bind.annotation.*;
import org.eclipse.emf.ecore.jaxb.*;

import IFC2X3.IFC2X3Factory;
import IFC2X3.IfcDraughtingPreDefinedColour;

@XmlRootElement(name = "IfcDraughtingPreDefinedColourRefElement")
public class IfcDraughtingPreDefinedColourRef extends IFC2X3.jaxb.IfcPreDefinedColourRef  {

	

	
	@Override
	public IfcDraughtingPreDefinedColour createInstance() {
		return IFC2X3Factory.eINSTANCE.createIfcDraughtingPreDefinedColour();
	}
	
	public static IfcDraughtingPreDefinedColourRef valueOf(String id) {
		IfcDraughtingPreDefinedColourRef result = new IfcDraughtingPreDefinedColourRef();
		result.setID(id);
		return result;
	}

	@Override
	public String toString() {
		return getID();
	}
	

}