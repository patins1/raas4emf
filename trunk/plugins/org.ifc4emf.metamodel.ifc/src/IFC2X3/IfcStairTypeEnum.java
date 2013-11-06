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
 * A representation of the literals of the enumeration '<em><b>Ifc Stair Type Enum</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see IFC2X3.IFC2X3Package#getIfcStairTypeEnum()
 * @model
 * @generated
 */
public enum IfcStairTypeEnum implements Enumerator {
	/**
	 * The '<em><b>STRAIGHT RUN STAIR</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #STRAIGHT_RUN_STAIR_VALUE
	 * @generated
	 * @ordered
	 */
	STRAIGHT_RUN_STAIR(0, "STRAIGHT_RUN_STAIR", "STRAIGHT_RUN_STAIR"), /**
	 * The '<em><b>TWO STRAIGHT RUN STAIR</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #TWO_STRAIGHT_RUN_STAIR_VALUE
	 * @generated
	 * @ordered
	 */
	TWO_STRAIGHT_RUN_STAIR(1, "TWO_STRAIGHT_RUN_STAIR", "TWO_STRAIGHT_RUN_STAIR"), /**
	 * The '<em><b>QUARTER WINDING STAIR</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #QUARTER_WINDING_STAIR_VALUE
	 * @generated
	 * @ordered
	 */
	QUARTER_WINDING_STAIR(2, "QUARTER_WINDING_STAIR", "QUARTER_WINDING_STAIR"), /**
	 * The '<em><b>QUARTER TURN STAIR</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #QUARTER_TURN_STAIR_VALUE
	 * @generated
	 * @ordered
	 */
	QUARTER_TURN_STAIR(3, "QUARTER_TURN_STAIR", "QUARTER_TURN_STAIR"), /**
	 * The '<em><b>HALF WINDING STAIR</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #HALF_WINDING_STAIR_VALUE
	 * @generated
	 * @ordered
	 */
	HALF_WINDING_STAIR(4, "HALF_WINDING_STAIR", "HALF_WINDING_STAIR"), /**
	 * The '<em><b>HALF TURN STAIR</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #HALF_TURN_STAIR_VALUE
	 * @generated
	 * @ordered
	 */
	HALF_TURN_STAIR(5, "HALF_TURN_STAIR", "HALF_TURN_STAIR"), /**
	 * The '<em><b>TWO QUARTER WINDING STAIR</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #TWO_QUARTER_WINDING_STAIR_VALUE
	 * @generated
	 * @ordered
	 */
	TWO_QUARTER_WINDING_STAIR(6, "TWO_QUARTER_WINDING_STAIR", "TWO_QUARTER_WINDING_STAIR"), /**
	 * The '<em><b>TWO QUARTER TURN STAIR</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #TWO_QUARTER_TURN_STAIR_VALUE
	 * @generated
	 * @ordered
	 */
	TWO_QUARTER_TURN_STAIR(7, "TWO_QUARTER_TURN_STAIR", "TWO_QUARTER_TURN_STAIR"), /**
	 * The '<em><b>THREE QUARTER WINDING STAIR</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #THREE_QUARTER_WINDING_STAIR_VALUE
	 * @generated
	 * @ordered
	 */
	THREE_QUARTER_WINDING_STAIR(8, "THREE_QUARTER_WINDING_STAIR", "THREE_QUARTER_WINDING_STAIR"), /**
	 * The '<em><b>THREE QUARTER TURN STAIR</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #THREE_QUARTER_TURN_STAIR_VALUE
	 * @generated
	 * @ordered
	 */
	THREE_QUARTER_TURN_STAIR(9, "THREE_QUARTER_TURN_STAIR", "THREE_QUARTER_TURN_STAIR"), /**
	 * The '<em><b>SPIRAL STAIR</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #SPIRAL_STAIR_VALUE
	 * @generated
	 * @ordered
	 */
	SPIRAL_STAIR(10, "SPIRAL_STAIR", "SPIRAL_STAIR"), /**
	 * The '<em><b>DOUBLE RETURN STAIR</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #DOUBLE_RETURN_STAIR_VALUE
	 * @generated
	 * @ordered
	 */
	DOUBLE_RETURN_STAIR(11, "DOUBLE_RETURN_STAIR", "DOUBLE_RETURN_STAIR"), /**
	 * The '<em><b>CURVED RUN STAIR</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CURVED_RUN_STAIR_VALUE
	 * @generated
	 * @ordered
	 */
	CURVED_RUN_STAIR(12, "CURVED_RUN_STAIR", "CURVED_RUN_STAIR"), /**
	 * The '<em><b>TWO CURVED RUN STAIR</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #TWO_CURVED_RUN_STAIR_VALUE
	 * @generated
	 * @ordered
	 */
	TWO_CURVED_RUN_STAIR(13, "TWO_CURVED_RUN_STAIR", "TWO_CURVED_RUN_STAIR"), /**
	 * The '<em><b>USERDEFINED</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #USERDEFINED_VALUE
	 * @generated
	 * @ordered
	 */
	USERDEFINED(14, "USERDEFINED", "USERDEFINED"), /**
	 * The '<em><b>NOTDEFINED</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #NOTDEFINED_VALUE
	 * @generated
	 * @ordered
	 */
	NOTDEFINED(15, "NOTDEFINED", "NOTDEFINED");

