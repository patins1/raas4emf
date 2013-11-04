/**
 * Copyright 2013 Smart Services CRC Pty Ltd
 */
package org.raas4emf.cms.ui.rap;

import org.eclipse.rap.ui.interactiondesign.layout.model.ILayoutSetInitializer;
import org.eclipse.rap.ui.interactiondesign.layout.model.LayoutSet;
import org.eclipse.swt.layout.FormAttachment;
import org.eclipse.swt.layout.FormData;

public class RAASLogoInitializer implements ILayoutSetInitializer {

	public RAASLogoInitializer() {
		// nothing to do
	}

	@Override
	public void initializeLayoutSet(LayoutSet layoutSet) {
		String path = ILayoutSetConstants.IMAGE_PATH_BUSINESS;
		layoutSet.addImagePath(ILayoutSetConstants.LOGO, path + "logo.png");

		FormData fdLogo = new FormData();
		fdLogo.right = new FormAttachment(100, -75);
		fdLogo.top = new FormAttachment(0, 0);
		layoutSet.addPosition(ILayoutSetConstants.LOGO_POSITION, fdLogo);

	}

}
