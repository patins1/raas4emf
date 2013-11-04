/**
 * Copyright 2013 Smart Services CRC Pty Ltd
 */
package org.raas4emf.cms.ui.actions;

import java.util.Collection;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.edit.command.DeleteCommand;
import org.eclipse.emf.edit.domain.EditingDomain;

import raascms.Artifact;
import raascms.Folder;

public class RAASDeleteCommand extends DeleteCommand {

	public RAASDeleteCommand(EditingDomain domain, Collection<?> collection) {
		super(domain, collection);
	}

	protected Map<EObject, Collection<EStructuralFeature.Setting>> findReferences(Collection<EObject> eObjects) {

		Set<EObject> emfObjectsToSearch = new HashSet<EObject>();
		for (EObject eObject : eObjects) {
			if (eObject instanceof Artifact || eObject instanceof Folder) {
				emfObjectsToSearch.add(eObject.eContainer());
			} else {
				EObject goUp = eObject;
				Artifact artifact = getArtifact(goUp);
				if (artifact != null) {
					emfObjectsToSearch.add(artifact);
				} else {
					System.out.println("Couldn't find usages for " + eObject);
					return super.findReferences(eObjects);
				}
			}
		}
		return EcoreUtil.UsageCrossReferencer.findAll(eObjects, emfObjectsToSearch);
	}

	public static Artifact getArtifact(EObject goUp) {
		while (goUp != null) {
			if (goUp instanceof Artifact) {
				Artifact artifact = (Artifact) goUp;
				return artifact;
			}
			goUp = goUp.eContainer();
		}
		return null;
	}

}
