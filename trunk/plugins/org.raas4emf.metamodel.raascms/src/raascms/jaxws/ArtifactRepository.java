
    
package raascms.jaxws;
 
import java.util.List;

import javax.jws.WebParam;
import javax.jws.WebService;
import javax.ws.rs.Consumes;
import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;

import raascms.Artifact;
import raascms.jaxb.ArtifactRefAdapter;

@Path("/Artifact")
@WebService
public interface ArtifactRepository {
      
	// RepositoryRoot operations for Artifact

	@GET
	@Path("/Getname/{id}")
	@Produces({"application/xml", "application/json"})
	String Getname(@WebParam(name="Artifact_ROOTID") @PathParam("id") @XmlJavaTypeAdapter(ArtifactRefAdapter.class) Artifact Artifact_ROOTID) throws Exception;

	@PUT
	@Path("/Setname/{id}/{value:[^/]*}")
	@Produces({"application/xml", "application/json"})
	@Consumes({"application/xml", "application/json"})
	void Setname(@WebParam(name="Artifact_ROOTID") @PathParam("id") @XmlJavaTypeAdapter(ArtifactRefAdapter.class) Artifact Artifact_ROOTID, @WebParam(name="String_VALUE") @PathParam("value") String String_VALUE) throws Exception;

	// CRUD operations for Artifact

	@POST
	@Path("/CreateArtifact")
	@Produces({"application/xml", "application/json"})
	@Consumes({"application/xml", "application/json"})
	@XmlJavaTypeAdapter(ArtifactRefAdapter.class)
	Artifact CreateArtifact(@WebParam(name="Artifact_VALUE") Artifact Artifact_VALUE) throws Exception;
	    
	@Path("/GetArtifact/{id}/")
	Artifact GetArtifactAndGotoSubresource(@WebParam(name="Artifact_ID") @PathParam("id") @XmlJavaTypeAdapter(ArtifactRefAdapter.class) Artifact Artifact_ID) throws Exception;
    
	@GET
	@Path("/GetArtifact/{id}")
	@Produces({"application/xml", "application/json"})
	Artifact GetArtifact(@WebParam(name="Artifact_ID") @PathParam("id") @XmlJavaTypeAdapter(ArtifactRefAdapter.class) Artifact Artifact_ID) throws Exception;

	@PUT
	@Path("/UpdateArtifact/{id}")
	@Consumes({"application/xml", "application/json"})
	void UpdateArtifact(@WebParam(name="Artifact_ID") @PathParam("id") @XmlJavaTypeAdapter(ArtifactRefAdapter.class) Artifact Artifact_ID, @WebParam(name="Artifact_VALUE") Artifact Artifact_VALUE) throws Exception;

	@DELETE
	@Path("/DeleteArtifact/{id}")
	void DeleteArtifact(@WebParam(name="Artifact_ID") @PathParam("id") @XmlJavaTypeAdapter(ArtifactRefAdapter.class) Artifact Artifact_ID) throws Exception;

	@GET
	@Path("/GetAllArtifact")
	@Produces({"application/xml", "application/json"})
	List<Artifact> GetAllArtifact() throws Exception;
	
    
	@GET
	@Path("/Query/{queryString}")
	@Produces({"application/xml", "application/json"})
	List<?> Query(@WebParam(name="QueryString") @PathParam("queryString") String queryString) throws Exception;
	
}