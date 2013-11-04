/**
 * Copyright 2013 Smart Services CRC Pty Ltd
 */
package org.raas4emf.cms.ui.rap;

import org.eclipse.rap.internal.design.example.business.layoutsets.CoolbarInitializer;
import org.eclipse.rap.ui.interactiondesign.layout.model.ILayoutSetInitializer;
import org.eclipse.rap.ui.interactiondesign.layout.model.LayoutSet;
import org.eclipse.swt.layout.FormData;

@SuppressWarnings("restriction")
public class RAASCoolbarInitializer extends CoolbarInitializer implements ILayoutSetInitializer {

	@Override
	public void initializeLayoutSet(LayoutSet layoutSet) {
		super.initializeLayoutSet(layoutSet);
		FormData spacingData = new FormData();
		spacingData.width = 0;
		layoutSet.addPosition(ILayoutSetConstants.COOLBAR_SPACING, spacingData);
	}

}
