/**
 * Copyright 2013 Smart Services CRC Pty Ltd
 */
package org.raas4emf.cms.core;

import java.util.Collection;

import org.eclipse.emf.ecore.EObject;

public interface ILogicalParentChildRelationship {

	Collection<EObject> getLogicalChildren();

	EObject getAssertedContainer();

}
