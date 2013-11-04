

package au.com.smartservicescrc.raas_small_test.jaxws;
 
import javax.jws.WebParam;
import javax.jws.WebService;
import javax.ws.rs.*;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import au.com.smartservicescrc.raas_small_test.jaxb.TopClassDRefAdapter;
import au.com.smartservicescrc.raas_small_test.jaxb.DerivedUnderClassE1RefAdapter;

import au.com.smartservicescrc.raas_small_test.DerivedUnderClassE1;
import au.com.smartservicescrc.raas_small_test.RstPackage;
import au.com.smartservicescrc.raas_small_test.TopClassD;

import java.util.List;

@Path("/DerivedUnderClassE1")
@WebService
public interface DerivedUnderClassE1Repository {
  
	// RepositoryRoot operations

	@GET
	@Path("/GetraasRef/{id}")
	@Produces({"application/xml", "application/json"})
	String GetraasRef(@WebParam(name="DerivedUnderClassE1_ROOTID") @PathParam("id") @XmlJavaTypeAdapter(DerivedUnderClassE1RefAdapter.class) DerivedUnderClassE1 DerivedUnderClassE1_ROOTID) throws Exception;

	@PUT
	@Path("/SetraasRef/{id}/{value:[^/]*}")
	@Produces({"application/xml", "application/json"})
	@Consumes({"application/xml", "application/json"})
	void SetraasRef(@WebParam(name="DerivedUnderClassE1_ROOTID") @PathParam("id") @XmlJavaTypeAdapter(DerivedUnderClassE1RefAdapter.class) DerivedUnderClassE1 DerivedUnderClassE1_ROOTID, @WebParam(name="String_VALUE") @PathParam("value") String String_VALUE) throws Exception;

	@GET
	@Path("/GetsingleRefClassD/{id}")
	@Produces({"application/xml", "application/json"})
	TopClassD GetsingleRefClassD(@WebParam(name="DerivedUnderClassE1_ROOTID") @PathParam("id") @XmlJavaTypeAdapter(DerivedUnderClassE1RefAdapter.class) DerivedUnderClassE1 DerivedUnderClassE1_ROOTID) throws Exception;

	@PUT
	@Path("/SetsingleRefClassD/{id}")
	@Produces({"application/xml", "application/json"})
	@Consumes({"application/xml", "application/json"})
	void SetsingleRefClassD(@WebParam(name="DerivedUnderClassE1_ROOTID") @PathParam("id") @XmlJavaTypeAdapter(DerivedUnderClassE1RefAdapter.class) DerivedUnderClassE1 DerivedUnderClassE1_ROOTID, @WebParam(name="TopClassD_ID")  @XmlJavaTypeAdapter(TopClassDRefAdapter.class) TopClassD TopClassD_ID) throws Exception;

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
	
}