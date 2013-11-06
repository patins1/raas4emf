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
 * A representation of the literals of the enumeration '<em><b>Ifc Change Action Enum</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see IFC2X3.IFC2X3Package#getIfcChangeActionEnum()
 * @model
 * @generated
 */
public enum IfcChangeActionEnum implements Enumerator {
	/**
	 * The '<em><b>NOCHANGE</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #NOCHANGE_VALUE
	 * @generated
	 * @ordered
	 */
	NOCHANGE(0, "NOCHANGE", "NOCHANGE"), /**
	 * The '<em><b>MODIFIED</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #MODIFIED_VALUE
	 * @generated
	 * @ordered
	 */
	MODIFIED(1, "MODIFIED", "MODIFIED"), /**
	 * The '<em><b>ADDED</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ADDED_VALUE
	 * @generated
	 * @ordered
	 */
	ADDED(2, "ADDED", "ADDED"), /**
	 * The '<em><b>DELETED</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #DELETED_VALUE
	 * @generated
	 * @ordered
	 */
	DELETED(3, "DELETED", "DELETED"), /**
	 * The '<em><b>MODIFIEDADDED</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #MODIFIEDADDED_VALUE
	 * @generated
	 * @ordered
	 */
	MODIFIEDADDED(4, "MODIFIEDADDED", "MODIFIEDADDED"), /**
	 * The '<em><b>MODIFIEDDELETED</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #MODIFIEDDELETED_VALUE
	 * @generated
	 * @ordered
	 */
	MODIFIEDDELETED(5, "MODIFIEDDELETED", "MODIFIEDDELETED");

	/**
	 * The '<em><b>NOCHANGE</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>NOCHANGE</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #NOCHANGE
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int NOCHANGE_VALUE = 0;

	/**
	 * The '<em><b>MODIFIED</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>MODIFIED</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #MODIFIED
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int MODIFIED_VALUE = 1;

	/**
	 * The '<em><b>ADDED</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>ADDED</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #ADDED
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int ADDED_VALUE = 2;

	/**
	 * The '<em><b>DELETED</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>DELETED</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #DELETED
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int DELETED_VALUE = 3;

	/**
	 * The '<em><b>MODIFIEDADDED</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>MODIFIEDADDED</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #MODIFIEDADDED
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int MODIFIEDADDED_VALUE = 4;

	/**
	 * The '<em><b>MODIFIEDDELETED</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>MODIFIEDDELETED</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #MODIFIEDDELETED
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int MODIFIEDDELETED_VALUE = 5;

	/**
	 * An array of all the '<em><b>Ifc Change Action Enum</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final IfcChangeActionEnum[] VALUES_ARRAY =
		new IfcChangeActionEnum[] {
			NOCHANGE,
			MODIFIED,
			ADDED,
			DELETED,
			MODIFIEDADDED,
			MODIFIEDDELETED,
		};

	/**
	 * A public read-only list of all the '<em><b>Ifc Change Action Enum</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<IfcChangeActionEnum> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Ifc Change Action Enum</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static IfcChangeActionEnum get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			IfcChangeActionEnum result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Ifc Change Action Enum</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static IfcChangeActionEnum getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			IfcChangeActionEnum result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Ifc Change Action Enum</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static IfcChangeActionEnum get(int value) {
		switch (value) {
			case NOCHANGE_VALUE: return NOCHANGE;
			case MODIFIED_VALUE: return MODIFIED;
			case ADDED_VALUE: return ADDED;
			case DELETED_VALUE: return DELETED;
			case MODIFIEDADDED_VALUE: return MODIFIEDADDED;
			case MODIFIEDDELETED_VALUE: return MODIFIEDDELETED;
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
	private IfcChangeActionEnum(int value, String name, String literal) {
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
	
} //IfcChangeActionEnum
