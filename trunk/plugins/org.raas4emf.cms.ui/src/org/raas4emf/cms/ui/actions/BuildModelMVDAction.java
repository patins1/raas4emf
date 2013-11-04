/**
 * Copyright 2013 Smart Services CRC Pty Ltd
 */
package org.raas4emf.cms.ui.actions;

import java.util.HashSet;
import java.util.Set;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EClassifier;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;

import raascms.impl.ArtifactImpl;
import IFC2X3.IFC2X3Package;

public class BuildModelMVDAction extends BuildModelAction {

	public BuildModelMVDAction() {
		super();
	}

	@Override
	protected ResourceSetImpl getResourceSet() {
		ResourceSetImpl result = super.getResourceSet();
		Set<EClass> whiteList = new HashSet<EClass>();
		// entities
		addClass(whiteList, IFC2X3Package.eINSTANCE.getIfcProject());
		addClass(whiteList, IFC2X3Package.eINSTANCE.getIfcElement());
		addClass(whiteList, IFC2X3Package.eINSTANCE.getIfcSpatialStructureElement());
		// association classes
		addClass(whiteList, IFC2X3Package.eINSTANCE.getIfcRelDecomposes());
		addClass(whiteList, IFC2X3Package.eINSTANCE.getIfcRelContainedInSpatialStructure());
		addClass(whiteList, IFC2X3Package.eINSTANCE.getIfcRelFillsElement());
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
