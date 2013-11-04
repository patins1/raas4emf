

package raas.experiments.jaxbased.webservice;
 
import javax.jws.WebService;
import javax.ws.rs.Path;

import au.com.smartservicescrc.raas_small_test.ReposRoot;
import au.com.smartservicescrc.raas_small_test.RstPackage;
import au.com.smartservicescrc.raas_small_test.TopClassA;
import au.com.smartservicescrc.raas_small_test.TopClassB;
import au.com.smartservicescrc.raas_small_test.TopClassC;
import au.com.smartservicescrc.raas_small_test.TopClassD;
import au.com.smartservicescrc.raas_small_test.TopClassM;

import java.util.List;

@Path("/ReposRoot")
@WebService(endpointInterface = "au.com.smartservicescrc.raas_small_test.jaxws.ReposRootRepository", serviceName = "ReposRootRepository")
public class ReposRootRepositoryImpl extends raas.experiments.jaxbased.webservice.raas.WebserviceRepository implements au.com.smartservicescrc.raas_small_test.jaxws.ReposRootRepository {
 
 	public ReposRootRepositoryImpl() throws Exception {
		super(RstPackage.eINSTANCE);
	}
 
	// RepositoryRoot operations

	public String GetraasRef(ReposRoot rootRef) throws Exception {
		return getter(rootRef,RstPackage.eINSTANCE.getReposRoot_RaasRef());
	}

	public void SetraasRef(ReposRoot rootRef, String valuesRef) throws Exception {
		setter(rootRef,RstPackage.eINSTANCE.getReposRoot_RaasRef(),valuesRef);
	}

	public String GetsingleAttrString(ReposRoot rootRef) throws Exception {
		return getter(rootRef,RstPackage.eINSTANCE.getReposRoot_SingleAttrString());
	}

	public void SetsingleAttrString(ReposRoot rootRef, String valuesRef) throws Exception {
		setter(rootRef,RstPackage.eINSTANCE.getReposRoot_SingleAttrString(),valuesRef);
	}

	public List<TopClassA> GetmultiContainClassA(ReposRoot rootRef) throws Exception {
		return getter(rootRef,RstPackage.eINSTANCE.getReposRoot_MultiContainClassA());
	}

	public void SetmultiContainClassA(ReposRoot rootRef, List<TopClassA> valuesRef) throws Exception {
		setter(rootRef,RstPackage.eINSTANCE.getReposRoot_MultiContainClassA(),valuesRef);
	}

	public TopClassB GetoptionalContainClassB(ReposRoot rootRef) throws Exception {
		return getter(rootRef,RstPackage.eINSTANCE.getReposRoot_OptionalContainClassB());
	}

	public void SetoptionalContainClassB(ReposRoot rootRef, TopClassB valuesRef) throws Exception {
		setter(rootRef,RstPackage.eINSTANCE.getReposRoot_OptionalContainClassB(),valuesRef);
	}

	public TopClassC GetsingleContainClassC(ReposRoot rootRef) throws Exception {
		return getter(rootRef,RstPackage.eINSTANCE.getReposRoot_SingleContainClassC());
	}

	public void SetsingleContainClassC(ReposRoot rootRef, TopClassC valuesRef) throws Exception {
		setter(rootRef,RstPackage.eINSTANCE.getReposRoot_SingleContainClassC(),valuesRef);
	}

	public List<TopClassD> GetmultiRefClassD(ReposRoot rootRef) throws Exception {
		return getter(rootRef,RstPackage.eINSTANCE.getReposRoot_MultiRefClassD());
	}

	public void SetmultiRefClassD(ReposRoot rootRef, List<TopClassD> valuesRef) throws Exception {
		setter(rootRef,RstPackage.eINSTANCE.getReposRoot_MultiRefClassD(),valuesRef);
	}

	public List<String> GetmultiAttrString(ReposRoot rootRef) throws Exception {
		return getter(rootRef,RstPackage.eINSTANCE.getReposRoot_MultiAttrString());
	}

	public void SetmultiAttrString(ReposRoot rootRef, List<String> valuesRef) throws Exception {
		setter(rootRef,RstPackage.eINSTANCE.getReposRoot_MultiAttrString(),valuesRef);
	}

	public TopClassM GetsingleNonContainClassM(ReposRoot rootRef) throws Exception {
		return getter(rootRef,RstPackage.eINSTANCE.getReposRoot_SingleNonContainClassM());
	}

	public void SetsingleNonContainClassM(ReposRoot rootRef, TopClassM valuesRef) throws Exception {
		setter(rootRef,RstPackage.eINSTANCE.getReposRoot_SingleNonContainClassM(),valuesRef);
	}

	// CRUD operations for ReposRoot

	public ReposRoot CreateReposRoot(ReposRoot value) throws Exception {
		return create(value);
	}

	public ReposRoot GetReposRoot(ReposRoot valueRef) throws Exception {
		return get(valueRef);
	}

	public void UpdateReposRoot(ReposRoot valueRef, ReposRoot value) throws Exception {
		update(valueRef, value);
	}

	public void DeleteReposRoot(ReposRoot valueRef) throws Exception {
		delete(valueRef);
	}

	public List<ReposRoot> GetAllReposRoot() throws Exception {
		return getAllInstances(RstPackage.Literals.REPOS_ROOT);
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
	
	// CRUD operations for TopClassB

	public TopClassB CreateTopClassB(TopClassB value) throws Exception {
		return create(value);
	}

	public TopClassB GetTopClassB(TopClassB valueRef) throws Exception {
		return get(valueRef);
	}

	public void UpdateTopClassB(TopClassB valueRef, TopClassB value) throws Exception {
		update(valueRef, value);
	}

	public void DeleteTopClassB(TopClassB valueRef) throws Exception {
		delete(valueRef);
	}

	public List<TopClassB> GetAllTopClassB() throws Exception {
		return getAllInstances(RstPackage.Literals.TOP_CLASS_B);
	}
	
	// CRUD operations for TopClassC

	public TopClassC CreateTopClassC(TopClassC value) throws Exception {
		return create(value);
	}

	public TopClassC GetTopClassC(TopClassC valueRef) throws Exception {
		return get(valueRef);
	}

	public void UpdateTopClassC(TopClassC valueRef, TopClassC value) throws Exception {
		update(valueRef, value);
	}

	public void DeleteTopClassC(TopClassC valueRef) throws Exception {
		delete(valueRef);
	}

	public List<TopClassC> GetAllTopClassC() throws Exception {
		return getAllInstances(RstPackage.Literals.TOP_CLASS_C);
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