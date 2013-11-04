

package au.com.smartservicescrc.raas_small_test.jaxws;
 
import javax.jws.WebParam;
import javax.jws.WebService;
import javax.ws.rs.*;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import au.com.smartservicescrc.raas_small_test.jaxb.TopClassARefAdapter;
import au.com.smartservicescrc.raas_small_test.jaxb.UnderClassERefAdapter;
import au.com.smartservicescrc.raas_small_test.jaxb.UnderClassFRefAdapter;
import au.com.smartservicescrc.raas_small_test.jaxb.DerivedUnderClassE1RefAdapter;
import au.com.smartservicescrc.raas_small_test.jaxb.DerivedUnderClassE2RefAdapter;
import au.com.smartservicescrc.raas_small_test.jaxb.TopClassMRefAdapter;
import au.com.smartservicescrc.raas_small_test.jaxb.MergingE1AndE2RefAdapter;

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
@WebService
public interface TopClassARepository {
  
	// RepositoryRoot operations

	@GET
	@Path("/GetraasRef/{id}")
	@Produces({"application/xml", "application/json"})
	String GetraasRef(@WebParam(name="TopClassA_ROOTID") @PathParam("id") @XmlJavaTypeAdapter(TopClassARefAdapter.class) TopClassA TopClassA_ROOTID) throws Exception;

	@PUT
	@Path("/SetraasRef/{id}/{value:[^/]*}")
	@Produces({"application/xml", "application/json"})
	@Consumes({"application/xml", "application/json"})
	void SetraasRef(@WebParam(name="TopClassA_ROOTID") @PathParam("id") @XmlJavaTypeAdapter(TopClassARefAdapter.class) TopClassA TopClassA_ROOTID, @WebParam(name="String_VALUE") @PathParam("value") String String_VALUE) throws Exception;

	@GET
	@Path("/GetmultiContainClassE/{id}")
	@Produces({"application/xml", "application/json"})
	List<UnderClassE> GetmultiContainClassE(@WebParam(name="TopClassA_ROOTID") @PathParam("id") @XmlJavaTypeAdapter(TopClassARefAdapter.class) TopClassA TopClassA_ROOTID) throws Exception;

	@PUT
	@Path("/SetmultiContainClassE/{id}")
	@Produces({"application/xml", "application/json"})
	@Consumes({"application/xml", "application/json"})
	void SetmultiContainClassE(@WebParam(name="TopClassA_ROOTID") @PathParam("id") @XmlJavaTypeAdapter(TopClassARefAdapter.class) TopClassA TopClassA_ROOTID, @WebParam(name="UnderClassE_ID")  @XmlJavaTypeAdapter(UnderClassERefAdapter.class) List<UnderClassE> UnderClassE_ID) throws Exception;

	@GET
	@Path("/GetsingleContainClassF/{id}")
	@Produces({"application/xml", "application/json"})
	UnderClassF GetsingleContainClassF(@WebParam(name="TopClassA_ROOTID") @PathParam("id") @XmlJavaTypeAdapter(TopClassARefAdapter.class) TopClassA TopClassA_ROOTID) throws Exception;

	@PUT
	@Path("/SetsingleContainClassF/{id}")
	@Produces({"application/xml", "application/json"})
	@Consumes({"application/xml", "application/json"})
	void SetsingleContainClassF(@WebParam(name="TopClassA_ROOTID") @PathParam("id") @XmlJavaTypeAdapter(TopClassARefAdapter.class) TopClassA TopClassA_ROOTID, @WebParam(name="UnderClassF_ID")  @XmlJavaTypeAdapter(UnderClassFRefAdapter.class) UnderClassF UnderClassF_ID) throws Exception;

	// CRUD operations for TopClassA

	@POST
	@Path("/CreateTopClassA")
	@Produces({"application/xml", "application/json"})
	@Consumes({"application/xml", "application/json"})
	@XmlJavaTypeAdapter(TopClassARefAdapter.class)
	TopClassA CreateTopClassA(@WebParam(name="TopClassA_VALUE") TopClassA TopClassA_VALUE) throws Exception;

