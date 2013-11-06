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
 * A representation of the literals of the enumeration '<em><b>Ifc Stair Flight Type Enum</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see IFC2X3.IFC2X3Package#getIfcStairFlightTypeEnum()
 * @model
 * @generated
 */
public enum IfcStairFlightTypeEnum implements Enumerator {
	/**
	 * The '<em><b>STRAIGHT</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #STRAIGHT_VALUE
	 * @generated
	 * @ordered
	 */
	STRAIGHT(0, "STRAIGHT", "STRAIGHT"), /**
	 * The '<em><b>WINDER</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #WINDER_VALUE
	 * @generated
	 * @ordered
	 */
	WINDER(1, "WINDER", "WINDER"), /**
	 * The '<em><b>SPIRAL</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #SPIRAL_VALUE
	 * @generated
	 * @ordered
	 */
	SPIRAL(2, "SPIRAL", "SPIRAL"), /**
	 * The '<em><b>CURVED</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CURVED_VALUE
	 * @generated
	 * @ordered
	 */
	CURVED(3, "CURVED", "CURVED"), /**
	 * The '<em><b>FREEFORM</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #FREEFORM_VALUE
	 * @generated
	 * @ordered
	 */
	FREEFORM(4, "FREEFORM", "FREEFORM"), /**
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
	 * The '<em><b>STRAIGHT</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>STRAIGHT</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #STRAIGHT
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int STRAIGHT_VALUE = 0;

	/**
	 * The '<em><b>WINDER</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>WINDER</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #WINDER
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int WINDER_VALUE = 1;

	/**
	 * The '<em><b>SPIRAL</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>SPIRAL</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #SPIRAL
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int SPIRAL_VALUE = 2;

	/**
	 * The '<em><b>CURVED</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>CURVED</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #CURVED
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int CURVED_VALUE = 3;

	/**
	 * The '<em><b>FREEFORM</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>FREEFORM</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #FREEFORM
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int FREEFORM_VALUE = 4;

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
	 * An array of all the '<em><b>Ifc Stair Flight Type Enum</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final IfcStairFlightTypeEnum[] VALUES_ARRAY =
		new IfcStairFlightTypeEnum[] {
			STRAIGHT,
			WINDER,
			SPIRAL,
			CURVED,
			FREEFORM,
			USERDEFINED,
			NOTDEFINED,
		};

	/**
	 * A public read-only list of all the '<em><b>Ifc Stair Flight Type Enum</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<IfcStairFlightTypeEnum> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Ifc Stair Flight Type Enum</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static IfcStairFlightTypeEnum get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			IfcStairFlightTypeEnum result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Ifc Stair Flight Type Enum</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static IfcStairFlightTypeEnum getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			IfcStairFlightTypeEnum result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Ifc Stair Flight Type Enum</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static IfcStairFlightTypeEnum get(int value) {
		switch (value) {
			case STRAIGHT_VALUE: return STRAIGHT;
			case WINDER_VALUE: return WINDER;
			case SPIRAL_VALUE: return SPIRAL;
			case CURVED_VALUE: return CURVED;
			case FREEFORM_VALUE: return FREEFORM;
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
	private IfcStairFlightTypeEnum(int value, String name, String literal) {
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
	
} //IfcStairFlightTypeEnum
