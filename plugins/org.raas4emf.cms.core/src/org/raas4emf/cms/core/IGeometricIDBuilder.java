/**
 * Copyright 2013 Smart Services CRC Pty Ltd
 */
package org.raas4emf.cms.core;

public interface IGeometricIDBuilder {

	/**
	 * Builds the ID used by the adapted object in the geometry representation
	 * 
	 * @return the ID or <code>null</code> if not present
	 */
	String buildID();

}
