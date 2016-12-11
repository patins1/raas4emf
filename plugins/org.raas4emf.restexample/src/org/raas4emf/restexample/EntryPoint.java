/**
 * Copyright (c) 2015, 2016 Joerg Kiegeland, Distributed Models Pty Ltd, and others.
 * All rights reserved.   This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */

package org.raas4emf.restexample;

public class EntryPoint implements org.eclipse.rap.rwt.application.EntryPoint {

	public EntryPoint() {
	}

	@Override
	public int createUI() {
		org.raas4emf.cms.core.Activator.err("Calling createUI SHOULD NEVER HAPPEN!!!");
		return 0;
	}

}
