/**
 * Copyright 2013 Smart Services CRC Pty Ltd
 */
package org.raas4emf.cms.ui.editor.editor;

import org.eclipse.swt.widgets.Composite;
import org.eclipse.ui.forms.widgets.Section;
import org.eclipse.ui.forms.widgets.ToggleHyperlink;

/**
 * This class exposes the toggle
 * 
 * @author kiegelan
 * 
 */
public class CleverSection extends Section {

	public CleverSection(Composite parent, int style) {
		super(parent, style);
	}

	public ToggleHyperlink getToggle() {
		return toggle;
	}

	@Override
	public void reflow() {
		super.reflow();
	}
}
