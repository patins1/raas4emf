/**
 * Copyright 2013 Smart Services CRC Pty Ltd
 */
package org.raas4emf.cms.ui.adapters;

import org.eclipse.emf.ecore.EObject;
import org.ifc4emf.metamodel.ifcheader.Model;
import org.ifc4emf.part21.loader.ContainmentTreeOrderedByNumberHelper;
import org.raas4emf.cms.core.IGeometricIDBuilder;
import org.raas4emf.cms.ui.AdapterFactoryTyped;

import IFC2X3.IfcRoot;

public class GeometricIDBuilderAdapterFactory extends AdapterFactoryTyped<IfcRoot, IGeometricIDBuilder> {

	@Override
	public IGeometricIDBuilder getAdapterTyped(final IfcRoot ifcRoot, Class<IGeometricIDBuilder> adapterType) {
		return new IGeometricIDBuilder() {

			@Override
			public String buildID() {
				EObject p = ifcRoot;
				while (p != null) {
					if (p instanceof Model) {
						Model model = (Model) p;
						if ("".equals(model.getDescription().getImplementation_level()))
							return ifcRoot.getName(); // reverse eng. model
						break;
					}
					p = p.eContainer();
				}
				int index = getPart21Index(ifcRoot);
				if (index != -1) {
					return "_" + index;
				}
				return null;
			}

		};
	}

	static public Model getModel(EObject parent) {
		while (parent != null) {
			if (parent instanceof Model) {
				Model artifact = (Model) parent;
				return artifact;
			}
			parent = parent.eContainer();
		}
		return null;
	}

	static public int getPart21Index(EObject eObject) {
		Model model = getModel(eObject);
		if (model != null) {
			return new ContainmentTreeOrderedByNumberHelper(model).get(eObject, null);
		}
		return -1;
	}

}
