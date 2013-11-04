

package au.com.smartservicescrc.raas_small_test.jaxws;
 
import javax.jws.WebParam;
import javax.jws.WebService;
import javax.ws.rs.*;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import au.com.smartservicescrc.raas_small_test.jaxb.ReposRootRefAdapter;
import au.com.smartservicescrc.raas_small_test.jaxb.TopClassARefAdapter;
import au.com.smartservicescrc.raas_small_test.jaxb.TopClassBRefAdapter;
import au.com.smartservicescrc.raas_small_test.jaxb.TopClassCRefAdapter;
import au.com.smartservicescrc.raas_small_test.jaxb.TopClassDRefAdapter;
import au.com.smartservicescrc.raas_small_test.jaxb.TopClassMRefAdapter;

import au.com.smartservicescrc.raas_small_test.ReposRoot;
import au.com.smartservicescrc.raas_small_test.RstPackage;
import au.com.smartservicescrc.raas_small_test.TopClassA;
import au.com.smartservicescrc.raas_small_test.TopClassB;
import au.com.smartservicescrc.raas_small_test.TopClassC;
import au.com.smartservicescrc.raas_small_test.TopClassD;
import au.com.smartservicescrc.raas_small_test.TopClassM;

import java.util.List;

@Path("/ReposRoot")
@WebService
public interface ReposRootRepository {
  
	// RepositoryRoot operations

	@GET
	@Path("/GetraasRef/{id}")
	@Produces({"application/xml", "application/json"})
	String GetraasRef(@WebParam(name="ReposRoot_ROOTID") @PathParam("id") @XmlJavaTypeAdapter(ReposRootRefAdapter.class) ReposRoot ReposRoot_ROOTID) throws Exception;

	@PUT
	@Path("/SetraasRef/{id}/{value:[^/]*}")
	@Produces({"application/xml", "application/json"})
	@Consumes({"application/xml", "application/json"})
	void SetraasRef(@WebParam(name="ReposRoot_ROOTID") @PathParam("id") @XmlJavaTypeAdapter(ReposRootRefAdapter.class) ReposRoot ReposRoot_ROOTID, @WebParam(name="String_VALUE") @PathParam("value") String String_VALUE) throws Exception;

	@GET
	@Path("/GetsingleAttrString/{id}")
	@Produces({"application/xml", "application/json"})
	String GetsingleAttrString(@WebParam(name="ReposRoot_ROOTID") @PathParam("id") @XmlJavaTypeAdapter(ReposRootRefAdapter.class) ReposRoot ReposRoot_ROOTID) throws Exception;

	@PUT
	@Path("/SetsingleAttrString/{id}/{value:[^/]*}")
	@Produces({"application/xml", "application/json"})
	@Consumes({"application/xml", "application/json"})
	void SetsingleAttrString(@WebParam(name="ReposRoot_ROOTID") @PathParam("id") @XmlJavaTypeAdapter(ReposRootRefAdapter.class) ReposRoot ReposRoot_ROOTID, @WebParam(name="String_VALUE") @PathParam("value") String String_VALUE) throws Exception;

	@GET
	@Path("/GetmultiContainClassA/{id}")
	@Produces({"application/xml", "application/json"})
	List<TopClassA> GetmultiContainClassA(@WebParam(name="ReposRoot_ROOTID") @PathParam("id") @XmlJavaTypeAdapter(ReposRootRefAdapter.class) ReposRoot ReposRoot_ROOTID) throws Exception;

	@PUT
	@Path("/SetmultiContainClassA/{id}")
	@Produces({"application/xml", "application/json"})
	@Consumes({"application/xml", "application/json"})
	void SetmultiContainClassA(@WebParam(name="ReposRoot_ROOTID") @PathParam("id") @XmlJavaTypeAdapter(ReposRootRefAdapter.class) ReposRoot ReposRoot_ROOTID, @WebParam(name="TopClassA_ID")  @XmlJavaTypeAdapter(TopClassARefAdapter.class) List<TopClassA> TopClassA_ID) throws Exception;

	@GET
	@Path("/GetoptionalContainClassB/{id}")
	@Produces({"application/xml", "application/json"})
	TopClassB GetoptionalContainClassB(@WebParam(name="ReposRoot_ROOTID") @PathParam("id") @XmlJavaTypeAdapter(ReposRootRefAdapter.class) ReposRoot ReposRoot_ROOTID) throws Exception;

