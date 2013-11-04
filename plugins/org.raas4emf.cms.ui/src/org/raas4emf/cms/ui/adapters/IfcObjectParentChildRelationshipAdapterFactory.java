/**
 * Copyright 2013 Smart Services CRC Pty Ltd
 */
package org.raas4emf.cms.ui.adapters;

import java.util.ArrayList;
import java.util.Collection;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.ui.internal.Model;
import org.raas4emf.cms.core.ILogicalParentChildRelationship;
import org.raas4emf.cms.ui.AdapterFactoryTyped;

import IFC2X3.IfcElement;
import IFC2X3.IfcObjectDefinition;
import IFC2X3.IfcOpeningElement;
import IFC2X3.IfcProduct;
import IFC2X3.IfcProject;
import IFC2X3.IfcRelContainedInSpatialStructure;
import IFC2X3.IfcRelDecomposes;
import IFC2X3.IfcRelFillsElement;
import IFC2X3.IfcSpatialStructureElement;
import IFC2X3.util.SDAIAdapter;

public class IfcObjectParentChildRelationshipAdapterFactory extends AdapterFactoryTyped<IfcObjectDefinition, ILogicalParentChildRelationship> {

	@Override
	public ILogicalParentChildRelationship getAdapterTyped(final IfcObjectDefinition ifcObject, Class<ILogicalParentChildRelationship> adapterType) {
		return new ILogicalParentChildRelationship() {

			@Override
			public Collection<EObject> getLogicalChildren() {
				Collection<EObject> children = new ArrayList<EObject>();
				// relation 1
				for (IfcRelDecomposes ifcRelDecomposes : ifcObject.getIsDecomposedBy()) {
					children.addAll(ifcRelDecomposes.getRelatedObjects());
				}
				// relation 2
				if (ifcObject instanceof IfcSpatialStructureElement) {
					IfcSpatialStructureElement ele = (IfcSpatialStructureElement) ifcObject;
					for (IfcRelContainedInSpatialStructure ifcRelDecomposes : ele.getContainsElements()) {
						children.addAll(ifcRelDecomposes.getRelatedElements());
					}
				}
				// relation 3
				if (ifcObject instanceof IfcElement) {
					IfcElement ifcElement = (IfcElement) ifcObject;
					for (IfcRelFillsElement e : SDAIAdapter.asList(ifcElement.getFillsVoids()))
						if (e.getRelatingOpeningElement() != null)
							children.add(e.getRelatingOpeningElement());
				}
				return children;
			}

			@Override
			public EObject getAssertedContainer() {
				// relation 0
				if (ifcObject instanceof IfcProject) {
					IfcProject ifcProject = (IfcProject) ifcObject;
					EObject container = ifcProject.eContainer();
					while (container != null)
						if (container instanceof Model)
							return container;
						else
							container = container.eContainer();
				}
				// relation 1
				if (ifcObject instanceof IfcObjectDefinition) {
					IfcObjectDefinition ifcObjectDefinition = (IfcObjectDefinition) ifcObject;
					IfcRelDecomposes ifcRelDecomposes = ifcObjectDefinition.getDecomposes();
					if (ifcRelDecomposes != null && ifcRelDecomposes.getRelatingObject() != null)
						return ifcRelDecomposes.getRelatingObject();
				}
				// relation 2
				if (ifcObject instanceof IfcProduct) {
					IfcProduct ifcProduct = (IfcProduct) ifcObject;
					IfcRelContainedInSpatialStructure ifcRelDecomposes = ifcProduct.getContainedInStructure();
					if (ifcRelDecomposes != null && ifcRelDecomposes.getRelatingStructure() != null)
						return ifcRelDecomposes.getRelatingStructure();
				}
				// relation 3
				if (ifcObject instanceof IfcOpeningElement) {
					IfcOpeningElement ifcOpeningElement = (IfcOpeningElement) ifcObject;
					EList<IfcRelFillsElement> es = ifcOpeningElement.getHasFillings();
					if (es.size() == 1 && es.get(0).getRelatedBuildingElement() != null)
						return es.get(0).getRelatedBuildingElement();
				}
				return null;
			}

		};
	}

}
