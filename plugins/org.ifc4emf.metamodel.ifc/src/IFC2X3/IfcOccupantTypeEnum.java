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
 * A representation of the literals of the enumeration '<em><b>Ifc Occupant Type Enum</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see IFC2X3.IFC2X3Package#getIfcOccupantTypeEnum()
 * @model
 * @generated
 */
public enum IfcOccupantTypeEnum implements Enumerator {
	/**
	 * The '<em><b>ASSIGNEE</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ASSIGNEE_VALUE
	 * @generated
	 * @ordered
	 */
	ASSIGNEE(0, "ASSIGNEE", "ASSIGNEE"), /**
	 * The '<em><b>ASSIGNOR</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ASSIGNOR_VALUE
	 * @generated
	 * @ordered
	 */
	ASSIGNOR(1, "ASSIGNOR", "ASSIGNOR"), /**
	 * The '<em><b>LESSEE</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #LESSEE_VALUE
	 * @generated
	 * @ordered
	 */
	LESSEE(2, "LESSEE", "LESSEE"), /**
	 * The '<em><b>LESSOR</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #LESSOR_VALUE
	 * @generated
	 * @ordered
	 */
	LESSOR(3, "LESSOR", "LESSOR"), /**
	 * The '<em><b>LETTINGAGENT</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #LETTINGAGENT_VALUE
	 * @generated
	 * @ordered
	 */
	LETTINGAGENT(4, "LETTINGAGENT", "LETTINGAGENT"), /**
	 * The '<em><b>OWNER</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #OWNER_VALUE
	 * @generated
	 * @ordered
	 */
	OWNER(5, "OWNER", "OWNER"), /**
	 * The '<em><b>TENANT</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #TENANT_VALUE
	 * @generated
	 * @ordered
	 */
	TENANT(6, "TENANT", "TENANT"), /**
	 * The '<em><b>USERDEFINED</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #USERDEFINED_VALUE
	 * @generated
	 * @ordered
	 */
	USERDEFINED(7, "USERDEFINED", "USERDEFINED"), /**
	 * The '<em><b>NOTDEFINED</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #NOTDEFINED_VALUE
	 * @generated
	 * @ordered
	 */
	NOTDEFINED(8, "NOTDEFINED", "NOTDEFINED");

	/**
	 * The '<em><b>ASSIGNEE</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>ASSIGNEE</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #ASSIGNEE
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int ASSIGNEE_VALUE = 0;

	/**
	 * The '<em><b>ASSIGNOR</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>ASSIGNOR</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #ASSIGNOR
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int ASSIGNOR_VALUE = 1;

	/**
	 * The '<em><b>LESSEE</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>LESSEE</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #LESSEE
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int LESSEE_VALUE = 2;

	/**
	 * The '<em><b>LESSOR</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>LESSOR</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #LESSOR
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int LESSOR_VALUE = 3;

	/**
	 * The '<em><b>LETTINGAGENT</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>LETTINGAGENT</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #LETTINGAGENT
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int LETTINGAGENT_VALUE = 4;

	/**
	 * The '<em><b>OWNER</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>OWNER</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #OWNER
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int OWNER_VALUE = 5;

	/**
	 * The '<em><b>TENANT</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>TENANT</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #TENANT
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int TENANT_VALUE = 6;

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
	public static final int NOTDEFINED_VALUE = 8;

	/**
	 * An array of all the '<em><b>Ifc Occupant Type Enum</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final IfcOccupantTypeEnum[] VALUES_ARRAY =
		new IfcOccupantTypeEnum[] {
			ASSIGNEE,
			ASSIGNOR,
			LESSEE,
			LESSOR,
			LETTINGAGENT,
			OWNER,
			TENANT,
			USERDEFINED,
			NOTDEFINED,
		};

	/**
	 * A public read-only list of all the '<em><b>Ifc Occupant Type Enum</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<IfcOccupantTypeEnum> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Ifc Occupant Type Enum</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static IfcOccupantTypeEnum get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			IfcOccupantTypeEnum result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Ifc Occupant Type Enum</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static IfcOccupantTypeEnum getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			IfcOccupantTypeEnum result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Ifc Occupant Type Enum</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static IfcOccupantTypeEnum get(int value) {
		switch (value) {
			case ASSIGNEE_VALUE: return ASSIGNEE;
			case ASSIGNOR_VALUE: return ASSIGNOR;
			case LESSEE_VALUE: return LESSEE;
			case LESSOR_VALUE: return LESSOR;
			case LETTINGAGENT_VALUE: return LETTINGAGENT;
			case OWNER_VALUE: return OWNER;
			case TENANT_VALUE: return TENANT;
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
	private IfcOccupantTypeEnum(int value, String name, String literal) {
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
	
} //IfcOccupantTypeEnum
