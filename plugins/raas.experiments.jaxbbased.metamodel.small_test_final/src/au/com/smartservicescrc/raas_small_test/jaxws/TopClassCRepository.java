

package au.com.smartservicescrc.raas_small_test.jaxws;
 
import javax.jws.WebParam;
import javax.jws.WebService;
import javax.ws.rs.*;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import au.com.smartservicescrc.raas_small_test.jaxb.TopClassCRefAdapter;
import au.com.smartservicescrc.raas_small_test.jaxb.UnderClassFRefAdapter;

import au.com.smartservicescrc.raas_small_test.RstPackage;
import au.com.smartservicescrc.raas_small_test.TopClassC;
import au.com.smartservicescrc.raas_small_test.UnderClassF;

import java.util.List;

@Path("/TopClassC")
@WebService
public interface TopClassCRepository {
  
	// RepositoryRoot operations

	@GET
	@Path("/GetraasRef/{id}")
	@Produces({"application/xml", "application/json"})
	String GetraasRef(@WebParam(name="TopClassC_ROOTID") @PathParam("id") @XmlJavaTypeAdapter(TopClassCRefAdapter.class) TopClassC TopClassC_ROOTID) throws Exception;

	@PUT
	@Path("/SetraasRef/{id}/{value:[^/]*}")
	@Produces({"application/xml", "application/json"})
	@Consumes({"application/xml", "application/json"})
	void SetraasRef(@WebParam(name="TopClassC_ROOTID") @PathParam("id") @XmlJavaTypeAdapter(TopClassCRefAdapter.class) TopClassC TopClassC_ROOTID, @WebParam(name="String_VALUE") @PathParam("value") String String_VALUE) throws Exception;

	@GET
	@Path("/Getmulti2lowerAttrInt/{id}")
	@Produces({"application/xml", "application/json"})
	List<Integer> Getmulti2lowerAttrInt(@WebParam(name="TopClassC_ROOTID") @PathParam("id") @XmlJavaTypeAdapter(TopClassCRefAdapter.class) TopClassC TopClassC_ROOTID) throws Exception;

	@PUT
	@Path("/Setmulti2lowerAttrInt/{id}/{value:[^/]*}")
	@Produces({"application/xml", "application/json"})
	@Consumes({"application/xml", "application/json"})
	void Setmulti2lowerAttrInt(@WebParam(name="TopClassC_ROOTID") @PathParam("id") @XmlJavaTypeAdapter(TopClassCRefAdapter.class) TopClassC TopClassC_ROOTID, @WebParam(name="Integer_VALUE") @PathParam("value") List<Integer> Integer_VALUE) throws Exception;

	@GET
	@Path("/GetsingleAttrInt/{id}")
	@Produces({"application/xml", "application/json"})
	int GetsingleAttrInt(@WebParam(name="TopClassC_ROOTID") @PathParam("id") @XmlJavaTypeAdapter(TopClassCRefAdapter.class) TopClassC TopClassC_ROOTID) throws Exception;

	@PUT
	@Path("/SetsingleAttrInt/{id}/{value:[^/]*}")
	@Produces({"application/xml", "application/json"})
	@Consumes({"application/xml", "application/json"})
	void SetsingleAttrInt(@WebParam(name="TopClassC_ROOTID") @PathParam("id") @XmlJavaTypeAdapter(TopClassCRefAdapter.class) TopClassC TopClassC_ROOTID, @WebParam(name="Integer_VALUE") @PathParam("value") int Integer_VALUE) throws Exception;

	@GET
	@Path("/GetoptionalAttrInt/{id}")
	@Produces({"application/xml", "application/json"})
	int GetoptionalAttrInt(@WebParam(name="TopClassC_ROOTID") @PathParam("id") @XmlJavaTypeAdapter(TopClassCRefAdapter.class) TopClassC TopClassC_ROOTID) throws Exception;

	@PUT
	@Path("/SetoptionalAttrInt/{id}/{value:[^/]*}")
	@Produces({"application/xml", "application/json"})
	@Consumes({"application/xml", "application/json"})
	void SetoptionalAttrInt(@WebParam(name="TopClassC_ROOTID") @PathParam("id") @XmlJavaTypeAdapter(TopClassCRefAdapter.class) TopClassC TopClassC_ROOTID, @WebParam(name="Integer_VALUE") @PathParam("value") int Integer_VALUE) throws Exception;

	@GET
	@Path("/GetsingleContainClassF/{id}")
	@Produces({"application/xml", "application/json"})
	UnderClassF GetsingleContainClassF(@WebParam(name="TopClassC_ROOTID") @PathParam("id") @XmlJavaTypeAdapter(TopClassCRefAdapter.class) TopClassC TopClassC_ROOTID) throws Exception;

	@PUT
	@Path("/SetsingleContainClassF/{id}")
	@Produces({"application/xml", "application/json"})
	@Consumes({"application/xml", "application/json"})
	void SetsingleContainClassF(@WebParam(name="TopClassC_ROOTID") @PathParam("id") @XmlJavaTypeAdapter(TopClassCRefAdapter.class) TopClassC TopClassC_ROOTID, @WebParam(name="UnderClassF_ID")  @XmlJavaTypeAdapter(UnderClassFRefAdapter.class) UnderClassF UnderClassF_ID) throws Exception;

	// CRUD operations for TopClassC

	@POST
	@Path("/CreateTopClassC")
	@Produces({"application/xml", "application/json"})
	@Consumes({"application/xml", "application/json"})
	@XmlJavaTypeAdapter(TopClassCRefAdapter.class)
	TopClassC CreateTopClassC(@WebParam(name="TopClassC_VALUE") TopClassC TopClassC_VALUE) throws Exception;

	@GET
	@Path("/GetTopClassC/{id}")
	@Produces({"application/xml", "application/json"})
	TopClassC GetTopClassC(@WebParam(name="TopClassC_ID") @PathParam("id") @XmlJavaTypeAdapter(TopClassCRefAdapter.class) TopClassC TopClassC_ID) throws Exception;

	@PUT
	@Path("/UpdateTopClassC/{id}")
	@Consumes({"application/xml", "application/json"})
	void UpdateTopClassC(@WebParam(name="TopClassC_ID") @PathParam("id") @XmlJavaTypeAdapter(TopClassCRefAdapter.class) TopClassC TopClassC_ID, @WebParam(name="TopClassC_VALUE") TopClassC TopClassC_VALUE) throws Exception;

	@DELETE
	@Path("/DeleteTopClassC/{id}")
	void DeleteTopClassC(@WebParam(name="TopClassC_ID") @PathParam("id") @XmlJavaTypeAdapter(TopClassCRefAdapter.class) TopClassC TopClassC_ID) throws Exception;

	@GET
	@Path("/GetAllTopClassC")
	@Produces({"application/xml", "application/json"})
	List<TopClassC> GetAllTopClassC() throws Exception;
	
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