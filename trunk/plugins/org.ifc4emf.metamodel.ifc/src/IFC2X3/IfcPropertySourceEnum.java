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
 * A representation of the literals of the enumeration '<em><b>Ifc Property Source Enum</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see IFC2X3.IFC2X3Package#getIfcPropertySourceEnum()
 * @model
 * @generated
 */
public enum IfcPropertySourceEnum implements Enumerator {
	/**
	 * The '<em><b>DESIGN</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #DESIGN_VALUE
	 * @generated
	 * @ordered
	 */
	DESIGN(0, "DESIGN", "DESIGN"), /**
	 * The '<em><b>DESIGNMAXIMUM</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #DESIGNMAXIMUM_VALUE
	 * @generated
	 * @ordered
	 */
	DESIGNMAXIMUM(1, "DESIGNMAXIMUM", "DESIGNMAXIMUM"), /**
	 * The '<em><b>DESIGNMINIMUM</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #DESIGNMINIMUM_VALUE
	 * @generated
	 * @ordered
	 */
	DESIGNMINIMUM(2, "DESIGNMINIMUM", "DESIGNMINIMUM"), /**
	 * The '<em><b>SIMULATED</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #SIMULATED_VALUE
	 * @generated
	 * @ordered
	 */
	SIMULATED(3, "SIMULATED", "SIMULATED"), /**
	 * The '<em><b>ASBUILT</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ASBUILT_VALUE
	 * @generated
	 * @ordered
	 */
	ASBUILT(4, "ASBUILT", "ASBUILT"), /**
	 * The '<em><b>COMMISSIONING</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #COMMISSIONING_VALUE
	 * @generated
	 * @ordered
	 */
	COMMISSIONING(5, "COMMISSIONING", "COMMISSIONING"), /**
	 * The '<em><b>MEASURED</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #MEASURED_VALUE
	 * @generated
	 * @ordered
	 */
	MEASURED(6, "MEASURED", "MEASURED"), /**
	 * The '<em><b>USERDEFINED</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #USERDEFINED_VALUE
	 * @generated
	 * @ordered
	 */
	USERDEFINED(7, "USERDEFINED", "USERDEFINED"), /**
	 * The '<em><b>NOTKNOWN</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #NOTKNOWN_VALUE
	 * @generated
	 * @ordered
	 */
	NOTKNOWN(8, "NOTKNOWN", "NOTKNOWN");

	/**
	 * The '<em><b>DESIGN</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>DESIGN</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #DESIGN
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int DESIGN_VALUE = 0;

	/**
	 * The '<em><b>DESIGNMAXIMUM</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>DESIGNMAXIMUM</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #DESIGNMAXIMUM
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int DESIGNMAXIMUM_VALUE = 1;

	/**
	 * The '<em><b>DESIGNMINIMUM</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>DESIGNMINIMUM</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #DESIGNMINIMUM
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int DESIGNMINIMUM_VALUE = 2;

	/**
	 * The '<em><b>SIMULATED</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>SIMULATED</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #SIMULATED
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int SIMULATED_VALUE = 3;

	/**
	 * The '<em><b>ASBUILT</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>ASBUILT</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #ASBUILT
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int ASBUILT_VALUE = 4;

	/**
	 * The '<em><b>COMMISSIONING</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>COMMISSIONING</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #COMMISSIONING
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int COMMISSIONING_VALUE = 5;

	/**
	 * The '<em><b>MEASURED</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>MEASURED</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #MEASURED
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int MEASURED_VALUE = 6;

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
	public static final int USERDEFINED_VALUE = 7;

	/**
	 * The '<em><b>NOTKNOWN</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>NOTKNOWN</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #NOTKNOWN
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int NOTKNOWN_VALUE = 8;

	/**
	 * An array of all the '<em><b>Ifc Property Source Enum</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final IfcPropertySourceEnum[] VALUES_ARRAY =
		new IfcPropertySourceEnum[] {
			DESIGN,
			DESIGNMAXIMUM,
			DESIGNMINIMUM,
			SIMULATED,
			ASBUILT,
			COMMISSIONING,
			MEASURED,
			USERDEFINED,
			NOTKNOWN,
		};

	/**
	 * A public read-only list of all the '<em><b>Ifc Property Source Enum</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<IfcPropertySourceEnum> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Ifc Property Source Enum</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static IfcPropertySourceEnum get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			IfcPropertySourceEnum result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Ifc Property Source Enum</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static IfcPropertySourceEnum getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			IfcPropertySourceEnum result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Ifc Property Source Enum</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static IfcPropertySourceEnum get(int value) {
		switch (value) {
			case DESIGN_VALUE: return DESIGN;
			case DESIGNMAXIMUM_VALUE: return DESIGNMAXIMUM;
			case DESIGNMINIMUM_VALUE: return DESIGNMINIMUM;
			case SIMULATED_VALUE: return SIMULATED;
			case ASBUILT_VALUE: return ASBUILT;
			case COMMISSIONING_VALUE: return COMMISSIONING;
			case MEASURED_VALUE: return MEASURED;
			case USERDEFINED_VALUE: return USERDEFINED;
			case NOTKNOWN_VALUE: return NOTKNOWN;
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
	private IfcPropertySourceEnum(int value, String name, String literal) {
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
	
} //IfcPropertySourceEnum
