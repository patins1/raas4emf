

package au.com.smartservicescrc.raas_small_test.jaxws;
 
import javax.jws.WebParam;
import javax.jws.WebService;
import javax.ws.rs.*;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import au.com.smartservicescrc.raas_small_test.jaxb.TopClassDRefAdapter;

import au.com.smartservicescrc.raas_small_test.RstPackage;
import au.com.smartservicescrc.raas_small_test.TopClassD;

import java.util.List;
import java.util.TimeZone;

@Path("/TopClassD")
@WebService
public interface TopClassDRepository {
  
	// RepositoryRoot operations

	@GET
	@Path("/GetraasRef/{id}")
	@Produces({"application/xml", "application/json"})
	String GetraasRef(@WebParam(name="TopClassD_ROOTID") @PathParam("id") @XmlJavaTypeAdapter(TopClassDRefAdapter.class) TopClassD TopClassD_ROOTID) throws Exception;

	@PUT
	@Path("/SetraasRef/{id}/{value:[^/]*}")
	@Produces({"application/xml", "application/json"})
	@Consumes({"application/xml", "application/json"})
	void SetraasRef(@WebParam(name="TopClassD_ROOTID") @PathParam("id") @XmlJavaTypeAdapter(TopClassDRefAdapter.class) TopClassD TopClassD_ROOTID, @WebParam(name="String_VALUE") @PathParam("value") String String_VALUE) throws Exception;

	@GET
	@Path("/Getmulti2lowerAttrInt/{id}")
	@Produces({"application/xml", "application/json"})
	List<Integer> Getmulti2lowerAttrInt(@WebParam(name="TopClassD_ROOTID") @PathParam("id") @XmlJavaTypeAdapter(TopClassDRefAdapter.class) TopClassD TopClassD_ROOTID) throws Exception;

	@PUT
	@Path("/Setmulti2lowerAttrInt/{id}/{value:[^/]*}")
	@Produces({"application/xml", "application/json"})
	@Consumes({"application/xml", "application/json"})
	void Setmulti2lowerAttrInt(@WebParam(name="TopClassD_ROOTID") @PathParam("id") @XmlJavaTypeAdapter(TopClassDRefAdapter.class) TopClassD TopClassD_ROOTID, @WebParam(name="Integer_VALUE") @PathParam("value") List<Integer> Integer_VALUE) throws Exception;

	@GET
	@Path("/GetsingleAttrInt/{id}")
	@Produces({"application/xml", "application/json"})
	int GetsingleAttrInt(@WebParam(name="TopClassD_ROOTID") @PathParam("id") @XmlJavaTypeAdapter(TopClassDRefAdapter.class) TopClassD TopClassD_ROOTID) throws Exception;

	@PUT
	@Path("/SetsingleAttrInt/{id}/{value:[^/]*}")
	@Produces({"application/xml", "application/json"})
	@Consumes({"application/xml", "application/json"})
	void SetsingleAttrInt(@WebParam(name="TopClassD_ROOTID") @PathParam("id") @XmlJavaTypeAdapter(TopClassDRefAdapter.class) TopClassD TopClassD_ROOTID, @WebParam(name="Integer_VALUE") @PathParam("value") int Integer_VALUE) throws Exception;

	@GET
	@Path("/GetoptionalAttrInt/{id}")
	@Produces({"application/xml", "application/json"})
	int GetoptionalAttrInt(@WebParam(name="TopClassD_ROOTID") @PathParam("id") @XmlJavaTypeAdapter(TopClassDRefAdapter.class) TopClassD TopClassD_ROOTID) throws Exception;

	@PUT
	@Path("/SetoptionalAttrInt/{id}/{value:[^/]*}")
	@Produces({"application/xml", "application/json"})
	@Consumes({"application/xml", "application/json"})
	void SetoptionalAttrInt(@WebParam(name="TopClassD_ROOTID") @PathParam("id") @XmlJavaTypeAdapter(TopClassDRefAdapter.class) TopClassD TopClassD_ROOTID, @WebParam(name="Integer_VALUE") @PathParam("value") int Integer_VALUE) throws Exception;

	@GET
	@Path("/GetoptionalTimeZone/{id}")
	@Produces({"application/xml", "application/json"})
	TimeZone GetoptionalTimeZone(@WebParam(name="TopClassD_ROOTID") @PathParam("id") @XmlJavaTypeAdapter(TopClassDRefAdapter.class) TopClassD TopClassD_ROOTID) throws Exception;

	@PUT
	@Path("/SetoptionalTimeZone/{id}/{value:[^/]*}")
	@Produces({"application/xml", "application/json"})
	@Consumes({"application/xml", "application/json"})
	void SetoptionalTimeZone(@WebParam(name="TopClassD_ROOTID") @PathParam("id") @XmlJavaTypeAdapter(TopClassDRefAdapter.class) TopClassD TopClassD_ROOTID, @WebParam(name="TimeZone_VALUE") @PathParam("value") TimeZone TimeZone_VALUE) throws Exception;

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
	
}