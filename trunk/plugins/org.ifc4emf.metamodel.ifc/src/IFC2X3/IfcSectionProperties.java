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

import IFC2X3.jaxb.IfcSectionPropertiesImplAdapter;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Ifc Section Properties</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link IFC2X3.IfcSectionProperties#getSectionType <em>Section Type</em>}</li>
 *   <li>{@link IFC2X3.IfcSectionProperties#getStartProfile <em>Start Profile</em>}</li>
 *   <li>{@link IFC2X3.IfcSectionProperties#getEndProfile <em>End Profile</em>}</li>
 * </ul>
 * </p>
 *
 * @see IFC2X3.IFC2X3Package#getIfcSectionProperties()
 * @model
 * @extends CDOObject
 * @generated
 */
@XmlJavaTypeAdapter(IfcSectionPropertiesImplAdapter.class)
public interface IfcSectionProperties extends CDOObject {
	/**
	 * Returns the value of the '<em><b>End Profile</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>End Profile</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>End Profile</em>' reference.
	 * @see #setEndProfile(IfcProfileDef)
	 * @see IFC2X3.IFC2X3Package#getIfcSectionProperties_EndProfile()
	 * @model
	 * @generated
	 */
	IfcProfileDef getEndProfile();

	/**
	 * Sets the value of the '{@link IFC2X3.IfcSectionProperties#getEndProfile <em>End Profile</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>End Profile</em>' reference.
	 * @see #getEndProfile()
	 * @generated
	 */
	void setEndProfile(IfcProfileDef value);

	/**
	 * Returns the value of the '<em><b>Start Profile</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Start Profile</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Start Profile</em>' reference.
	 * @see #setStartProfile(IfcProfileDef)
	 * @see IFC2X3.IFC2X3Package#getIfcSectionProperties_StartProfile()
	 * @model required="true"
	 * @generated
	 */
	IfcProfileDef getStartProfile();

	/**
	 * Sets the value of the '{@link IFC2X3.IfcSectionProperties#getStartProfile <em>Start Profile</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Start Profile</em>' reference.
	 * @see #getStartProfile()
	 * @generated
	 */
	void setStartProfile(IfcProfileDef value);

	/**
	 * Returns the value of the '<em><b>Section Type</b></em>' attribute.
	 * The literals are from the enumeration {@link IFC2X3.IfcSectionTypeEnum}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Section Type</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Section Type</em>' attribute.
	 * @see IFC2X3.IfcSectionTypeEnum
	 * @see #isSetSectionType()
	 * @see #unsetSectionType()
	 * @see #setSectionType(IfcSectionTypeEnum)
	 * @see IFC2X3.IFC2X3Package#getIfcSectionProperties_SectionType()
	 * @model unsettable="true" required="true"
	 * @generated
	 */
	IfcSectionTypeEnum getSectionType();

	/**
	 * Sets the value of the '{@link IFC2X3.IfcSectionProperties#getSectionType <em>Section Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Section Type</em>' attribute.
	 * @see IFC2X3.IfcSectionTypeEnum
	 * @see #isSetSectionType()
	 * @see #unsetSectionType()
	 * @see #getSectionType()
	 * @generated
	 */
	void setSectionType(IfcSectionTypeEnum value);

	/**
	 * Unsets the value of the '{@link IFC2X3.IfcSectionProperties#getSectionType <em>Section Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetSectionType()
	 * @see #getSectionType()
	 * @see #setSectionType(IfcSectionTypeEnum)
	 * @generated
	 */
	void unsetSectionType();

	/**
	 * Returns whether the value of the '{@link IFC2X3.IfcSectionProperties#getSectionType <em>Section Type</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Section Type</em>' attribute is set.
	 * @see #unsetSectionType()
	 * @see #getSectionType()
	 * @see #setSectionType(IfcSectionTypeEnum)
	 * @generated
	 */
	boolean isSetSectionType();

} // IfcSectionProperties
