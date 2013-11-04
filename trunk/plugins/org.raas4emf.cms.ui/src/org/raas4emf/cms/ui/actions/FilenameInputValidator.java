/**
 * Copyright 2013 Smart Services CRC Pty Ltd
 */
package org.raas4emf.cms.ui.actions;

import org.eclipse.jface.dialogs.IInputValidator;

public class FilenameInputValidator implements IInputValidator {

	@Override
	public String isValid(String newText) {
		for (char c : new char[] { '\\', '/', ':', '*', '?', '"', '<', '>', '|' }) {
			int index = newText.indexOf(c);
			if (index != -1) {
				return "Invalid character at position " + index + "!";
			}
		}
		return null;
	}

}
