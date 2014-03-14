/**
 * Copyright 2013 Smart Services CRC Pty Ltd
 */
package org.raas4emf.cms.ui.adapters;

import java.util.Collection;

import org.eclipse.emf.ecore.EObject;
import org.ifc4emf.metamodel.ifcheader.Model;
import org.raas4emf.cms.core.IGeometricIDResolver;
import org.raas4emf.cms.core.RAASUtils;
import org.raas4emf.cms.ui.AdapterFactoryTyped;
import org.raas4emf.cms.ui.CMSActivator;
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
					try {
						EObject result = RAASUtils.getFromIndex(new Integer(guid.substring(1)), artifact);
						if (result != null)
							return result;
					} catch (NumberFormatException e) {
						// do nothing
					}
				}
				for (EObject eObject : artifact.getContents()) {
					if (eObject instanceof Model) {
						Model model = (Model) eObject;
						long start = System.currentTimeMillis();
						Integer index = getIndexForGUID(model, guid);
						long end0 = System.currentTimeMillis();
						// EMap<String, Integer> guidToPart21 = model.getGuidToPart21() != null ? model.getGuidToPart21().getGuidToPart21() : new BasicEMap<String, Integer>();
						// long end1 = System.currentTimeMillis();
						// Integer index2 = guidToPart21.get(guid);
						// long end2 = System.currentTimeMillis();
						CMSActivator.log("SQL find index for guid took " + (end0 - start) + " milliseconds");
						// CMSActivator.log("Get index for guid took " + (end1 - end0) + " milliseconds");
						// CMSActivator.log("Find index for guid took " + (end2 - end1) + " milliseconds");
						// CMSActivator.log(index + "=" + index2);
						if (index != null) {
							EObject result = RAASUtils.getFromIndex(index, artifact);
							if (result != null)
								return result;
						}
					}
				}
				return null;// findByName(artifact.getContents());
			}

			private Integer getIndexForGUID(Model model, String guid) {
				return RAASUtils.getIndexForGUIDStatic(model, guid);
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
