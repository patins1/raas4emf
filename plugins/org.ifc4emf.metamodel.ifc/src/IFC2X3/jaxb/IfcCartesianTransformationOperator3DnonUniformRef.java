package IFC2X3.jaxb;

import javax.xml.bind.annotation.*;
import org.eclipse.emf.ecore.jaxb.*;

import IFC2X3.IFC2X3Factory;
import IFC2X3.IfcCartesianTransformationOperator3DnonUniform;

@XmlRootElement(name = "IfcCartesianTransformationOperator3DnonUniformRefElement")
public class IfcCartesianTransformationOperator3DnonUniformRef extends IFC2X3.jaxb.IfcCartesianTransformationOperator3DRef  {

	

	
	@Override
	public IfcCartesianTransformationOperator3DnonUniform createInstance() {
		return IFC2X3Factory.eINSTANCE.createIfcCartesianTransformationOperator3DnonUniform();
	}
	
	public static IfcCartesianTransformationOperator3DnonUniformRef valueOf(String id) {
		IfcCartesianTransformationOperator3DnonUniformRef result = new IfcCartesianTransformationOperator3DnonUniformRef();
		result.setID(id);
		return result;
	}

	@Override
	public String toString() {
		return getID();
	}
	

}