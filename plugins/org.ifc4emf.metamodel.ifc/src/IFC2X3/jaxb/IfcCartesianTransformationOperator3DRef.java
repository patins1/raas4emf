package IFC2X3.jaxb;

import javax.xml.bind.annotation.*;
import org.eclipse.emf.ecore.jaxb.*;

import IFC2X3.IFC2X3Factory;
import IFC2X3.IfcCartesianTransformationOperator3D;

@XmlRootElement(name = "IfcCartesianTransformationOperator3DRefElement")
public class IfcCartesianTransformationOperator3DRef extends IFC2X3.jaxb.IfcCartesianTransformationOperatorRef  {

	

	
	@Override
	public IfcCartesianTransformationOperator3D createInstance() {
		return IFC2X3Factory.eINSTANCE.createIfcCartesianTransformationOperator3D();
	}
	
	public static IfcCartesianTransformationOperator3DRef valueOf(String id) {
		IfcCartesianTransformationOperator3DRef result = new IfcCartesianTransformationOperator3DRef();
		result.setID(id);
		return result;
	}

	@Override
	public String toString() {
		return getID();
	}
	

}