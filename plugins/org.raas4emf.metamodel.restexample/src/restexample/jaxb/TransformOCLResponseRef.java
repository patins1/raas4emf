package restexample.jaxb;

import javax.xml.bind.annotation.*;
import org.eclipse.emf.ecore.jaxb.*;

import restexample.RestexampleFactory;
import restexample.TransformOCLResponse;

@XmlRootElement(name = "TransformOCLResponseRefElement")
public class TransformOCLResponseRef extends org.eclipse.emf.ecore.jaxb.EObjectRef  {

	

	
	@Override
	public TransformOCLResponse createInstance() {
		return RestexampleFactory.eINSTANCE.createTransformOCLResponse();
	}
	
	public static TransformOCLResponseRef valueOf(String id) {
		TransformOCLResponseRef result = new TransformOCLResponseRef();
		result.setID(id);
		return result;
	}

	@Override
	public String toString() {
		return getID();
	}
	

}