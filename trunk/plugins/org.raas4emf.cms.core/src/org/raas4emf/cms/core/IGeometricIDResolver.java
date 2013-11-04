/**
 * Copyright 2013 Smart Services CRC Pty Ltd
 */
package org.raas4emf.cms.core;

import org.eclipse.emf.ecore.EObject;

import raascms.Artifact;

public interface IGeometricIDResolver {

	EObject resolve(Artifact artifact);

}
