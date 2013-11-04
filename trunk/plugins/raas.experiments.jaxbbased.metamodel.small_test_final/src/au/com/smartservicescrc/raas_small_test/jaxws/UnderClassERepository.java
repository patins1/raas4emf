

package au.com.smartservicescrc.raas_small_test.jaxws;
 
import javax.jws.WebParam;
import javax.jws.WebService;
import javax.ws.rs.*;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import au.com.smartservicescrc.raas_small_test.jaxb.UnderClassERefAdapter;

import au.com.smartservicescrc.raas_small_test.RstPackage;
import au.com.smartservicescrc.raas_small_test.UnderClassE;

import java.util.List;

@Path("/UnderClassE")
@WebService
public interface UnderClassERepository {
  
	// RepositoryRoot operations

	@GET
	@Path("/GetraasRef/{id}")
	@Produces({"application/xml", "application/json"})
	String GetraasRef(@WebParam(name="UnderClassE_ROOTID") @PathParam("id") @XmlJavaTypeAdapter(UnderClassERefAdapter.class) UnderClassE UnderClassE_ROOTID) throws Exception;

	@PUT
	@Path("/SetraasRef/{id}/{value:[^/]*}")
	@Produces({"application/xml", "application/json"})
	@Consumes({"application/xml", "application/json"})
	void SetraasRef(@WebParam(name="UnderClassE_ROOTID") @PathParam("id") @XmlJavaTypeAdapter(UnderClassERefAdapter.class) UnderClassE UnderClassE_ROOTID, @WebParam(name="String_VALUE") @PathParam("value") String String_VALUE) throws Exception;

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
	
}