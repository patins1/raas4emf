package IFC2X3.jaxb;

import javax.xml.bind.annotation.*;
import org.eclipse.emf.ecore.jaxb.*;

import IFC2X3.IFC2X3Factory;
import IFC2X3.IfcCartesianTransformationOperator2DnonUniform;

@XmlRootElement(name = "IfcCartesianTransformationOperator2DnonUniformRefElement")
public class IfcCartesianTransformationOperator2DnonUniformRef extends IFC2X3.jaxb.IfcCartesianTransformationOperator2DRef  {

	

	
	@Override
	public IfcCartesianTransformationOperator2DnonUniform createInstance() {
		return IFC2X3Factory.eINSTANCE.createIfcCartesianTransformationOperator2DnonUniform();
	}
	
	public static IfcCartesianTransformationOperator2DnonUniformRef valueOf(String id) {
		IfcCartesianTransformationOperator2DnonUniformRef result = new IfcCartesianTransformationOperator2DnonUniformRef();
		result.setID(id);
		return result;
	}

	@Override
	public String toString() {
		return getID();
	}
	

}