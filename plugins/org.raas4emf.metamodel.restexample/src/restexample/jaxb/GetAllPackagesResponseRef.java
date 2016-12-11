package restexample.jaxb;

import javax.xml.bind.annotation.*;
import org.eclipse.emf.ecore.jaxb.*;

import restexample.GetAllPackagesResponse;
import restexample.RestexampleFactory;

@XmlRootElement(name = "GetAllPackagesResponseRefElement")
public class GetAllPackagesResponseRef extends org.eclipse.emf.ecore.jaxb.EObjectRef  {

	

	
	@Override
	public GetAllPackagesResponse createInstance() {
		return RestexampleFactory.eINSTANCE.createGetAllPackagesResponse();
	}
	
	public static GetAllPackagesResponseRef valueOf(String id) {
		GetAllPackagesResponseRef result = new GetAllPackagesResponseRef();
		result.setID(id);
		return result;
	}

	@Override
	public String toString() {
		return getID();
	}
	

}