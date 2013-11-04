

package raas.experiments.jaxbased.webservice;
 
import javax.jws.WebService;
import javax.ws.rs.Path;

import au.com.smartservicescrc.raas_small_test.DerivedUnderClassE1;
import au.com.smartservicescrc.raas_small_test.DerivedUnderClassE2;
import au.com.smartservicescrc.raas_small_test.MergingE1AndE2;
import au.com.smartservicescrc.raas_small_test.RstPackage;
import au.com.smartservicescrc.raas_small_test.TopClassA;
import au.com.smartservicescrc.raas_small_test.TopClassM;
import au.com.smartservicescrc.raas_small_test.UnderClassE;
import au.com.smartservicescrc.raas_small_test.UnderClassF;

import java.util.List;

@Path("/TopClassA")
@WebService(endpointInterface = "au.com.smartservicescrc.raas_small_test.jaxws.TopClassARepository", serviceName = "TopClassARepository")
public class TopClassARepositoryImpl extends raas.experiments.jaxbased.webservice.raas.WebserviceRepository implements au.com.smartservicescrc.raas_small_test.jaxws.TopClassARepository {
 
 	public TopClassARepositoryImpl() throws Exception {
		super(RstPackage.eINSTANCE);
	}
 
	// RepositoryRoot operations

	public String GetraasRef(TopClassA rootRef) throws Exception {
		return getter(rootRef,RstPackage.eINSTANCE.getTopClassA_RaasRef());
	}

	public void SetraasRef(TopClassA rootRef, String valuesRef) throws Exception {
		setter(rootRef,RstPackage.eINSTANCE.getTopClassA_RaasRef(),valuesRef);
	}

	public List<UnderClassE> GetmultiContainClassE(TopClassA rootRef) throws Exception {
		return getter(rootRef,RstPackage.eINSTANCE.getTopClassA_MultiContainClassE());
	}

	public void SetmultiContainClassE(TopClassA rootRef, List<UnderClassE> valuesRef) throws Exception {
		setter(rootRef,RstPackage.eINSTANCE.getTopClassA_MultiContainClassE(),valuesRef);
	}

	public UnderClassF GetsingleContainClassF(TopClassA rootRef) throws Exception {
		return getter(rootRef,RstPackage.eINSTANCE.getTopClassA_SingleContainClassF());
	}

	public void SetsingleContainClassF(TopClassA rootRef, UnderClassF valuesRef) throws Exception {
		setter(rootRef,RstPackage.eINSTANCE.getTopClassA_SingleContainClassF(),valuesRef);
	}

	// CRUD operations for TopClassA

	public TopClassA CreateTopClassA(TopClassA value) throws Exception {
		return create(value);
	}

	public TopClassA GetTopClassA(TopClassA valueRef) throws Exception {
		return get(valueRef);
	}

	public void UpdateTopClassA(TopClassA valueRef, TopClassA value) throws Exception {
		update(valueRef, value);
	}

	public void DeleteTopClassA(TopClassA valueRef) throws Exception {
		delete(valueRef);
	}

	public List<TopClassA> GetAllTopClassA() throws Exception {
		return getAllInstances(RstPackage.Literals.TOP_CLASS_A);
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