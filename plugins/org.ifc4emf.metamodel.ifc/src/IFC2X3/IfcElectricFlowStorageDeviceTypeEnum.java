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
 * A representation of the literals of the enumeration '<em><b>Ifc Electric Flow Storage Device Type Enum</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see IFC2X3.IFC2X3Package#getIfcElectricFlowStorageDeviceTypeEnum()
 * @model
 * @generated
 */
public enum IfcElectricFlowStorageDeviceTypeEnum implements Enumerator {
	/**
	 * The '<em><b>BATTERY</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #BATTERY_VALUE
	 * @generated
	 * @ordered
	 */
	BATTERY(0, "BATTERY", "BATTERY"), /**
	 * The '<em><b>CAPACITORBANK</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CAPACITORBANK_VALUE
	 * @generated
	 * @ordered
	 */
	CAPACITORBANK(1, "CAPACITORBANK", "CAPACITORBANK"), /**
	 * The '<em><b>HARMONICFILTER</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #HARMONICFILTER_VALUE
	 * @generated
	 * @ordered
	 */
	HARMONICFILTER(2, "HARMONICFILTER", "HARMONICFILTER"), /**
	 * The '<em><b>INDUCTORBANK</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #INDUCTORBANK_VALUE
	 * @generated
	 * @ordered
	 */
	INDUCTORBANK(3, "INDUCTORBANK", "INDUCTORBANK"), /**
	 * The '<em><b>UPS</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #UPS_VALUE
	 * @generated
	 * @ordered
	 */
	UPS(4, "UPS", "UPS"), /**
	 * The '<em><b>USERDEFINED</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #USERDEFINED_VALUE
	 * @generated
	 * @ordered
	 */
	USERDEFINED(5, "USERDEFINED", "USERDEFINED"), /**
	 * The '<em><b>NOTDEFINED</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #NOTDEFINED_VALUE
	 * @generated
	 * @ordered
	 */
	NOTDEFINED(6, "NOTDEFINED", "NOTDEFINED");

	/**
	 * The '<em><b>BATTERY</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>BATTERY</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #BATTERY
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int BATTERY_VALUE = 0;

	/**
	 * The '<em><b>CAPACITORBANK</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>CAPACITORBANK</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #CAPACITORBANK
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int CAPACITORBANK_VALUE = 1;

	/**
	 * The '<em><b>HARMONICFILTER</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>HARMONICFILTER</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #HARMONICFILTER
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int HARMONICFILTER_VALUE = 2;

	/**
	 * The '<em><b>INDUCTORBANK</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>INDUCTORBANK</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #INDUCTORBANK
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int INDUCTORBANK_VALUE = 3;

	/**
	 * The '<em><b>UPS</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>UPS</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #UPS
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int UPS_VALUE = 4;

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
	public static final int USERDEFINED_VALUE = 5;

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
	public static final int NOTDEFINED_VALUE = 6;

	/**
	 * An array of all the '<em><b>Ifc Electric Flow Storage Device Type Enum</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final IfcElectricFlowStorageDeviceTypeEnum[] VALUES_ARRAY =
		new IfcElectricFlowStorageDeviceTypeEnum[] {
			BATTERY,
			CAPACITORBANK,
			HARMONICFILTER,
			INDUCTORBANK,
			UPS,
			USERDEFINED,
			NOTDEFINED,
		};

	/**
	 * A public read-only list of all the '<em><b>Ifc Electric Flow Storage Device Type Enum</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<IfcElectricFlowStorageDeviceTypeEnum> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Ifc Electric Flow Storage Device Type Enum</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static IfcElectricFlowStorageDeviceTypeEnum get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			IfcElectricFlowStorageDeviceTypeEnum result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Ifc Electric Flow Storage Device Type Enum</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static IfcElectricFlowStorageDeviceTypeEnum getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			IfcElectricFlowStorageDeviceTypeEnum result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Ifc Electric Flow Storage Device Type Enum</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static IfcElectricFlowStorageDeviceTypeEnum get(int value) {
		switch (value) {
			case BATTERY_VALUE: return BATTERY;
			case CAPACITORBANK_VALUE: return CAPACITORBANK;
			case HARMONICFILTER_VALUE: return HARMONICFILTER;
			case INDUCTORBANK_VALUE: return INDUCTORBANK;
			case UPS_VALUE: return UPS;
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
	private IfcElectricFlowStorageDeviceTypeEnum(int value, String name, String literal) {
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
	
} //IfcElectricFlowStorageDeviceTypeEnum
