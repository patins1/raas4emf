/**
 * Copyright (c) 2015, 2016 Joerg Kiegeland, Distributed Models Pty Ltd, and others.
 * All rights reserved.   This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */

package ocltransformation;

import java.io.IOException;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.stream.Stream;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.URIConverter;
import org.eclipse.emf.ecore.xmi.XMLResource;
import org.eclipse.emf.ecore.xmi.impl.GenericXMLResourceFactoryImpl;
import org.eclipse.emf.ecore.xml.type.AnyType;
import org.eclipse.emf.ecore.xml.type.XMLTypeDocumentRoot;
import org.eclipse.emf.ecore.util.FeatureMap;

/**
 * This class contains helper functions to evaluate the Java equivalents of the OCL expressions
 */
public class OCLTransformationHelper {

	// / For a singleton set, returns the one and only element
	static public <T> T One(T item) {
		return item;
	}

	// / For a singleton set, returns the one and only element
	static public <T> T One(Stream<T> list) {
		Optional<T> optional = list.findFirst();
		if (optional.isPresent())
			return optional.get();
		return null;
	}

	//
	static public <T> Stream<T> Set(List<T> item) {
		return item.stream();
	}

	// / Makes an element or elements available as set
	static public <T> Stream<T> Set(T item) {
		ArrayList<T> result = new ArrayList<T>();
		if (item != null)
			result.add(item);
		return result.stream();
	}

	// / Flattens nested set structures
	static public <T extends EObject> Stream<T> Flatten(Stream<Stream<T>> list) {
		return list.flatMap(x -> x);
	}

	static public <T> T Flatten(T list) {
		return list;
	}

}