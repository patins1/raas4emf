/**
 * Copyright 2013 Smart Services CRC Pty Ltd
 */
package org.raas4emf.cms.core;

import java.util.List;

import org.eclipse.emf.ecore.EObject;

import raascms.Artifact;

public interface IGeometricHighlighter {

	List<? extends EObject> getElementsToHighlight();

	Artifact getModelArtifact();

}
