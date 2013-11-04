/**
 * Copyright 2013 Smart Services CRC Pty Ltd
 */
package org.raas4emf.cms.ui.adapters;

import java.util.Arrays;
import java.util.Collection;

import org.eclipse.emf.ecore.EObject;
import org.ifc4emf.metamodel.ifcheader.Model;
import org.raas4emf.cms.core.ILogicalParentChildRelationship;
import org.raas4emf.cms.ui.AdapterFactoryTyped;

public class IfcModelParentChildRelationshipAdapterFactory extends AdapterFactoryTyped<Model, ILogicalParentChildRelationship> {

	@Override
	public ILogicalParentChildRelationship getAdapterTyped(final Model model, Class<ILogicalParentChildRelationship> adapterType) {
		return new ILogicalParentChildRelationship() {

			@Override
			public Collection<EObject> getLogicalChildren() {
				// relation 0
				if (model.getRoot() != null)
					return Arrays.asList(model.getRoot());
				return null;
			}

			@Override
			public EObject getAssertedContainer() {
				return null;
			}

		};
	}

}
