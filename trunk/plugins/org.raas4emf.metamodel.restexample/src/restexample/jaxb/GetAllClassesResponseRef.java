package restexample.jaxb;

import javax.xml.bind.annotation.*;
import org.eclipse.emf.ecore.jaxb.*;

import restexample.GetAllClassesResponse;
import restexample.RestexampleFactory;

@XmlRootElement(name = "GetAllClassesResponseRefElement")
public class GetAllClassesResponseRef extends org.eclipse.emf.ecore.jaxb.EObjectRef  {

	

	
	@Override
	public GetAllClassesResponse createInstance() {
		return RestexampleFactory.eINSTANCE.createGetAllClassesResponse();
	}
	
	public static GetAllClassesResponseRef valueOf(String id) {
		GetAllClassesResponseRef result = new GetAllClassesResponseRef();
		result.setID(id);
		return result;
	}

	@Override
	public String toString() {
		return getID();
	}
	

}