	@PUT
	@Path("/SetoptionalContainClassB/{id}")
	@Produces({"application/xml", "application/json"})
	@Consumes({"application/xml", "application/json"})
	void SetoptionalContainClassB(@WebParam(name="ReposRoot_ROOTID") @PathParam("id") @XmlJavaTypeAdapter(ReposRootRefAdapter.class) ReposRoot ReposRoot_ROOTID, @WebParam(name="TopClassB_ID")  @XmlJavaTypeAdapter(TopClassBRefAdapter.class) TopClassB TopClassB_ID) throws Exception;

	@GET
	@Path("/GetsingleContainClassC/{id}")
	@Produces({"application/xml", "application/json"})
	TopClassC GetsingleContainClassC(@WebParam(name="ReposRoot_ROOTID") @PathParam("id") @XmlJavaTypeAdapter(ReposRootRefAdapter.class) ReposRoot ReposRoot_ROOTID) throws Exception;

	@PUT
	@Path("/SetsingleContainClassC/{id}")
	@Produces({"application/xml", "application/json"})
	@Consumes({"application/xml", "application/json"})
	void SetsingleContainClassC(@WebParam(name="ReposRoot_ROOTID") @PathParam("id") @XmlJavaTypeAdapter(ReposRootRefAdapter.class) ReposRoot ReposRoot_ROOTID, @WebParam(name="TopClassC_ID")  @XmlJavaTypeAdapter(TopClassCRefAdapter.class) TopClassC TopClassC_ID) throws Exception;

	@GET
	@Path("/GetmultiRefClassD/{id}")
	@Produces({"application/xml", "application/json"})
	List<TopClassD> GetmultiRefClassD(@WebParam(name="ReposRoot_ROOTID") @PathParam("id") @XmlJavaTypeAdapter(ReposRootRefAdapter.class) ReposRoot ReposRoot_ROOTID) throws Exception;

	@PUT
	@Path("/SetmultiRefClassD/{id}")
	@Produces({"application/xml", "application/json"})
	@Consumes({"application/xml", "application/json"})
	void SetmultiRefClassD(@WebParam(name="ReposRoot_ROOTID") @PathParam("id") @XmlJavaTypeAdapter(ReposRootRefAdapter.class) ReposRoot ReposRoot_ROOTID, @WebParam(name="TopClassD_ID")  @XmlJavaTypeAdapter(TopClassDRefAdapter.class) List<TopClassD> TopClassD_ID) throws Exception;

	@GET
	@Path("/GetmultiAttrString/{id}")
	@Produces({"application/xml", "application/json"})
	List<String> GetmultiAttrString(@WebParam(name="ReposRoot_ROOTID") @PathParam("id") @XmlJavaTypeAdapter(ReposRootRefAdapter.class) ReposRoot ReposRoot_ROOTID) throws Exception;

	@PUT
	@Path("/SetmultiAttrString/{id}/{value:[^/]*}")
	@Produces({"application/xml", "application/json"})
	@Consumes({"application/xml", "application/json"})
	void SetmultiAttrString(@WebParam(name="ReposRoot_ROOTID") @PathParam("id") @XmlJavaTypeAdapter(ReposRootRefAdapter.class) ReposRoot ReposRoot_ROOTID, @WebParam(name="String_VALUE") @PathParam("value") List<String> String_VALUE) throws Exception;

	@GET
	@Path("/GetsingleNonContainClassM/{id}")
	@Produces({"application/xml", "application/json"})
	TopClassM GetsingleNonContainClassM(@WebParam(name="ReposRoot_ROOTID") @PathParam("id") @XmlJavaTypeAdapter(ReposRootRefAdapter.class) ReposRoot ReposRoot_ROOTID) throws Exception;

	@PUT
	@Path("/SetsingleNonContainClassM/{id}")
	@Produces({"application/xml", "application/json"})
	@Consumes({"application/xml", "application/json"})
	void SetsingleNonContainClassM(@WebParam(name="ReposRoot_ROOTID") @PathParam("id") @XmlJavaTypeAdapter(ReposRootRefAdapter.class) ReposRoot ReposRoot_ROOTID, @WebParam(name="TopClassM_ID")  @XmlJavaTypeAdapter(TopClassMRefAdapter.class) TopClassM TopClassM_ID) throws Exception;

	// CRUD operations for ReposRoot

	@POST
	@Path("/CreateReposRoot")
	@Produces({"application/xml", "application/json"})
	@Consumes({"application/xml", "application/json"})
	@XmlJavaTypeAdapter(ReposRootRefAdapter.class)
	ReposRoot CreateReposRoot(@WebParam(name="ReposRoot_VALUE") ReposRoot ReposRoot_VALUE) throws Exception;

