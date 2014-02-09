/**
 * Copyright 2013 Smart Services CRC Pty Ltd
 */
package org.raas4emf.cms.ui.actions;

import org.eclipse.core.commands.AbstractHandler;
import org.eclipse.core.commands.ExecutionEvent;
import org.eclipse.core.commands.ExecutionException;
import org.raas4emf.cms.core.RAASUtils;
import org.raas4emf.cms.ui.CMSActivator;
import org.raas4emf.cms.ui.RAASUIUtils;
import org.raas4emf.cms.ui.views.PreviewView;

import raascms.Artifact;

public class SetColorSchemeAction extends AbstractHandler {

	public SetColorSchemeAction() {
		super();
	}

	@Override
	public Object execute(ExecutionEvent event) throws ExecutionException {
		for (final Artifact colorScheme : RAASUIUtils.getSelection(event, Artifact.class)) {
			CMSActivator.getSessionInstance().setColors(RAASUtils.getBlobAsString(colorScheme));
			for (PreviewView preview : PreviewView.findView()) {
				preview.reload();
			}
		}
		return null;
	}

}
