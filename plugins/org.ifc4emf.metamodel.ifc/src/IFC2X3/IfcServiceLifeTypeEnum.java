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
 * A representation of the literals of the enumeration '<em><b>Ifc Service Life Type Enum</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see IFC2X3.IFC2X3Package#getIfcServiceLifeTypeEnum()
 * @model
 * @generated
 */
public enum IfcServiceLifeTypeEnum implements Enumerator {
	/**
	 * The '<em><b>ACTUALSERVICELIFE</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ACTUALSERVICELIFE_VALUE
	 * @generated
	 * @ordered
	 */
	ACTUALSERVICELIFE(0, "ACTUALSERVICELIFE", "ACTUALSERVICELIFE"), /**
	 * The '<em><b>EXPECTEDSERVICELIFE</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #EXPECTEDSERVICELIFE_VALUE
	 * @generated
	 * @ordered
	 */
	EXPECTEDSERVICELIFE(1, "EXPECTEDSERVICELIFE", "EXPECTEDSERVICELIFE"), /**
	 * The '<em><b>OPTIMISTICREFERENCESERVICELIFE</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #OPTIMISTICREFERENCESERVICELIFE_VALUE
	 * @generated
	 * @ordered
	 */
	OPTIMISTICREFERENCESERVICELIFE(2, "OPTIMISTICREFERENCESERVICELIFE", "OPTIMISTICREFERENCESERVICELIFE"), /**
	 * The '<em><b>PESSIMISTICREFERENCESERVICELIFE</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #PESSIMISTICREFERENCESERVICELIFE_VALUE
	 * @generated
	 * @ordered
	 */
	PESSIMISTICREFERENCESERVICELIFE(3, "PESSIMISTICREFERENCESERVICELIFE", "PESSIMISTICREFERENCESERVICELIFE"), /**
	 * The '<em><b>REFERENCESERVICELIFE</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #REFERENCESERVICELIFE_VALUE
	 * @generated
	 * @ordered
	 */
	REFERENCESERVICELIFE(4, "REFERENCESERVICELIFE", "REFERENCESERVICELIFE");

	/**
	 * The '<em><b>ACTUALSERVICELIFE</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>ACTUALSERVICELIFE</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #ACTUALSERVICELIFE
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int ACTUALSERVICELIFE_VALUE = 0;

	/**
	 * The '<em><b>EXPECTEDSERVICELIFE</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>EXPECTEDSERVICELIFE</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #EXPECTEDSERVICELIFE
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int EXPECTEDSERVICELIFE_VALUE = 1;

	/**
	 * The '<em><b>OPTIMISTICREFERENCESERVICELIFE</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>OPTIMISTICREFERENCESERVICELIFE</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #OPTIMISTICREFERENCESERVICELIFE
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int OPTIMISTICREFERENCESERVICELIFE_VALUE = 2;

	/**
	 * The '<em><b>PESSIMISTICREFERENCESERVICELIFE</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>PESSIMISTICREFERENCESERVICELIFE</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #PESSIMISTICREFERENCESERVICELIFE
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int PESSIMISTICREFERENCESERVICELIFE_VALUE = 3;

	/**
	 * The '<em><b>REFERENCESERVICELIFE</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>REFERENCESERVICELIFE</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #REFERENCESERVICELIFE
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int REFERENCESERVICELIFE_VALUE = 4;

	/**
	 * An array of all the '<em><b>Ifc Service Life Type Enum</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final IfcServiceLifeTypeEnum[] VALUES_ARRAY =
		new IfcServiceLifeTypeEnum[] {
			ACTUALSERVICELIFE,
			EXPECTEDSERVICELIFE,
			OPTIMISTICREFERENCESERVICELIFE,
			PESSIMISTICREFERENCESERVICELIFE,
			REFERENCESERVICELIFE,
		};

	/**
	 * A public read-only list of all the '<em><b>Ifc Service Life Type Enum</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<IfcServiceLifeTypeEnum> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Ifc Service Life Type Enum</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static IfcServiceLifeTypeEnum get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			IfcServiceLifeTypeEnum result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Ifc Service Life Type Enum</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static IfcServiceLifeTypeEnum getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			IfcServiceLifeTypeEnum result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Ifc Service Life Type Enum</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static IfcServiceLifeTypeEnum get(int value) {
		switch (value) {
			case ACTUALSERVICELIFE_VALUE: return ACTUALSERVICELIFE;
			case EXPECTEDSERVICELIFE_VALUE: return EXPECTEDSERVICELIFE;
			case OPTIMISTICREFERENCESERVICELIFE_VALUE: return OPTIMISTICREFERENCESERVICELIFE;
			case PESSIMISTICREFERENCESERVICELIFE_VALUE: return PESSIMISTICREFERENCESERVICELIFE;
			case REFERENCESERVICELIFE_VALUE: return REFERENCESERVICELIFE;
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
	private IfcServiceLifeTypeEnum(int value, String name, String literal) {
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
	
} //IfcServiceLifeTypeEnum
