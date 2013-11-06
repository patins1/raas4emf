package IFC2X3.jaxb;

import javax.xml.bind.annotation.*;
import org.eclipse.emf.ecore.jaxb.*;

import IFC2X3.IFC2X3Factory;
import IFC2X3.IfcMeasureValue;

@XmlRootElement(name = "IfcMeasureValueRefElement")
public class IfcMeasureValueRef extends org.eclipse.emf.cdo.jaxb.CDOObjectRef  {

	

	
	@Override
	public IfcMeasureValue createInstance() {
		return IFC2X3Factory.eINSTANCE.createIfcMeasureValue();
	}
	
	public static IfcMeasureValueRef valueOf(String id) {
		IfcMeasureValueRef result = new IfcMeasureValueRef();
		result.setID(id);
		return result;
	}

	@Override
	public String toString() {
		return getID();
	}
	

}