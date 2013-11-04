

package raas.experiments.jaxbased.webservice;
 
import javax.jws.WebService;
import javax.ws.rs.Path;

import au.com.smartservicescrc.raas_small_test.DerivedUnderClassE1;
import au.com.smartservicescrc.raas_small_test.RstPackage;
import au.com.smartservicescrc.raas_small_test.TopClassD;

import java.util.List;

@Path("/DerivedUnderClassE1")
@WebService(endpointInterface = "au.com.smartservicescrc.raas_small_test.jaxws.DerivedUnderClassE1Repository", serviceName = "DerivedUnderClassE1Repository")
public class DerivedUnderClassE1RepositoryImpl extends raas.experiments.jaxbased.webservice.raas.WebserviceRepository implements au.com.smartservicescrc.raas_small_test.jaxws.DerivedUnderClassE1Repository {
 
 	public DerivedUnderClassE1RepositoryImpl() throws Exception {
		super(RstPackage.eINSTANCE);
	}
 
	// RepositoryRoot operations

	public String GetraasRef(DerivedUnderClassE1 rootRef) throws Exception {
		return getter(rootRef,RstPackage.eINSTANCE.getUnderClassE_RaasRef());
	}

	public void SetraasRef(DerivedUnderClassE1 rootRef, String valuesRef) throws Exception {
		setter(rootRef,RstPackage.eINSTANCE.getUnderClassE_RaasRef(),valuesRef);
	}

	public TopClassD GetsingleRefClassD(DerivedUnderClassE1 rootRef) throws Exception {
		return getter(rootRef,RstPackage.eINSTANCE.getDerivedUnderClassE1_SingleRefClassD());
	}

	public void SetsingleRefClassD(DerivedUnderClassE1 rootRef, TopClassD valuesRef) throws Exception {
		setter(rootRef,RstPackage.eINSTANCE.getDerivedUnderClassE1_SingleRefClassD(),valuesRef);
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
	
	// CRUD operations for DerivedUnderClassE1

	public DerivedUnderClassE1 CreateDerivedUnderClassE1(DerivedUnderClassE1 value) throws Exception {
		return create(value);
	}

	public DerivedUnderClassE1 GetDerivedUnderClassE1(DerivedUnderClassE1 valueRef) throws Exception {
		return get(valueRef);
	}

	public void UpdateDerivedUnderClassE1(DerivedUnderClassE1 valueRef, DerivedUnderClassE1 value) throws Exception {
		update(valueRef, value);
	}

	public void DeleteDerivedUnderClassE1(DerivedUnderClassE1 valueRef) throws Exception {
		delete(valueRef);
	}

	public List<DerivedUnderClassE1> GetAllDerivedUnderClassE1() throws Exception {
		return getAllInstances(RstPackage.Literals.DERIVED_UNDER_CLASS_E1);
	}
	
}