package IFC2X3.jaxb;

import javax.xml.bind.annotation.*;
import org.eclipse.emf.ecore.jaxb.*;

import IFC2X3.IFC2X3Factory;
import IFC2X3.IfcCartesianTransformationOperator2D;

@XmlRootElement(name = "IfcCartesianTransformationOperator2DRefElement")
public class IfcCartesianTransformationOperator2DRef extends IFC2X3.jaxb.IfcCartesianTransformationOperatorRef  {

	

	
	@Override
	public IfcCartesianTransformationOperator2D createInstance() {
		return IFC2X3Factory.eINSTANCE.createIfcCartesianTransformationOperator2D();
	}
	
	public static IfcCartesianTransformationOperator2DRef valueOf(String id) {
		IfcCartesianTransformationOperator2DRef result = new IfcCartesianTransformationOperator2DRef();
		result.setID(id);
		return result;
	}

	@Override
	public String toString() {
		return getID();
	}
	

}