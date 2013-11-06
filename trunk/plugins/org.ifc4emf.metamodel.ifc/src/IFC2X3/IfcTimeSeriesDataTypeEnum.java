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
 * A representation of the literals of the enumeration '<em><b>Ifc Time Series Data Type Enum</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see IFC2X3.IFC2X3Package#getIfcTimeSeriesDataTypeEnum()
 * @model
 * @generated
 */
public enum IfcTimeSeriesDataTypeEnum implements Enumerator {
	/**
	 * The '<em><b>CONTINUOUS</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CONTINUOUS_VALUE
	 * @generated
	 * @ordered
	 */
	CONTINUOUS(0, "CONTINUOUS", "CONTINUOUS"), /**
	 * The '<em><b>DISCRETE</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #DISCRETE_VALUE
	 * @generated
	 * @ordered
	 */
	DISCRETE(1, "DISCRETE", "DISCRETE"), /**
	 * The '<em><b>DISCRETEBINARY</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #DISCRETEBINARY_VALUE
	 * @generated
	 * @ordered
	 */
	DISCRETEBINARY(2, "DISCRETEBINARY", "DISCRETEBINARY"), /**
	 * The '<em><b>PIECEWISEBINARY</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #PIECEWISEBINARY_VALUE
	 * @generated
	 * @ordered
	 */
	PIECEWISEBINARY(3, "PIECEWISEBINARY", "PIECEWISEBINARY"), /**
	 * The '<em><b>PIECEWISECONSTANT</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #PIECEWISECONSTANT_VALUE
	 * @generated
	 * @ordered
	 */
	PIECEWISECONSTANT(4, "PIECEWISECONSTANT", "PIECEWISECONSTANT"), /**
	 * The '<em><b>PIECEWISECONTINUOUS</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #PIECEWISECONTINUOUS_VALUE
	 * @generated
	 * @ordered
	 */
	PIECEWISECONTINUOUS(5, "PIECEWISECONTINUOUS", "PIECEWISECONTINUOUS"), /**
	 * The '<em><b>NOTDEFINED</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #NOTDEFINED_VALUE
	 * @generated
	 * @ordered
	 */
	NOTDEFINED(6, "NOTDEFINED", "NOTDEFINED");

	/**
	 * The '<em><b>CONTINUOUS</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>CONTINUOUS</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #CONTINUOUS
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int CONTINUOUS_VALUE = 0;

	/**
	 * The '<em><b>DISCRETE</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>DISCRETE</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #DISCRETE
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int DISCRETE_VALUE = 1;

	/**
	 * The '<em><b>DISCRETEBINARY</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>DISCRETEBINARY</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #DISCRETEBINARY
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int DISCRETEBINARY_VALUE = 2;

	/**
	 * The '<em><b>PIECEWISEBINARY</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>PIECEWISEBINARY</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #PIECEWISEBINARY
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int PIECEWISEBINARY_VALUE = 3;

	/**
	 * The '<em><b>PIECEWISECONSTANT</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>PIECEWISECONSTANT</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #PIECEWISECONSTANT
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int PIECEWISECONSTANT_VALUE = 4;

	/**
	 * The '<em><b>PIECEWISECONTINUOUS</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>PIECEWISECONTINUOUS</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #PIECEWISECONTINUOUS
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int PIECEWISECONTINUOUS_VALUE = 5;

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
	 * An array of all the '<em><b>Ifc Time Series Data Type Enum</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final IfcTimeSeriesDataTypeEnum[] VALUES_ARRAY =
		new IfcTimeSeriesDataTypeEnum[] {
			CONTINUOUS,
			DISCRETE,
			DISCRETEBINARY,
			PIECEWISEBINARY,
			PIECEWISECONSTANT,
			PIECEWISECONTINUOUS,
			NOTDEFINED,
		};

	/**
	 * A public read-only list of all the '<em><b>Ifc Time Series Data Type Enum</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<IfcTimeSeriesDataTypeEnum> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Ifc Time Series Data Type Enum</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static IfcTimeSeriesDataTypeEnum get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			IfcTimeSeriesDataTypeEnum result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Ifc Time Series Data Type Enum</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static IfcTimeSeriesDataTypeEnum getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			IfcTimeSeriesDataTypeEnum result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Ifc Time Series Data Type Enum</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static IfcTimeSeriesDataTypeEnum get(int value) {
		switch (value) {
			case CONTINUOUS_VALUE: return CONTINUOUS;
			case DISCRETE_VALUE: return DISCRETE;
			case DISCRETEBINARY_VALUE: return DISCRETEBINARY;
			case PIECEWISEBINARY_VALUE: return PIECEWISEBINARY;
			case PIECEWISECONSTANT_VALUE: return PIECEWISECONSTANT;
			case PIECEWISECONTINUOUS_VALUE: return PIECEWISECONTINUOUS;
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
	private IfcTimeSeriesDataTypeEnum(int value, String name, String literal) {
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
	
} //IfcTimeSeriesDataTypeEnum
