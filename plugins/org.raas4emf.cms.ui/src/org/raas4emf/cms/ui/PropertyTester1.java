/**
 * Copyright 2013 Smart Services CRC Pty Ltd
 */
package org.raas4emf.cms.ui;

import org.eclipse.core.expressions.PropertyTester;
import org.raas4emf.cms.core.RAASUtils;

import raascms.Artifact;

public class PropertyTester1 extends PropertyTester {

	public PropertyTester1() {
	}

	@Override
	public boolean test(Object receiver, String property, Object[] args, Object expectedValue) {
		if (receiver instanceof Artifact) {
			final Artifact artifact = (Artifact) receiver;
			if (artifact.getFileContent() != null && !RAASUtils.isModelComplete(artifact)) {
				return true;
			}
		}
		return false;
	}

}
