

package au.com.smartservicescrc.raas_small_test.jaxws;
 
import javax.jws.WebParam;
import javax.jws.WebService;
import javax.ws.rs.*;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import au.com.smartservicescrc.raas_small_test.jaxb.UnderClassFRefAdapter;

import au.com.smartservicescrc.raas_small_test.RstPackage;
import au.com.smartservicescrc.raas_small_test.UnderClassF;

import java.util.List;

@Path("/UnderClassF")
@WebService
public interface UnderClassFRepository {
  
	// RepositoryRoot operations

	@GET
	@Path("/GetraasRef/{id}")
	@Produces({"application/xml", "application/json"})
	String GetraasRef(@WebParam(name="UnderClassF_ROOTID") @PathParam("id") @XmlJavaTypeAdapter(UnderClassFRefAdapter.class) UnderClassF UnderClassF_ROOTID) throws Exception;

	@PUT
	@Path("/SetraasRef/{id}/{value:[^/]*}")
	@Produces({"application/xml", "application/json"})
	@Consumes({"application/xml", "application/json"})
	void SetraasRef(@WebParam(name="UnderClassF_ROOTID") @PathParam("id") @XmlJavaTypeAdapter(UnderClassFRefAdapter.class) UnderClassF UnderClassF_ROOTID, @WebParam(name="String_VALUE") @PathParam("value") String String_VALUE) throws Exception;

	@GET
	@Path("/GetsingleAttrInt/{id}")
	@Produces({"application/xml", "application/json"})
	int GetsingleAttrInt(@WebParam(name="UnderClassF_ROOTID") @PathParam("id") @XmlJavaTypeAdapter(UnderClassFRefAdapter.class) UnderClassF UnderClassF_ROOTID) throws Exception;

	@PUT
	@Path("/SetsingleAttrInt/{id}/{value:[^/]*}")
	@Produces({"application/xml", "application/json"})
	@Consumes({"application/xml", "application/json"})
	void SetsingleAttrInt(@WebParam(name="UnderClassF_ROOTID") @PathParam("id") @XmlJavaTypeAdapter(UnderClassFRefAdapter.class) UnderClassF UnderClassF_ROOTID, @WebParam(name="Integer_VALUE") @PathParam("value") int Integer_VALUE) throws Exception;

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
	
}