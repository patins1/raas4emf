/**
 * Copyright 2013 Smart Services CRC Pty Ltd
 */
package org.raas4emf.cms.ui.graf;

import java.util.ArrayList;
import java.util.Collection;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EReference;
import org.raas4emf.cms.core.RAASUtils;
import org.raas4emf.cms.core.graf.IEdge;
import org.raas4emf.cms.core.graf.IVertex;

import IFC2X3.IFC2X3Package;
import IFC2X3.IfcDoor;
import IFC2X3.IfcRelContainedInSpatialStructure;
import IFC2X3.IfcRelDecomposes;
import IFC2X3.IfcRelDefinesByProperties;
import IFC2X3.IfcRoot;
import IFC2X3.IfcSpace;

public class EObjectAsVertex implements IVertex {

	public final EObject space;

	public EObjectAsVertex(EObject eObject) {
		this.space = eObject;
	}

	public Collection<IEdge> getEdges() {
		Collection<IEdge> result = new ArrayList<IEdge>();
		for (EReference b : space.eClass().getEAllReferences()) {
			result.add(new EReferenceAsEdge(space, b));
		}
		return result;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((space == null) ? 0 : space.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		EObjectAsVertex other = (EObjectAsVertex) obj;
		if (space == null) {
			if (other.space != null)
				return false;
		} else if (!space.equals(other.space))
			return false;
		return true;
	}

	public double getCost() {
		EClass eClass = space.eClass();
		if (eClass == IFC2X3Package.eINSTANCE.getIfcWallStandardCase() || eClass == IFC2X3Package.eINSTANCE.getIfcCurtainWall() || eClass == IFC2X3Package.eINSTANCE.getIfcSlab())
			return 1.5;
		return 0;
	}

	@Override
	public String getName() {
		if (space instanceof IfcSpace)
			return space.eClass().getName() + "." + RAASUtils.getSpaceName((IfcSpace) space);
		if (space instanceof IfcDoor)
			return space.eClass().getName() + "." + RAASUtils.getDoorName((IfcDoor) space);
		if (space instanceof IfcRelContainedInSpatialStructure) {
			IfcRelContainedInSpatialStructure ifcRelContainedInSpatialStructure = (IfcRelContainedInSpatialStructure) space;
			return space.eClass().getName() + "=>" + ifcRelContainedInSpatialStructure.getRelatingStructure().getName();
		}
		if (space instanceof IfcRelDefinesByProperties) {
			IfcRelDefinesByProperties ifcRelDefinesByProperties = (IfcRelDefinesByProperties) space;
			return space.eClass().getName() + "=>" + ifcRelDefinesByProperties.getRelatingPropertyDefinition().getName();
		}
		if (space instanceof IfcRelDecomposes) {
			IfcRelDecomposes ifcRelDecomposes = (IfcRelDecomposes) space;
			if (ifcRelDecomposes.getRelatingObject().getName() != null)
				return space.eClass().getName() + "=>" + ifcRelDecomposes.getRelatingObject().getName();
			return space.eClass().getName() + "=>" + ifcRelDecomposes.getRelatingObject().eClass().getName();
		}
		if (space instanceof IfcRoot) {
			IfcRoot ifcProduct = (IfcRoot) space;
			if (ifcProduct.getName() != null && !"".equals(ifcProduct.getName()))
				return space.eClass().getName() + "." + ifcProduct.getName();
			if (ifcProduct.getGlobalId() != null && !"".equals(ifcProduct.getGlobalId()))
				return space.eClass().getName() + "." + ifcProduct.getGlobalId();
		}
		return space.eClass().getName();
	}

	@Override
	public String toString() {
		return getName();
	}

	@Override
	public EObject getUserObject() {
		return space;
	}
}
