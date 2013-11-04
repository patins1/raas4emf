/**
 * Copyright 2013 Smart Services CRC Pty Ltd
 */
package org.raas4emf.service;

import java.util.List;

import javax.jws.WebService;
import javax.ws.rs.Path;

import org.eclipse.emf.cdo.common.lob.CDOBlob;

import raascms.Artifact;
import raascms.RaascmsPackage;

@Path("/Artifact")
@WebService(endpointInterface = "raascms.jaxws.ArtifactRepository", serviceName = "ArtifactRepository")
public class ArtifactRepositoryImpl extends org.raas4emf.service.raas.WebserviceRepository implements raascms.jaxws.ArtifactRepository {

	public ArtifactRepositoryImpl() throws Exception {
		super(RaascmsPackage.eINSTANCE);
	}

	// RepositoryRoot operations for Artifact

	public String Getname(Artifact rootRef) throws Exception {
		return getter(rootRef, RaascmsPackage.eINSTANCE.getArtifact_Name());
	}

	public void Setname(Artifact rootRef, String valuesRef) throws Exception {
		setter(rootRef, RaascmsPackage.eINSTANCE.getArtifact_Name(), valuesRef);
	}

	public CDOBlob GetfileContent(Artifact rootRef) throws Exception {
		return getter(rootRef, RaascmsPackage.eINSTANCE.getArtifact_FileContent());
	}

	public void SetfileContent(Artifact rootRef, CDOBlob valuesRef) throws Exception {
		setter(rootRef, RaascmsPackage.eINSTANCE.getArtifact_FileContent(), valuesRef);
	}

	// CRUD operations for Artifact

	public Artifact CreateArtifact(Artifact value) throws Exception {
		return create(value);
	}

	public Artifact GetArtifactAndGotoSubresource(Artifact valueRef) throws Exception {
		return get(valueRef);
	}

	public Artifact GetArtifact(Artifact valueRef) throws Exception {
		return get(valueRef);
	}

	public void UpdateArtifact(Artifact valueRef, Artifact value) throws Exception {
		update(valueRef, value);
	}

	public void DeleteArtifact(Artifact valueRef) throws Exception {
		delete(valueRef);
	}

	public List<Artifact> GetAllArtifact() throws Exception {
		return getAllInstances(RaascmsPackage.Literals.ARTIFACT);
	}

	@Override
	public List<?> Query(String queryString) throws Exception {
		return query(queryString);
	}

}