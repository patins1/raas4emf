/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package IFC2X3;

import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;

import IFC2X3.jaxb.IfcServiceLifeImplAdapter;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Ifc Service Life</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link IFC2X3.IfcServiceLife#getServiceLifeType <em>Service Life Type</em>}</li>
 *   <li>{@link IFC2X3.IfcServiceLife#getServiceLifeDuration <em>Service Life Duration</em>}</li>
 * </ul>
 * </p>
 *
 * @see IFC2X3.IFC2X3Package#getIfcServiceLife()
 * @model
 * @generated
 */
@XmlJavaTypeAdapter(IfcServiceLifeImplAdapter.class)
public interface IfcServiceLife extends IfcControl {
	/**
	 * Returns the value of the '<em><b>Service Life Duration</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Service Life Duration</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Service Life Duration</em>' attribute.
	 * @see #isSetServiceLifeDuration()
	 * @see #unsetServiceLifeDuration()
	 * @see #setServiceLifeDuration(Double)
	 * @see IFC2X3.IFC2X3Package#getIfcServiceLife_ServiceLifeDuration()
	 * @model unsettable="true" dataType="IFC2X3.REAL" required="true"
	 * @generated
	 */
	Double getServiceLifeDuration();

	/**
	 * Sets the value of the '{@link IFC2X3.IfcServiceLife#getServiceLifeDuration <em>Service Life Duration</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Service Life Duration</em>' attribute.
	 * @see #isSetServiceLifeDuration()
	 * @see #unsetServiceLifeDuration()
	 * @see #getServiceLifeDuration()
	 * @generated
	 */
	void setServiceLifeDuration(Double value);

	/**
	 * Unsets the value of the '{@link IFC2X3.IfcServiceLife#getServiceLifeDuration <em>Service Life Duration</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetServiceLifeDuration()
	 * @see #getServiceLifeDuration()
	 * @see #setServiceLifeDuration(Double)
	 * @generated
	 */
	void unsetServiceLifeDuration();

	/**
	 * Returns whether the value of the '{@link IFC2X3.IfcServiceLife#getServiceLifeDuration <em>Service Life Duration</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Service Life Duration</em>' attribute is set.
	 * @see #unsetServiceLifeDuration()
	 * @see #getServiceLifeDuration()
	 * @see #setServiceLifeDuration(Double)
	 * @generated
	 */
	boolean isSetServiceLifeDuration();

	/**
	 * Returns the value of the '<em><b>Service Life Type</b></em>' attribute.
	 * The literals are from the enumeration {@link IFC2X3.IfcServiceLifeTypeEnum}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Service Life Type</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Service Life Type</em>' attribute.
	 * @see IFC2X3.IfcServiceLifeTypeEnum
	 * @see #isSetServiceLifeType()
	 * @see #unsetServiceLifeType()
	 * @see #setServiceLifeType(IfcServiceLifeTypeEnum)
	 * @see IFC2X3.IFC2X3Package#getIfcServiceLife_ServiceLifeType()
	 * @model unsettable="true" required="true"
	 * @generated
	 */
	IfcServiceLifeTypeEnum getServiceLifeType();

	/**
	 * Sets the value of the '{@link IFC2X3.IfcServiceLife#getServiceLifeType <em>Service Life Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Service Life Type</em>' attribute.
	 * @see IFC2X3.IfcServiceLifeTypeEnum
	 * @see #isSetServiceLifeType()
	 * @see #unsetServiceLifeType()
	 * @see #getServiceLifeType()
	 * @generated
	 */
	void setServiceLifeType(IfcServiceLifeTypeEnum value);

	/**
	 * Unsets the value of the '{@link IFC2X3.IfcServiceLife#getServiceLifeType <em>Service Life Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetServiceLifeType()
	 * @see #getServiceLifeType()
	 * @see #setServiceLifeType(IfcServiceLifeTypeEnum)
	 * @generated
	 */
	void unsetServiceLifeType();

	/**
	 * Returns whether the value of the '{@link IFC2X3.IfcServiceLife#getServiceLifeType <em>Service Life Type</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Service Life Type</em>' attribute is set.
	 * @see #unsetServiceLifeType()
	 * @see #getServiceLifeType()
	 * @see #setServiceLifeType(IfcServiceLifeTypeEnum)
	 * @generated
	 */
	boolean isSetServiceLifeType();

} // IfcServiceLife
