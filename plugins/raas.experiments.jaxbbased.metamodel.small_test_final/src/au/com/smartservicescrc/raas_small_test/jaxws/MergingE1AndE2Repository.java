

package au.com.smartservicescrc.raas_small_test.jaxws;
 
import javax.jws.WebParam;
import javax.jws.WebService;
import javax.ws.rs.*;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import au.com.smartservicescrc.raas_small_test.jaxb.TopClassDRefAdapter;
import au.com.smartservicescrc.raas_small_test.jaxb.ThirdLevelClassJRefAdapter;
import au.com.smartservicescrc.raas_small_test.jaxb.MergingE1AndE2RefAdapter;

import au.com.smartservicescrc.raas_small_test.MergingE1AndE2;
import au.com.smartservicescrc.raas_small_test.RstPackage;
import au.com.smartservicescrc.raas_small_test.ThirdLevelClassJ;
import au.com.smartservicescrc.raas_small_test.TopClassD;

import java.util.List;

@Path("/MergingE1AndE2")
@WebService
public interface MergingE1AndE2Repository {
  
	// RepositoryRoot operations

	@GET
	@Path("/GetraasRef/{id}")
	@Produces({"application/xml", "application/json"})
	String GetraasRef(@WebParam(name="MergingE1AndE2_ROOTID") @PathParam("id") @XmlJavaTypeAdapter(MergingE1AndE2RefAdapter.class) MergingE1AndE2 MergingE1AndE2_ROOTID) throws Exception;

	@PUT
	@Path("/SetraasRef/{id}/{value:[^/]*}")
	@Produces({"application/xml", "application/json"})
	@Consumes({"application/xml", "application/json"})
	void SetraasRef(@WebParam(name="MergingE1AndE2_ROOTID") @PathParam("id") @XmlJavaTypeAdapter(MergingE1AndE2RefAdapter.class) MergingE1AndE2 MergingE1AndE2_ROOTID, @WebParam(name="String_VALUE") @PathParam("value") String String_VALUE) throws Exception;

	@GET
	@Path("/GetsingleRefClassD/{id}")
	@Produces({"application/xml", "application/json"})
	TopClassD GetsingleRefClassD(@WebParam(name="MergingE1AndE2_ROOTID") @PathParam("id") @XmlJavaTypeAdapter(MergingE1AndE2RefAdapter.class) MergingE1AndE2 MergingE1AndE2_ROOTID) throws Exception;

	@PUT
	@Path("/SetsingleRefClassD/{id}")
	@Produces({"application/xml", "application/json"})
	@Consumes({"application/xml", "application/json"})
	void SetsingleRefClassD(@WebParam(name="MergingE1AndE2_ROOTID") @PathParam("id") @XmlJavaTypeAdapter(MergingE1AndE2RefAdapter.class) MergingE1AndE2 MergingE1AndE2_ROOTID, @WebParam(name="TopClassD_ID")  @XmlJavaTypeAdapter(TopClassDRefAdapter.class) TopClassD TopClassD_ID) throws Exception;

	@GET
	@Path("/GetmultiContainClassJ/{id}")
	@Produces({"application/xml", "application/json"})
	List<ThirdLevelClassJ> GetmultiContainClassJ(@WebParam(name="MergingE1AndE2_ROOTID") @PathParam("id") @XmlJavaTypeAdapter(MergingE1AndE2RefAdapter.class) MergingE1AndE2 MergingE1AndE2_ROOTID) throws Exception;

	@PUT
	@Path("/SetmultiContainClassJ/{id}")
	@Produces({"application/xml", "application/json"})
	@Consumes({"application/xml", "application/json"})
	void SetmultiContainClassJ(@WebParam(name="MergingE1AndE2_ROOTID") @PathParam("id") @XmlJavaTypeAdapter(MergingE1AndE2RefAdapter.class) MergingE1AndE2 MergingE1AndE2_ROOTID, @WebParam(name="ThirdLevelClassJ_ID")  @XmlJavaTypeAdapter(ThirdLevelClassJRefAdapter.class) List<ThirdLevelClassJ> ThirdLevelClassJ_ID) throws Exception;

	@GET
	@Path("/GetoptionalAttrString/{id}")
	@Produces({"application/xml", "application/json"})
	String GetoptionalAttrString(@WebParam(name="MergingE1AndE2_ROOTID") @PathParam("id") @XmlJavaTypeAdapter(MergingE1AndE2RefAdapter.class) MergingE1AndE2 MergingE1AndE2_ROOTID) throws Exception;

