/**
 * Copyright 2013 Smart Services CRC Pty Ltd
 */
package org.raas4emf.cms.ui.graf;

import java.util.ArrayList;
import java.util.Collection;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EReference;
import org.raas4emf.cms.core.graf.IEdge;
import org.raas4emf.cms.core.graf.IVertex;

import IFC2X3.IFC2X3Package;

public class EReferenceAsEdge implements IEdge {

	public final EReference door;
	private EObject space;

	public EReferenceAsEdge(EObject space, EReference door) {
		this.space = space;
		this.door = door;
	}

	public Collection<IVertex> getVertices() {
		Collection<IVertex> result = new ArrayList<IVertex>();
		Object value = space.eGet(door);
		if (value instanceof EObject) {
			EObject eObject = (EObject) value;
			result.add(new EObjectAsVertex(eObject));
		}
		if (value instanceof EList) {
			EList<?> eList = (EList<?>) value;
			for (Object ob : eList) {
				if (ob instanceof EObject) {
					EObject eObject = (EObject) ob;
					result.add(new EObjectAsVertex(eObject));
				}
			}
		}
		return result;
	}

	public double getCost() {
		// penalty for containment relationships is 2
		if (door == IFC2X3Package.eINSTANCE.getIfcObjectDefinition_Decomposes())
			return 2;
		if (door == IFC2X3Package.eINSTANCE.getIfcRelContainedInSpatialStructure_RelatedElements())
			return 2;
		if (door == IFC2X3Package.eINSTANCE.getIfcRelDecomposes_RelatedObjects())
			return 2;
		// for "not important" relationships is 3
		if (door == IFC2X3Package.eINSTANCE.getIfcProduct_Representation())
			return 3;
		if (door == IFC2X3Package.eINSTANCE.getIfcProduct_ObjectPlacement())
			return 3;
		if (door == IFC2X3Package.eINSTANCE.getIfcObject_IsDefinedBy())
			return 4;
		if (door == IFC2X3Package.eINSTANCE.getIfcRoot_HasAssociations())
			return 3;
		// otherwise 1
		return 1;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((door == null) ? 0 : door.hashCode());
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
		EReferenceAsEdge other = (EReferenceAsEdge) obj;
		if (door == null) {
			if (other.door != null)
				return false;
		} else if (!door.equals(other.door))
			return false;
		return true;
	}

	@Override
	public String getName() {
		return door.getEContainingClass().getName() + "." + door.getName();
	}

	@Override
	public String toString() {
		return getName();
	}

	@Override
	public Object getUserObject() {
		return door;
	}

}
