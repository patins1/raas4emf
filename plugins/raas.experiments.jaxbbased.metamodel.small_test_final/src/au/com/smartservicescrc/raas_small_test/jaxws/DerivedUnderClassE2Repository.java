

package au.com.smartservicescrc.raas_small_test.jaxws;
 
import javax.jws.WebParam;
import javax.jws.WebService;
import javax.ws.rs.*;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import au.com.smartservicescrc.raas_small_test.jaxb.ThirdLevelClassJRefAdapter;
import au.com.smartservicescrc.raas_small_test.jaxb.DerivedUnderClassE2RefAdapter;

import au.com.smartservicescrc.raas_small_test.DerivedUnderClassE2;
import au.com.smartservicescrc.raas_small_test.RstPackage;
import au.com.smartservicescrc.raas_small_test.ThirdLevelClassJ;

import java.util.List;

@Path("/DerivedUnderClassE2")
@WebService
public interface DerivedUnderClassE2Repository {
  
	// RepositoryRoot operations

	@GET
	@Path("/GetraasRef/{id}")
	@Produces({"application/xml", "application/json"})
	String GetraasRef(@WebParam(name="DerivedUnderClassE2_ROOTID") @PathParam("id") @XmlJavaTypeAdapter(DerivedUnderClassE2RefAdapter.class) DerivedUnderClassE2 DerivedUnderClassE2_ROOTID) throws Exception;

	@PUT
	@Path("/SetraasRef/{id}/{value:[^/]*}")
	@Produces({"application/xml", "application/json"})
	@Consumes({"application/xml", "application/json"})
	void SetraasRef(@WebParam(name="DerivedUnderClassE2_ROOTID") @PathParam("id") @XmlJavaTypeAdapter(DerivedUnderClassE2RefAdapter.class) DerivedUnderClassE2 DerivedUnderClassE2_ROOTID, @WebParam(name="String_VALUE") @PathParam("value") String String_VALUE) throws Exception;

	@GET
	@Path("/GetmultiContainClassJ/{id}")
	@Produces({"application/xml", "application/json"})
	List<ThirdLevelClassJ> GetmultiContainClassJ(@WebParam(name="DerivedUnderClassE2_ROOTID") @PathParam("id") @XmlJavaTypeAdapter(DerivedUnderClassE2RefAdapter.class) DerivedUnderClassE2 DerivedUnderClassE2_ROOTID) throws Exception;

	@PUT
	@Path("/SetmultiContainClassJ/{id}")
	@Produces({"application/xml", "application/json"})
	@Consumes({"application/xml", "application/json"})
	void SetmultiContainClassJ(@WebParam(name="DerivedUnderClassE2_ROOTID") @PathParam("id") @XmlJavaTypeAdapter(DerivedUnderClassE2RefAdapter.class) DerivedUnderClassE2 DerivedUnderClassE2_ROOTID, @WebParam(name="ThirdLevelClassJ_ID")  @XmlJavaTypeAdapter(ThirdLevelClassJRefAdapter.class) List<ThirdLevelClassJ> ThirdLevelClassJ_ID) throws Exception;

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
	
}