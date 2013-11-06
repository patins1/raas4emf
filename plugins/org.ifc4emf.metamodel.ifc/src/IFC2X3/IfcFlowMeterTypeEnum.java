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
 * A representation of the literals of the enumeration '<em><b>Ifc Flow Meter Type Enum</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see IFC2X3.IFC2X3Package#getIfcFlowMeterTypeEnum()
 * @model
 * @generated
 */
public enum IfcFlowMeterTypeEnum implements Enumerator {
	/**
	 * The '<em><b>ELECTRICMETER</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ELECTRICMETER_VALUE
	 * @generated
	 * @ordered
	 */
	ELECTRICMETER(0, "ELECTRICMETER", "ELECTRICMETER"), /**
	 * The '<em><b>ENERGYMETER</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ENERGYMETER_VALUE
	 * @generated
	 * @ordered
	 */
	ENERGYMETER(1, "ENERGYMETER", "ENERGYMETER"), /**
	 * The '<em><b>FLOWMETER</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #FLOWMETER_VALUE
	 * @generated
	 * @ordered
	 */
	FLOWMETER(2, "FLOWMETER", "FLOWMETER"), /**
	 * The '<em><b>GASMETER</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #GASMETER_VALUE
	 * @generated
	 * @ordered
	 */
	GASMETER(3, "GASMETER", "GASMETER"), /**
	 * The '<em><b>OILMETER</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #OILMETER_VALUE
	 * @generated
	 * @ordered
	 */
	OILMETER(4, "OILMETER", "OILMETER"), /**
	 * The '<em><b>WATERMETER</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #WATERMETER_VALUE
	 * @generated
	 * @ordered
	 */
	WATERMETER(5, "WATERMETER", "WATERMETER"), /**
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
	 * The '<em><b>ELECTRICMETER</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>ELECTRICMETER</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #ELECTRICMETER
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int ELECTRICMETER_VALUE = 0;

	/**
	 * The '<em><b>ENERGYMETER</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>ENERGYMETER</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #ENERGYMETER
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int ENERGYMETER_VALUE = 1;

	/**
	 * The '<em><b>FLOWMETER</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>FLOWMETER</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #FLOWMETER
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int FLOWMETER_VALUE = 2;

	/**
	 * The '<em><b>GASMETER</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>GASMETER</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #GASMETER
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int GASMETER_VALUE = 3;

	/**
	 * The '<em><b>OILMETER</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>OILMETER</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #OILMETER
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int OILMETER_VALUE = 4;

	/**
	 * The '<em><b>WATERMETER</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>WATERMETER</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #WATERMETER
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int WATERMETER_VALUE = 5;

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
	 * An array of all the '<em><b>Ifc Flow Meter Type Enum</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final IfcFlowMeterTypeEnum[] VALUES_ARRAY =
		new IfcFlowMeterTypeEnum[] {
			ELECTRICMETER,
			ENERGYMETER,
			FLOWMETER,
			GASMETER,
			OILMETER,
			WATERMETER,
			USERDEFINED,
			NOTDEFINED,
		};

	/**
	 * A public read-only list of all the '<em><b>Ifc Flow Meter Type Enum</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<IfcFlowMeterTypeEnum> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Ifc Flow Meter Type Enum</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static IfcFlowMeterTypeEnum get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			IfcFlowMeterTypeEnum result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Ifc Flow Meter Type Enum</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static IfcFlowMeterTypeEnum getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			IfcFlowMeterTypeEnum result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Ifc Flow Meter Type Enum</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static IfcFlowMeterTypeEnum get(int value) {
		switch (value) {
			case ELECTRICMETER_VALUE: return ELECTRICMETER;
			case ENERGYMETER_VALUE: return ENERGYMETER;
			case FLOWMETER_VALUE: return FLOWMETER;
			case GASMETER_VALUE: return GASMETER;
			case OILMETER_VALUE: return OILMETER;
			case WATERMETER_VALUE: return WATERMETER;
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
	private IfcFlowMeterTypeEnum(int value, String name, String literal) {
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
	
} //IfcFlowMeterTypeEnum
