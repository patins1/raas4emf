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
 * A representation of the literals of the enumeration '<em><b>Ifc Benchmark Enum</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see IFC2X3.IFC2X3Package#getIfcBenchmarkEnum()
 * @model
 * @generated
 */
public enum IfcBenchmarkEnum implements Enumerator {
	/**
	 * The '<em><b>GREATERTHAN</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #GREATERTHAN_VALUE
	 * @generated
	 * @ordered
	 */
	GREATERTHAN(0, "GREATERTHAN", "GREATERTHAN"), /**
	 * The '<em><b>GREATERTHANOREQUALTO</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #GREATERTHANOREQUALTO_VALUE
	 * @generated
	 * @ordered
	 */
	GREATERTHANOREQUALTO(1, "GREATERTHANOREQUALTO", "GREATERTHANOREQUALTO"), /**
	 * The '<em><b>LESSTHAN</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #LESSTHAN_VALUE
	 * @generated
	 * @ordered
	 */
	LESSTHAN(2, "LESSTHAN", "LESSTHAN"), /**
	 * The '<em><b>LESSTHANOREQUALTO</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #LESSTHANOREQUALTO_VALUE
	 * @generated
	 * @ordered
	 */
	LESSTHANOREQUALTO(3, "LESSTHANOREQUALTO", "LESSTHANOREQUALTO"), /**
	 * The '<em><b>EQUALTO</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #EQUALTO_VALUE
	 * @generated
	 * @ordered
	 */
	EQUALTO(4, "EQUALTO", "EQUALTO"), /**
	 * The '<em><b>NOTEQUALTO</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #NOTEQUALTO_VALUE
	 * @generated
	 * @ordered
	 */
	NOTEQUALTO(5, "NOTEQUALTO", "NOTEQUALTO");

	/**
	 * The '<em><b>GREATERTHAN</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>GREATERTHAN</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #GREATERTHAN
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int GREATERTHAN_VALUE = 0;

	/**
	 * The '<em><b>GREATERTHANOREQUALTO</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>GREATERTHANOREQUALTO</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #GREATERTHANOREQUALTO
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int GREATERTHANOREQUALTO_VALUE = 1;

	/**
	 * The '<em><b>LESSTHAN</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>LESSTHAN</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #LESSTHAN
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int LESSTHAN_VALUE = 2;

	/**
	 * The '<em><b>LESSTHANOREQUALTO</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>LESSTHANOREQUALTO</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #LESSTHANOREQUALTO
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int LESSTHANOREQUALTO_VALUE = 3;

	/**
	 * The '<em><b>EQUALTO</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>EQUALTO</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #EQUALTO
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int EQUALTO_VALUE = 4;

	/**
	 * The '<em><b>NOTEQUALTO</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>NOTEQUALTO</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #NOTEQUALTO
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int NOTEQUALTO_VALUE = 5;

	/**
	 * An array of all the '<em><b>Ifc Benchmark Enum</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final IfcBenchmarkEnum[] VALUES_ARRAY =
		new IfcBenchmarkEnum[] {
			GREATERTHAN,
			GREATERTHANOREQUALTO,
			LESSTHAN,
			LESSTHANOREQUALTO,
			EQUALTO,
			NOTEQUALTO,
		};

	/**
	 * A public read-only list of all the '<em><b>Ifc Benchmark Enum</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<IfcBenchmarkEnum> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Ifc Benchmark Enum</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static IfcBenchmarkEnum get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			IfcBenchmarkEnum result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Ifc Benchmark Enum</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static IfcBenchmarkEnum getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			IfcBenchmarkEnum result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Ifc Benchmark Enum</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static IfcBenchmarkEnum get(int value) {
		switch (value) {
			case GREATERTHAN_VALUE: return GREATERTHAN;
			case GREATERTHANOREQUALTO_VALUE: return GREATERTHANOREQUALTO;
			case LESSTHAN_VALUE: return LESSTHAN;
			case LESSTHANOREQUALTO_VALUE: return LESSTHANOREQUALTO;
			case EQUALTO_VALUE: return EQUALTO;
			case NOTEQUALTO_VALUE: return NOTEQUALTO;
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
	private IfcBenchmarkEnum(int value, String name, String literal) {
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
	
} //IfcBenchmarkEnum
