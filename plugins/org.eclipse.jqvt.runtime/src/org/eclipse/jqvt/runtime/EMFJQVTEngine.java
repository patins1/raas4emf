/**
 * Copyright (c) 2010- 2011 Joerg Kiegeland,  Song Hui.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *    Joerg Kiegeland - initial API and implementation
 *    Song Hui - interrelational logic
 */
package org.eclipse.jqvt.runtime;

import java.io.IOException;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.util.EcoreUtil;

public class EMFJQVTEngine extends JQVTEngine {

	public final List<Object> createdElements = new ArrayList<Object>();
	final Map<String, Collection<?>> srcResMap = new HashMap<String, Collection<?>>();

	// Collection<?> srcRes = null;

	@Override
	public <T> T createInstanceRef(Class<T> clazz) {
		try {
			String packageName = clazz.getPackage().getName();
			String className = packageName.substring(packageName.lastIndexOf('.') + 1) + "Factory";
			className = className.substring(0, 1).toUpperCase() + className.substring(1);
			Class<?> factory = Class.forName(packageName + "." + className, true, clazz.getClassLoader());
			Field f = factory.getField("eINSTANCE");
			Object eINSTANCE = f.get(null);
			Method m = factory.getMethod("create" + clazz.getSimpleName());
			T result = (T) m.invoke(eINSTANCE);
			createdElements.add((EObject) result);
			return result;
		} catch (Throwable e) {
			throw new RuntimeException("Error as trying to create instance of " + clazz, e);
		}
	}

	/**
	 * An EMF version execute, using URI strings to indicate the source and target models
	 * 
	 * @param trafo
	 * @param source
	 *            defines the source model; expected is either a URI string for which the EMF resource is loaded, or a {@link java.util.Collection} with the semantics of {@link EcoreUtil#getAllContents(Collection, boolean))} with the last parameter set to <code>true</code>
	 * @param target
	 *            defines the target model; expected is either a URI string for which the EMF resource is loaded, or a {@link java.util.Collection} to which new elements are added
	 * @throws IllegalAccessException
	 * @throws InvocationTargetException
	 * @throws IOException
	 */
	public void execute(Object trafo, Object... models) throws IllegalAccessException, InvocationTargetException, IOException {
		Activator.log("Starting");

		ResourceSet rset = new ResourceSetImpl();

		List<String> directions = null;
		try {
			directions = (List<String>) trafo.getClass().getField("global_direction").get(null);
			for (int i = 0; i < models.length - 1; i++) {
				Activator.log("Loading " + models[i]);
				Collection<?> srcRes = models[i] instanceof String ? Arrays.asList(rset.getResource(URI.createURI((String) models[i]), true)) : (Collection<?>) models[i];
				Activator.log("Loaded " + models[i]);
				srcResMap.put(directions.get(i), srcRes);
			}
		} catch (Exception e) {
			Activator.err(e);
		}

		Object target = models[models.length - 1];
		Object targetRes = target instanceof String ? rset.createResource(URI.createURI(((String) target))) : (Collection<?>) target;

		super.execute(trafo);

		for (Object eObject : createdElements) {
			if (((EObject) eObject).eContainer() == null && ((EObject) eObject).eResource()==null && !((EObject)eObject).eIsProxy()) {
				if (targetRes instanceof Resource)
					((Resource) targetRes).getContents().add((EObject) eObject);
				else
					((Collection) targetRes).add(eObject);
			}
		}
		doSave(targetRes);
		Activator.log("Finished");
	}

	protected void doSave(Object targetRes) throws IOException {
		if (targetRes instanceof Resource)
			((Resource) targetRes).save(null);
	}

	@Override
	public Iterator<?> allInstancesIterator(String direction) {
		Iterator<?> it = EcoreUtil.getAllContents(srcResMap.get(direction), true);
		return it;
	}

	private Map<String, List> mapInstancesList = new HashMap<String, List>();

	/**
	 * Get all instances of the type clazz, the result is cached
	 */
	@Override
	public <T> List<T> getInstancesFor(Class<T> clazz, String direction) {
		String key = clazz.getName() + direction;
		List cached = mapInstancesList.get(key);
		if (cached != null)
			return (List<T>) cached;
		cached = new ArrayList<T>();
		for (Iterator<?> it = allInstancesIterator(direction); it.hasNext();) {
			Object curr = it.next();
			if (clazz.isInstance(curr))
				cached.add(curr);
		}
		mapInstancesList.put(key, cached);
		return (List<T>) cached;
	}

	public List<Object> getCreatedElements() {
		return createdElements;
	}

}
