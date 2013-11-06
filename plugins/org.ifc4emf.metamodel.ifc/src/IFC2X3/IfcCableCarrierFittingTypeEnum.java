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
 * A representation of the literals of the enumeration '<em><b>Ifc Cable Carrier Fitting Type Enum</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see IFC2X3.IFC2X3Package#getIfcCableCarrierFittingTypeEnum()
 * @model
 * @generated
 */
public enum IfcCableCarrierFittingTypeEnum implements Enumerator {
	/**
	 * The '<em><b>BEND</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #BEND_VALUE
	 * @generated
	 * @ordered
	 */
	BEND(0, "BEND", "BEND"), /**
	 * The '<em><b>CROSS</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CROSS_VALUE
	 * @generated
	 * @ordered
	 */
	CROSS(1, "CROSS", "CROSS"), /**
	 * The '<em><b>REDUCER</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #REDUCER_VALUE
	 * @generated
	 * @ordered
	 */
	REDUCER(2, "REDUCER", "REDUCER"), /**
	 * The '<em><b>TEE</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #TEE_VALUE
	 * @generated
	 * @ordered
	 */
	TEE(3, "TEE", "TEE"), /**
	 * The '<em><b>USERDEFINED</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #USERDEFINED_VALUE
	 * @generated
	 * @ordered
	 */
	USERDEFINED(4, "USERDEFINED", "USERDEFINED"), /**
	 * The '<em><b>NOTDEFINED</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #NOTDEFINED_VALUE
	 * @generated
	 * @ordered
	 */
	NOTDEFINED(5, "NOTDEFINED", "NOTDEFINED");

	/**
	 * The '<em><b>BEND</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>BEND</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #BEND
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int BEND_VALUE = 0;

	/**
	 * The '<em><b>CROSS</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>CROSS</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #CROSS
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int CROSS_VALUE = 1;

	/**
	 * The '<em><b>REDUCER</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>REDUCER</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #REDUCER
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int REDUCER_VALUE = 2;

	/**
	 * The '<em><b>TEE</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>TEE</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #TEE
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int TEE_VALUE = 3;

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
	public static final int USERDEFINED_VALUE = 4;

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
	public static final int NOTDEFINED_VALUE = 5;

	/**
	 * An array of all the '<em><b>Ifc Cable Carrier Fitting Type Enum</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final IfcCableCarrierFittingTypeEnum[] VALUES_ARRAY =
		new IfcCableCarrierFittingTypeEnum[] {
			BEND,
			CROSS,
			REDUCER,
			TEE,
			USERDEFINED,
			NOTDEFINED,
		};

	/**
	 * A public read-only list of all the '<em><b>Ifc Cable Carrier Fitting Type Enum</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<IfcCableCarrierFittingTypeEnum> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Ifc Cable Carrier Fitting Type Enum</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static IfcCableCarrierFittingTypeEnum get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			IfcCableCarrierFittingTypeEnum result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Ifc Cable Carrier Fitting Type Enum</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static IfcCableCarrierFittingTypeEnum getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			IfcCableCarrierFittingTypeEnum result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Ifc Cable Carrier Fitting Type Enum</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static IfcCableCarrierFittingTypeEnum get(int value) {
		switch (value) {
			case BEND_VALUE: return BEND;
			case CROSS_VALUE: return CROSS;
			case REDUCER_VALUE: return REDUCER;
			case TEE_VALUE: return TEE;
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
	private IfcCableCarrierFittingTypeEnum(int value, String name, String literal) {
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
	
} //IfcCableCarrierFittingTypeEnum
