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
 * A representation of the literals of the enumeration '<em><b>Ifc Thermal Load Source Enum</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see IFC2X3.IFC2X3Package#getIfcThermalLoadSourceEnum()
 * @model
 * @generated
 */
public enum IfcThermalLoadSourceEnum implements Enumerator {
	/**
	 * The '<em><b>PEOPLE</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #PEOPLE_VALUE
	 * @generated
	 * @ordered
	 */
	PEOPLE(0, "PEOPLE", "PEOPLE"), /**
	 * The '<em><b>LIGHTING</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #LIGHTING_VALUE
	 * @generated
	 * @ordered
	 */
	LIGHTING(1, "LIGHTING", "LIGHTING"), /**
	 * The '<em><b>EQUIPMENT</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #EQUIPMENT_VALUE
	 * @generated
	 * @ordered
	 */
	EQUIPMENT(2, "EQUIPMENT", "EQUIPMENT"), /**
	 * The '<em><b>VENTILATIONINDOORAIR</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #VENTILATIONINDOORAIR_VALUE
	 * @generated
	 * @ordered
	 */
	VENTILATIONINDOORAIR(3, "VENTILATIONINDOORAIR", "VENTILATIONINDOORAIR"), /**
	 * The '<em><b>VENTILATIONOUTSIDEAIR</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #VENTILATIONOUTSIDEAIR_VALUE
	 * @generated
	 * @ordered
	 */
	VENTILATIONOUTSIDEAIR(4, "VENTILATIONOUTSIDEAIR", "VENTILATIONOUTSIDEAIR"), /**
	 * The '<em><b>RECIRCULATEDAIR</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #RECIRCULATEDAIR_VALUE
	 * @generated
	 * @ordered
	 */
	RECIRCULATEDAIR(5, "RECIRCULATEDAIR", "RECIRCULATEDAIR"), /**
	 * The '<em><b>EXHAUSTAIR</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #EXHAUSTAIR_VALUE
	 * @generated
	 * @ordered
	 */
	EXHAUSTAIR(6, "EXHAUSTAIR", "EXHAUSTAIR"), /**
	 * The '<em><b>AIREXCHANGERATE</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #AIREXCHANGERATE_VALUE
	 * @generated
	 * @ordered
	 */
	AIREXCHANGERATE(7, "AIREXCHANGERATE", "AIREXCHANGERATE"), /**
	 * The '<em><b>DRYBULBTEMPERATURE</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #DRYBULBTEMPERATURE_VALUE
	 * @generated
	 * @ordered
	 */
	DRYBULBTEMPERATURE(8, "DRYBULBTEMPERATURE", "DRYBULBTEMPERATURE"), /**
	 * The '<em><b>RELATIVEHUMIDITY</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #RELATIVEHUMIDITY_VALUE
	 * @generated
	 * @ordered
	 */
	RELATIVEHUMIDITY(9, "RELATIVEHUMIDITY", "RELATIVEHUMIDITY"), /**
	 * The '<em><b>INFILTRATION</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #INFILTRATION_VALUE
	 * @generated
	 * @ordered
	 */
	INFILTRATION(10, "INFILTRATION", "INFILTRATION"), /**
	 * The '<em><b>USERDEFINED</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #USERDEFINED_VALUE
	 * @generated
	 * @ordered
	 */
	USERDEFINED(11, "USERDEFINED", "USERDEFINED"), /**
	 * The '<em><b>NOTDEFINED</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #NOTDEFINED_VALUE
	 * @generated
	 * @ordered
	 */
	NOTDEFINED(12, "NOTDEFINED", "NOTDEFINED");

