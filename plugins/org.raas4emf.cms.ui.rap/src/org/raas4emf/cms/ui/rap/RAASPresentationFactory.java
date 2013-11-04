/**
 * Copyright 2013 Smart Services CRC Pty Ltd
 */
package org.raas4emf.cms.ui.rap;

import org.eclipse.jface.internal.provisional.action.ICoolBarManager2;
import org.eclipse.rap.internal.design.example.managers.CoolBarManager;
import org.eclipse.swt.layout.FormAttachment;
import org.eclipse.swt.layout.FormData;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Control;

@SuppressWarnings("restriction")
public class RAASPresentationFactory extends org.eclipse.rap.internal.design.example.business.BusinessPresentationFactory {

	public RAASPresentationFactory() {
	}

	@Override
	public ICoolBarManager2 createCoolBarManager() {
		return new CoolBarManager() {

			private static final long serialVersionUID = 1L;

			@Override
			public Control createControl2(Composite parent) {
				FormData fdCoolBar = (FormData) parent.getLayoutData();
				fdCoolBar.top = new FormAttachment(0, 33);
				fdCoolBar.bottom = new FormAttachment(100, 0);
				return super.createControl2(parent);
			}

		};
	}

}
