

package raas.experiments.jaxbased.webservice;
 
import javax.jws.WebService;
import javax.ws.rs.Path;

import au.com.smartservicescrc.raas_small_test.DerivedUnderClassE2;
import au.com.smartservicescrc.raas_small_test.RstPackage;
import au.com.smartservicescrc.raas_small_test.ThirdLevelClassJ;

import java.util.List;

@Path("/DerivedUnderClassE2")
@WebService(endpointInterface = "au.com.smartservicescrc.raas_small_test.jaxws.DerivedUnderClassE2Repository", serviceName = "DerivedUnderClassE2Repository")
public class DerivedUnderClassE2RepositoryImpl extends raas.experiments.jaxbased.webservice.raas.WebserviceRepository implements au.com.smartservicescrc.raas_small_test.jaxws.DerivedUnderClassE2Repository {
 
 	public DerivedUnderClassE2RepositoryImpl() throws Exception {
		super(RstPackage.eINSTANCE);
	}
 
	// RepositoryRoot operations

	public String GetraasRef(DerivedUnderClassE2 rootRef) throws Exception {
		return getter(rootRef,RstPackage.eINSTANCE.getUnderClassE_RaasRef());
	}

	public void SetraasRef(DerivedUnderClassE2 rootRef, String valuesRef) throws Exception {
		setter(rootRef,RstPackage.eINSTANCE.getUnderClassE_RaasRef(),valuesRef);
	}

	public List<ThirdLevelClassJ> GetmultiContainClassJ(DerivedUnderClassE2 rootRef) throws Exception {
		return getter(rootRef,RstPackage.eINSTANCE.getDerivedUnderClassE2_MultiContainClassJ());
	}

	public void SetmultiContainClassJ(DerivedUnderClassE2 rootRef, List<ThirdLevelClassJ> valuesRef) throws Exception {
		setter(rootRef,RstPackage.eINSTANCE.getDerivedUnderClassE2_MultiContainClassJ(),valuesRef);
	}

	// CRUD operations for ThirdLevelClassJ

	public ThirdLevelClassJ CreateThirdLevelClassJ(ThirdLevelClassJ value) throws Exception {
		return create(value);
	}

	public ThirdLevelClassJ GetThirdLevelClassJ(ThirdLevelClassJ valueRef) throws Exception {
		return get(valueRef);
	}

	public void UpdateThirdLevelClassJ(ThirdLevelClassJ valueRef, ThirdLevelClassJ value) throws Exception {
		update(valueRef, value);
	}

	public void DeleteThirdLevelClassJ(ThirdLevelClassJ valueRef) throws Exception {
		delete(valueRef);
	}

	public List<ThirdLevelClassJ> GetAllThirdLevelClassJ() throws Exception {
		return getAllInstances(RstPackage.Literals.THIRD_LEVEL_CLASS_J);
	}
	
	// CRUD operations for DerivedUnderClassE2

	public DerivedUnderClassE2 CreateDerivedUnderClassE2(DerivedUnderClassE2 value) throws Exception {
		return create(value);
	}

	public DerivedUnderClassE2 GetDerivedUnderClassE2(DerivedUnderClassE2 valueRef) throws Exception {
		return get(valueRef);
	}

	public void UpdateDerivedUnderClassE2(DerivedUnderClassE2 valueRef, DerivedUnderClassE2 value) throws Exception {
		update(valueRef, value);
	}

	public void DeleteDerivedUnderClassE2(DerivedUnderClassE2 valueRef) throws Exception {
		delete(valueRef);
	}

	public List<DerivedUnderClassE2> GetAllDerivedUnderClassE2() throws Exception {
		return getAllInstances(RstPackage.Literals.DERIVED_UNDER_CLASS_E2);
	}
	
}