

package raas.experiments.jaxbased.webservice;
 
import javax.jws.WebService;
import javax.ws.rs.Path;

import au.com.smartservicescrc.raas_small_test.RstPackage;
import au.com.smartservicescrc.raas_small_test.UnderClassE;

import java.util.List;

@Path("/UnderClassE")
@WebService(endpointInterface = "au.com.smartservicescrc.raas_small_test.jaxws.UnderClassERepository", serviceName = "UnderClassERepository")
public class UnderClassERepositoryImpl extends raas.experiments.jaxbased.webservice.raas.WebserviceRepository implements au.com.smartservicescrc.raas_small_test.jaxws.UnderClassERepository {
 
 	public UnderClassERepositoryImpl() throws Exception {
		super(RstPackage.eINSTANCE);
	}
 
	// RepositoryRoot operations

	public String GetraasRef(UnderClassE rootRef) throws Exception {
		return getter(rootRef,RstPackage.eINSTANCE.getUnderClassE_RaasRef());
	}

	public void SetraasRef(UnderClassE rootRef, String valuesRef) throws Exception {
		setter(rootRef,RstPackage.eINSTANCE.getUnderClassE_RaasRef(),valuesRef);
	}

	// CRUD operations for UnderClassE

	public UnderClassE CreateUnderClassE(UnderClassE value) throws Exception {
		return create(value);
	}

	public UnderClassE GetUnderClassE(UnderClassE valueRef) throws Exception {
		return get(valueRef);
	}

	public void UpdateUnderClassE(UnderClassE valueRef, UnderClassE value) throws Exception {
		update(valueRef, value);
	}

	public void DeleteUnderClassE(UnderClassE valueRef) throws Exception {
		delete(valueRef);
	}

	public List<UnderClassE> GetAllUnderClassE() throws Exception {
		return getAllInstances(RstPackage.Literals.UNDER_CLASS_E);
	}
	
}