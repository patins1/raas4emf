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
 * A representation of the literals of the enumeration '<em><b>Ifc Role Enum</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see IFC2X3.IFC2X3Package#getIfcRoleEnum()
 * @model
 * @generated
 */
public enum IfcRoleEnum implements Enumerator {
	/**
	 * The '<em><b>SUPPLIER</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #SUPPLIER_VALUE
	 * @generated
	 * @ordered
	 */
	SUPPLIER(0, "SUPPLIER", "SUPPLIER"), /**
	 * The '<em><b>MANUFACTURER</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #MANUFACTURER_VALUE
	 * @generated
	 * @ordered
	 */
	MANUFACTURER(1, "MANUFACTURER", "MANUFACTURER"), /**
	 * The '<em><b>CONTRACTOR</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CONTRACTOR_VALUE
	 * @generated
	 * @ordered
	 */
	CONTRACTOR(2, "CONTRACTOR", "CONTRACTOR"), /**
	 * The '<em><b>SUBCONTRACTOR</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #SUBCONTRACTOR_VALUE
	 * @generated
	 * @ordered
	 */
	SUBCONTRACTOR(3, "SUBCONTRACTOR", "SUBCONTRACTOR"), /**
	 * The '<em><b>ARCHITECT</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ARCHITECT_VALUE
	 * @generated
	 * @ordered
	 */
	ARCHITECT(4, "ARCHITECT", "ARCHITECT"), /**
	 * The '<em><b>STRUCTURALENGINEER</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #STRUCTURALENGINEER_VALUE
	 * @generated
	 * @ordered
	 */
	STRUCTURALENGINEER(5, "STRUCTURALENGINEER", "STRUCTURALENGINEER"), /**
	 * The '<em><b>COSTENGINEER</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #COSTENGINEER_VALUE
	 * @generated
	 * @ordered
	 */
	COSTENGINEER(6, "COSTENGINEER", "COSTENGINEER"), /**
	 * The '<em><b>CLIENT</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CLIENT_VALUE
	 * @generated
	 * @ordered
	 */
	CLIENT(7, "CLIENT", "CLIENT"), /**
	 * The '<em><b>BUILDINGOWNER</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #BUILDINGOWNER_VALUE
	 * @generated
	 * @ordered
	 */
	BUILDINGOWNER(8, "BUILDINGOWNER", "BUILDINGOWNER"), /**
	 * The '<em><b>BUILDINGOPERATOR</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #BUILDINGOPERATOR_VALUE
	 * @generated
	 * @ordered
	 */
	BUILDINGOPERATOR(9, "BUILDINGOPERATOR", "BUILDINGOPERATOR"), /**
	 * The '<em><b>MECHANICALENGINEER</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #MECHANICALENGINEER_VALUE
	 * @generated
	 * @ordered
	 */
	MECHANICALENGINEER(10, "MECHANICALENGINEER", "MECHANICALENGINEER"), /**
	 * The '<em><b>ELECTRICALENGINEER</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ELECTRICALENGINEER_VALUE
	 * @generated
	 * @ordered
	 */
	ELECTRICALENGINEER(11, "ELECTRICALENGINEER", "ELECTRICALENGINEER"), /**
	 * The '<em><b>PROJECTMANAGER</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #PROJECTMANAGER_VALUE
	 * @generated
	 * @ordered
	 */
	PROJECTMANAGER(12, "PROJECTMANAGER", "PROJECTMANAGER"), /**
	 * The '<em><b>FACILITIESMANAGER</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #FACILITIESMANAGER_VALUE
	 * @generated
	 * @ordered
	 */
	FACILITIESMANAGER(13, "FACILITIESMANAGER", "FACILITIESMANAGER"), /**
	 * The '<em><b>CIVILENGINEER</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CIVILENGINEER_VALUE
	 * @generated
	 * @ordered
	 */
	CIVILENGINEER(14, "CIVILENGINEER", "CIVILENGINEER"), /**
	 * The '<em><b>COMISSIONINGENGINEER</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #COMISSIONINGENGINEER_VALUE
	 * @generated
	 * @ordered
	 */
	COMISSIONINGENGINEER(15, "COMISSIONINGENGINEER", "COMISSIONINGENGINEER"), /**
	 * The '<em><b>ENGINEER</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ENGINEER_VALUE
	 * @generated
	 * @ordered
	 */
	ENGINEER(16, "ENGINEER", "ENGINEER"), /**
	 * The '<em><b>OWNER</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #OWNER_VALUE
	 * @generated
	 * @ordered
	 */
	OWNER(17, "OWNER", "OWNER"), /**
	 * The '<em><b>CONSULTANT</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CONSULTANT_VALUE
	 * @generated
	 * @ordered
	 */
	CONSULTANT(18, "CONSULTANT", "CONSULTANT"), /**
	 * The '<em><b>CONSTRUCTIONMANAGER</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CONSTRUCTIONMANAGER_VALUE
	 * @generated
	 * @ordered
	 */
	CONSTRUCTIONMANAGER(19, "CONSTRUCTIONMANAGER", "CONSTRUCTIONMANAGER"), /**
	 * The '<em><b>FIELDCONSTRUCTIONMANAGER</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #FIELDCONSTRUCTIONMANAGER_VALUE
	 * @generated
	 * @ordered
	 */
	FIELDCONSTRUCTIONMANAGER(20, "FIELDCONSTRUCTIONMANAGER", "FIELDCONSTRUCTIONMANAGER"), /**
	 * The '<em><b>RESELLER</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #RESELLER_VALUE
	 * @generated
	 * @ordered
	 */
	RESELLER(21, "RESELLER", "RESELLER"), /**
	 * The '<em><b>USERDEFINED</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #USERDEFINED_VALUE
	 * @generated
	 * @ordered
	 */
	USERDEFINED(22, "USERDEFINED", "USERDEFINED");

