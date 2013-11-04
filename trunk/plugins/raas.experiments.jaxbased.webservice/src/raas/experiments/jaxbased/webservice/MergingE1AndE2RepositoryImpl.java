

package raas.experiments.jaxbased.webservice;
 
import javax.jws.WebService;
import javax.ws.rs.Path;

import au.com.smartservicescrc.raas_small_test.MergingE1AndE2;
import au.com.smartservicescrc.raas_small_test.RstPackage;
import au.com.smartservicescrc.raas_small_test.ThirdLevelClassJ;
import au.com.smartservicescrc.raas_small_test.TopClassD;

import java.util.List;

@Path("/MergingE1AndE2")
@WebService(endpointInterface = "au.com.smartservicescrc.raas_small_test.jaxws.MergingE1AndE2Repository", serviceName = "MergingE1AndE2Repository")
public class MergingE1AndE2RepositoryImpl extends raas.experiments.jaxbased.webservice.raas.WebserviceRepository implements au.com.smartservicescrc.raas_small_test.jaxws.MergingE1AndE2Repository {
 
 	public MergingE1AndE2RepositoryImpl() throws Exception {
		super(RstPackage.eINSTANCE);
	}
 
	// RepositoryRoot operations

	public String GetraasRef(MergingE1AndE2 rootRef) throws Exception {
		return getter(rootRef,RstPackage.eINSTANCE.getUnderClassE_RaasRef());
	}

	public void SetraasRef(MergingE1AndE2 rootRef, String valuesRef) throws Exception {
		setter(rootRef,RstPackage.eINSTANCE.getUnderClassE_RaasRef(),valuesRef);
	}

	public TopClassD GetsingleRefClassD(MergingE1AndE2 rootRef) throws Exception {
		return getter(rootRef,RstPackage.eINSTANCE.getDerivedUnderClassE1_SingleRefClassD());
	}

	public void SetsingleRefClassD(MergingE1AndE2 rootRef, TopClassD valuesRef) throws Exception {
		setter(rootRef,RstPackage.eINSTANCE.getDerivedUnderClassE1_SingleRefClassD(),valuesRef);
	}

	public List<ThirdLevelClassJ> GetmultiContainClassJ(MergingE1AndE2 rootRef) throws Exception {
		return getter(rootRef,RstPackage.eINSTANCE.getDerivedUnderClassE2_MultiContainClassJ());
	}

	public void SetmultiContainClassJ(MergingE1AndE2 rootRef, List<ThirdLevelClassJ> valuesRef) throws Exception {
		setter(rootRef,RstPackage.eINSTANCE.getDerivedUnderClassE2_MultiContainClassJ(),valuesRef);
	}

	public String GetoptionalAttrString(MergingE1AndE2 rootRef) throws Exception {
		return getter(rootRef,RstPackage.eINSTANCE.getMergingE1AndE2_OptionalAttrString());
	}

	public void SetoptionalAttrString(MergingE1AndE2 rootRef, String valuesRef) throws Exception {
		setter(rootRef,RstPackage.eINSTANCE.getMergingE1AndE2_OptionalAttrString(),valuesRef);
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
	
	// CRUD operations for MergingE1AndE2

	public MergingE1AndE2 CreateMergingE1AndE2(MergingE1AndE2 value) throws Exception {
		return create(value);
	}

	public MergingE1AndE2 GetMergingE1AndE2(MergingE1AndE2 valueRef) throws Exception {
		return get(valueRef);
	}

	public void UpdateMergingE1AndE2(MergingE1AndE2 valueRef, MergingE1AndE2 value) throws Exception {
		update(valueRef, value);
	}

	public void DeleteMergingE1AndE2(MergingE1AndE2 valueRef) throws Exception {
		delete(valueRef);
	}

	public List<MergingE1AndE2> GetAllMergingE1AndE2() throws Exception {
		return getAllInstances(RstPackage.Literals.MERGING_E1_AND_E2);
	}
	
}