	/**
	 * The '<em><b>STRAIGHT RUN STAIR</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>STRAIGHT RUN STAIR</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #STRAIGHT_RUN_STAIR
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int STRAIGHT_RUN_STAIR_VALUE = 0;

	/**
	 * The '<em><b>TWO STRAIGHT RUN STAIR</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>TWO STRAIGHT RUN STAIR</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #TWO_STRAIGHT_RUN_STAIR
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int TWO_STRAIGHT_RUN_STAIR_VALUE = 1;

	/**
	 * The '<em><b>QUARTER WINDING STAIR</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>QUARTER WINDING STAIR</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #QUARTER_WINDING_STAIR
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int QUARTER_WINDING_STAIR_VALUE = 2;

	/**
	 * The '<em><b>QUARTER TURN STAIR</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>QUARTER TURN STAIR</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #QUARTER_TURN_STAIR
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int QUARTER_TURN_STAIR_VALUE = 3;

	/**
	 * The '<em><b>HALF WINDING STAIR</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>HALF WINDING STAIR</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #HALF_WINDING_STAIR
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int HALF_WINDING_STAIR_VALUE = 4;

	/**
	 * The '<em><b>HALF TURN STAIR</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>HALF TURN STAIR</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #HALF_TURN_STAIR
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int HALF_TURN_STAIR_VALUE = 5;

	/**
	 * The '<em><b>TWO QUARTER WINDING STAIR</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>TWO QUARTER WINDING STAIR</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #TWO_QUARTER_WINDING_STAIR
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int TWO_QUARTER_WINDING_STAIR_VALUE = 6;

	/**
	 * The '<em><b>TWO QUARTER TURN STAIR</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>TWO QUARTER TURN STAIR</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #TWO_QUARTER_TURN_STAIR
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int TWO_QUARTER_TURN_STAIR_VALUE = 7;

	/**
	 * The '<em><b>THREE QUARTER WINDING STAIR</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>THREE QUARTER WINDING STAIR</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #THREE_QUARTER_WINDING_STAIR
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int THREE_QUARTER_WINDING_STAIR_VALUE = 8;

	/**
	 * The '<em><b>THREE QUARTER TURN STAIR</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>THREE QUARTER TURN STAIR</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #THREE_QUARTER_TURN_STAIR
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int THREE_QUARTER_TURN_STAIR_VALUE = 9;

	/**
	 * The '<em><b>SPIRAL STAIR</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>SPIRAL STAIR</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #SPIRAL_STAIR
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int SPIRAL_STAIR_VALUE = 10;

	/**
	 * The '<em><b>DOUBLE RETURN STAIR</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>DOUBLE RETURN STAIR</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #DOUBLE_RETURN_STAIR
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int DOUBLE_RETURN_STAIR_VALUE = 11;

	/**
	 * The '<em><b>CURVED RUN STAIR</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>CURVED RUN STAIR</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #CURVED_RUN_STAIR
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int CURVED_RUN_STAIR_VALUE = 12;

	/**
	 * The '<em><b>TWO CURVED RUN STAIR</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>TWO CURVED RUN STAIR</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #TWO_CURVED_RUN_STAIR
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int TWO_CURVED_RUN_STAIR_VALUE = 13;

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
	public static final int USERDEFINED_VALUE = 14;

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
	public static final int NOTDEFINED_VALUE = 15;

	/**
	 * An array of all the '<em><b>Ifc Stair Type Enum</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final IfcStairTypeEnum[] VALUES_ARRAY =
		new IfcStairTypeEnum[] {
			STRAIGHT_RUN_STAIR,
			TWO_STRAIGHT_RUN_STAIR,
			QUARTER_WINDING_STAIR,
			QUARTER_TURN_STAIR,
			HALF_WINDING_STAIR,
			HALF_TURN_STAIR,
			TWO_QUARTER_WINDING_STAIR,
			TWO_QUARTER_TURN_STAIR,
			THREE_QUARTER_WINDING_STAIR,
			THREE_QUARTER_TURN_STAIR,
			SPIRAL_STAIR,
			DOUBLE_RETURN_STAIR,
			CURVED_RUN_STAIR,
			TWO_CURVED_RUN_STAIR,
			USERDEFINED,
			NOTDEFINED,
		};

	/**
	 * A public read-only list of all the '<em><b>Ifc Stair Type Enum</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<IfcStairTypeEnum> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Ifc Stair Type Enum</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static IfcStairTypeEnum get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			IfcStairTypeEnum result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Ifc Stair Type Enum</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static IfcStairTypeEnum getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			IfcStairTypeEnum result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Ifc Stair Type Enum</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static IfcStairTypeEnum get(int value) {
		switch (value) {
			case STRAIGHT_RUN_STAIR_VALUE: return STRAIGHT_RUN_STAIR;
			case TWO_STRAIGHT_RUN_STAIR_VALUE: return TWO_STRAIGHT_RUN_STAIR;
			case QUARTER_WINDING_STAIR_VALUE: return QUARTER_WINDING_STAIR;
			case QUARTER_TURN_STAIR_VALUE: return QUARTER_TURN_STAIR;
			case HALF_WINDING_STAIR_VALUE: return HALF_WINDING_STAIR;
			case HALF_TURN_STAIR_VALUE: return HALF_TURN_STAIR;
			case TWO_QUARTER_WINDING_STAIR_VALUE: return TWO_QUARTER_WINDING_STAIR;
			case TWO_QUARTER_TURN_STAIR_VALUE: return TWO_QUARTER_TURN_STAIR;
			case THREE_QUARTER_WINDING_STAIR_VALUE: return THREE_QUARTER_WINDING_STAIR;
			case THREE_QUARTER_TURN_STAIR_VALUE: return THREE_QUARTER_TURN_STAIR;
			case SPIRAL_STAIR_VALUE: return SPIRAL_STAIR;
			case DOUBLE_RETURN_STAIR_VALUE: return DOUBLE_RETURN_STAIR;
			case CURVED_RUN_STAIR_VALUE: return CURVED_RUN_STAIR;
			case TWO_CURVED_RUN_STAIR_VALUE: return TWO_CURVED_RUN_STAIR;
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
	private IfcStairTypeEnum(int value, String name, String literal) {
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
	
} //IfcStairTypeEnum
