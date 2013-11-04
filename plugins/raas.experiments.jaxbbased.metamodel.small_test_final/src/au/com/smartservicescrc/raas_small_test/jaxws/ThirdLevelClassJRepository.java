

package au.com.smartservicescrc.raas_small_test.jaxws;
 
import javax.jws.WebParam;
import javax.jws.WebService;
import javax.ws.rs.*;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import au.com.smartservicescrc.raas_small_test.jaxb.ThirdLevelClassJRefAdapter;
import au.com.smartservicescrc.raas_small_test.jaxb.FourthLevelClassKRefAdapter;

import au.com.smartservicescrc.raas_small_test.FourthLevelClassK;
import au.com.smartservicescrc.raas_small_test.RstPackage;
import au.com.smartservicescrc.raas_small_test.ThirdLevelClassJ;

import java.util.List;

@Path("/ThirdLevelClassJ")
@WebService
public interface ThirdLevelClassJRepository {
  
	// RepositoryRoot operations

	@GET
	@Path("/GetraasRef/{id}")
	@Produces({"application/xml", "application/json"})
	String GetraasRef(@WebParam(name="ThirdLevelClassJ_ROOTID") @PathParam("id") @XmlJavaTypeAdapter(ThirdLevelClassJRefAdapter.class) ThirdLevelClassJ ThirdLevelClassJ_ROOTID) throws Exception;

	@PUT
	@Path("/SetraasRef/{id}/{value:[^/]*}")
	@Produces({"application/xml", "application/json"})
	@Consumes({"application/xml", "application/json"})
	void SetraasRef(@WebParam(name="ThirdLevelClassJ_ROOTID") @PathParam("id") @XmlJavaTypeAdapter(ThirdLevelClassJRefAdapter.class) ThirdLevelClassJ ThirdLevelClassJ_ROOTID, @WebParam(name="String_VALUE") @PathParam("value") String String_VALUE) throws Exception;

	@GET
	@Path("/Getmulti2lowerAttrInt/{id}")
	@Produces({"application/xml", "application/json"})
	List<Integer> Getmulti2lowerAttrInt(@WebParam(name="ThirdLevelClassJ_ROOTID") @PathParam("id") @XmlJavaTypeAdapter(ThirdLevelClassJRefAdapter.class) ThirdLevelClassJ ThirdLevelClassJ_ROOTID) throws Exception;

	@PUT
	@Path("/Setmulti2lowerAttrInt/{id}/{value:[^/]*}")
	@Produces({"application/xml", "application/json"})
	@Consumes({"application/xml", "application/json"})
	void Setmulti2lowerAttrInt(@WebParam(name="ThirdLevelClassJ_ROOTID") @PathParam("id") @XmlJavaTypeAdapter(ThirdLevelClassJRefAdapter.class) ThirdLevelClassJ ThirdLevelClassJ_ROOTID, @WebParam(name="Integer_VALUE") @PathParam("value") List<Integer> Integer_VALUE) throws Exception;

	@GET
	@Path("/GetsingleAttrInt/{id}")
	@Produces({"application/xml", "application/json"})
	int GetsingleAttrInt(@WebParam(name="ThirdLevelClassJ_ROOTID") @PathParam("id") @XmlJavaTypeAdapter(ThirdLevelClassJRefAdapter.class) ThirdLevelClassJ ThirdLevelClassJ_ROOTID) throws Exception;

	@PUT
	@Path("/SetsingleAttrInt/{id}/{value:[^/]*}")
	@Produces({"application/xml", "application/json"})
	@Consumes({"application/xml", "application/json"})
	void SetsingleAttrInt(@WebParam(name="ThirdLevelClassJ_ROOTID") @PathParam("id") @XmlJavaTypeAdapter(ThirdLevelClassJRefAdapter.class) ThirdLevelClassJ ThirdLevelClassJ_ROOTID, @WebParam(name="Integer_VALUE") @PathParam("value") int Integer_VALUE) throws Exception;

