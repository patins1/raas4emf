/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package IFC2X3;

import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;

import org.eclipse.emf.common.util.EList;

import IFC2X3.jaxb.IfcPersonAndOrganizationImplAdapter;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Ifc Person And Organization</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link IFC2X3.IfcPersonAndOrganization#getThePerson <em>The Person</em>}</li>
 *   <li>{@link IFC2X3.IfcPersonAndOrganization#getTheOrganization <em>The Organization</em>}</li>
 *   <li>{@link IFC2X3.IfcPersonAndOrganization#getRoles <em>Roles</em>}</li>
 * </ul>
 * </p>
 *
 * @see IFC2X3.IFC2X3Package#getIfcPersonAndOrganization()
 * @model
 * @generated
 */
@XmlJavaTypeAdapter(IfcPersonAndOrganizationImplAdapter.class)
public interface IfcPersonAndOrganization extends IfcActorSelect, IfcObjectReferenceSelect {
	/**
	 * Returns the value of the '<em><b>The Person</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link IFC2X3.IfcPerson#getEngagedIn <em>Engaged In</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>The Person</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>The Person</em>' reference.
	 * @see #setThePerson(IfcPerson)
	 * @see IFC2X3.IFC2X3Package#getIfcPersonAndOrganization_ThePerson()
	 * @see IFC2X3.IfcPerson#getEngagedIn
	 * @model opposite="EngagedIn" required="true"
	 * @generated
	 */
	IfcPerson getThePerson();

	/**
	 * Sets the value of the '{@link IFC2X3.IfcPersonAndOrganization#getThePerson <em>The Person</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>The Person</em>' reference.
	 * @see #getThePerson()
	 * @generated
	 */
	void setThePerson(IfcPerson value);

	/**
	 * Returns the value of the '<em><b>The Organization</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link IFC2X3.IfcOrganization#getEngages <em>Engages</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>The Organization</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>The Organization</em>' reference.
	 * @see #setTheOrganization(IfcOrganization)
	 * @see IFC2X3.IFC2X3Package#getIfcPersonAndOrganization_TheOrganization()
	 * @see IFC2X3.IfcOrganization#getEngages
	 * @model opposite="Engages" required="true"
	 * @generated
	 */
	IfcOrganization getTheOrganization();

	/**
	 * Sets the value of the '{@link IFC2X3.IfcPersonAndOrganization#getTheOrganization <em>The Organization</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>The Organization</em>' reference.
	 * @see #getTheOrganization()
	 * @generated
	 */
	void setTheOrganization(IfcOrganization value);

	/**
	 * Returns the value of the '<em><b>Roles</b></em>' reference list.
	 * The list contents are of type {@link IFC2X3.IfcActorRole}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Roles</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Roles</em>' reference list.
	 * @see IFC2X3.IFC2X3Package#getIfcPersonAndOrganization_Roles()
	 * @model
	 * @generated
	 */
	EList<IfcActorRole> getRoles();

} // IfcPersonAndOrganization
