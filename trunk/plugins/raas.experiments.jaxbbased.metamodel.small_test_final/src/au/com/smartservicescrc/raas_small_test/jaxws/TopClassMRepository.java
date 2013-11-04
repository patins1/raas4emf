

package au.com.smartservicescrc.raas_small_test.jaxws;
 
import javax.jws.WebParam;
import javax.jws.WebService;
import javax.ws.rs.*;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import au.com.smartservicescrc.raas_small_test.jaxb.TopClassMRefAdapter;

import au.com.smartservicescrc.raas_small_test.RstPackage;
import au.com.smartservicescrc.raas_small_test.TopClassM;

import java.util.List;

@Path("/TopClassM")
@WebService
public interface TopClassMRepository {
  
	// RepositoryRoot operations

	@GET
	@Path("/GetraasRef/{id}")
	@Produces({"application/xml", "application/json"})
	String GetraasRef(@WebParam(name="TopClassM_ROOTID") @PathParam("id") @XmlJavaTypeAdapter(TopClassMRefAdapter.class) TopClassM TopClassM_ROOTID) throws Exception;

	@PUT
	@Path("/SetraasRef/{id}/{value:[^/]*}")
	@Produces({"application/xml", "application/json"})
	@Consumes({"application/xml", "application/json"})
	void SetraasRef(@WebParam(name="TopClassM_ROOTID") @PathParam("id") @XmlJavaTypeAdapter(TopClassMRefAdapter.class) TopClassM TopClassM_ROOTID, @WebParam(name="String_VALUE") @PathParam("value") String String_VALUE) throws Exception;

	@GET
	@Path("/GetsingleAttrInt/{id}")
	@Produces({"application/xml", "application/json"})
	int GetsingleAttrInt(@WebParam(name="TopClassM_ROOTID") @PathParam("id") @XmlJavaTypeAdapter(TopClassMRefAdapter.class) TopClassM TopClassM_ROOTID) throws Exception;

	@PUT
	@Path("/SetsingleAttrInt/{id}/{value:[^/]*}")
	@Produces({"application/xml", "application/json"})
	@Consumes({"application/xml", "application/json"})
	void SetsingleAttrInt(@WebParam(name="TopClassM_ROOTID") @PathParam("id") @XmlJavaTypeAdapter(TopClassMRefAdapter.class) TopClassM TopClassM_ROOTID, @WebParam(name="Integer_VALUE") @PathParam("value") int Integer_VALUE) throws Exception;

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
	
}