	@GET
	@Path("/GetoptionalAttrInt/{id}")
	@Produces({"application/xml", "application/json"})
	int GetoptionalAttrInt(@WebParam(name="ThirdLevelClassJ_ROOTID") @PathParam("id") @XmlJavaTypeAdapter(ThirdLevelClassJRefAdapter.class) ThirdLevelClassJ ThirdLevelClassJ_ROOTID) throws Exception;

	@PUT
	@Path("/SetoptionalAttrInt/{id}/{value:[^/]*}")
	@Produces({"application/xml", "application/json"})
	@Consumes({"application/xml", "application/json"})
	void SetoptionalAttrInt(@WebParam(name="ThirdLevelClassJ_ROOTID") @PathParam("id") @XmlJavaTypeAdapter(ThirdLevelClassJRefAdapter.class) ThirdLevelClassJ ThirdLevelClassJ_ROOTID, @WebParam(name="Integer_VALUE") @PathParam("value") int Integer_VALUE) throws Exception;

	@GET
	@Path("/GetoptionalContainClassK/{id}")
	@Produces({"application/xml", "application/json"})
	FourthLevelClassK GetoptionalContainClassK(@WebParam(name="ThirdLevelClassJ_ROOTID") @PathParam("id") @XmlJavaTypeAdapter(ThirdLevelClassJRefAdapter.class) ThirdLevelClassJ ThirdLevelClassJ_ROOTID) throws Exception;

	@PUT
	@Path("/SetoptionalContainClassK/{id}")
	@Produces({"application/xml", "application/json"})
	@Consumes({"application/xml", "application/json"})
	void SetoptionalContainClassK(@WebParam(name="ThirdLevelClassJ_ROOTID") @PathParam("id") @XmlJavaTypeAdapter(ThirdLevelClassJRefAdapter.class) ThirdLevelClassJ ThirdLevelClassJ_ROOTID, @WebParam(name="FourthLevelClassK_ID")  @XmlJavaTypeAdapter(FourthLevelClassKRefAdapter.class) FourthLevelClassK FourthLevelClassK_ID) throws Exception;

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
	
	// CRUD operations for FourthLevelClassK

	@POST
	@Path("/CreateFourthLevelClassK")
	@Produces({"application/xml", "application/json"})
	@Consumes({"application/xml", "application/json"})
	@XmlJavaTypeAdapter(FourthLevelClassKRefAdapter.class)
	FourthLevelClassK CreateFourthLevelClassK(@WebParam(name="FourthLevelClassK_VALUE") FourthLevelClassK FourthLevelClassK_VALUE) throws Exception;

	@GET
	@Path("/GetFourthLevelClassK/{id}")
	@Produces({"application/xml", "application/json"})
	FourthLevelClassK GetFourthLevelClassK(@WebParam(name="FourthLevelClassK_ID") @PathParam("id") @XmlJavaTypeAdapter(FourthLevelClassKRefAdapter.class) FourthLevelClassK FourthLevelClassK_ID) throws Exception;

	@PUT
	@Path("/UpdateFourthLevelClassK/{id}")
	@Consumes({"application/xml", "application/json"})
	void UpdateFourthLevelClassK(@WebParam(name="FourthLevelClassK_ID") @PathParam("id") @XmlJavaTypeAdapter(FourthLevelClassKRefAdapter.class) FourthLevelClassK FourthLevelClassK_ID, @WebParam(name="FourthLevelClassK_VALUE") FourthLevelClassK FourthLevelClassK_VALUE) throws Exception;

	@DELETE
	@Path("/DeleteFourthLevelClassK/{id}")
	void DeleteFourthLevelClassK(@WebParam(name="FourthLevelClassK_ID") @PathParam("id") @XmlJavaTypeAdapter(FourthLevelClassKRefAdapter.class) FourthLevelClassK FourthLevelClassK_ID) throws Exception;

	@GET
	@Path("/GetAllFourthLevelClassK")
	@Produces({"application/xml", "application/json"})
	List<FourthLevelClassK> GetAllFourthLevelClassK() throws Exception;
	
}