	/**
	 * The '<em><b>PEOPLE</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>PEOPLE</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #PEOPLE
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int PEOPLE_VALUE = 0;

	/**
	 * The '<em><b>LIGHTING</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>LIGHTING</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #LIGHTING
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int LIGHTING_VALUE = 1;

	/**
	 * The '<em><b>EQUIPMENT</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>EQUIPMENT</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #EQUIPMENT
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int EQUIPMENT_VALUE = 2;

	/**
	 * The '<em><b>VENTILATIONINDOORAIR</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>VENTILATIONINDOORAIR</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #VENTILATIONINDOORAIR
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int VENTILATIONINDOORAIR_VALUE = 3;

	/**
	 * The '<em><b>VENTILATIONOUTSIDEAIR</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>VENTILATIONOUTSIDEAIR</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #VENTILATIONOUTSIDEAIR
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int VENTILATIONOUTSIDEAIR_VALUE = 4;

	/**
	 * The '<em><b>RECIRCULATEDAIR</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>RECIRCULATEDAIR</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #RECIRCULATEDAIR
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int RECIRCULATEDAIR_VALUE = 5;

	/**
	 * The '<em><b>EXHAUSTAIR</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>EXHAUSTAIR</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #EXHAUSTAIR
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int EXHAUSTAIR_VALUE = 6;

	/**
	 * The '<em><b>AIREXCHANGERATE</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>AIREXCHANGERATE</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #AIREXCHANGERATE
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int AIREXCHANGERATE_VALUE = 7;

	/**
	 * The '<em><b>DRYBULBTEMPERATURE</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>DRYBULBTEMPERATURE</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #DRYBULBTEMPERATURE
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int DRYBULBTEMPERATURE_VALUE = 8;

	/**
	 * The '<em><b>RELATIVEHUMIDITY</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>RELATIVEHUMIDITY</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #RELATIVEHUMIDITY
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int RELATIVEHUMIDITY_VALUE = 9;

	/**
	 * The '<em><b>INFILTRATION</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>INFILTRATION</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #INFILTRATION
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int INFILTRATION_VALUE = 10;

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
	public static final int USERDEFINED_VALUE = 11;

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
	public static final int NOTDEFINED_VALUE = 12;

	/**
	 * An array of all the '<em><b>Ifc Thermal Load Source Enum</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final IfcThermalLoadSourceEnum[] VALUES_ARRAY =
		new IfcThermalLoadSourceEnum[] {
			PEOPLE,
			LIGHTING,
			EQUIPMENT,
			VENTILATIONINDOORAIR,
			VENTILATIONOUTSIDEAIR,
			RECIRCULATEDAIR,
			EXHAUSTAIR,
			AIREXCHANGERATE,
			DRYBULBTEMPERATURE,
			RELATIVEHUMIDITY,
			INFILTRATION,
			USERDEFINED,
			NOTDEFINED,
		};

	/**
	 * A public read-only list of all the '<em><b>Ifc Thermal Load Source Enum</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<IfcThermalLoadSourceEnum> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Ifc Thermal Load Source Enum</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static IfcThermalLoadSourceEnum get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			IfcThermalLoadSourceEnum result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Ifc Thermal Load Source Enum</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static IfcThermalLoadSourceEnum getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			IfcThermalLoadSourceEnum result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Ifc Thermal Load Source Enum</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static IfcThermalLoadSourceEnum get(int value) {
		switch (value) {
			case PEOPLE_VALUE: return PEOPLE;
			case LIGHTING_VALUE: return LIGHTING;
			case EQUIPMENT_VALUE: return EQUIPMENT;
			case VENTILATIONINDOORAIR_VALUE: return VENTILATIONINDOORAIR;
			case VENTILATIONOUTSIDEAIR_VALUE: return VENTILATIONOUTSIDEAIR;
			case RECIRCULATEDAIR_VALUE: return RECIRCULATEDAIR;
			case EXHAUSTAIR_VALUE: return EXHAUSTAIR;
			case AIREXCHANGERATE_VALUE: return AIREXCHANGERATE;
			case DRYBULBTEMPERATURE_VALUE: return DRYBULBTEMPERATURE;
			case RELATIVEHUMIDITY_VALUE: return RELATIVEHUMIDITY;
			case INFILTRATION_VALUE: return INFILTRATION;
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
	private IfcThermalLoadSourceEnum(int value, String name, String literal) {
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
	
} //IfcThermalLoadSourceEnum
