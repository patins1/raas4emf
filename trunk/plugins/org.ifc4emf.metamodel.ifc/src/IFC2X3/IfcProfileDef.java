/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package IFC2X3;

import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;

import org.eclipse.emf.cdo.CDOObject;
import org.eclipse.emf.ecore.EObject;

import IFC2X3.jaxb.IfcProfileDefImplAdapter;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Ifc Profile Def</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link IFC2X3.IfcProfileDef#getProfileType <em>Profile Type</em>}</li>
 *   <li>{@link IFC2X3.IfcProfileDef#getProfileName <em>Profile Name</em>}</li>
 * </ul>
 * </p>
 *
 * @see IFC2X3.IFC2X3Package#getIfcProfileDef()
 * @model
 * @extends CDOObject
 * @generated
 */
@XmlJavaTypeAdapter(IfcProfileDefImplAdapter.class)
public interface IfcProfileDef extends CDOObject {
	/**
	 * Returns the value of the '<em><b>Profile Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Profile Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Profile Name</em>' attribute.
	 * @see #isSetProfileName()
	 * @see #unsetProfileName()
	 * @see #setProfileName(String)
	 * @see IFC2X3.IFC2X3Package#getIfcProfileDef_ProfileName()
	 * @model unsettable="true" dataType="IFC2X3.STRING"
	 * @generated
	 */
	String getProfileName();

	/**
	 * Sets the value of the '{@link IFC2X3.IfcProfileDef#getProfileName <em>Profile Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Profile Name</em>' attribute.
	 * @see #isSetProfileName()
	 * @see #unsetProfileName()
	 * @see #getProfileName()
	 * @generated
	 */
	void setProfileName(String value);

	/**
	 * Unsets the value of the '{@link IFC2X3.IfcProfileDef#getProfileName <em>Profile Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetProfileName()
	 * @see #getProfileName()
	 * @see #setProfileName(String)
	 * @generated
	 */
	void unsetProfileName();

	/**
	 * Returns whether the value of the '{@link IFC2X3.IfcProfileDef#getProfileName <em>Profile Name</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Profile Name</em>' attribute is set.
	 * @see #unsetProfileName()
	 * @see #getProfileName()
	 * @see #setProfileName(String)
	 * @generated
	 */
	boolean isSetProfileName();

	/**
	 * Returns the value of the '<em><b>Profile Type</b></em>' attribute.
	 * The literals are from the enumeration {@link IFC2X3.IfcProfileTypeEnum}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Profile Type</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Profile Type</em>' attribute.
	 * @see IFC2X3.IfcProfileTypeEnum
	 * @see #isSetProfileType()
	 * @see #unsetProfileType()
	 * @see #setProfileType(IfcProfileTypeEnum)
	 * @see IFC2X3.IFC2X3Package#getIfcProfileDef_ProfileType()
	 * @model unsettable="true" required="true"
	 * @generated
	 */
	IfcProfileTypeEnum getProfileType();

	/**
	 * Sets the value of the '{@link IFC2X3.IfcProfileDef#getProfileType <em>Profile Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Profile Type</em>' attribute.
	 * @see IFC2X3.IfcProfileTypeEnum
	 * @see #isSetProfileType()
	 * @see #unsetProfileType()
	 * @see #getProfileType()
	 * @generated
	 */
	void setProfileType(IfcProfileTypeEnum value);

	/**
	 * Unsets the value of the '{@link IFC2X3.IfcProfileDef#getProfileType <em>Profile Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetProfileType()
	 * @see #getProfileType()
	 * @see #setProfileType(IfcProfileTypeEnum)
	 * @generated
	 */
	void unsetProfileType();

	/**
	 * Returns whether the value of the '{@link IFC2X3.IfcProfileDef#getProfileType <em>Profile Type</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Profile Type</em>' attribute is set.
	 * @see #unsetProfileType()
	 * @see #getProfileType()
	 * @see #setProfileType(IfcProfileTypeEnum)
	 * @generated
	 */
	boolean isSetProfileType();

} // IfcProfileDef
