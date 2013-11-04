

package au.com.smartservicescrc.raas_small_test.jaxws;
 
import javax.jws.WebParam;
import javax.jws.WebService;
import javax.ws.rs.*;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import au.com.smartservicescrc.raas_small_test.jaxb.TopClassBRefAdapter;
import au.com.smartservicescrc.raas_small_test.jaxb.UnderClassERefAdapter;
import au.com.smartservicescrc.raas_small_test.jaxb.DerivedUnderClassE1RefAdapter;
import au.com.smartservicescrc.raas_small_test.jaxb.DerivedUnderClassE2RefAdapter;
import au.com.smartservicescrc.raas_small_test.jaxb.TopClassMRefAdapter;
import au.com.smartservicescrc.raas_small_test.jaxb.MergingE1AndE2RefAdapter;

import au.com.smartservicescrc.raas_small_test.DerivedUnderClassE1;
import au.com.smartservicescrc.raas_small_test.DerivedUnderClassE2;
import au.com.smartservicescrc.raas_small_test.MergingE1AndE2;
import au.com.smartservicescrc.raas_small_test.RstPackage;
import au.com.smartservicescrc.raas_small_test.TopClassB;
import au.com.smartservicescrc.raas_small_test.TopClassM;
import au.com.smartservicescrc.raas_small_test.UnderClassE;

import java.util.List;

@Path("/TopClassB")
@WebService
public interface TopClassBRepository {
  
	// RepositoryRoot operations

	@GET
	@Path("/GetraasRef/{id}")
	@Produces({"application/xml", "application/json"})
	String GetraasRef(@WebParam(name="TopClassB_ROOTID") @PathParam("id") @XmlJavaTypeAdapter(TopClassBRefAdapter.class) TopClassB TopClassB_ROOTID) throws Exception;

	@PUT
	@Path("/SetraasRef/{id}/{value:[^/]*}")
	@Produces({"application/xml", "application/json"})
	@Consumes({"application/xml", "application/json"})
	void SetraasRef(@WebParam(name="TopClassB_ROOTID") @PathParam("id") @XmlJavaTypeAdapter(TopClassBRefAdapter.class) TopClassB TopClassB_ROOTID, @WebParam(name="String_VALUE") @PathParam("value") String String_VALUE) throws Exception;

	@GET
	@Path("/Getmulti2lowerAttrInt/{id}")
	@Produces({"application/xml", "application/json"})
	List<Integer> Getmulti2lowerAttrInt(@WebParam(name="TopClassB_ROOTID") @PathParam("id") @XmlJavaTypeAdapter(TopClassBRefAdapter.class) TopClassB TopClassB_ROOTID) throws Exception;

	@PUT
	@Path("/Setmulti2lowerAttrInt/{id}/{value:[^/]*}")
	@Produces({"application/xml", "application/json"})
	@Consumes({"application/xml", "application/json"})
	void Setmulti2lowerAttrInt(@WebParam(name="TopClassB_ROOTID") @PathParam("id") @XmlJavaTypeAdapter(TopClassBRefAdapter.class) TopClassB TopClassB_ROOTID, @WebParam(name="Integer_VALUE") @PathParam("value") List<Integer> Integer_VALUE) throws Exception;

	@GET
	@Path("/GetsingleAttrInt/{id}")
	@Produces({"application/xml", "application/json"})
	int GetsingleAttrInt(@WebParam(name="TopClassB_ROOTID") @PathParam("id") @XmlJavaTypeAdapter(TopClassBRefAdapter.class) TopClassB TopClassB_ROOTID) throws Exception;

	@PUT
	@Path("/SetsingleAttrInt/{id}/{value:[^/]*}")
	@Produces({"application/xml", "application/json"})
	@Consumes({"application/xml", "application/json"})
	void SetsingleAttrInt(@WebParam(name="TopClassB_ROOTID") @PathParam("id") @XmlJavaTypeAdapter(TopClassBRefAdapter.class) TopClassB TopClassB_ROOTID, @WebParam(name="Integer_VALUE") @PathParam("value") int Integer_VALUE) throws Exception;

	@GET
	@Path("/GetoptionalAttrInt/{id}")
	@Produces({"application/xml", "application/json"})
	int GetoptionalAttrInt(@WebParam(name="TopClassB_ROOTID") @PathParam("id") @XmlJavaTypeAdapter(TopClassBRefAdapter.class) TopClassB TopClassB_ROOTID) throws Exception;

	@PUT
	@Path("/SetoptionalAttrInt/{id}/{value:[^/]*}")
	@Produces({"application/xml", "application/json"})
	@Consumes({"application/xml", "application/json"})
	void SetoptionalAttrInt(@WebParam(name="TopClassB_ROOTID") @PathParam("id") @XmlJavaTypeAdapter(TopClassBRefAdapter.class) TopClassB TopClassB_ROOTID, @WebParam(name="Integer_VALUE") @PathParam("value") int Integer_VALUE) throws Exception;

	@GET
	@Path("/GetmultiRefClassE/{id}")
	@Produces({"application/xml", "application/json"})
	List<UnderClassE> GetmultiRefClassE(@WebParam(name="TopClassB_ROOTID") @PathParam("id") @XmlJavaTypeAdapter(TopClassBRefAdapter.class) TopClassB TopClassB_ROOTID) throws Exception;

	@PUT
	@Path("/SetmultiRefClassE/{id}")
	@Produces({"application/xml", "application/json"})
	@Consumes({"application/xml", "application/json"})
	void SetmultiRefClassE(@WebParam(name="TopClassB_ROOTID") @PathParam("id") @XmlJavaTypeAdapter(TopClassBRefAdapter.class) TopClassB TopClassB_ROOTID, @WebParam(name="UnderClassE_ID")  @XmlJavaTypeAdapter(UnderClassERefAdapter.class) List<UnderClassE> UnderClassE_ID) throws Exception;

	// CRUD operations for TopClassB

	@POST
	@Path("/CreateTopClassB")
	@Produces({"application/xml", "application/json"})
	@Consumes({"application/xml", "application/json"})
	@XmlJavaTypeAdapter(TopClassBRefAdapter.class)
	TopClassB CreateTopClassB(@WebParam(name="TopClassB_VALUE") TopClassB TopClassB_VALUE) throws Exception;

	@GET
	@Path("/GetTopClassB/{id}")
	@Produces({"application/xml", "application/json"})
	TopClassB GetTopClassB(@WebParam(name="TopClassB_ID") @PathParam("id") @XmlJavaTypeAdapter(TopClassBRefAdapter.class) TopClassB TopClassB_ID) throws Exception;

	@PUT
	@Path("/UpdateTopClassB/{id}")
	@Consumes({"application/xml", "application/json"})
	void UpdateTopClassB(@WebParam(name="TopClassB_ID") @PathParam("id") @XmlJavaTypeAdapter(TopClassBRefAdapter.class) TopClassB TopClassB_ID, @WebParam(name="TopClassB_VALUE") TopClassB TopClassB_VALUE) throws Exception;

	@DELETE
	@Path("/DeleteTopClassB/{id}")
	void DeleteTopClassB(@WebParam(name="TopClassB_ID") @PathParam("id") @XmlJavaTypeAdapter(TopClassBRefAdapter.class) TopClassB TopClassB_ID) throws Exception;

	@GET
	@Path("/GetAllTopClassB")
	@Produces({"application/xml", "application/json"})
	List<TopClassB> GetAllTopClassB() throws Exception;
	
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