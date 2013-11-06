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
 * A representation of the literals of the enumeration '<em><b>Ifc Window Style Construction Enum</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see IFC2X3.IFC2X3Package#getIfcWindowStyleConstructionEnum()
 * @model
 * @generated
 */
public enum IfcWindowStyleConstructionEnum implements Enumerator {
	/**
	 * The '<em><b>ALUMINIUM</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ALUMINIUM_VALUE
	 * @generated
	 * @ordered
	 */
	ALUMINIUM(0, "ALUMINIUM", "ALUMINIUM"), /**
	 * The '<em><b>HIGH GRADE STEEL</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #HIGH_GRADE_STEEL_VALUE
	 * @generated
	 * @ordered
	 */
	HIGH_GRADE_STEEL(1, "HIGH_GRADE_STEEL", "HIGH_GRADE_STEEL"), /**
	 * The '<em><b>STEEL</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #STEEL_VALUE
	 * @generated
	 * @ordered
	 */
	STEEL(2, "STEEL", "STEEL"), /**
	 * The '<em><b>WOOD</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #WOOD_VALUE
	 * @generated
	 * @ordered
	 */
	WOOD(3, "WOOD", "WOOD"), /**
	 * The '<em><b>ALUMINIUM WOOD</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ALUMINIUM_WOOD_VALUE
	 * @generated
	 * @ordered
	 */
	ALUMINIUM_WOOD(4, "ALUMINIUM_WOOD", "ALUMINIUM_WOOD"), /**
	 * The '<em><b>PLASTIC</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #PLASTIC_VALUE
	 * @generated
	 * @ordered
	 */
	PLASTIC(5, "PLASTIC", "PLASTIC"), /**
	 * The '<em><b>OTHER CONSTRUCTION</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #OTHER_CONSTRUCTION_VALUE
	 * @generated
	 * @ordered
	 */
	OTHER_CONSTRUCTION(6, "OTHER_CONSTRUCTION", "OTHER_CONSTRUCTION"), /**
	 * The '<em><b>NOTDEFINED</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #NOTDEFINED_VALUE
	 * @generated
	 * @ordered
	 */
	NOTDEFINED(7, "NOTDEFINED", "NOTDEFINED");

	/**
	 * The '<em><b>ALUMINIUM</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>ALUMINIUM</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #ALUMINIUM
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int ALUMINIUM_VALUE = 0;

	/**
	 * The '<em><b>HIGH GRADE STEEL</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>HIGH GRADE STEEL</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #HIGH_GRADE_STEEL
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int HIGH_GRADE_STEEL_VALUE = 1;

	/**
	 * The '<em><b>STEEL</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>STEEL</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #STEEL
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int STEEL_VALUE = 2;

	/**
	 * The '<em><b>WOOD</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>WOOD</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #WOOD
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int WOOD_VALUE = 3;

	/**
	 * The '<em><b>ALUMINIUM WOOD</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>ALUMINIUM WOOD</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #ALUMINIUM_WOOD
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int ALUMINIUM_WOOD_VALUE = 4;

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
	public static final int PLASTIC_VALUE = 5;

	/**
	 * The '<em><b>OTHER CONSTRUCTION</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>OTHER CONSTRUCTION</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #OTHER_CONSTRUCTION
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int OTHER_CONSTRUCTION_VALUE = 6;

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
	 * An array of all the '<em><b>Ifc Window Style Construction Enum</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final IfcWindowStyleConstructionEnum[] VALUES_ARRAY =
		new IfcWindowStyleConstructionEnum[] {
			ALUMINIUM,
			HIGH_GRADE_STEEL,
			STEEL,
			WOOD,
			ALUMINIUM_WOOD,
			PLASTIC,
			OTHER_CONSTRUCTION,
			NOTDEFINED,
		};

	/**
	 * A public read-only list of all the '<em><b>Ifc Window Style Construction Enum</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<IfcWindowStyleConstructionEnum> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Ifc Window Style Construction Enum</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static IfcWindowStyleConstructionEnum get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			IfcWindowStyleConstructionEnum result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Ifc Window Style Construction Enum</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static IfcWindowStyleConstructionEnum getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			IfcWindowStyleConstructionEnum result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Ifc Window Style Construction Enum</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static IfcWindowStyleConstructionEnum get(int value) {
		switch (value) {
			case ALUMINIUM_VALUE: return ALUMINIUM;
			case HIGH_GRADE_STEEL_VALUE: return HIGH_GRADE_STEEL;
			case STEEL_VALUE: return STEEL;
			case WOOD_VALUE: return WOOD;
			case ALUMINIUM_WOOD_VALUE: return ALUMINIUM_WOOD;
			case PLASTIC_VALUE: return PLASTIC;
			case OTHER_CONSTRUCTION_VALUE: return OTHER_CONSTRUCTION;
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
	private IfcWindowStyleConstructionEnum(int value, String name, String literal) {
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
	
} //IfcWindowStyleConstructionEnum
