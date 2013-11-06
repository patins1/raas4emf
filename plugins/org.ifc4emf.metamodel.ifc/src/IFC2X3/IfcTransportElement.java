/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package IFC2X3;

import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;

import IFC2X3.jaxb.IfcTransportElementImplAdapter;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Ifc Transport Element</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link IFC2X3.IfcTransportElement#getOperationType <em>Operation Type</em>}</li>
 *   <li>{@link IFC2X3.IfcTransportElement#getCapacityByWeight <em>Capacity By Weight</em>}</li>
 *   <li>{@link IFC2X3.IfcTransportElement#getCapacityByNumber <em>Capacity By Number</em>}</li>
 * </ul>
 * </p>
 *
 * @see IFC2X3.IFC2X3Package#getIfcTransportElement()
 * @model
 * @generated
 */
@XmlJavaTypeAdapter(IfcTransportElementImplAdapter.class)
public interface IfcTransportElement extends IfcElement {
	/**
	 * Returns the value of the '<em><b>Capacity By Number</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Capacity By Number</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Capacity By Number</em>' attribute.
	 * @see #isSetCapacityByNumber()
	 * @see #unsetCapacityByNumber()
	 * @see #setCapacityByNumber(Double)
	 * @see IFC2X3.IFC2X3Package#getIfcTransportElement_CapacityByNumber()
	 * @model unsettable="true" dataType="IFC2X3.NUMBER"
	 * @generated
	 */
	Double getCapacityByNumber();

	/**
	 * Sets the value of the '{@link IFC2X3.IfcTransportElement#getCapacityByNumber <em>Capacity By Number</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Capacity By Number</em>' attribute.
	 * @see #isSetCapacityByNumber()
	 * @see #unsetCapacityByNumber()
	 * @see #getCapacityByNumber()
	 * @generated
	 */
	void setCapacityByNumber(Double value);

	/**
	 * Unsets the value of the '{@link IFC2X3.IfcTransportElement#getCapacityByNumber <em>Capacity By Number</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetCapacityByNumber()
	 * @see #getCapacityByNumber()
	 * @see #setCapacityByNumber(Double)
	 * @generated
	 */
	void unsetCapacityByNumber();

	/**
	 * Returns whether the value of the '{@link IFC2X3.IfcTransportElement#getCapacityByNumber <em>Capacity By Number</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Capacity By Number</em>' attribute is set.
	 * @see #unsetCapacityByNumber()
	 * @see #getCapacityByNumber()
	 * @see #setCapacityByNumber(Double)
	 * @generated
	 */
	boolean isSetCapacityByNumber();

	/**
	 * Returns the value of the '<em><b>Capacity By Weight</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Capacity By Weight</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Capacity By Weight</em>' attribute.
	 * @see #isSetCapacityByWeight()
	 * @see #unsetCapacityByWeight()
	 * @see #setCapacityByWeight(Double)
	 * @see IFC2X3.IFC2X3Package#getIfcTransportElement_CapacityByWeight()
	 * @model unsettable="true" dataType="IFC2X3.REAL"
	 * @generated
	 */
	Double getCapacityByWeight();

	/**
	 * Sets the value of the '{@link IFC2X3.IfcTransportElement#getCapacityByWeight <em>Capacity By Weight</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Capacity By Weight</em>' attribute.
	 * @see #isSetCapacityByWeight()
	 * @see #unsetCapacityByWeight()
	 * @see #getCapacityByWeight()
	 * @generated
	 */
	void setCapacityByWeight(Double value);

	/**
	 * Unsets the value of the '{@link IFC2X3.IfcTransportElement#getCapacityByWeight <em>Capacity By Weight</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetCapacityByWeight()
	 * @see #getCapacityByWeight()
	 * @see #setCapacityByWeight(Double)
	 * @generated
	 */
	void unsetCapacityByWeight();

	/**
	 * Returns whether the value of the '{@link IFC2X3.IfcTransportElement#getCapacityByWeight <em>Capacity By Weight</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Capacity By Weight</em>' attribute is set.
	 * @see #unsetCapacityByWeight()
	 * @see #getCapacityByWeight()
	 * @see #setCapacityByWeight(Double)
	 * @generated
	 */
	boolean isSetCapacityByWeight();

	/**
	 * Returns the value of the '<em><b>Operation Type</b></em>' attribute.
	 * The literals are from the enumeration {@link IFC2X3.IfcTransportElementTypeEnum}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Operation Type</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Operation Type</em>' attribute.
	 * @see IFC2X3.IfcTransportElementTypeEnum
	 * @see #isSetOperationType()
	 * @see #unsetOperationType()
	 * @see #setOperationType(IfcTransportElementTypeEnum)
	 * @see IFC2X3.IFC2X3Package#getIfcTransportElement_OperationType()
	 * @model unsettable="true"
	 * @generated
	 */
	IfcTransportElementTypeEnum getOperationType();

	/**
	 * Sets the value of the '{@link IFC2X3.IfcTransportElement#getOperationType <em>Operation Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Operation Type</em>' attribute.
	 * @see IFC2X3.IfcTransportElementTypeEnum
	 * @see #isSetOperationType()
	 * @see #unsetOperationType()
	 * @see #getOperationType()
	 * @generated
	 */
	void setOperationType(IfcTransportElementTypeEnum value);

	/**
	 * Unsets the value of the '{@link IFC2X3.IfcTransportElement#getOperationType <em>Operation Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetOperationType()
	 * @see #getOperationType()
	 * @see #setOperationType(IfcTransportElementTypeEnum)
	 * @generated
	 */
	void unsetOperationType();

	/**
	 * Returns whether the value of the '{@link IFC2X3.IfcTransportElement#getOperationType <em>Operation Type</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Operation Type</em>' attribute is set.
	 * @see #unsetOperationType()
	 * @see #getOperationType()
	 * @see #setOperationType(IfcTransportElementTypeEnum)
	 * @generated
	 */
	boolean isSetOperationType();

} // IfcTransportElement
