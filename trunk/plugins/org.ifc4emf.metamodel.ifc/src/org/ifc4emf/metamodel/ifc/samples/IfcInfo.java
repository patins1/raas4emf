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
package org.ifc4emf.metamodel.ifc.samples;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.xmi.impl.XMIResourceFactoryImpl;
import org.ifc4emf.metamodel.ifcheader.Model;
import org.ifc4emf.metamodel.trace.TracePackage;

import IFC2X3.IFC2X3Package;
import IFC2X3.util.IFC2X3ResourceFactoryImpl;
import IFC2X3.util.IFC2X3ResourceImpl;
import express2ecore.Express2ecorePackage;

/**
 * Class to print out some info about occurence numbers of an IFC file
 * 
 */
public class IfcInfo {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		// register metamodel packages
		EPackage.Registry.INSTANCE.put(Express2ecorePackage.eNS_URI, Express2ecorePackage.eINSTANCE);
		EPackage.Registry.INSTANCE.put(IFC2X3Package.eNS_URI, IFC2X3Package.eINSTANCE);
		EPackage.Registry.INSTANCE.put(TracePackage.eNS_URI, TracePackage.eINSTANCE);

		// register resource factories
		Resource.Factory.Registry.INSTANCE.getExtensionToFactoryMap().put("ifc", new IFC2X3ResourceFactoryImpl());
		Resource.Factory.Registry.INSTANCE.getExtensionToFactoryMap().put("xmi", new XMIResourceFactoryImpl());
		Resource.Factory.Registry.INSTANCE.getExtensionToFactoryMap().put("xml", new XMIResourceFactoryImpl());

		// print info about some IFC file on disk
		ResourceSet resourceSet = new ResourceSetImpl();
		IFC2X3ResourceImpl resource = (IFC2X3ResourceImpl) resourceSet.getResource(URI.createFileURI("D:\\dev\\ibim\\Buildings\\industrial\\v1\\industrial.ifc"), true);
		Model model = (Model) resource.getContents().get(0);
		System.out.println("#BuildingElements=" + model.getNumBuildingElements());
		System.out.println("#Buildings=" + model.getNumBuildings());
		System.out.println("#BuildingStories=" + model.getNumBuildingStories());
		System.out.println("#IfcObjects=" + model.getNumIfcObjects());
		System.out.println("#Products=" + model.getNumProducts());
		System.out.println("#Sites=" + model.getNumSites());
		System.out.println("#Spaces=" + model.getNumSpaces());

	}

}
