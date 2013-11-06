package IFC2X3.jaxb;

import javax.xml.bind.annotation.*;
import org.eclipse.emf.ecore.jaxb.*;

import IFC2X3.IFC2X3Factory;
import IFC2X3.IfcDimensionalExponents;

@XmlRootElement(name = "IfcDimensionalExponentsRefElement")
public class IfcDimensionalExponentsRef extends org.eclipse.emf.cdo.jaxb.CDOObjectRef  {

	

	
	@Override
	public IfcDimensionalExponents createInstance() {
		return IFC2X3Factory.eINSTANCE.createIfcDimensionalExponents();
	}
	
	public static IfcDimensionalExponentsRef valueOf(String id) {
		IfcDimensionalExponentsRef result = new IfcDimensionalExponentsRef();
		result.setID(id);
		return result;
	}

	@Override
	public String toString() {
		return getID();
	}
	

}