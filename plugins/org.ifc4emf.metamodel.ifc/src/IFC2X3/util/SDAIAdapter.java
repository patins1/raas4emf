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

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Enumeration;
import java.util.List;

import org.eclipse.emf.common.util.EList;

/**
 * Class with utilities to adapt migrated SDAI code
 */
public class SDAIAdapter {

	/**
	 * Whether geometric calculations as EDM does it shall be simulated. TODO
	 * EDM calculations may be wrong, check this.
	 */
	public static final boolean SIMULATE_EDM_CALCULATIONS = true;
	
	/**
	 * The Derby DB cannot store NAN, so do not do it in the IBM model, see
	 * https://issues.apache.org/jira/browse/DERBY-3290
	 */
	public static final boolean DONT_STORE_NAN = true;

	/**
	 * Since some references are not multivalued as corresponding SDAI
	 * references, this method can be used to get a List object nevertheless.
	 * 
	 * @param <T>
	 * @param item
	 *            can be <code>null</code>
	 * @return an empty list if the passed object is <code>null</code>,
	 *         otherwise a list containing this object.
	 */
	@SuppressWarnings("unchecked")
	public static <T> List<T> asList(T item) {
		if (item == null)
			return new ArrayList<T>();
		return Arrays.asList(item);
	}

	/**
	 * @param <T>
	 * @param list
	 *            a list
	 * @return returns the same list as passed. Purpose: the other same-named
	 *         method shall not create List<List<T>>
	 */
	public static <T> List<T> asList(List<T> list) {
		return list;
	}

	/**
	 * @param <T>
	 * @param list
	 * @return <code>null</code> if list is empty (as SDAI's "elements()" would
	 *         do), otherwise an enumeration for this list
	 */
	public static <T> Enumeration<T> elements(List<T> list) {
		if (list.isEmpty())
			return null;
		return Collections.enumeration(list);
	}

	/**
	 * Checks if list is not empty. Background: SDAI returns a <code>null</code>
	 * list where EMF returns an empty list. So this method can be used to
	 * abstract from this difference.
	 * 
	 * @param list
	 * @return
	 */
	public static boolean notEmpty(List<?> list) {
		if (!(list instanceof EList))
			throw new RuntimeException("expected EList");
		return !list.isEmpty();
	}

	/**
	 * Checks if enumeration is not empty. Background: SDAI returns a
	 * <code>null</code> enumeration for empty lists. So the parameter is just
	 * checked for <code>null</code> as {@link #elements(List)} also returns
	 * <code>null</code> for empty lists.
	 * 
	 * @param enumeration
	 * @return
	 */
	public static boolean notEmpty(Enumeration<?> enumeration) {
		return enumeration != null;
	}

	/**
	 * As {@link #notEmpty(List)}, however this check should be a irrelevant to
	 * the control-flow, i.e. always returning true results in unmodified
	 * program behavior. Background: Old SDAI code had to check against
	 * <code>null</code>.
	 * 
	 * @param list
	 * @return
	 */
	public static boolean notEmptyIrrelevant(List<?> list) {
		if (!(list instanceof EList))
			throw new RuntimeException("expected EList");
		return !list.isEmpty();
	}

}
