

package raas.experiments.jaxbased.webservice;
 
import javax.jws.WebService;
import javax.ws.rs.Path;

import au.com.smartservicescrc.raas_small_test.RstPackage;
import au.com.smartservicescrc.raas_small_test.TopClassD;

import java.util.List;
import java.util.TimeZone;

@Path("/TopClassD")
@WebService(endpointInterface = "au.com.smartservicescrc.raas_small_test.jaxws.TopClassDRepository", serviceName = "TopClassDRepository")
public class TopClassDRepositoryImpl extends raas.experiments.jaxbased.webservice.raas.WebserviceRepository implements au.com.smartservicescrc.raas_small_test.jaxws.TopClassDRepository {
 
 	public TopClassDRepositoryImpl() throws Exception {
		super(RstPackage.eINSTANCE);
	}
 
	// RepositoryRoot operations

	public String GetraasRef(TopClassD rootRef) throws Exception {
		return getter(rootRef,RstPackage.eINSTANCE.getTopClassD_RaasRef());
	}

	public void SetraasRef(TopClassD rootRef, String valuesRef) throws Exception {
		setter(rootRef,RstPackage.eINSTANCE.getTopClassD_RaasRef(),valuesRef);
	}

	public List<Integer> Getmulti2lowerAttrInt(TopClassD rootRef) throws Exception {
		return getter(rootRef,RstPackage.eINSTANCE.getTopClassD_Multi2lowerAttrInt());
	}

	public void Setmulti2lowerAttrInt(TopClassD rootRef, List<Integer> valuesRef) throws Exception {
		setter(rootRef,RstPackage.eINSTANCE.getTopClassD_Multi2lowerAttrInt(),valuesRef);
	}

	public int GetsingleAttrInt(TopClassD rootRef) throws Exception {
		return getter(rootRef,RstPackage.eINSTANCE.getTopClassD_SingleAttrInt());
	}

	public void SetsingleAttrInt(TopClassD rootRef, int valuesRef) throws Exception {
		setter(rootRef,RstPackage.eINSTANCE.getTopClassD_SingleAttrInt(),valuesRef);
	}

	public int GetoptionalAttrInt(TopClassD rootRef) throws Exception {
		return getter(rootRef,RstPackage.eINSTANCE.getTopClassD_OptionalAttrInt());
	}

	public void SetoptionalAttrInt(TopClassD rootRef, int valuesRef) throws Exception {
		setter(rootRef,RstPackage.eINSTANCE.getTopClassD_OptionalAttrInt(),valuesRef);
	}

	public TimeZone GetoptionalTimeZone(TopClassD rootRef) throws Exception {
		return getter(rootRef,RstPackage.eINSTANCE.getTopClassD_OptionalTimeZone());
	}

	public void SetoptionalTimeZone(TopClassD rootRef, TimeZone valuesRef) throws Exception {
		setter(rootRef,RstPackage.eINSTANCE.getTopClassD_OptionalTimeZone(),valuesRef);
	}

	// CRUD operations for TopClassD

	public TopClassD CreateTopClassD(TopClassD value) throws Exception {
		return create(value);
	}

	public TopClassD GetTopClassD(TopClassD valueRef) throws Exception {
		return get(valueRef);
	}

	public void UpdateTopClassD(TopClassD valueRef, TopClassD value) throws Exception {
		update(valueRef, value);
	}

	public void DeleteTopClassD(TopClassD valueRef) throws Exception {
		delete(valueRef);
	}

	public List<TopClassD> GetAllTopClassD() throws Exception {
		return getAllInstances(RstPackage.Literals.TOP_CLASS_D);
	}
	
}