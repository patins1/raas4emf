/**
 * Copyright 2013 Smart Services CRC Pty Ltd
 */
package org.raas4emf.cms.ui.adapters;

import java.util.Collection;

import org.eclipse.emf.ecore.EObject;
import org.ifc4emf.metamodel.ifcheader.Model;
import org.ifc4emf.part21.loader.ContainmentTreeOrderedByNumberHelper;
import org.raas4emf.cms.core.IGeometricIDResolver;
import org.raas4emf.cms.core.RAASUtils;
import org.raas4emf.cms.ui.AdapterFactoryTyped;
import org.raas4emf.cms.ui.views.DirectoryView;

import raascms.Artifact;
import IFC2X3.IfcRoot;

public class GeometricIDResolverAdapterFactory extends AdapterFactoryTyped<String, IGeometricIDResolver> {

	@Override
	public IGeometricIDResolver getAdapterTyped(final String guid, Class<IGeometricIDResolver> adapterType) {
		return new IGeometricIDResolver() {

			@Override
			public EObject resolve(Artifact artifact) {
				if (guid.startsWith("cdo")) {
					return RAASUtils.findObjectById(guid.substring("cdo".length()), artifact.eResource());
				}
				if (guid.startsWith("_")) {
					for (EObject content : artifact.getContents()) {
						if (content instanceof Model) {
							Model model = (Model) content;
							ContainmentTreeOrderedByNumberHelper helper = new ContainmentTreeOrderedByNumberHelper(model);
							try {
								return helper.get(new Integer(guid.substring(1)));
							} catch (NumberFormatException e) {
								// do nothing
							}
						}
					}
				}
				return findByName(artifact.getContents());
			}

			private EObject findByName(Collection<EObject> contents) {
				for (EObject eObject : contents) {
					if (eObject instanceof IfcRoot) {
						IfcRoot ifcRoot = (IfcRoot) eObject;
						if (guid.equals(ifcRoot.getName()))
							return ifcRoot;
					}
					EObject x = findByName(DirectoryView.getLogicalChildren(eObject));
					if (x != null)
						return x;
				}
				return null;
			}

		};
	}

}
