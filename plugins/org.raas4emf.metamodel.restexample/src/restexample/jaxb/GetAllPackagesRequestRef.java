package restexample.jaxb;

import javax.xml.bind.annotation.*;
import org.eclipse.emf.ecore.jaxb.*;

import restexample.GetAllPackagesRequest;
import restexample.RestexampleFactory;

@XmlRootElement(name = "GetAllPackagesRequestRefElement")
public class GetAllPackagesRequestRef extends org.eclipse.emf.ecore.jaxb.EObjectRef  {

	

	
	@Override
	public GetAllPackagesRequest createInstance() {
		return RestexampleFactory.eINSTANCE.createGetAllPackagesRequest();
	}
	
	public static GetAllPackagesRequestRef valueOf(String id) {
		GetAllPackagesRequestRef result = new GetAllPackagesRequestRef();
		result.setID(id);
		return result;
	}

	@Override
	public String toString() {
		return getID();
	}
	

}