package org.raas4emf.cms.core;

import java.util.HashSet;
import java.util.Set;

import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.Status;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EClassifier;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;

import raascms.Artifact;
import raascms.impl.ArtifactImpl;
import IFC2X3.IFC2X3Package;

public class ParsingJob extends RAASJob {

	final private boolean treeMvd;

	private boolean treeMvdAssociationClasses = false;

	public ParsingJob(Artifact artifact, boolean treeMvd) {
		super("Parsing " + artifact.getName(), artifact);
		this.treeMvd = treeMvd;
		this.setRule(new RAASSchedulingRule(Integer.parseInt(System.getProperty("PARALLEL_PARSING", "1")), "PARSE"));
	}

	public ParsingJob(Artifact artifact, boolean treeMvd, boolean treeMvdAssociationClasses) {
		this(artifact, treeMvd);
		this.treeMvdAssociationClasses = treeMvdAssociationClasses;
	}

	protected IStatus run(IProgressMonitor monitor) {
		monitor = interceptMonitor(monitor);
		if (artifact.getFileContent() != null && !RAASUtils.isModelComplete(artifact)) {
			try {
				monitor.subTask("Build " + artifact.getName());
				RAASUtils.increaseSessionTimeout(artifact);
				RAASUtils.generateModel(getResourceSet(), URI.createFileURI("/dev/" + artifact.getName()), artifact, monitor);
			} catch (Exception e) {
				Activator.err(e);
				return new Status(IStatus.ERROR, Activator.PLUGIN_ID, "Error while building " + RAASUtils.getPath(artifact), e);
			} finally {
				if (GeometryJob.STATUS_CHANGED_CALLBACK != null)
					GeometryJob.STATUS_CHANGED_CALLBACK.stateChanged(artifact);
			}
		}
		return Status.OK_STATUS;
	}

	protected ResourceSetImpl getResourceSet() {
		ResourceSetImpl result = new ResourceSetImpl();
		if (!treeMvd)
			return result;
		Set<EClass> whiteList = new HashSet<EClass>();
		// entities
		addClass(whiteList, IFC2X3Package.eINSTANCE.getIfcProject());
		addClass(whiteList, IFC2X3Package.eINSTANCE.getIfcElement());
		addClass(whiteList, IFC2X3Package.eINSTANCE.getIfcSpatialStructureElement());
		if (treeMvdAssociationClasses) {
			// association classes
			addClass(whiteList, IFC2X3Package.eINSTANCE.getIfcRelDecomposes());
			addClass(whiteList, IFC2X3Package.eINSTANCE.getIfcRelContainedInSpatialStructure());
			addClass(whiteList, IFC2X3Package.eINSTANCE.getIfcRelFillsElement());
		} else {
			result.getLoadOptions().put(ArtifactImpl.OPTION_SKIPREFERENCES, true);
		}
		result.getLoadOptions().put(ArtifactImpl.OPTION_MVD, whiteList);
		return result;
	}

	private void addClass(Set<EClass> whiteList, EClass ifcClass) {
		if (!whiteList.add(ifcClass))
			return;
		for (EClassifier eClassifier : IFC2X3Package.eINSTANCE.getEClassifiers()) {
			if (eClassifier instanceof EClass) {
				EClass eClass = (EClass) eClassifier;
				if (ifcClass.isSuperTypeOf(eClass)) {
					whiteList.add(eClass);
				}
			}
		}
	}
}
