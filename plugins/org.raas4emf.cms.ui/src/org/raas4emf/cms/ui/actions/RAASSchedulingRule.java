/**
 * Copyright 2013 Smart Services CRC Pty Ltd
 */
package org.raas4emf.cms.ui.actions;

import org.eclipse.core.runtime.jobs.ISchedulingRule;

public class RAASSchedulingRule implements ISchedulingRule {

	@Override
	public boolean contains(ISchedulingRule rule) {
		return rule instanceof RAASSchedulingRule;
	}

	@Override
	public boolean isConflicting(ISchedulingRule rule) {
		return rule instanceof RAASSchedulingRule;
	}

};