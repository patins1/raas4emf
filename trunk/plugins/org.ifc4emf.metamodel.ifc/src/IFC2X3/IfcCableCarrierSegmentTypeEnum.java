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
 * A representation of the literals of the enumeration '<em><b>Ifc Cable Carrier Segment Type Enum</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see IFC2X3.IFC2X3Package#getIfcCableCarrierSegmentTypeEnum()
 * @model
 * @generated
 */
public enum IfcCableCarrierSegmentTypeEnum implements Enumerator {
	/**
	 * The '<em><b>CABLELADDERSEGMENT</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CABLELADDERSEGMENT_VALUE
	 * @generated
	 * @ordered
	 */
	CABLELADDERSEGMENT(0, "CABLELADDERSEGMENT", "CABLELADDERSEGMENT"), /**
	 * The '<em><b>CABLETRAYSEGMENT</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CABLETRAYSEGMENT_VALUE
	 * @generated
	 * @ordered
	 */
	CABLETRAYSEGMENT(1, "CABLETRAYSEGMENT", "CABLETRAYSEGMENT"), /**
	 * The '<em><b>CABLETRUNKINGSEGMENT</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CABLETRUNKINGSEGMENT_VALUE
	 * @generated
	 * @ordered
	 */
	CABLETRUNKINGSEGMENT(2, "CABLETRUNKINGSEGMENT", "CABLETRUNKINGSEGMENT"), /**
	 * The '<em><b>CONDUITSEGMENT</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CONDUITSEGMENT_VALUE
	 * @generated
	 * @ordered
	 */
	CONDUITSEGMENT(3, "CONDUITSEGMENT", "CONDUITSEGMENT"), /**
	 * The '<em><b>USERDEFINED</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #USERDEFINED_VALUE
	 * @generated
	 * @ordered
	 */
	USERDEFINED(4, "USERDEFINED", "USERDEFINED"), /**
	 * The '<em><b>NOTDEFINED</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #NOTDEFINED_VALUE
	 * @generated
	 * @ordered
	 */
	NOTDEFINED(5, "NOTDEFINED", "NOTDEFINED");

	/**
	 * The '<em><b>CABLELADDERSEGMENT</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>CABLELADDERSEGMENT</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #CABLELADDERSEGMENT
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int CABLELADDERSEGMENT_VALUE = 0;

	/**
	 * The '<em><b>CABLETRAYSEGMENT</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>CABLETRAYSEGMENT</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #CABLETRAYSEGMENT
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int CABLETRAYSEGMENT_VALUE = 1;

	/**
	 * The '<em><b>CABLETRUNKINGSEGMENT</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>CABLETRUNKINGSEGMENT</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #CABLETRUNKINGSEGMENT
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int CABLETRUNKINGSEGMENT_VALUE = 2;

	/**
	 * The '<em><b>CONDUITSEGMENT</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>CONDUITSEGMENT</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #CONDUITSEGMENT
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int CONDUITSEGMENT_VALUE = 3;

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
	public static final int USERDEFINED_VALUE = 4;

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
	public static final int NOTDEFINED_VALUE = 5;

	/**
	 * An array of all the '<em><b>Ifc Cable Carrier Segment Type Enum</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final IfcCableCarrierSegmentTypeEnum[] VALUES_ARRAY =
		new IfcCableCarrierSegmentTypeEnum[] {
			CABLELADDERSEGMENT,
			CABLETRAYSEGMENT,
			CABLETRUNKINGSEGMENT,
			CONDUITSEGMENT,
			USERDEFINED,
			NOTDEFINED,
		};

	/**
	 * A public read-only list of all the '<em><b>Ifc Cable Carrier Segment Type Enum</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<IfcCableCarrierSegmentTypeEnum> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Ifc Cable Carrier Segment Type Enum</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static IfcCableCarrierSegmentTypeEnum get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			IfcCableCarrierSegmentTypeEnum result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Ifc Cable Carrier Segment Type Enum</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static IfcCableCarrierSegmentTypeEnum getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			IfcCableCarrierSegmentTypeEnum result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Ifc Cable Carrier Segment Type Enum</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static IfcCableCarrierSegmentTypeEnum get(int value) {
		switch (value) {
			case CABLELADDERSEGMENT_VALUE: return CABLELADDERSEGMENT;
			case CABLETRAYSEGMENT_VALUE: return CABLETRAYSEGMENT;
			case CABLETRUNKINGSEGMENT_VALUE: return CABLETRUNKINGSEGMENT;
			case CONDUITSEGMENT_VALUE: return CONDUITSEGMENT;
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
	private IfcCableCarrierSegmentTypeEnum(int value, String name, String literal) {
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
	
} //IfcCableCarrierSegmentTypeEnum
