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

import IFC2X3.jaxb.IfcOwnerHistoryImplAdapter;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Ifc Owner History</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link IFC2X3.IfcOwnerHistory#getOwningUser <em>Owning User</em>}</li>
 *   <li>{@link IFC2X3.IfcOwnerHistory#getOwningApplication <em>Owning Application</em>}</li>
 *   <li>{@link IFC2X3.IfcOwnerHistory#getState <em>State</em>}</li>
 *   <li>{@link IFC2X3.IfcOwnerHistory#getChangeAction <em>Change Action</em>}</li>
 *   <li>{@link IFC2X3.IfcOwnerHistory#getLastModifiedDate <em>Last Modified Date</em>}</li>
 *   <li>{@link IFC2X3.IfcOwnerHistory#getLastModifyingUser <em>Last Modifying User</em>}</li>
 *   <li>{@link IFC2X3.IfcOwnerHistory#getLastModifyingApplication <em>Last Modifying Application</em>}</li>
 *   <li>{@link IFC2X3.IfcOwnerHistory#getCreationDate <em>Creation Date</em>}</li>
 * </ul>
 * </p>
 *
 * @see IFC2X3.IFC2X3Package#getIfcOwnerHistory()
 * @model
 * @extends CDOObject
 * @generated
 */
@XmlJavaTypeAdapter(IfcOwnerHistoryImplAdapter.class)
public interface IfcOwnerHistory extends CDOObject {
	/**
	 * Returns the value of the '<em><b>Last Modifying User</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Last Modifying User</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Last Modifying User</em>' reference.
	 * @see #setLastModifyingUser(IfcPersonAndOrganization)
	 * @see IFC2X3.IFC2X3Package#getIfcOwnerHistory_LastModifyingUser()
	 * @model
	 * @generated
	 */
	IfcPersonAndOrganization getLastModifyingUser();

	/**
	 * Sets the value of the '{@link IFC2X3.IfcOwnerHistory#getLastModifyingUser <em>Last Modifying User</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Last Modifying User</em>' reference.
	 * @see #getLastModifyingUser()
	 * @generated
	 */
	void setLastModifyingUser(IfcPersonAndOrganization value);

	/**
	 * Returns the value of the '<em><b>Owning User</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Owning User</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Owning User</em>' reference.
	 * @see #setOwningUser(IfcPersonAndOrganization)
	 * @see IFC2X3.IFC2X3Package#getIfcOwnerHistory_OwningUser()
	 * @model required="true"
	 * @generated
	 */
	IfcPersonAndOrganization getOwningUser();

	/**
	 * Sets the value of the '{@link IFC2X3.IfcOwnerHistory#getOwningUser <em>Owning User</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Owning User</em>' reference.
	 * @see #getOwningUser()
	 * @generated
	 */
	void setOwningUser(IfcPersonAndOrganization value);

	/**
	 * Returns the value of the '<em><b>Last Modifying Application</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Last Modifying Application</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Last Modifying Application</em>' reference.
	 * @see #setLastModifyingApplication(IfcApplication)
	 * @see IFC2X3.IFC2X3Package#getIfcOwnerHistory_LastModifyingApplication()
	 * @model
	 * @generated
	 */
	IfcApplication getLastModifyingApplication();

	/**
	 * Sets the value of the '{@link IFC2X3.IfcOwnerHistory#getLastModifyingApplication <em>Last Modifying Application</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Last Modifying Application</em>' reference.
	 * @see #getLastModifyingApplication()
	 * @generated
	 */
	void setLastModifyingApplication(IfcApplication value);

	/**
	 * Returns the value of the '<em><b>Owning Application</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Owning Application</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Owning Application</em>' reference.
	 * @see #setOwningApplication(IfcApplication)
	 * @see IFC2X3.IFC2X3Package#getIfcOwnerHistory_OwningApplication()
	 * @model required="true"
	 * @generated
	 */
	IfcApplication getOwningApplication();

	/**
	 * Sets the value of the '{@link IFC2X3.IfcOwnerHistory#getOwningApplication <em>Owning Application</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Owning Application</em>' reference.
	 * @see #getOwningApplication()
	 * @generated
	 */
	void setOwningApplication(IfcApplication value);

	/**
	 * Returns the value of the '<em><b>Creation Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Creation Date</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Creation Date</em>' attribute.
	 * @see #isSetCreationDate()
	 * @see #unsetCreationDate()
	 * @see #setCreationDate(Integer)
	 * @see IFC2X3.IFC2X3Package#getIfcOwnerHistory_CreationDate()
	 * @model unsettable="true" dataType="IFC2X3.INTEGER" required="true"
	 * @generated
	 */
	Integer getCreationDate();

	/**
	 * Sets the value of the '{@link IFC2X3.IfcOwnerHistory#getCreationDate <em>Creation Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Creation Date</em>' attribute.
	 * @see #isSetCreationDate()
	 * @see #unsetCreationDate()
	 * @see #getCreationDate()
	 * @generated
	 */
	void setCreationDate(Integer value);

	/**
	 * Unsets the value of the '{@link IFC2X3.IfcOwnerHistory#getCreationDate <em>Creation Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetCreationDate()
	 * @see #getCreationDate()
	 * @see #setCreationDate(Integer)
	 * @generated
	 */
	void unsetCreationDate();

	/**
	 * Returns whether the value of the '{@link IFC2X3.IfcOwnerHistory#getCreationDate <em>Creation Date</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Creation Date</em>' attribute is set.
	 * @see #unsetCreationDate()
	 * @see #getCreationDate()
	 * @see #setCreationDate(Integer)
	 * @generated
	 */
	boolean isSetCreationDate();

	/**
	 * Returns the value of the '<em><b>Last Modified Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Last Modified Date</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Last Modified Date</em>' attribute.
	 * @see #isSetLastModifiedDate()
	 * @see #unsetLastModifiedDate()
	 * @see #setLastModifiedDate(Integer)
	 * @see IFC2X3.IFC2X3Package#getIfcOwnerHistory_LastModifiedDate()
	 * @model unsettable="true" dataType="IFC2X3.INTEGER"
	 * @generated
	 */
	Integer getLastModifiedDate();

	/**
	 * Sets the value of the '{@link IFC2X3.IfcOwnerHistory#getLastModifiedDate <em>Last Modified Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Last Modified Date</em>' attribute.
	 * @see #isSetLastModifiedDate()
	 * @see #unsetLastModifiedDate()
	 * @see #getLastModifiedDate()
	 * @generated
	 */
	void setLastModifiedDate(Integer value);

	/**
	 * Unsets the value of the '{@link IFC2X3.IfcOwnerHistory#getLastModifiedDate <em>Last Modified Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetLastModifiedDate()
	 * @see #getLastModifiedDate()
	 * @see #setLastModifiedDate(Integer)
	 * @generated
	 */
	void unsetLastModifiedDate();

	/**
	 * Returns whether the value of the '{@link IFC2X3.IfcOwnerHistory#getLastModifiedDate <em>Last Modified Date</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Last Modified Date</em>' attribute is set.
	 * @see #unsetLastModifiedDate()
	 * @see #getLastModifiedDate()
	 * @see #setLastModifiedDate(Integer)
	 * @generated
	 */
	boolean isSetLastModifiedDate();

	/**
	 * Returns the value of the '<em><b>Change Action</b></em>' attribute.
	 * The literals are from the enumeration {@link IFC2X3.IfcChangeActionEnum}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Change Action</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Change Action</em>' attribute.
	 * @see IFC2X3.IfcChangeActionEnum
	 * @see #isSetChangeAction()
	 * @see #unsetChangeAction()
	 * @see #setChangeAction(IfcChangeActionEnum)
	 * @see IFC2X3.IFC2X3Package#getIfcOwnerHistory_ChangeAction()
	 * @model unsettable="true" required="true"
	 * @generated
	 */
	IfcChangeActionEnum getChangeAction();

	/**
	 * Sets the value of the '{@link IFC2X3.IfcOwnerHistory#getChangeAction <em>Change Action</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Change Action</em>' attribute.
	 * @see IFC2X3.IfcChangeActionEnum
	 * @see #isSetChangeAction()
	 * @see #unsetChangeAction()
	 * @see #getChangeAction()
	 * @generated
	 */
	void setChangeAction(IfcChangeActionEnum value);

	/**
	 * Unsets the value of the '{@link IFC2X3.IfcOwnerHistory#getChangeAction <em>Change Action</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetChangeAction()
	 * @see #getChangeAction()
	 * @see #setChangeAction(IfcChangeActionEnum)
	 * @generated
	 */
	void unsetChangeAction();

	/**
	 * Returns whether the value of the '{@link IFC2X3.IfcOwnerHistory#getChangeAction <em>Change Action</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Change Action</em>' attribute is set.
	 * @see #unsetChangeAction()
	 * @see #getChangeAction()
	 * @see #setChangeAction(IfcChangeActionEnum)
	 * @generated
	 */
	boolean isSetChangeAction();

	/**
	 * Returns the value of the '<em><b>State</b></em>' attribute.
	 * The literals are from the enumeration {@link IFC2X3.IfcStateEnum}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>State</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>State</em>' attribute.
	 * @see IFC2X3.IfcStateEnum
	 * @see #isSetState()
	 * @see #unsetState()
	 * @see #setState(IfcStateEnum)
	 * @see IFC2X3.IFC2X3Package#getIfcOwnerHistory_State()
	 * @model unsettable="true"
	 * @generated
	 */
	IfcStateEnum getState();

	/**
	 * Sets the value of the '{@link IFC2X3.IfcOwnerHistory#getState <em>State</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>State</em>' attribute.
	 * @see IFC2X3.IfcStateEnum
	 * @see #isSetState()
	 * @see #unsetState()
	 * @see #getState()
	 * @generated
	 */
	void setState(IfcStateEnum value);

	/**
	 * Unsets the value of the '{@link IFC2X3.IfcOwnerHistory#getState <em>State</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetState()
	 * @see #getState()
	 * @see #setState(IfcStateEnum)
	 * @generated
	 */
	void unsetState();

	/**
	 * Returns whether the value of the '{@link IFC2X3.IfcOwnerHistory#getState <em>State</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>State</em>' attribute is set.
	 * @see #unsetState()
	 * @see #getState()
	 * @see #setState(IfcStateEnum)
	 * @generated
	 */
	boolean isSetState();

} // IfcOwnerHistory
