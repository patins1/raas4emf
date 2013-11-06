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
 * A representation of the literals of the enumeration '<em><b>Ifc Controller Type Enum</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see IFC2X3.IFC2X3Package#getIfcControllerTypeEnum()
 * @model
 * @generated
 */
public enum IfcControllerTypeEnum implements Enumerator {
	/**
	 * The '<em><b>FLOATING</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #FLOATING_VALUE
	 * @generated
	 * @ordered
	 */
	FLOATING(0, "FLOATING", "FLOATING"), /**
	 * The '<em><b>PROPORTIONAL</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #PROPORTIONAL_VALUE
	 * @generated
	 * @ordered
	 */
	PROPORTIONAL(1, "PROPORTIONAL", "PROPORTIONAL"), /**
	 * The '<em><b>PROPORTIONALINTEGRAL</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #PROPORTIONALINTEGRAL_VALUE
	 * @generated
	 * @ordered
	 */
	PROPORTIONALINTEGRAL(2, "PROPORTIONALINTEGRAL", "PROPORTIONALINTEGRAL"), /**
	 * The '<em><b>PROPORTIONALINTEGRALDERIVATIVE</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #PROPORTIONALINTEGRALDERIVATIVE_VALUE
	 * @generated
	 * @ordered
	 */
	PROPORTIONALINTEGRALDERIVATIVE(3, "PROPORTIONALINTEGRALDERIVATIVE", "PROPORTIONALINTEGRALDERIVATIVE"), /**
	 * The '<em><b>TIMEDTWOPOSITION</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #TIMEDTWOPOSITION_VALUE
	 * @generated
	 * @ordered
	 */
	TIMEDTWOPOSITION(4, "TIMEDTWOPOSITION", "TIMEDTWOPOSITION"), /**
	 * The '<em><b>TWOPOSITION</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #TWOPOSITION_VALUE
	 * @generated
	 * @ordered
	 */
	TWOPOSITION(5, "TWOPOSITION", "TWOPOSITION"), /**
	 * The '<em><b>USERDEFINED</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #USERDEFINED_VALUE
	 * @generated
	 * @ordered
	 */
	USERDEFINED(6, "USERDEFINED", "USERDEFINED"), /**
	 * The '<em><b>NOTDEFINED</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #NOTDEFINED_VALUE
	 * @generated
	 * @ordered
	 */
	NOTDEFINED(7, "NOTDEFINED", "NOTDEFINED");

	/**
	 * The '<em><b>FLOATING</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>FLOATING</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #FLOATING
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int FLOATING_VALUE = 0;

	/**
	 * The '<em><b>PROPORTIONAL</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>PROPORTIONAL</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #PROPORTIONAL
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int PROPORTIONAL_VALUE = 1;

	/**
	 * The '<em><b>PROPORTIONALINTEGRAL</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>PROPORTIONALINTEGRAL</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #PROPORTIONALINTEGRAL
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int PROPORTIONALINTEGRAL_VALUE = 2;

	/**
	 * The '<em><b>PROPORTIONALINTEGRALDERIVATIVE</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>PROPORTIONALINTEGRALDERIVATIVE</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #PROPORTIONALINTEGRALDERIVATIVE
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int PROPORTIONALINTEGRALDERIVATIVE_VALUE = 3;

	/**
	 * The '<em><b>TIMEDTWOPOSITION</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>TIMEDTWOPOSITION</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #TIMEDTWOPOSITION
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int TIMEDTWOPOSITION_VALUE = 4;

	/**
	 * The '<em><b>TWOPOSITION</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>TWOPOSITION</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #TWOPOSITION
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int TWOPOSITION_VALUE = 5;

	/**
	 * The '<em><b>USERDEFINED</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>USERDEFINED</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #USERDEFINED
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int USERDEFINED_VALUE = 6;

	/**
	 * The '<em><b>NOTDEFINED</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>NOTDEFINED</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #NOTDEFINED
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int NOTDEFINED_VALUE = 7;

	/**
	 * An array of all the '<em><b>Ifc Controller Type Enum</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final IfcControllerTypeEnum[] VALUES_ARRAY =
		new IfcControllerTypeEnum[] {
			FLOATING,
			PROPORTIONAL,
			PROPORTIONALINTEGRAL,
			PROPORTIONALINTEGRALDERIVATIVE,
			TIMEDTWOPOSITION,
			TWOPOSITION,
			USERDEFINED,
			NOTDEFINED,
		};

	/**
	 * A public read-only list of all the '<em><b>Ifc Controller Type Enum</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<IfcControllerTypeEnum> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Ifc Controller Type Enum</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static IfcControllerTypeEnum get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			IfcControllerTypeEnum result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Ifc Controller Type Enum</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static IfcControllerTypeEnum getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			IfcControllerTypeEnum result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Ifc Controller Type Enum</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static IfcControllerTypeEnum get(int value) {
		switch (value) {
			case FLOATING_VALUE: return FLOATING;
			case PROPORTIONAL_VALUE: return PROPORTIONAL;
			case PROPORTIONALINTEGRAL_VALUE: return PROPORTIONALINTEGRAL;
			case PROPORTIONALINTEGRALDERIVATIVE_VALUE: return PROPORTIONALINTEGRALDERIVATIVE;
			case TIMEDTWOPOSITION_VALUE: return TIMEDTWOPOSITION;
			case TWOPOSITION_VALUE: return TWOPOSITION;
			case USERDEFINED_VALUE: return USERDEFINED;
			case NOTDEFINED_VALUE: return NOTDEFINED;
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
	private IfcControllerTypeEnum(int value, String name, String literal) {
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
	
} //IfcControllerTypeEnum
