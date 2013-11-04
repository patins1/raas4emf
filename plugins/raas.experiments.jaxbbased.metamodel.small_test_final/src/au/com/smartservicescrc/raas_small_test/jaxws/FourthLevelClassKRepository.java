

package au.com.smartservicescrc.raas_small_test.jaxws;
 
import javax.jws.WebParam;
import javax.jws.WebService;
import javax.ws.rs.*;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import au.com.smartservicescrc.raas_small_test.jaxb.FourthLevelClassKRefAdapter;

import au.com.smartservicescrc.raas_small_test.FourthLevelClassK;
import au.com.smartservicescrc.raas_small_test.RstPackage;

import java.util.List;

@Path("/FourthLevelClassK")
@WebService
public interface FourthLevelClassKRepository {
  
	// RepositoryRoot operations

	@GET
	@Path("/GetraasRef/{id}")
	@Produces({"application/xml", "application/json"})
	String GetraasRef(@WebParam(name="FourthLevelClassK_ROOTID") @PathParam("id") @XmlJavaTypeAdapter(FourthLevelClassKRefAdapter.class) FourthLevelClassK FourthLevelClassK_ROOTID) throws Exception;

	@PUT
	@Path("/SetraasRef/{id}/{value:[^/]*}")
	@Produces({"application/xml", "application/json"})
	@Consumes({"application/xml", "application/json"})
	void SetraasRef(@WebParam(name="FourthLevelClassK_ROOTID") @PathParam("id") @XmlJavaTypeAdapter(FourthLevelClassKRefAdapter.class) FourthLevelClassK FourthLevelClassK_ROOTID, @WebParam(name="String_VALUE") @PathParam("value") String String_VALUE) throws Exception;

	@GET
	@Path("/Getmulti2lowerAttrInt/{id}")
	@Produces({"application/xml", "application/json"})
	List<Integer> Getmulti2lowerAttrInt(@WebParam(name="FourthLevelClassK_ROOTID") @PathParam("id") @XmlJavaTypeAdapter(FourthLevelClassKRefAdapter.class) FourthLevelClassK FourthLevelClassK_ROOTID) throws Exception;

	@PUT
	@Path("/Setmulti2lowerAttrInt/{id}/{value:[^/]*}")
	@Produces({"application/xml", "application/json"})
	@Consumes({"application/xml", "application/json"})
	void Setmulti2lowerAttrInt(@WebParam(name="FourthLevelClassK_ROOTID") @PathParam("id") @XmlJavaTypeAdapter(FourthLevelClassKRefAdapter.class) FourthLevelClassK FourthLevelClassK_ROOTID, @WebParam(name="Integer_VALUE") @PathParam("value") List<Integer> Integer_VALUE) throws Exception;

	@GET
	@Path("/GetsingleAttrInt/{id}")
	@Produces({"application/xml", "application/json"})
	int GetsingleAttrInt(@WebParam(name="FourthLevelClassK_ROOTID") @PathParam("id") @XmlJavaTypeAdapter(FourthLevelClassKRefAdapter.class) FourthLevelClassK FourthLevelClassK_ROOTID) throws Exception;

	@PUT
	@Path("/SetsingleAttrInt/{id}/{value:[^/]*}")
	@Produces({"application/xml", "application/json"})
	@Consumes({"application/xml", "application/json"})
	void SetsingleAttrInt(@WebParam(name="FourthLevelClassK_ROOTID") @PathParam("id") @XmlJavaTypeAdapter(FourthLevelClassKRefAdapter.class) FourthLevelClassK FourthLevelClassK_ROOTID, @WebParam(name="Integer_VALUE") @PathParam("value") int Integer_VALUE) throws Exception;

	@GET
	@Path("/GetoptionalAttrInt/{id}")
	@Produces({"application/xml", "application/json"})
	int GetoptionalAttrInt(@WebParam(name="FourthLevelClassK_ROOTID") @PathParam("id") @XmlJavaTypeAdapter(FourthLevelClassKRefAdapter.class) FourthLevelClassK FourthLevelClassK_ROOTID) throws Exception;

	@PUT
	@Path("/SetoptionalAttrInt/{id}/{value:[^/]*}")
	@Produces({"application/xml", "application/json"})
	@Consumes({"application/xml", "application/json"})
	void SetoptionalAttrInt(@WebParam(name="FourthLevelClassK_ROOTID") @PathParam("id") @XmlJavaTypeAdapter(FourthLevelClassKRefAdapter.class) FourthLevelClassK FourthLevelClassK_ROOTID, @WebParam(name="Integer_VALUE") @PathParam("value") int Integer_VALUE) throws Exception;

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