	@GET
	@Path("/GetReposRoot/{id}")
	@Produces({"application/xml", "application/json"})
	ReposRoot GetReposRoot(@WebParam(name="ReposRoot_ID") @PathParam("id") @XmlJavaTypeAdapter(ReposRootRefAdapter.class) ReposRoot ReposRoot_ID) throws Exception;

	@PUT
	@Path("/UpdateReposRoot/{id}")
	@Consumes({"application/xml", "application/json"})
	void UpdateReposRoot(@WebParam(name="ReposRoot_ID") @PathParam("id") @XmlJavaTypeAdapter(ReposRootRefAdapter.class) ReposRoot ReposRoot_ID, @WebParam(name="ReposRoot_VALUE") ReposRoot ReposRoot_VALUE) throws Exception;

	@DELETE
	@Path("/DeleteReposRoot/{id}")
	void DeleteReposRoot(@WebParam(name="ReposRoot_ID") @PathParam("id") @XmlJavaTypeAdapter(ReposRootRefAdapter.class) ReposRoot ReposRoot_ID) throws Exception;

	@GET
	@Path("/GetAllReposRoot")
	@Produces({"application/xml", "application/json"})
	List<ReposRoot> GetAllReposRoot() throws Exception;
	
	// CRUD operations for TopClassA

	@POST
	@Path("/CreateTopClassA")
	@Produces({"application/xml", "application/json"})
	@Consumes({"application/xml", "application/json"})
	@XmlJavaTypeAdapter(TopClassARefAdapter.class)
	TopClassA CreateTopClassA(@WebParam(name="TopClassA_VALUE") TopClassA TopClassA_VALUE) throws Exception;

	@GET
	@Path("/GetTopClassA/{id}")
	@Produces({"application/xml", "application/json"})
	TopClassA GetTopClassA(@WebParam(name="TopClassA_ID") @PathParam("id") @XmlJavaTypeAdapter(TopClassARefAdapter.class) TopClassA TopClassA_ID) throws Exception;

	@PUT
	@Path("/UpdateTopClassA/{id}")
	@Consumes({"application/xml", "application/json"})
	void UpdateTopClassA(@WebParam(name="TopClassA_ID") @PathParam("id") @XmlJavaTypeAdapter(TopClassARefAdapter.class) TopClassA TopClassA_ID, @WebParam(name="TopClassA_VALUE") TopClassA TopClassA_VALUE) throws Exception;

	@DELETE
	@Path("/DeleteTopClassA/{id}")
	void DeleteTopClassA(@WebParam(name="TopClassA_ID") @PathParam("id") @XmlJavaTypeAdapter(TopClassARefAdapter.class) TopClassA TopClassA_ID) throws Exception;

	@GET
	@Path("/GetAllTopClassA")
	@Produces({"application/xml", "application/json"})
	List<TopClassA> GetAllTopClassA() throws Exception;
	
	// CRUD operations for TopClassB

	@POST
	@Path("/CreateTopClassB")
	@Produces({"application/xml", "application/json"})
	@Consumes({"application/xml", "application/json"})
	@XmlJavaTypeAdapter(TopClassBRefAdapter.class)
	TopClassB CreateTopClassB(@WebParam(name="TopClassB_VALUE") TopClassB TopClassB_VALUE) throws Exception;

	@GET
	@Path("/GetTopClassB/{id}")
	@Produces({"application/xml", "application/json"})
	TopClassB GetTopClassB(@WebParam(name="TopClassB_ID") @PathParam("id") @XmlJavaTypeAdapter(TopClassBRefAdapter.class) TopClassB TopClassB_ID) throws Exception;

	@PUT
	@Path("/UpdateTopClassB/{id}")
	@Consumes({"application/xml", "application/json"})
	void UpdateTopClassB(@WebParam(name="TopClassB_ID") @PathParam("id") @XmlJavaTypeAdapter(TopClassBRefAdapter.class) TopClassB TopClassB_ID, @WebParam(name="TopClassB_VALUE") TopClassB TopClassB_VALUE) throws Exception;

	@DELETE
	@Path("/DeleteTopClassB/{id}")
	void DeleteTopClassB(@WebParam(name="TopClassB_ID") @PathParam("id") @XmlJavaTypeAdapter(TopClassBRefAdapter.class) TopClassB TopClassB_ID) throws Exception;

	@GET
	@Path("/GetAllTopClassB")
	@Produces({"application/xml", "application/json"})
	List<TopClassB> GetAllTopClassB() throws Exception;
	
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