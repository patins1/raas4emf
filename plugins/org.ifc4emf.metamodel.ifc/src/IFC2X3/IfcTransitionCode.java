/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package IFC2X3;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Ifc Transition Code</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see IFC2X3.IFC2X3Package#getIfcTransitionCode()
 * @model
 * @generated
 */
public enum IfcTransitionCode implements Enumerator {
	/**
	 * The '<em><b>DISCONTINUOUS</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #DISCONTINUOUS_VALUE
	 * @generated
	 * @ordered
	 */
	DISCONTINUOUS(0, "DISCONTINUOUS", "DISCONTINUOUS"), /**
	 * The '<em><b>CONTINUOUS</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CONTINUOUS_VALUE
	 * @generated
	 * @ordered
	 */
	CONTINUOUS(1, "CONTINUOUS", "CONTINUOUS"), /**
	 * The '<em><b>CONTSAMEGRADIENT</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CONTSAMEGRADIENT_VALUE
	 * @generated
	 * @ordered
	 */
	CONTSAMEGRADIENT(2, "CONTSAMEGRADIENT", "CONTSAMEGRADIENT"), /**
	 * The '<em><b>CONTSAMEGRADIENTSAMECURVATURE</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CONTSAMEGRADIENTSAMECURVATURE_VALUE
	 * @generated
	 * @ordered
	 */
	CONTSAMEGRADIENTSAMECURVATURE(3, "CONTSAMEGRADIENTSAMECURVATURE", "CONTSAMEGRADIENTSAMECURVATURE");

	/**
	 * The '<em><b>DISCONTINUOUS</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>DISCONTINUOUS</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #DISCONTINUOUS
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int DISCONTINUOUS_VALUE = 0;

	/**
	 * The '<em><b>CONTINUOUS</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>CONTINUOUS</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #CONTINUOUS
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int CONTINUOUS_VALUE = 1;

	/**
	 * The '<em><b>CONTSAMEGRADIENT</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>CONTSAMEGRADIENT</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #CONTSAMEGRADIENT
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int CONTSAMEGRADIENT_VALUE = 2;

	/**
	 * The '<em><b>CONTSAMEGRADIENTSAMECURVATURE</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>CONTSAMEGRADIENTSAMECURVATURE</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #CONTSAMEGRADIENTSAMECURVATURE
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int CONTSAMEGRADIENTSAMECURVATURE_VALUE = 3;

	/**
	 * An array of all the '<em><b>Ifc Transition Code</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final IfcTransitionCode[] VALUES_ARRAY =
		new IfcTransitionCode[] {
			DISCONTINUOUS,
			CONTINUOUS,
			CONTSAMEGRADIENT,
			CONTSAMEGRADIENTSAMECURVATURE,
		};

	/**
	 * A public read-only list of all the '<em><b>Ifc Transition Code</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<IfcTransitionCode> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Ifc Transition Code</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static IfcTransitionCode get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			IfcTransitionCode result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Ifc Transition Code</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static IfcTransitionCode getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			IfcTransitionCode result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Ifc Transition Code</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static IfcTransitionCode get(int value) {
		switch (value) {
			case DISCONTINUOUS_VALUE: return DISCONTINUOUS;
			case CONTINUOUS_VALUE: return CONTINUOUS;
			case CONTSAMEGRADIENT_VALUE: return CONTSAMEGRADIENT;
			case CONTSAMEGRADIENTSAMECURVATURE_VALUE: return CONTSAMEGRADIENTSAMECURVATURE;
		}
		return null;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private final int value;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private final String name;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private final String literal;

	/**
	 * Only this class can construct instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private IfcTransitionCode(int value, String name, String literal) {
		this.value = value;
		this.name = name;
		this.literal = literal;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getValue() {
	  return value;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getName() {
	  return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getLiteral() {
	  return literal;
	}

	/**
	 * Returns the literal value of the enumerator, which is its string representation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		return literal;
	}
	
} //IfcTransitionCode
