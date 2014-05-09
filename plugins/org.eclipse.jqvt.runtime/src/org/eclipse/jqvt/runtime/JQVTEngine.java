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
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

public abstract class JQVTEngine {

	public JQVTEngine() {
		super();
	}

	/**
	 * Only used for the old {@code execute}
	 * 
	 * @return
	 */
	public abstract Iterator allInstancesIterator(String direction);

	public abstract <T> T createInstanceRef(Class<T> clazz);

	/**
	 * Get source model elements under the type clazz
	 * 
	 * @param clazz
	 * @return
	 */
	public abstract <T> List<T> getInstancesFor(Class<T> clazz, String direction);

	/**
	 * The original execute that traverses on objects
	 * 
	 * @param trafo
	 * @throws IllegalAccessException
	 * @throws InvocationTargetException
	 * @throws IOException
	 */
	public void execute_old(Object trafo) throws IllegalAccessException, InvocationTargetException, IOException {

		Activator.log("Starting");

		Map<Class<?>, List<Method>> typeToRelations = new HashMap<Class<?>, List<Method>>();

		// ===========================Change started================
		/**
		 * Changed by Hui, use trafo.getTopSortedMethods() to obtain all the topological sorted top relations
		 */
		List<Method> methods = null;
		try {
			Method getTopSortedMethods = trafo.getClass().getMethod("getTopSortedMethods");
			methods = (List<Method>) getTopSortedMethods.invoke(trafo);
		} catch (NoSuchMethodException e) {
			throw new RuntimeException("No getTopSortedMethods method? Blame Hui");
		} catch (ClassCastException e) {
			throw new RuntimeException("The getTopSortedMethods does not return List<Method>? Blame Hui");
		}
		for (Method m : methods) {
			if (!m.getName().startsWith("top_relation_") || m.getParameterTypes().length == 0)
				continue;
			Class<?> type = m.getParameterTypes()[0];
			List<Method> relations = typeToRelations.get(type);
			if (relations == null) {
				typeToRelations.put(type, relations = new ArrayList<Method>());
			}
			relations.add(m);
		}
		// ===================Change ended here===============

		Iterator<Object> it = this.allInstancesIterator("");
		while (it.hasNext()) {
			Object nextElement = it.next();
			Set<Class> treatedClasses = new HashSet<Class>();
			invokeRelationsFor(trafo, typeToRelations, nextElement, nextElement.getClass(), treatedClasses);
		}

		Activator.log("Finished");
	}

	/**
	 * An internal execution, without parameters about the source and target (that means without load and save) in case the I/O cannot be indicated by just strings
	 * 
	 * This new execute traverses the topological sorted top methods, and for each method, evaluates all the model elements under its parameter type
	 * 
	 * @param trafo
	 * @throws IllegalAccessException
	 * @throws InvocationTargetException
	 * @throws IOException
	 */
	public void execute(Object trafo) throws IllegalAccessException, InvocationTargetException, IOException {

		List<Method> methods = null;
		try {
			Method getTopSortedMethods = trafo.getClass().getMethod("getTopSortedMethods");
			methods = (List<Method>) getTopSortedMethods.invoke(trafo);
		} catch (NoSuchMethodException e) {
			throw new RuntimeException("No getTopSortedMethods method? Blame Hui");
		} catch (ClassCastException e) {
			throw new RuntimeException("The getTopSortedMethods does not return List<Method>? Blame Hui");
		}

		long totalStarted = System.currentTimeMillis();
		int totalTupleCount = 0;
		for (Method m : methods) {
			List<String> directions = null;
			try {
				directions = (List<String>) trafo.getClass().getField(m.getName() + "_directions").get(null);
			} catch (Exception e) {
				Activator.err(e);
			}
			long started = System.currentTimeMillis();
			int paramSize = m.getParameterTypes().length;
			List<List> itemObjects = new ArrayList<List>();
			int[] itemSizes = new int[paramSize];
			for (int i = 0; i < paramSize; i++) {
				Class paraType = m.getParameterTypes()[i];
				List objs = i - 1 >= 0 && itemSizes[i - 1] == 0 ? Collections.EMPTY_LIST : this.getInstancesFor(paraType, directions.get(i));
				itemSizes[i] = objs.size();
				itemObjects.add(objs);
			}
			int total = 1;
			for (int i = 0; i < paramSize; i++) {
				total *= itemSizes[i];
			}
			int tupleCount = 0;
			int successful = 0;

			if (total >= 1)
				Activator.log("Processing  " + total + " tuples of " + m.getName() + " ...");

			// Use the cartesian product of all instances as the parameters.
			for (int i = 0; i < total; i++) {
				int temp = i;
				Object[] params = new Object[paramSize];
				for (int j = paramSize - 1; j >= 0; j--) {
					params[j] = itemObjects.get(j).get(temp % itemSizes[j]);
					temp /= itemSizes[j];
				}
				Object o = m.invoke(trafo, params);
				if (o != null) {
					successful++;
				}
				tupleCount++;
			}
			long ended = System.currentTimeMillis();
			totalTupleCount += tupleCount;
			if (tupleCount >= 1)
				Activator.log(successful + " successful tuples of " + m.getName() + " took " + (ended - started) + " milliseconds");
		}
		long totalEnded = System.currentTimeMillis();
		Activator.log("Processing totally " + totalTupleCount + " tuples took " + (totalEnded - totalStarted) + " milliseconds");

	}

	/**
	 * It is not used for the new {@code execute}
	 * 
	 * @param trafo
	 * @param typeToRelations
	 * @param nextElement
	 * @param itf
	 * @param treatedClasses
	 * @throws IllegalAccessException
	 * @throws InvocationTargetException
	 */
	protected void invokeRelationsFor(Object trafo, Map<Class<?>, List<Method>> typeToRelations, Object nextElement, Class<?> itf, Set<Class> treatedClasses) throws IllegalAccessException, InvocationTargetException {
		if (!treatedClasses.add(itf))
			return;
		List<Method> relations = typeToRelations.get(itf);
		if (relations != null)
			for (Method m : relations) {
				Object[] params = new Object[m.getParameterTypes().length];
				params[0] = nextElement;
				Object o = m.invoke(trafo, params);
				Activator.log(m.getName() + " evaluated to " + (o != null));
			}
		for (Class<?> itf2 : itf.getInterfaces()) {
			invokeRelationsFor(trafo, typeToRelations, nextElement, itf2, treatedClasses);
		}
		if (itf.getSuperclass() != null)
			invokeRelationsFor(trafo, typeToRelations, nextElement, itf.getSuperclass(), treatedClasses);
	}

}