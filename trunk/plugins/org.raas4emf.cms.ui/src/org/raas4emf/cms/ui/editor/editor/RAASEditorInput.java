/**
 * Copyright 2013 Smart Services CRC Pty Ltd
 */
package org.raas4emf.cms.ui.editor.editor;

import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.emf.cdo.view.CDOView;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.ui.IEditorInput;

import raascms.Artifact;

public interface RAASEditorInput extends IEditorInput {

	public boolean isPersistent();

	public CDOView getView();

	public String getResourcePath();

	public EObject getModelElement();

	public void doSave(IProgressMonitor progressMonitor);

	public Artifact getPersistenArtifact();
}
