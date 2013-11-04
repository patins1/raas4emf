

package raas.experiments.jaxbased.webservice;
 
import javax.jws.WebService;
import javax.ws.rs.Path;

import au.com.smartservicescrc.raas_small_test.RstPackage;
import au.com.smartservicescrc.raas_small_test.TopClassC;
import au.com.smartservicescrc.raas_small_test.UnderClassF;

import java.util.List;

@Path("/TopClassC")
@WebService(endpointInterface = "au.com.smartservicescrc.raas_small_test.jaxws.TopClassCRepository", serviceName = "TopClassCRepository")
public class TopClassCRepositoryImpl extends raas.experiments.jaxbased.webservice.raas.WebserviceRepository implements au.com.smartservicescrc.raas_small_test.jaxws.TopClassCRepository {
 
 	public TopClassCRepositoryImpl() throws Exception {
		super(RstPackage.eINSTANCE);
	}
 
	// RepositoryRoot operations

	public String GetraasRef(TopClassC rootRef) throws Exception {
		return getter(rootRef,RstPackage.eINSTANCE.getTopClassC_RaasRef());
	}

	public void SetraasRef(TopClassC rootRef, String valuesRef) throws Exception {
		setter(rootRef,RstPackage.eINSTANCE.getTopClassC_RaasRef(),valuesRef);
	}

	public List<Integer> Getmulti2lowerAttrInt(TopClassC rootRef) throws Exception {
		return getter(rootRef,RstPackage.eINSTANCE.getTopClassC_Multi2lowerAttrInt());
	}

	public void Setmulti2lowerAttrInt(TopClassC rootRef, List<Integer> valuesRef) throws Exception {
		setter(rootRef,RstPackage.eINSTANCE.getTopClassC_Multi2lowerAttrInt(),valuesRef);
	}

	public int GetsingleAttrInt(TopClassC rootRef) throws Exception {
		return getter(rootRef,RstPackage.eINSTANCE.getTopClassC_SingleAttrInt());
	}

	public void SetsingleAttrInt(TopClassC rootRef, int valuesRef) throws Exception {
		setter(rootRef,RstPackage.eINSTANCE.getTopClassC_SingleAttrInt(),valuesRef);
	}

	public int GetoptionalAttrInt(TopClassC rootRef) throws Exception {
		return getter(rootRef,RstPackage.eINSTANCE.getTopClassC_OptionalAttrInt());
	}

	public void SetoptionalAttrInt(TopClassC rootRef, int valuesRef) throws Exception {
		setter(rootRef,RstPackage.eINSTANCE.getTopClassC_OptionalAttrInt(),valuesRef);
	}

	public UnderClassF GetsingleContainClassF(TopClassC rootRef) throws Exception {
		return getter(rootRef,RstPackage.eINSTANCE.getTopClassC_SingleContainClassF());
	}

	public void SetsingleContainClassF(TopClassC rootRef, UnderClassF valuesRef) throws Exception {
		setter(rootRef,RstPackage.eINSTANCE.getTopClassC_SingleContainClassF(),valuesRef);
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