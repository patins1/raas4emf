/**
 * Copyright 2013 Smart Services CRC Pty Ltd
 */
package org.raas4emf.cms.ui.editor.editor;

import org.eclipse.ui.forms.editor.IFormPage;

public interface IFormPageFactory {

	boolean canDisplay(Object viewerInput);

	IFormPage createInstance(RAASEditorExt raasEditorExt);

	String getPageText();

}
