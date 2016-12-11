package restexample.jaxb;

import javax.xml.bind.annotation.*;
import org.eclipse.emf.ecore.jaxb.*;

import restexample.RestexampleFactory;
import restexample.TransformOCLRequest;

@XmlRootElement(name = "TransformOCLRequestRefElement")
public class TransformOCLRequestRef extends org.eclipse.emf.ecore.jaxb.EObjectRef  {

	

	
	@Override
	public TransformOCLRequest createInstance() {
		return RestexampleFactory.eINSTANCE.createTransformOCLRequest();
	}
	
	public static TransformOCLRequestRef valueOf(String id) {
		TransformOCLRequestRef result = new TransformOCLRequestRef();
		result.setID(id);
		return result;
	}

	@Override
	public String toString() {
		return getID();
	}
	

}