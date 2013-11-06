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
 * A representation of the literals of the enumeration '<em><b>Ifc Reflectance Method Enum</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see IFC2X3.IFC2X3Package#getIfcReflectanceMethodEnum()
 * @model
 * @generated
 */
public enum IfcReflectanceMethodEnum implements Enumerator {
	/**
	 * The '<em><b>BLINN</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #BLINN_VALUE
	 * @generated
	 * @ordered
	 */
	BLINN(0, "BLINN", "BLINN"), /**
	 * The '<em><b>FLAT</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #FLAT_VALUE
	 * @generated
	 * @ordered
	 */
	FLAT(1, "FLAT", "FLAT"), /**
	 * The '<em><b>GLASS</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #GLASS_VALUE
	 * @generated
	 * @ordered
	 */
	GLASS(2, "GLASS", "GLASS"), /**
	 * The '<em><b>MATT</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #MATT_VALUE
	 * @generated
	 * @ordered
	 */
	MATT(3, "MATT", "MATT"), /**
	 * The '<em><b>METAL</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #METAL_VALUE
	 * @generated
	 * @ordered
	 */
	METAL(4, "METAL", "METAL"), /**
	 * The '<em><b>MIRROR</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #MIRROR_VALUE
	 * @generated
	 * @ordered
	 */
	MIRROR(5, "MIRROR", "MIRROR"), /**
	 * The '<em><b>PHONG</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #PHONG_VALUE
	 * @generated
	 * @ordered
	 */
	PHONG(6, "PHONG", "PHONG"), /**
	 * The '<em><b>PLASTIC</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #PLASTIC_VALUE
	 * @generated
	 * @ordered
	 */
	PLASTIC(7, "PLASTIC", "PLASTIC"), /**
	 * The '<em><b>STRAUSS</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #STRAUSS_VALUE
	 * @generated
	 * @ordered
	 */
	STRAUSS(8, "STRAUSS", "STRAUSS"), /**
	 * The '<em><b>NOTDEFINED</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #NOTDEFINED_VALUE
	 * @generated
	 * @ordered
	 */
	NOTDEFINED(9, "NOTDEFINED", "NOTDEFINED");

	/**
	 * The '<em><b>BLINN</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>BLINN</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #BLINN
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int BLINN_VALUE = 0;

	/**
	 * The '<em><b>FLAT</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>FLAT</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #FLAT
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int FLAT_VALUE = 1;

	/**
	 * The '<em><b>GLASS</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>GLASS</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #GLASS
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int GLASS_VALUE = 2;

	/**
	 * The '<em><b>MATT</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>MATT</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #MATT
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int MATT_VALUE = 3;

	/**
	 * The '<em><b>METAL</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>METAL</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #METAL
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int METAL_VALUE = 4;

	/**
	 * The '<em><b>MIRROR</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>MIRROR</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #MIRROR
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int MIRROR_VALUE = 5;

	/**
	 * The '<em><b>PHONG</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>PHONG</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #PHONG
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int PHONG_VALUE = 6;

	/**
	 * The '<em><b>PLASTIC</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>PLASTIC</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #PLASTIC
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int PLASTIC_VALUE = 7;

	/**
	 * The '<em><b>STRAUSS</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>STRAUSS</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #STRAUSS
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int STRAUSS_VALUE = 8;

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
	public static final int NOTDEFINED_VALUE = 9;

	/**
	 * An array of all the '<em><b>Ifc Reflectance Method Enum</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final IfcReflectanceMethodEnum[] VALUES_ARRAY =
		new IfcReflectanceMethodEnum[] {
			BLINN,
			FLAT,
			GLASS,
			MATT,
			METAL,
			MIRROR,
			PHONG,
			PLASTIC,
			STRAUSS,
			NOTDEFINED,
		};

	/**
	 * A public read-only list of all the '<em><b>Ifc Reflectance Method Enum</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<IfcReflectanceMethodEnum> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Ifc Reflectance Method Enum</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static IfcReflectanceMethodEnum get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			IfcReflectanceMethodEnum result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Ifc Reflectance Method Enum</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static IfcReflectanceMethodEnum getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			IfcReflectanceMethodEnum result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Ifc Reflectance Method Enum</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static IfcReflectanceMethodEnum get(int value) {
		switch (value) {
			case BLINN_VALUE: return BLINN;
			case FLAT_VALUE: return FLAT;
			case GLASS_VALUE: return GLASS;
			case MATT_VALUE: return MATT;
			case METAL_VALUE: return METAL;
			case MIRROR_VALUE: return MIRROR;
			case PHONG_VALUE: return PHONG;
			case PLASTIC_VALUE: return PLASTIC;
			case STRAUSS_VALUE: return STRAUSS;
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
	private IfcReflectanceMethodEnum(int value, String name, String literal) {
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
	
} //IfcReflectanceMethodEnum
