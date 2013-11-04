

package raas.experiments.jaxbased.webservice;
 
import javax.jws.WebService;
import javax.ws.rs.Path;

import au.com.smartservicescrc.raas_small_test.FourthLevelClassK;
import au.com.smartservicescrc.raas_small_test.RstPackage;
import au.com.smartservicescrc.raas_small_test.ThirdLevelClassJ;

import java.util.List;

@Path("/ThirdLevelClassJ")
@WebService(endpointInterface = "au.com.smartservicescrc.raas_small_test.jaxws.ThirdLevelClassJRepository", serviceName = "ThirdLevelClassJRepository")
public class ThirdLevelClassJRepositoryImpl extends raas.experiments.jaxbased.webservice.raas.WebserviceRepository implements au.com.smartservicescrc.raas_small_test.jaxws.ThirdLevelClassJRepository {
 
 	public ThirdLevelClassJRepositoryImpl() throws Exception {
		super(RstPackage.eINSTANCE);
	}
 
	// RepositoryRoot operations

	public String GetraasRef(ThirdLevelClassJ rootRef) throws Exception {
		return getter(rootRef,RstPackage.eINSTANCE.getThirdLevelClassJ_RaasRef());
	}

	public void SetraasRef(ThirdLevelClassJ rootRef, String valuesRef) throws Exception {
		setter(rootRef,RstPackage.eINSTANCE.getThirdLevelClassJ_RaasRef(),valuesRef);
	}

	public List<Integer> Getmulti2lowerAttrInt(ThirdLevelClassJ rootRef) throws Exception {
		return getter(rootRef,RstPackage.eINSTANCE.getThirdLevelClassJ_Multi2lowerAttrInt());
	}

	public void Setmulti2lowerAttrInt(ThirdLevelClassJ rootRef, List<Integer> valuesRef) throws Exception {
		setter(rootRef,RstPackage.eINSTANCE.getThirdLevelClassJ_Multi2lowerAttrInt(),valuesRef);
	}

	public int GetsingleAttrInt(ThirdLevelClassJ rootRef) throws Exception {
		return getter(rootRef,RstPackage.eINSTANCE.getThirdLevelClassJ_SingleAttrInt());
	}

	public void SetsingleAttrInt(ThirdLevelClassJ rootRef, int valuesRef) throws Exception {
		setter(rootRef,RstPackage.eINSTANCE.getThirdLevelClassJ_SingleAttrInt(),valuesRef);
	}

	public int GetoptionalAttrInt(ThirdLevelClassJ rootRef) throws Exception {
		return getter(rootRef,RstPackage.eINSTANCE.getThirdLevelClassJ_OptionalAttrInt());
	}

	public void SetoptionalAttrInt(ThirdLevelClassJ rootRef, int valuesRef) throws Exception {
		setter(rootRef,RstPackage.eINSTANCE.getThirdLevelClassJ_OptionalAttrInt(),valuesRef);
	}

	public FourthLevelClassK GetoptionalContainClassK(ThirdLevelClassJ rootRef) throws Exception {
		return getter(rootRef,RstPackage.eINSTANCE.getThirdLevelClassJ_OptionalContainClassK());
	}

	public void SetoptionalContainClassK(ThirdLevelClassJ rootRef, FourthLevelClassK valuesRef) throws Exception {
		setter(rootRef,RstPackage.eINSTANCE.getThirdLevelClassJ_OptionalContainClassK(),valuesRef);
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
	
	// CRUD operations for FourthLevelClassK

	public FourthLevelClassK CreateFourthLevelClassK(FourthLevelClassK value) throws Exception {
		return create(value);
	}

	public FourthLevelClassK GetFourthLevelClassK(FourthLevelClassK valueRef) throws Exception {
		return get(valueRef);
	}

	public void UpdateFourthLevelClassK(FourthLevelClassK valueRef, FourthLevelClassK value) throws Exception {
		update(valueRef, value);
	}

	public void DeleteFourthLevelClassK(FourthLevelClassK valueRef) throws Exception {
		delete(valueRef);
	}

	public List<FourthLevelClassK> GetAllFourthLevelClassK() throws Exception {
		return getAllInstances(RstPackage.Literals.FOURTH_LEVEL_CLASS_K);
	}
	
}