	@GET
	@Path("/GetTopClassA/{id}")
	@Produces({"application/xml", "application/json"})
	TopClassA GetTopClassA(@WebParam(name="TopClassA_ID") @PathParam("id") @XmlJavaTypeAdapter(TopClassARefAdapter.class) TopClassA TopClassA_ID) throws Exception;

	@PUT
	@Path("/UpdateTopClassA/{id}")
	@Consumes({"application/xml", "application/json"})
	void UpdateTopClassA(@WebParam(name="TopClassA_ID") @PathParam("id") @XmlJavaTypeAdapter(TopClassARefAdapter.class) TopClassA TopClassA_ID, @WebParam(name="TopClassA_VALUE") TopClassA TopClassA_VALUE) throws Exception;

	@DELETE
	@Path("/DeleteTopClassA/{id}")
	void DeleteTopClassA(@WebParam(name="TopClassA_ID") @PathParam("id") @XmlJavaTypeAdapter(TopClassARefAdapter.class) TopClassA TopClassA_ID) throws Exception;

	@GET
	@Path("/GetAllTopClassA")
	@Produces({"application/xml", "application/json"})
	List<TopClassA> GetAllTopClassA() throws Exception;
	
	// CRUD operations for UnderClassE

	@POST
	@Path("/CreateUnderClassE")
	@Produces({"application/xml", "application/json"})
	@Consumes({"application/xml", "application/json"})
	@XmlJavaTypeAdapter(UnderClassERefAdapter.class)
	UnderClassE CreateUnderClassE(@WebParam(name="UnderClassE_VALUE") UnderClassE UnderClassE_VALUE) throws Exception;

	@GET
	@Path("/GetUnderClassE/{id}")
	@Produces({"application/xml", "application/json"})
	UnderClassE GetUnderClassE(@WebParam(name="UnderClassE_ID") @PathParam("id") @XmlJavaTypeAdapter(UnderClassERefAdapter.class) UnderClassE UnderClassE_ID) throws Exception;

	@PUT
	@Path("/UpdateUnderClassE/{id}")
	@Consumes({"application/xml", "application/json"})
	void UpdateUnderClassE(@WebParam(name="UnderClassE_ID") @PathParam("id") @XmlJavaTypeAdapter(UnderClassERefAdapter.class) UnderClassE UnderClassE_ID, @WebParam(name="UnderClassE_VALUE") UnderClassE UnderClassE_VALUE) throws Exception;

	@DELETE
	@Path("/DeleteUnderClassE/{id}")
	void DeleteUnderClassE(@WebParam(name="UnderClassE_ID") @PathParam("id") @XmlJavaTypeAdapter(UnderClassERefAdapter.class) UnderClassE UnderClassE_ID) throws Exception;

	@GET
	@Path("/GetAllUnderClassE")
	@Produces({"application/xml", "application/json"})
	List<UnderClassE> GetAllUnderClassE() throws Exception;
	
	// CRUD operations for UnderClassF

	@POST
	@Path("/CreateUnderClassF")
	@Produces({"application/xml", "application/json"})
	@Consumes({"application/xml", "application/json"})
	@XmlJavaTypeAdapter(UnderClassFRefAdapter.class)
	UnderClassF CreateUnderClassF(@WebParam(name="UnderClassF_VALUE") UnderClassF UnderClassF_VALUE) throws Exception;

	@GET
	@Path("/GetUnderClassF/{id}")
	@Produces({"application/xml", "application/json"})
	UnderClassF GetUnderClassF(@WebParam(name="UnderClassF_ID") @PathParam("id") @XmlJavaTypeAdapter(UnderClassFRefAdapter.class) UnderClassF UnderClassF_ID) throws Exception;

	@PUT
	@Path("/UpdateUnderClassF/{id}")
	@Consumes({"application/xml", "application/json"})
	void UpdateUnderClassF(@WebParam(name="UnderClassF_ID") @PathParam("id") @XmlJavaTypeAdapter(UnderClassFRefAdapter.class) UnderClassF UnderClassF_ID, @WebParam(name="UnderClassF_VALUE") UnderClassF UnderClassF_VALUE) throws Exception;

