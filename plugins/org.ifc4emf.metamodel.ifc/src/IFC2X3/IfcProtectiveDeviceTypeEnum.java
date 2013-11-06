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
 * A representation of the literals of the enumeration '<em><b>Ifc Protective Device Type Enum</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see IFC2X3.IFC2X3Package#getIfcProtectiveDeviceTypeEnum()
 * @model
 * @generated
 */
public enum IfcProtectiveDeviceTypeEnum implements Enumerator {
	/**
	 * The '<em><b>FUSEDISCONNECTOR</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #FUSEDISCONNECTOR_VALUE
	 * @generated
	 * @ordered
	 */
	FUSEDISCONNECTOR(0, "FUSEDISCONNECTOR", "FUSEDISCONNECTOR"), /**
	 * The '<em><b>CIRCUITBREAKER</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CIRCUITBREAKER_VALUE
	 * @generated
	 * @ordered
	 */
	CIRCUITBREAKER(1, "CIRCUITBREAKER", "CIRCUITBREAKER"), /**
	 * The '<em><b>EARTHFAILUREDEVICE</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #EARTHFAILUREDEVICE_VALUE
	 * @generated
	 * @ordered
	 */
	EARTHFAILUREDEVICE(2, "EARTHFAILUREDEVICE", "EARTHFAILUREDEVICE"), /**
	 * The '<em><b>RESIDUALCURRENTCIRCUITBREAKER</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #RESIDUALCURRENTCIRCUITBREAKER_VALUE
	 * @generated
	 * @ordered
	 */
	RESIDUALCURRENTCIRCUITBREAKER(3, "RESIDUALCURRENTCIRCUITBREAKER", "RESIDUALCURRENTCIRCUITBREAKER"), /**
	 * The '<em><b>RESIDUALCURRENTSWITCH</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #RESIDUALCURRENTSWITCH_VALUE
	 * @generated
	 * @ordered
	 */
	RESIDUALCURRENTSWITCH(4, "RESIDUALCURRENTSWITCH", "RESIDUALCURRENTSWITCH"), /**
	 * The '<em><b>VARISTOR</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #VARISTOR_VALUE
	 * @generated
	 * @ordered
	 */
	VARISTOR(5, "VARISTOR", "VARISTOR"), /**
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
	 * The '<em><b>FUSEDISCONNECTOR</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>FUSEDISCONNECTOR</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #FUSEDISCONNECTOR
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int FUSEDISCONNECTOR_VALUE = 0;

	/**
	 * The '<em><b>CIRCUITBREAKER</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>CIRCUITBREAKER</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #CIRCUITBREAKER
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int CIRCUITBREAKER_VALUE = 1;

	/**
	 * The '<em><b>EARTHFAILUREDEVICE</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>EARTHFAILUREDEVICE</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #EARTHFAILUREDEVICE
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int EARTHFAILUREDEVICE_VALUE = 2;

	/**
	 * The '<em><b>RESIDUALCURRENTCIRCUITBREAKER</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>RESIDUALCURRENTCIRCUITBREAKER</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #RESIDUALCURRENTCIRCUITBREAKER
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int RESIDUALCURRENTCIRCUITBREAKER_VALUE = 3;

	/**
	 * The '<em><b>RESIDUALCURRENTSWITCH</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>RESIDUALCURRENTSWITCH</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #RESIDUALCURRENTSWITCH
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int RESIDUALCURRENTSWITCH_VALUE = 4;

	/**
	 * The '<em><b>VARISTOR</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>VARISTOR</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #VARISTOR
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int VARISTOR_VALUE = 5;

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
	 * An array of all the '<em><b>Ifc Protective Device Type Enum</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final IfcProtectiveDeviceTypeEnum[] VALUES_ARRAY =
		new IfcProtectiveDeviceTypeEnum[] {
			FUSEDISCONNECTOR,
			CIRCUITBREAKER,
			EARTHFAILUREDEVICE,
			RESIDUALCURRENTCIRCUITBREAKER,
			RESIDUALCURRENTSWITCH,
			VARISTOR,
			USERDEFINED,
			NOTDEFINED,
		};

	/**
	 * A public read-only list of all the '<em><b>Ifc Protective Device Type Enum</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<IfcProtectiveDeviceTypeEnum> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Ifc Protective Device Type Enum</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static IfcProtectiveDeviceTypeEnum get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			IfcProtectiveDeviceTypeEnum result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Ifc Protective Device Type Enum</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static IfcProtectiveDeviceTypeEnum getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			IfcProtectiveDeviceTypeEnum result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Ifc Protective Device Type Enum</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static IfcProtectiveDeviceTypeEnum get(int value) {
		switch (value) {
			case FUSEDISCONNECTOR_VALUE: return FUSEDISCONNECTOR;
			case CIRCUITBREAKER_VALUE: return CIRCUITBREAKER;
			case EARTHFAILUREDEVICE_VALUE: return EARTHFAILUREDEVICE;
			case RESIDUALCURRENTCIRCUITBREAKER_VALUE: return RESIDUALCURRENTCIRCUITBREAKER;
			case RESIDUALCURRENTSWITCH_VALUE: return RESIDUALCURRENTSWITCH;
			case VARISTOR_VALUE: return VARISTOR;
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
	private IfcProtectiveDeviceTypeEnum(int value, String name, String literal) {
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
	
} //IfcProtectiveDeviceTypeEnum
