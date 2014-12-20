/**
 * Copyright 2013 Smart Services CRC Pty Ltd
 */
package org.raas4emf.cms.core;

import org.eclipse.core.runtime.jobs.ISchedulingRule;

public class RAASSchedulingRule implements ISchedulingRule {

	private static int invocations = 0;

	private int lane;
	
	private String jobType = "";

	public RAASSchedulingRule() {
	}

	public RAASSchedulingRule(int laneCount, String jobType) {
		lane = invocations++ % laneCount;
		this.jobType = jobType;
	}

	@Override
	public boolean contains(ISchedulingRule rule) {
		return rule instanceof RAASSchedulingRule && lane == ((RAASSchedulingRule) rule).lane && jobType.equals(((RAASSchedulingRule) rule).jobType);
	}

	@Override
	public boolean isConflicting(ISchedulingRule rule) {
		return contains(rule);
	}

};