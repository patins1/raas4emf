/**
 * Copyright (c) 2010- 2011 QUT (Brisbane, Australia) and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *    Jim Steel - initial API and implementation
 *    Joerg Kiegeland - extension for database storage 
 */
package IFC2X3.util;

import java.io.IOException;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

import org.eclipse.core.runtime.Platform;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.xmi.impl.XMIResourceFactoryImpl;
import org.ifc4emf.metamodel.express.util.ExpressResourceFactoryImpl;

import express2ecore.Express2ecorePackage;

/**
 * Load the Express model from an XMI file (use the main method to generate the XMI file). This is much faster in debug mode.
 * 
 * @author Joe
 * 
 */
public class LoadExpressAsXmi {

	/**
	 * @param args
	 * @throws IOException
	 */
	public static void main(String[] args) throws IOException {

		// register metamodel packages
		EPackage.Registry.INSTANCE.put(Express2ecorePackage.eNS_URI, Express2ecorePackage.eINSTANCE);

		// register resource factories
		Resource.Factory.Registry.INSTANCE.getExtensionToFactoryMap().put("xmi", new XMIResourceFactoryImpl());
		Resource.Factory.Registry.INSTANCE.getExtensionToFactoryMap().put("exp", new ExpressResourceFactoryImpl());

		ResourceSet rs = new ResourceSetImpl();
		Resource expressModel = rs.getResource(URI.createFileURI("/C:/dev/cad/org.ifc4emf.metamodel.ifc/model/IFC2X3_Final_Struct.exp"), true);
		Set<EObject> danglings = new HashSet<EObject>();
		for (Iterator<EObject> it = EcoreUtil.getAllContents(expressModel, true); it.hasNext();) {
			EObject eObject = it.next();
			for (EReference eRef : eObject.eClass().getEAllReferences()) {
				if (!eRef.isContainment() && !eRef.isContainer() && !eRef.isDerived()) {
					Object val = eObject.eGet(eRef);
					List<EObject> list = val instanceof List ? (List) val : val != null ? Arrays.asList(val) : Arrays.asList();
					for (EObject cross : list) {
						if (cross.eResource() == null)
							danglings.add(cross);
					}
				}
			}
		}

		// not works, getting exception:
		// Map<EObject, Collection<Setting>> cross = CrossReferencer
		// .find(expressModel.getContents());
		// for (Collection<Setting> settings : cross.values()) {
		// for (Setting setting : settings) {
		// danglings.add(setting.getEObject());
		// }
		// }
		Resource expressXmiModel = rs.createResource(URI.createFileURI("/C:/dev/cad/org.ifc4emf.metamodel.ifc/model/IFC2X3_Final_Struct.exp.xmi"));
		expressXmiModel.getContents().addAll(expressModel.getContents());
		expressXmiModel.getContents().addAll(danglings);
		expressXmiModel.save(Collections.EMPTY_MAP);

	}

	private static URI createParentFolderUri(URI uri) {
		String lastSegment = uri.lastSegment();
		return (lastSegment == null || lastSegment.length() == 0 ? uri : uri.trimSegments(1).appendSegment(""));
	}

	/**
	 * Call on a just-created ResourceSet to preload the Express model from a XMI file
	 * 
	 * @param rs
	 */
	public static void fastLoadIFC(ResourceSet rs) {
		URI xmiUri;
		if (Platform.isRunning()) {
			xmiUri = URI.createURI("platform:/plugin/org.ifc4emf.metamodel.ifc/model/IFC2X3_Final_Struct.exp.xmi");
		} else {
			xmiUri = URI.createURI(String.valueOf(LoadExpressAsXmi.class.getResource("IFC2X3_Final_Struct.exp.xmi")));
		}
		Resource expressXmiModel = rs.getResource(xmiUri, true);
		expressXmiModel.setURI(URI.createURI("platform:/plugin/org.ifc4emf.metamodel.ifc/model/IFC2X3_Final_Struct.exp"));
	}

}
