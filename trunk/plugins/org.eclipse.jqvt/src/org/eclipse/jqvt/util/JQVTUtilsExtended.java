/**
 * Copyright 2013 Smart Services CRC Pty Ltd
 */
package org.eclipse.jqvt.util;

import java.util.Iterator;

import org.eclipse.emf.ecore.EObject;

/**
 * Utility methods not expressible with xtend
 */
@SuppressWarnings("restriction")
public class JQVTUtilsExtended {

	public static Iterable<EObject> getContainerIterable(final EObject eObject) {
		return new Iterable<EObject>() {

			@Override
			public Iterator<EObject> iterator() {
				return new Iterator<EObject>() {

					EObject current = eObject;

					@Override
					public boolean hasNext() {
						return current != null;
					}

					@Override
					public EObject next() {
						EObject result = current;
						current = current.eContainer();
						return result;
					}

					@Override
					public void remove() {
					}

				};
			}

		};
	}

}
