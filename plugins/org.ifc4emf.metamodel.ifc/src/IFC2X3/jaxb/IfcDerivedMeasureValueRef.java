package IFC2X3.jaxb;

import javax.xml.bind.annotation.*;
import org.eclipse.emf.ecore.jaxb.*;

import IFC2X3.IFC2X3Factory;
import IFC2X3.IfcDerivedMeasureValue;

@XmlRootElement(name = "IfcDerivedMeasureValueRefElement")
public class IfcDerivedMeasureValueRef extends org.eclipse.emf.cdo.jaxb.CDOObjectRef  {

	

	
	@Override
	public IfcDerivedMeasureValue createInstance() {
		return IFC2X3Factory.eINSTANCE.createIfcDerivedMeasureValue();
	}
	
	public static IfcDerivedMeasureValueRef valueOf(String id) {
		IfcDerivedMeasureValueRef result = new IfcDerivedMeasureValueRef();
		result.setID(id);
		return result;
	}

	@Override
	public String toString() {
		return getID();
	}
	

}