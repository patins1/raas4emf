/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package IFC2X3;

import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;

import IFC2X3.jaxb.IfcPropertyReferenceValueImplAdapter;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Ifc Property Reference Value</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link IFC2X3.IfcPropertyReferenceValue#getUsageName <em>Usage Name</em>}</li>
 *   <li>{@link IFC2X3.IfcPropertyReferenceValue#getPropertyReference <em>Property Reference</em>}</li>
 * </ul>
 * </p>
 *
 * @see IFC2X3.IFC2X3Package#getIfcPropertyReferenceValue()
 * @model
 * @generated
 */
@XmlJavaTypeAdapter(IfcPropertyReferenceValueImplAdapter.class)
public interface IfcPropertyReferenceValue extends IfcSimpleProperty {
	/**
	 * Returns the value of the '<em><b>Property Reference</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Property Reference</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Property Reference</em>' reference.
	 * @see #setPropertyReference(IfcObjectReferenceSelect)
	 * @see IFC2X3.IFC2X3Package#getIfcPropertyReferenceValue_PropertyReference()
	 * @model required="true"
	 * @generated
	 */
	IfcObjectReferenceSelect getPropertyReference();

	/**
	 * Sets the value of the '{@link IFC2X3.IfcPropertyReferenceValue#getPropertyReference <em>Property Reference</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Property Reference</em>' reference.
	 * @see #getPropertyReference()
	 * @generated
	 */
	void setPropertyReference(IfcObjectReferenceSelect value);

	/**
	 * Returns the value of the '<em><b>Usage Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Usage Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Usage Name</em>' attribute.
	 * @see #isSetUsageName()
	 * @see #unsetUsageName()
	 * @see #setUsageName(String)
	 * @see IFC2X3.IFC2X3Package#getIfcPropertyReferenceValue_UsageName()
	 * @model unsettable="true" dataType="IFC2X3.STRING"
	 * @generated
	 */
	String getUsageName();

	/**
	 * Sets the value of the '{@link IFC2X3.IfcPropertyReferenceValue#getUsageName <em>Usage Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Usage Name</em>' attribute.
	 * @see #isSetUsageName()
	 * @see #unsetUsageName()
	 * @see #getUsageName()
	 * @generated
	 */
	void setUsageName(String value);

	/**
	 * Unsets the value of the '{@link IFC2X3.IfcPropertyReferenceValue#getUsageName <em>Usage Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetUsageName()
	 * @see #getUsageName()
	 * @see #setUsageName(String)
	 * @generated
	 */
	void unsetUsageName();

	/**
	 * Returns whether the value of the '{@link IFC2X3.IfcPropertyReferenceValue#getUsageName <em>Usage Name</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Usage Name</em>' attribute is set.
	 * @see #unsetUsageName()
	 * @see #getUsageName()
	 * @see #setUsageName(String)
	 * @generated
	 */
	boolean isSetUsageName();

} // IfcPropertyReferenceValue
