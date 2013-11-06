package IFC2X3.jaxb;

import javax.xml.bind.annotation.*;
import org.eclipse.emf.ecore.jaxb.*;

import IFC2X3.IFC2X3Factory;
import IFC2X3.IfcClassificationNotation;

@XmlRootElement(name = "IfcClassificationNotationRefElement")
public class IfcClassificationNotationRef extends IFC2X3.jaxb.IfcClassificationNotationSelectRef  {

	

	
	@Override
	public IfcClassificationNotation createInstance() {
		return IFC2X3Factory.eINSTANCE.createIfcClassificationNotation();
	}
	
	public static IfcClassificationNotationRef valueOf(String id) {
		IfcClassificationNotationRef result = new IfcClassificationNotationRef();
		result.setID(id);
		return result;
	}

	@Override
	public String toString() {
		return getID();
	}
	

}