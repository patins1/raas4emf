/**
 * Copyright 2013 Smart Services CRC Pty Ltd
 */
package org.raas4emf.cms.ui;

import org.eclipse.core.expressions.PropertyTester;
import org.raas4emf.cms.core.RAASUtils;

import raascms.Artifact;

public class PropertyTester4 extends PropertyTester {

	public PropertyTester4() {
	}

	@Override
	public boolean test(Object receiver, String property, Object[] args, Object expectedValue) {
		if (receiver instanceof Artifact && expectedValue instanceof String) {
			String string = (String) expectedValue;
			Artifact artifact = (Artifact) receiver;
			return RAASUtils.hasExtension(artifact, string);
		}
		return false;
	}

}