	/**
	 * The '<em><b>SUPPLIER</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>SUPPLIER</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #SUPPLIER
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int SUPPLIER_VALUE = 0;

	/**
	 * The '<em><b>MANUFACTURER</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>MANUFACTURER</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #MANUFACTURER
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int MANUFACTURER_VALUE = 1;

	/**
	 * The '<em><b>CONTRACTOR</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>CONTRACTOR</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #CONTRACTOR
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int CONTRACTOR_VALUE = 2;

	/**
	 * The '<em><b>SUBCONTRACTOR</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>SUBCONTRACTOR</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #SUBCONTRACTOR
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int SUBCONTRACTOR_VALUE = 3;

	/**
	 * The '<em><b>ARCHITECT</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>ARCHITECT</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #ARCHITECT
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int ARCHITECT_VALUE = 4;

	/**
	 * The '<em><b>STRUCTURALENGINEER</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>STRUCTURALENGINEER</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #STRUCTURALENGINEER
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int STRUCTURALENGINEER_VALUE = 5;

	/**
	 * The '<em><b>COSTENGINEER</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>COSTENGINEER</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #COSTENGINEER
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int COSTENGINEER_VALUE = 6;

	/**
	 * The '<em><b>CLIENT</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>CLIENT</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #CLIENT
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int CLIENT_VALUE = 7;

	/**
	 * The '<em><b>BUILDINGOWNER</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>BUILDINGOWNER</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #BUILDINGOWNER
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int BUILDINGOWNER_VALUE = 8;

	/**
	 * The '<em><b>BUILDINGOPERATOR</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>BUILDINGOPERATOR</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #BUILDINGOPERATOR
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int BUILDINGOPERATOR_VALUE = 9;

	/**
	 * The '<em><b>MECHANICALENGINEER</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>MECHANICALENGINEER</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #MECHANICALENGINEER
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int MECHANICALENGINEER_VALUE = 10;

	/**
	 * The '<em><b>ELECTRICALENGINEER</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>ELECTRICALENGINEER</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #ELECTRICALENGINEER
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int ELECTRICALENGINEER_VALUE = 11;

	/**
	 * The '<em><b>PROJECTMANAGER</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>PROJECTMANAGER</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #PROJECTMANAGER
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int PROJECTMANAGER_VALUE = 12;

	/**
	 * The '<em><b>FACILITIESMANAGER</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>FACILITIESMANAGER</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #FACILITIESMANAGER
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int FACILITIESMANAGER_VALUE = 13;

	/**
	 * The '<em><b>CIVILENGINEER</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>CIVILENGINEER</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #CIVILENGINEER
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int CIVILENGINEER_VALUE = 14;

	/**
	 * The '<em><b>COMISSIONINGENGINEER</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>COMISSIONINGENGINEER</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #COMISSIONINGENGINEER
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int COMISSIONINGENGINEER_VALUE = 15;

	/**
	 * The '<em><b>ENGINEER</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>ENGINEER</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #ENGINEER
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int ENGINEER_VALUE = 16;

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
	public static final int OWNER_VALUE = 17;

	/**
	 * The '<em><b>CONSULTANT</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>CONSULTANT</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #CONSULTANT
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int CONSULTANT_VALUE = 18;

	/**
	 * The '<em><b>CONSTRUCTIONMANAGER</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>CONSTRUCTIONMANAGER</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #CONSTRUCTIONMANAGER
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int CONSTRUCTIONMANAGER_VALUE = 19;

	/**
	 * The '<em><b>FIELDCONSTRUCTIONMANAGER</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>FIELDCONSTRUCTIONMANAGER</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #FIELDCONSTRUCTIONMANAGER
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int FIELDCONSTRUCTIONMANAGER_VALUE = 20;

	/**
	 * The '<em><b>RESELLER</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>RESELLER</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #RESELLER
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int RESELLER_VALUE = 21;

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
	public static final int USERDEFINED_VALUE = 22;

	/**
	 * An array of all the '<em><b>Ifc Role Enum</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final IfcRoleEnum[] VALUES_ARRAY =
		new IfcRoleEnum[] {
			SUPPLIER,
			MANUFACTURER,
			CONTRACTOR,
			SUBCONTRACTOR,
			ARCHITECT,
			STRUCTURALENGINEER,
			COSTENGINEER,
			CLIENT,
			BUILDINGOWNER,
			BUILDINGOPERATOR,
			MECHANICALENGINEER,
			ELECTRICALENGINEER,
			PROJECTMANAGER,
			FACILITIESMANAGER,
			CIVILENGINEER,
			COMISSIONINGENGINEER,
			ENGINEER,
			OWNER,
			CONSULTANT,
			CONSTRUCTIONMANAGER,
			FIELDCONSTRUCTIONMANAGER,
			RESELLER,
			USERDEFINED,
		};

	/**
	 * A public read-only list of all the '<em><b>Ifc Role Enum</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<IfcRoleEnum> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Ifc Role Enum</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static IfcRoleEnum get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			IfcRoleEnum result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Ifc Role Enum</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static IfcRoleEnum getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			IfcRoleEnum result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Ifc Role Enum</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static IfcRoleEnum get(int value) {
		switch (value) {
			case SUPPLIER_VALUE: return SUPPLIER;
			case MANUFACTURER_VALUE: return MANUFACTURER;
			case CONTRACTOR_VALUE: return CONTRACTOR;
			case SUBCONTRACTOR_VALUE: return SUBCONTRACTOR;
			case ARCHITECT_VALUE: return ARCHITECT;
			case STRUCTURALENGINEER_VALUE: return STRUCTURALENGINEER;
			case COSTENGINEER_VALUE: return COSTENGINEER;
			case CLIENT_VALUE: return CLIENT;
			case BUILDINGOWNER_VALUE: return BUILDINGOWNER;
			case BUILDINGOPERATOR_VALUE: return BUILDINGOPERATOR;
			case MECHANICALENGINEER_VALUE: return MECHANICALENGINEER;
			case ELECTRICALENGINEER_VALUE: return ELECTRICALENGINEER;
			case PROJECTMANAGER_VALUE: return PROJECTMANAGER;
			case FACILITIESMANAGER_VALUE: return FACILITIESMANAGER;
			case CIVILENGINEER_VALUE: return CIVILENGINEER;
			case COMISSIONINGENGINEER_VALUE: return COMISSIONINGENGINEER;
			case ENGINEER_VALUE: return ENGINEER;
			case OWNER_VALUE: return OWNER;
			case CONSULTANT_VALUE: return CONSULTANT;
			case CONSTRUCTIONMANAGER_VALUE: return CONSTRUCTIONMANAGER;
			case FIELDCONSTRUCTIONMANAGER_VALUE: return FIELDCONSTRUCTIONMANAGER;
			case RESELLER_VALUE: return RESELLER;
			case USERDEFINED_VALUE: return USERDEFINED;
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
	private IfcRoleEnum(int value, String name, String literal) {
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
	
} //IfcRoleEnum