	@DELETE
	@Path("/DeleteUnderClassF/{id}")
	void DeleteUnderClassF(@WebParam(name="UnderClassF_ID") @PathParam("id") @XmlJavaTypeAdapter(UnderClassFRefAdapter.class) UnderClassF UnderClassF_ID) throws Exception;

	@GET
	@Path("/GetAllUnderClassF")
	@Produces({"application/xml", "application/json"})
	List<UnderClassF> GetAllUnderClassF() throws Exception;
	
	// CRUD operations for DerivedUnderClassE1

	@POST
	@Path("/CreateDerivedUnderClassE1")
	@Produces({"application/xml", "application/json"})
	@Consumes({"application/xml", "application/json"})
	@XmlJavaTypeAdapter(DerivedUnderClassE1RefAdapter.class)
	DerivedUnderClassE1 CreateDerivedUnderClassE1(@WebParam(name="DerivedUnderClassE1_VALUE") DerivedUnderClassE1 DerivedUnderClassE1_VALUE) throws Exception;

	@GET
	@Path("/GetDerivedUnderClassE1/{id}")
	@Produces({"application/xml", "application/json"})
	DerivedUnderClassE1 GetDerivedUnderClassE1(@WebParam(name="DerivedUnderClassE1_ID") @PathParam("id") @XmlJavaTypeAdapter(DerivedUnderClassE1RefAdapter.class) DerivedUnderClassE1 DerivedUnderClassE1_ID) throws Exception;

	@PUT
	@Path("/UpdateDerivedUnderClassE1/{id}")
	@Consumes({"application/xml", "application/json"})
	void UpdateDerivedUnderClassE1(@WebParam(name="DerivedUnderClassE1_ID") @PathParam("id") @XmlJavaTypeAdapter(DerivedUnderClassE1RefAdapter.class) DerivedUnderClassE1 DerivedUnderClassE1_ID, @WebParam(name="DerivedUnderClassE1_VALUE") DerivedUnderClassE1 DerivedUnderClassE1_VALUE) throws Exception;

	@DELETE
	@Path("/DeleteDerivedUnderClassE1/{id}")
	void DeleteDerivedUnderClassE1(@WebParam(name="DerivedUnderClassE1_ID") @PathParam("id") @XmlJavaTypeAdapter(DerivedUnderClassE1RefAdapter.class) DerivedUnderClassE1 DerivedUnderClassE1_ID) throws Exception;

	@GET
	@Path("/GetAllDerivedUnderClassE1")
	@Produces({"application/xml", "application/json"})
	List<DerivedUnderClassE1> GetAllDerivedUnderClassE1() throws Exception;
	
	// CRUD operations for DerivedUnderClassE2

	@POST
	@Path("/CreateDerivedUnderClassE2")
	@Produces({"application/xml", "application/json"})
	@Consumes({"application/xml", "application/json"})
	@XmlJavaTypeAdapter(DerivedUnderClassE2RefAdapter.class)
	DerivedUnderClassE2 CreateDerivedUnderClassE2(@WebParam(name="DerivedUnderClassE2_VALUE") DerivedUnderClassE2 DerivedUnderClassE2_VALUE) throws Exception;

	@GET
	@Path("/GetDerivedUnderClassE2/{id}")
	@Produces({"application/xml", "application/json"})
	DerivedUnderClassE2 GetDerivedUnderClassE2(@WebParam(name="DerivedUnderClassE2_ID") @PathParam("id") @XmlJavaTypeAdapter(DerivedUnderClassE2RefAdapter.class) DerivedUnderClassE2 DerivedUnderClassE2_ID) throws Exception;

	@PUT
	@Path("/UpdateDerivedUnderClassE2/{id}")
	@Consumes({"application/xml", "application/json"})
	void UpdateDerivedUnderClassE2(@WebParam(name="DerivedUnderClassE2_ID") @PathParam("id") @XmlJavaTypeAdapter(DerivedUnderClassE2RefAdapter.class) DerivedUnderClassE2 DerivedUnderClassE2_ID, @WebParam(name="DerivedUnderClassE2_VALUE") DerivedUnderClassE2 DerivedUnderClassE2_VALUE) throws Exception;

