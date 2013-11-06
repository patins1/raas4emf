/**
 * Copyright 2013 Smart Services CRC Pty Ltd
 */
package org.eclipse.jqvt.validation;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.xtext.validation.ValidationMessageAcceptor;

/**
 * Exception thrown when the first validation error occurs; stores information which can be passed to AbstractDeclarativeValidator.error().
 */
public class ValidationException extends RuntimeException {

	private static final long serialVersionUID = 1L;

	public final EObject source;
	public final EStructuralFeature feature;
	public final int index;

	public ValidationException(String message, EObject source, EStructuralFeature feature, int index) {
		super(message);
		this.source = source;
		this.feature = feature;
		this.index = index;
	}

	public ValidationException(String message, EObject source, EStructuralFeature feature) {
		this(message, source, feature, ValidationMessageAcceptor.INSIGNIFICANT_INDEX);
	}
}
