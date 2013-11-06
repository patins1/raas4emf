/**
 * Copyright 2013 Smart Services CRC Pty Ltd
 */
package org.eclipse.jqvt.jvmmodel;

import org.eclipse.jqvt.jQVT.RelationDomain;
import org.eclipse.xtext.xbase.XExpression;

/**
 * Convenience class to group call arguments with their formal parameters
 */
@SuppressWarnings("restriction")
public class ParamPair {

	/**
	 * The formal parameter
	 */
	public final RelationDomain domain;

	/**
	 * The call argument
	 */
	public final XExpression exp;

	public ParamPair(XExpression exp, RelationDomain domain) {
		this.exp = exp;
		this.domain = domain;
	}

}
