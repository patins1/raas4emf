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
 * A representation of the literals of the enumeration '<em><b>Ifc Lamp Type Enum</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see IFC2X3.IFC2X3Package#getIfcLampTypeEnum()
 * @model
 * @generated
 */
public enum IfcLampTypeEnum implements Enumerator {
	/**
	 * The '<em><b>COMPACTFLUORESCENT</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #COMPACTFLUORESCENT_VALUE
	 * @generated
	 * @ordered
	 */
	COMPACTFLUORESCENT(0, "COMPACTFLUORESCENT", "COMPACTFLUORESCENT"), /**
	 * The '<em><b>FLUORESCENT</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #FLUORESCENT_VALUE
	 * @generated
	 * @ordered
	 */
	FLUORESCENT(1, "FLUORESCENT", "FLUORESCENT"), /**
	 * The '<em><b>HIGHPRESSUREMERCURY</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #HIGHPRESSUREMERCURY_VALUE
	 * @generated
	 * @ordered
	 */
	HIGHPRESSUREMERCURY(2, "HIGHPRESSUREMERCURY", "HIGHPRESSUREMERCURY"), /**
	 * The '<em><b>HIGHPRESSURESODIUM</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #HIGHPRESSURESODIUM_VALUE
	 * @generated
	 * @ordered
	 */
	HIGHPRESSURESODIUM(3, "HIGHPRESSURESODIUM", "HIGHPRESSURESODIUM"), /**
	 * The '<em><b>METALHALIDE</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #METALHALIDE_VALUE
	 * @generated
	 * @ordered
	 */
	METALHALIDE(4, "METALHALIDE", "METALHALIDE"), /**
	 * The '<em><b>TUNGSTENFILAMENT</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #TUNGSTENFILAMENT_VALUE
	 * @generated
	 * @ordered
	 */
	TUNGSTENFILAMENT(5, "TUNGSTENFILAMENT", "TUNGSTENFILAMENT"), /**
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
	 * The '<em><b>COMPACTFLUORESCENT</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>COMPACTFLUORESCENT</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #COMPACTFLUORESCENT
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int COMPACTFLUORESCENT_VALUE = 0;

	/**
	 * The '<em><b>FLUORESCENT</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>FLUORESCENT</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #FLUORESCENT
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int FLUORESCENT_VALUE = 1;

	/**
	 * The '<em><b>HIGHPRESSUREMERCURY</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>HIGHPRESSUREMERCURY</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #HIGHPRESSUREMERCURY
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int HIGHPRESSUREMERCURY_VALUE = 2;

	/**
	 * The '<em><b>HIGHPRESSURESODIUM</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>HIGHPRESSURESODIUM</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #HIGHPRESSURESODIUM
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int HIGHPRESSURESODIUM_VALUE = 3;

	/**
	 * The '<em><b>METALHALIDE</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>METALHALIDE</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #METALHALIDE
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int METALHALIDE_VALUE = 4;

	/**
	 * The '<em><b>TUNGSTENFILAMENT</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>TUNGSTENFILAMENT</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #TUNGSTENFILAMENT
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int TUNGSTENFILAMENT_VALUE = 5;

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
	 * An array of all the '<em><b>Ifc Lamp Type Enum</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final IfcLampTypeEnum[] VALUES_ARRAY =
		new IfcLampTypeEnum[] {
			COMPACTFLUORESCENT,
			FLUORESCENT,
			HIGHPRESSUREMERCURY,
			HIGHPRESSURESODIUM,
			METALHALIDE,
			TUNGSTENFILAMENT,
			USERDEFINED,
			NOTDEFINED,
		};

	/**
	 * A public read-only list of all the '<em><b>Ifc Lamp Type Enum</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<IfcLampTypeEnum> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Ifc Lamp Type Enum</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static IfcLampTypeEnum get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			IfcLampTypeEnum result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Ifc Lamp Type Enum</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static IfcLampTypeEnum getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			IfcLampTypeEnum result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Ifc Lamp Type Enum</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static IfcLampTypeEnum get(int value) {
		switch (value) {
			case COMPACTFLUORESCENT_VALUE: return COMPACTFLUORESCENT;
			case FLUORESCENT_VALUE: return FLUORESCENT;
			case HIGHPRESSUREMERCURY_VALUE: return HIGHPRESSUREMERCURY;
			case HIGHPRESSURESODIUM_VALUE: return HIGHPRESSURESODIUM;
			case METALHALIDE_VALUE: return METALHALIDE;
			case TUNGSTENFILAMENT_VALUE: return TUNGSTENFILAMENT;
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
	private IfcLampTypeEnum(int value, String name, String literal) {
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
	
} //IfcLampTypeEnum
