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
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/**
 * @author DSGAdmin
 * 
 */
public class PlainJQVTEngine extends JQVTEngine {

	private Map<String, List> mapInstancesList = new HashMap<String, List>();

	/**
	 * 
	 */
	public PlainJQVTEngine() {
		// TODO Auto-generated constructor stub
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.eclipse.jqvt.runtime.JQVTEngine#allInstancesIterator(java.lang.String)
	 */
	@Override
	public Iterator allInstancesIterator(String direction) {
		throw new RuntimeException("should never be called");
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.eclipse.jqvt.runtime.JQVTEngine#createInstanceRef(java.lang.Class)
	 */
	@Override
	public <T> T createInstanceRef(Class<T> clazz) {
		// TODO Auto-generated method stub
		return outRes.createInstancesRef(clazz);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.eclipse.jqvt.runtime.JQVTEngine#getInstancesFor(java.lang.Class, java.lang.String)
	 */
	@Override
	public <T> List<T> getInstancesFor(Class<T> clazz, String direction) {
		String key = clazz.getName() + direction;
		List cached = mapInstancesList.get(key);
		if (cached != null)
			return (List<T>) cached;
		cached = new ArrayList<T>();
		List<T> list = srcResMap.get(direction).getInstancesFor(clazz);
		mapInstancesList.put(key, list);
		return list;
	}

	public Map<String, InputResource> srcResMap = new HashMap<String, InputResource>();
	public OutputResource outRes = null;

	public void execute(Object trafo, PlainJQVTEngine.JQVTResource... resources) throws IllegalAccessException, InvocationTargetException, IOException {
		List<String> directions = null;
		try {
			directions = (List<String>) trafo.getClass().getField("global_direction").get(null);
			for (int i = 0; i < resources.length - 1; i++) {
				InputResource iRes = (InputResource) resources[i];
				iRes.load();
				srcResMap.put(directions.get(i), iRes);
			}
			outRes = (OutputResource) resources[resources.length - 1];
		} catch (Exception e) {
			Activator.err("The first argument may not be a legal Transformation: " + trafo, e);
		}

		super.execute(trafo);

		outRes.finish();

	}

	public static interface JQVTResource {

	}

	public static interface InputResource extends JQVTResource {
		<T> List<T> getInstancesFor(Class<T> clazz);

		void load();
	}

	public static interface OutputResource extends JQVTResource {
		<T> T createInstancesRef(Class<T> clazz);

		void finish();
	}

}
