package IFC2X3.jaxb;

import javax.xml.bind.annotation.*;
import org.eclipse.emf.ecore.jaxb.*;

import IFC2X3.IFC2X3Factory;
import IFC2X3.IfcAsymmetricIShapeProfileDef;

@XmlRootElement(name = "IfcAsymmetricIShapeProfileDefRefElement")
public class IfcAsymmetricIShapeProfileDefRef extends IFC2X3.jaxb.IfcIShapeProfileDefRef  {

	

	
	@Override
	public IfcAsymmetricIShapeProfileDef createInstance() {
		return IFC2X3Factory.eINSTANCE.createIfcAsymmetricIShapeProfileDef();
	}
	
	public static IfcAsymmetricIShapeProfileDefRef valueOf(String id) {
		IfcAsymmetricIShapeProfileDefRef result = new IfcAsymmetricIShapeProfileDefRef();
		result.setID(id);
		return result;
	}

	@Override
	public String toString() {
		return getID();
	}
	

}