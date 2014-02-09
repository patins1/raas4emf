/**
 * Copyright 2013 Smart Services CRC Pty Ltd
 */
package org.raas4emf.cms.ui.actions;

import org.eclipse.core.commands.AbstractHandler;
import org.eclipse.core.commands.ExecutionEvent;
import org.eclipse.core.commands.ExecutionException;
import org.raas4emf.cms.ui.CMSActivator;
import org.raas4emf.cms.ui.RAASUIUtils;

import raascms.Artifact;

public class DownloadAction extends AbstractHandler {

	@Override
	public Object execute(ExecutionEvent event) throws ExecutionException {
		for (final Artifact artifact : RAASUIUtils.getSelection(event, Artifact.class)) {
			CMSActivator.getSessionInstance().exportPSets(artifact);
		}
		return null;
	}

}
