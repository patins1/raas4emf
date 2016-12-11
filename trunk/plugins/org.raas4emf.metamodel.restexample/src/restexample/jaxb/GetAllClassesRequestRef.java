package restexample.jaxb;

import javax.xml.bind.annotation.*;
import org.eclipse.emf.ecore.jaxb.*;

import restexample.GetAllClassesRequest;
import restexample.RestexampleFactory;

@XmlRootElement(name = "GetAllClassesRequestRefElement")
public class GetAllClassesRequestRef extends org.eclipse.emf.ecore.jaxb.EObjectRef  {

	

	
	@Override
	public GetAllClassesRequest createInstance() {
		return RestexampleFactory.eINSTANCE.createGetAllClassesRequest();
	}
	
	public static GetAllClassesRequestRef valueOf(String id) {
		GetAllClassesRequestRef result = new GetAllClassesRequestRef();
		result.setID(id);
		return result;
	}

	@Override
	public String toString() {
		return getID();
	}
	

}