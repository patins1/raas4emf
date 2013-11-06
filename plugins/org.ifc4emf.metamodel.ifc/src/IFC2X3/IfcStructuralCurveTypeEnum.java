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
 * A representation of the literals of the enumeration '<em><b>Ifc Structural Curve Type Enum</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see IFC2X3.IFC2X3Package#getIfcStructuralCurveTypeEnum()
 * @model
 * @generated
 */
public enum IfcStructuralCurveTypeEnum implements Enumerator {
	/**
	 * The '<em><b>RIGID JOINED MEMBER</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #RIGID_JOINED_MEMBER_VALUE
	 * @generated
	 * @ordered
	 */
	RIGID_JOINED_MEMBER(0, "RIGID_JOINED_MEMBER", "RIGID_JOINED_MEMBER"), /**
	 * The '<em><b>PIN JOINED MEMBER</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #PIN_JOINED_MEMBER_VALUE
	 * @generated
	 * @ordered
	 */
	PIN_JOINED_MEMBER(1, "PIN_JOINED_MEMBER", "PIN_JOINED_MEMBER"), /**
	 * The '<em><b>CABLE</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CABLE_VALUE
	 * @generated
	 * @ordered
	 */
	CABLE(2, "CABLE", "CABLE"), /**
	 * The '<em><b>TENSION MEMBER</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #TENSION_MEMBER_VALUE
	 * @generated
	 * @ordered
	 */
	TENSION_MEMBER(3, "TENSION_MEMBER", "TENSION_MEMBER"), /**
	 * The '<em><b>COMPRESSION MEMBER</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #COMPRESSION_MEMBER_VALUE
	 * @generated
	 * @ordered
	 */
	COMPRESSION_MEMBER(4, "COMPRESSION_MEMBER", "COMPRESSION_MEMBER"), /**
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
	 * The '<em><b>RIGID JOINED MEMBER</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>RIGID JOINED MEMBER</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #RIGID_JOINED_MEMBER
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int RIGID_JOINED_MEMBER_VALUE = 0;

	/**
	 * The '<em><b>PIN JOINED MEMBER</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>PIN JOINED MEMBER</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #PIN_JOINED_MEMBER
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int PIN_JOINED_MEMBER_VALUE = 1;

	/**
	 * The '<em><b>CABLE</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>CABLE</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #CABLE
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int CABLE_VALUE = 2;

	/**
	 * The '<em><b>TENSION MEMBER</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>TENSION MEMBER</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #TENSION_MEMBER
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int TENSION_MEMBER_VALUE = 3;

	/**
	 * The '<em><b>COMPRESSION MEMBER</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>COMPRESSION MEMBER</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #COMPRESSION_MEMBER
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int COMPRESSION_MEMBER_VALUE = 4;

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
	 * An array of all the '<em><b>Ifc Structural Curve Type Enum</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final IfcStructuralCurveTypeEnum[] VALUES_ARRAY =
		new IfcStructuralCurveTypeEnum[] {
			RIGID_JOINED_MEMBER,
			PIN_JOINED_MEMBER,
			CABLE,
			TENSION_MEMBER,
			COMPRESSION_MEMBER,
			USERDEFINED,
			NOTDEFINED,
		};

	/**
	 * A public read-only list of all the '<em><b>Ifc Structural Curve Type Enum</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<IfcStructuralCurveTypeEnum> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Ifc Structural Curve Type Enum</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static IfcStructuralCurveTypeEnum get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			IfcStructuralCurveTypeEnum result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Ifc Structural Curve Type Enum</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static IfcStructuralCurveTypeEnum getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			IfcStructuralCurveTypeEnum result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Ifc Structural Curve Type Enum</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static IfcStructuralCurveTypeEnum get(int value) {
		switch (value) {
			case RIGID_JOINED_MEMBER_VALUE: return RIGID_JOINED_MEMBER;
			case PIN_JOINED_MEMBER_VALUE: return PIN_JOINED_MEMBER;
			case CABLE_VALUE: return CABLE;
			case TENSION_MEMBER_VALUE: return TENSION_MEMBER;
			case COMPRESSION_MEMBER_VALUE: return COMPRESSION_MEMBER;
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
	private IfcStructuralCurveTypeEnum(int value, String name, String literal) {
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
	
} //IfcStructuralCurveTypeEnum