	@PUT
	@Path("/SetoptionalAttrString/{id}/{value:[^/]*}")
	@Produces({"application/xml", "application/json"})
	@Consumes({"application/xml", "application/json"})
	void SetoptionalAttrString(@WebParam(name="MergingE1AndE2_ROOTID") @PathParam("id") @XmlJavaTypeAdapter(MergingE1AndE2RefAdapter.class) MergingE1AndE2 MergingE1AndE2_ROOTID, @WebParam(name="String_VALUE") @PathParam("value") String String_VALUE) throws Exception;

	// CRUD operations for TopClassD

	@POST
	@Path("/CreateTopClassD")
	@Produces({"application/xml", "application/json"})
	@Consumes({"application/xml", "application/json"})
	@XmlJavaTypeAdapter(TopClassDRefAdapter.class)
	TopClassD CreateTopClassD(@WebParam(name="TopClassD_VALUE") TopClassD TopClassD_VALUE) throws Exception;

	@GET
	@Path("/GetTopClassD/{id}")
	@Produces({"application/xml", "application/json"})
	TopClassD GetTopClassD(@WebParam(name="TopClassD_ID") @PathParam("id") @XmlJavaTypeAdapter(TopClassDRefAdapter.class) TopClassD TopClassD_ID) throws Exception;

	@PUT
	@Path("/UpdateTopClassD/{id}")
	@Consumes({"application/xml", "application/json"})
	void UpdateTopClassD(@WebParam(name="TopClassD_ID") @PathParam("id") @XmlJavaTypeAdapter(TopClassDRefAdapter.class) TopClassD TopClassD_ID, @WebParam(name="TopClassD_VALUE") TopClassD TopClassD_VALUE) throws Exception;

	@DELETE
	@Path("/DeleteTopClassD/{id}")
	void DeleteTopClassD(@WebParam(name="TopClassD_ID") @PathParam("id") @XmlJavaTypeAdapter(TopClassDRefAdapter.class) TopClassD TopClassD_ID) throws Exception;

	@GET
	@Path("/GetAllTopClassD")
	@Produces({"application/xml", "application/json"})
	List<TopClassD> GetAllTopClassD() throws Exception;
	
	// CRUD operations for ThirdLevelClassJ

	@POST
	@Path("/CreateThirdLevelClassJ")
	@Produces({"application/xml", "application/json"})
	@Consumes({"application/xml", "application/json"})
	@XmlJavaTypeAdapter(ThirdLevelClassJRefAdapter.class)
	ThirdLevelClassJ CreateThirdLevelClassJ(@WebParam(name="ThirdLevelClassJ_VALUE") ThirdLevelClassJ ThirdLevelClassJ_VALUE) throws Exception;

	@GET
	@Path("/GetThirdLevelClassJ/{id}")
	@Produces({"application/xml", "application/json"})
	ThirdLevelClassJ GetThirdLevelClassJ(@WebParam(name="ThirdLevelClassJ_ID") @PathParam("id") @XmlJavaTypeAdapter(ThirdLevelClassJRefAdapter.class) ThirdLevelClassJ ThirdLevelClassJ_ID) throws Exception;

	@PUT
	@Path("/UpdateThirdLevelClassJ/{id}")
	@Consumes({"application/xml", "application/json"})
	void UpdateThirdLevelClassJ(@WebParam(name="ThirdLevelClassJ_ID") @PathParam("id") @XmlJavaTypeAdapter(ThirdLevelClassJRefAdapter.class) ThirdLevelClassJ ThirdLevelClassJ_ID, @WebParam(name="ThirdLevelClassJ_VALUE") ThirdLevelClassJ ThirdLevelClassJ_VALUE) throws Exception;

	@DELETE
	@Path("/DeleteThirdLevelClassJ/{id}")
	void DeleteThirdLevelClassJ(@WebParam(name="ThirdLevelClassJ_ID") @PathParam("id") @XmlJavaTypeAdapter(ThirdLevelClassJRefAdapter.class) ThirdLevelClassJ ThirdLevelClassJ_ID) throws Exception;

	@GET
	@Path("/GetAllThirdLevelClassJ")
	@Produces({"application/xml", "application/json"})
	List<ThirdLevelClassJ> GetAllThirdLevelClassJ() throws Exception;
	
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