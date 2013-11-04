

package raas.experiments.jaxbased.webservice;
 
import javax.jws.WebService;
import javax.ws.rs.Path;

import au.com.smartservicescrc.raas_small_test.RstPackage;
import au.com.smartservicescrc.raas_small_test.TopClassM;

import java.util.List;

@Path("/TopClassM")
@WebService(endpointInterface = "au.com.smartservicescrc.raas_small_test.jaxws.TopClassMRepository", serviceName = "TopClassMRepository")
public class TopClassMRepositoryImpl extends raas.experiments.jaxbased.webservice.raas.WebserviceRepository implements au.com.smartservicescrc.raas_small_test.jaxws.TopClassMRepository {
 
 	public TopClassMRepositoryImpl() throws Exception {
		super(RstPackage.eINSTANCE);
	}
 
	// RepositoryRoot operations

	public String GetraasRef(TopClassM rootRef) throws Exception {
		return getter(rootRef,RstPackage.eINSTANCE.getUnderClassE_RaasRef());
	}

	public void SetraasRef(TopClassM rootRef, String valuesRef) throws Exception {
		setter(rootRef,RstPackage.eINSTANCE.getUnderClassE_RaasRef(),valuesRef);
	}

	public int GetsingleAttrInt(TopClassM rootRef) throws Exception {
		return getter(rootRef,RstPackage.eINSTANCE.getTopClassM_SingleAttrInt());
	}

	public void SetsingleAttrInt(TopClassM rootRef, int valuesRef) throws Exception {
		setter(rootRef,RstPackage.eINSTANCE.getTopClassM_SingleAttrInt(),valuesRef);
	}

	// CRUD operations for TopClassM

	public TopClassM CreateTopClassM(TopClassM value) throws Exception {
		return create(value);
	}

	public TopClassM GetTopClassM(TopClassM valueRef) throws Exception {
		return get(valueRef);
	}

	public void UpdateTopClassM(TopClassM valueRef, TopClassM value) throws Exception {
		update(valueRef, value);
	}

	public void DeleteTopClassM(TopClassM valueRef) throws Exception {
		delete(valueRef);
	}

	public List<TopClassM> GetAllTopClassM() throws Exception {
		return getAllInstances(RstPackage.Literals.TOP_CLASS_M);
	}
	
}