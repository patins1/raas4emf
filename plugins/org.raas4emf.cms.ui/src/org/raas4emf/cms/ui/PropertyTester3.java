/**
 * Copyright 2013 Smart Services CRC Pty Ltd
 */
package org.raas4emf.cms.ui;

import org.eclipse.core.expressions.PropertyTester;
import org.raas4emf.cms.core.RAASUtils;

import raascms.Folder;

public class PropertyTester3 extends PropertyTester {

	public PropertyTester3() {
	}

	@Override
	public boolean test(Object receiver, String property, Object[] args, Object expectedValue) {
		if (receiver instanceof Folder) {
			Folder folder = (Folder) receiver;
			if (RAASUtils.getPropertiesFile(folder) != null) {
				return true;
			}
		}
		return false;
	}

}
