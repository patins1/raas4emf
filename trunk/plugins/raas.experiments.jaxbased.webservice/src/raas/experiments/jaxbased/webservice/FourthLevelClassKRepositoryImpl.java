

package raas.experiments.jaxbased.webservice;
 
import javax.jws.WebService;
import javax.ws.rs.Path;

import au.com.smartservicescrc.raas_small_test.FourthLevelClassK;
import au.com.smartservicescrc.raas_small_test.RstPackage;

import java.util.List;

@Path("/FourthLevelClassK")
@WebService(endpointInterface = "au.com.smartservicescrc.raas_small_test.jaxws.FourthLevelClassKRepository", serviceName = "FourthLevelClassKRepository")
public class FourthLevelClassKRepositoryImpl extends raas.experiments.jaxbased.webservice.raas.WebserviceRepository implements au.com.smartservicescrc.raas_small_test.jaxws.FourthLevelClassKRepository {
 
 	public FourthLevelClassKRepositoryImpl() throws Exception {
		super(RstPackage.eINSTANCE);
	}
 
	// RepositoryRoot operations

	public String GetraasRef(FourthLevelClassK rootRef) throws Exception {
		return getter(rootRef,RstPackage.eINSTANCE.getFourthLevelClassK_RaasRef());
	}

	public void SetraasRef(FourthLevelClassK rootRef, String valuesRef) throws Exception {
		setter(rootRef,RstPackage.eINSTANCE.getFourthLevelClassK_RaasRef(),valuesRef);
	}

	public List<Integer> Getmulti2lowerAttrInt(FourthLevelClassK rootRef) throws Exception {
		return getter(rootRef,RstPackage.eINSTANCE.getFourthLevelClassK_Multi2lowerAttrInt());
	}

	public void Setmulti2lowerAttrInt(FourthLevelClassK rootRef, List<Integer> valuesRef) throws Exception {
		setter(rootRef,RstPackage.eINSTANCE.getFourthLevelClassK_Multi2lowerAttrInt(),valuesRef);
	}

	public int GetsingleAttrInt(FourthLevelClassK rootRef) throws Exception {
		return getter(rootRef,RstPackage.eINSTANCE.getFourthLevelClassK_SingleAttrInt());
	}

	public void SetsingleAttrInt(FourthLevelClassK rootRef, int valuesRef) throws Exception {
		setter(rootRef,RstPackage.eINSTANCE.getFourthLevelClassK_SingleAttrInt(),valuesRef);
	}

	public int GetoptionalAttrInt(FourthLevelClassK rootRef) throws Exception {
		return getter(rootRef,RstPackage.eINSTANCE.getFourthLevelClassK_OptionalAttrInt());
	}

	public void SetoptionalAttrInt(FourthLevelClassK rootRef, int valuesRef) throws Exception {
		setter(rootRef,RstPackage.eINSTANCE.getFourthLevelClassK_OptionalAttrInt(),valuesRef);
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