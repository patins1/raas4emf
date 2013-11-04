

package raas.experiments.jaxbased.webservice;
 
import javax.jws.WebService;
import javax.ws.rs.Path;

import au.com.smartservicescrc.raas_small_test.RstPackage;
import au.com.smartservicescrc.raas_small_test.UnderClassF;

import java.util.List;

@Path("/UnderClassF")
@WebService(endpointInterface = "au.com.smartservicescrc.raas_small_test.jaxws.UnderClassFRepository", serviceName = "UnderClassFRepository")
public class UnderClassFRepositoryImpl extends raas.experiments.jaxbased.webservice.raas.WebserviceRepository implements au.com.smartservicescrc.raas_small_test.jaxws.UnderClassFRepository {
 
 	public UnderClassFRepositoryImpl() throws Exception {
		super(RstPackage.eINSTANCE);
	}
 
	// RepositoryRoot operations

	public String GetraasRef(UnderClassF rootRef) throws Exception {
		return getter(rootRef,RstPackage.eINSTANCE.getUnderClassF_RaasRef());
	}

	public void SetraasRef(UnderClassF rootRef, String valuesRef) throws Exception {
		setter(rootRef,RstPackage.eINSTANCE.getUnderClassF_RaasRef(),valuesRef);
	}

	public int GetsingleAttrInt(UnderClassF rootRef) throws Exception {
		return getter(rootRef,RstPackage.eINSTANCE.getUnderClassF_SingleAttrInt());
	}

	public void SetsingleAttrInt(UnderClassF rootRef, int valuesRef) throws Exception {
		setter(rootRef,RstPackage.eINSTANCE.getUnderClassF_SingleAttrInt(),valuesRef);
	}

	// CRUD operations for UnderClassF

	public UnderClassF CreateUnderClassF(UnderClassF value) throws Exception {
		return create(value);
	}

	public UnderClassF GetUnderClassF(UnderClassF valueRef) throws Exception {
		return get(valueRef);
	}

	public void UpdateUnderClassF(UnderClassF valueRef, UnderClassF value) throws Exception {
		update(valueRef, value);
	}

	public void DeleteUnderClassF(UnderClassF valueRef) throws Exception {
		delete(valueRef);
	}

	public List<UnderClassF> GetAllUnderClassF() throws Exception {
		return getAllInstances(RstPackage.Literals.UNDER_CLASS_F);
	}
	
}