	@DELETE
	@Path("/DeleteDerivedUnderClassE2/{id}")
	void DeleteDerivedUnderClassE2(@WebParam(name="DerivedUnderClassE2_ID") @PathParam("id") @XmlJavaTypeAdapter(DerivedUnderClassE2RefAdapter.class) DerivedUnderClassE2 DerivedUnderClassE2_ID) throws Exception;

	@GET
	@Path("/GetAllDerivedUnderClassE2")
	@Produces({"application/xml", "application/json"})
	List<DerivedUnderClassE2> GetAllDerivedUnderClassE2() throws Exception;
	
	// CRUD operations for TopClassM

	@POST
	@Path("/CreateTopClassM")
	@Produces({"application/xml", "application/json"})
	@Consumes({"application/xml", "application/json"})
	@XmlJavaTypeAdapter(TopClassMRefAdapter.class)
	TopClassM CreateTopClassM(@WebParam(name="TopClassM_VALUE") TopClassM TopClassM_VALUE) throws Exception;

	@GET
	@Path("/GetTopClassM/{id}")
	@Produces({"application/xml", "application/json"})
	TopClassM GetTopClassM(@WebParam(name="TopClassM_ID") @PathParam("id") @XmlJavaTypeAdapter(TopClassMRefAdapter.class) TopClassM TopClassM_ID) throws Exception;

	@PUT
	@Path("/UpdateTopClassM/{id}")
	@Consumes({"application/xml", "application/json"})
	void UpdateTopClassM(@WebParam(name="TopClassM_ID") @PathParam("id") @XmlJavaTypeAdapter(TopClassMRefAdapter.class) TopClassM TopClassM_ID, @WebParam(name="TopClassM_VALUE") TopClassM TopClassM_VALUE) throws Exception;

	@DELETE
	@Path("/DeleteTopClassM/{id}")
	void DeleteTopClassM(@WebParam(name="TopClassM_ID") @PathParam("id") @XmlJavaTypeAdapter(TopClassMRefAdapter.class) TopClassM TopClassM_ID) throws Exception;

	@GET
	@Path("/GetAllTopClassM")
	@Produces({"application/xml", "application/json"})
	List<TopClassM> GetAllTopClassM() throws Exception;
	
	// CRUD operations for MergingE1AndE2

	@POST
	@Path("/CreateMergingE1AndE2")
	@Produces({"application/xml", "application/json"})
	@Consumes({"application/xml", "application/json"})
	@XmlJavaTypeAdapter(MergingE1AndE2RefAdapter.class)
	MergingE1AndE2 CreateMergingE1AndE2(@WebParam(name="MergingE1AndE2_VALUE") MergingE1AndE2 MergingE1AndE2_VALUE) throws Exception;

	@GET
	@Path("/GetMergingE1AndE2/{id}")
	@Produces({"application/xml", "application/json"})
	MergingE1AndE2 GetMergingE1AndE2(@WebParam(name="MergingE1AndE2_ID") @PathParam("id") @XmlJavaTypeAdapter(MergingE1AndE2RefAdapter.class) MergingE1AndE2 MergingE1AndE2_ID) throws Exception;

	@PUT
	@Path("/UpdateMergingE1AndE2/{id}")
	@Consumes({"application/xml", "application/json"})
	void UpdateMergingE1AndE2(@WebParam(name="MergingE1AndE2_ID") @PathParam("id") @XmlJavaTypeAdapter(MergingE1AndE2RefAdapter.class) MergingE1AndE2 MergingE1AndE2_ID, @WebParam(name="MergingE1AndE2_VALUE") MergingE1AndE2 MergingE1AndE2_VALUE) throws Exception;

	@DELETE
	@Path("/DeleteMergingE1AndE2/{id}")
	void DeleteMergingE1AndE2(@WebParam(name="MergingE1AndE2_ID") @PathParam("id") @XmlJavaTypeAdapter(MergingE1AndE2RefAdapter.class) MergingE1AndE2 MergingE1AndE2_ID) throws Exception;

	@GET
	@Path("/GetAllMergingE1AndE2")
	@Produces({"application/xml", "application/json"})
	List<MergingE1AndE2> GetAllMergingE1AndE2() throws Exception;
	
}