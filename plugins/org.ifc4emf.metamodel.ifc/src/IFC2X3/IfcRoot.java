/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package IFC2X3;

import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;

import org.eclipse.emf.cdo.CDOObject;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;

import IFC2X3.jaxb.IfcRootImplAdapter;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Ifc Root</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link IFC2X3.IfcRoot#getGlobalId <em>Global Id</em>}</li>
 *   <li>{@link IFC2X3.IfcRoot#getOwnerHistory <em>Owner History</em>}</li>
 *   <li>{@link IFC2X3.IfcRoot#getName <em>Name</em>}</li>
 *   <li>{@link IFC2X3.IfcRoot#getDescription <em>Description</em>}</li>
 *   <li>{@link IFC2X3.IfcRoot#getHasAssociations <em>Has Associations</em>}</li>
 * </ul>
 * </p>
 *
 * @see IFC2X3.IFC2X3Package#getIfcRoot()
 * @model
 * @extends CDOObject
 * @generated
 */
@XmlJavaTypeAdapter(IfcRootImplAdapter.class)
public interface IfcRoot extends CDOObject {
	/**
	 * Returns the value of the '<em><b>Owner History</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Owner History</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Owner History</em>' reference.
	 * @see #setOwnerHistory(IfcOwnerHistory)
	 * @see IFC2X3.IFC2X3Package#getIfcRoot_OwnerHistory()
	 * @model required="true"
	 * @generated
	 */
	IfcOwnerHistory getOwnerHistory();

	/**
	 * Sets the value of the '{@link IFC2X3.IfcRoot#getOwnerHistory <em>Owner History</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Owner History</em>' reference.
	 * @see #getOwnerHistory()
	 * @generated
	 */
	void setOwnerHistory(IfcOwnerHistory value);

	/**
	 * Returns the value of the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Description</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Description</em>' attribute.
	 * @see #isSetDescription()
	 * @see #unsetDescription()
	 * @see #setDescription(String)
	 * @see IFC2X3.IFC2X3Package#getIfcRoot_Description()
	 * @model unsettable="true" dataType="IFC2X3.STRING"
	 * @generated
	 */
	String getDescription();

	/**
	 * Sets the value of the '{@link IFC2X3.IfcRoot#getDescription <em>Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Description</em>' attribute.
	 * @see #isSetDescription()
	 * @see #unsetDescription()
	 * @see #getDescription()
	 * @generated
	 */
	void setDescription(String value);

	/**
	 * Unsets the value of the '{@link IFC2X3.IfcRoot#getDescription <em>Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetDescription()
	 * @see #getDescription()
	 * @see #setDescription(String)
	 * @generated
	 */
	void unsetDescription();

	/**
	 * Returns whether the value of the '{@link IFC2X3.IfcRoot#getDescription <em>Description</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Description</em>' attribute is set.
	 * @see #unsetDescription()
	 * @see #getDescription()
	 * @see #setDescription(String)
	 * @generated
	 */
	boolean isSetDescription();

	/**
	 * Returns the value of the '<em><b>Has Associations</b></em>' reference list.
	 * The list contents are of type {@link IFC2X3.IfcRelAssociates}.
	 * It is bidirectional and its opposite is '{@link IFC2X3.IfcRelAssociates#getRelatedObjects <em>Related Objects</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Has Associations</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Has Associations</em>' reference list.
	 * @see IFC2X3.IFC2X3Package#getIfcRoot_HasAssociations()
	 * @see IFC2X3.IfcRelAssociates#getRelatedObjects
	 * @model opposite="RelatedObjects" ordered="false"
	 * @generated
	 */
	EList<IfcRelAssociates> getHasAssociations();

	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #isSetName()
	 * @see #unsetName()
	 * @see #setName(String)
	 * @see IFC2X3.IFC2X3Package#getIfcRoot_Name()
	 * @model unsettable="true" dataType="IFC2X3.STRING"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link IFC2X3.IfcRoot#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #isSetName()
	 * @see #unsetName()
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Unsets the value of the '{@link IFC2X3.IfcRoot#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetName()
	 * @see #getName()
	 * @see #setName(String)
	 * @generated
	 */
	void unsetName();

	/**
	 * Returns whether the value of the '{@link IFC2X3.IfcRoot#getName <em>Name</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Name</em>' attribute is set.
	 * @see #unsetName()
	 * @see #getName()
	 * @see #setName(String)
	 * @generated
	 */
	boolean isSetName();

	/**
	 * Returns the value of the '<em><b>Global Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Global Id</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Global Id</em>' attribute.
	 * @see #isSetGlobalId()
	 * @see #unsetGlobalId()
	 * @see #setGlobalId(String)
	 * @see IFC2X3.IFC2X3Package#getIfcRoot_GlobalId()
	 * @model unsettable="true" id="true" dataType="IFC2X3.STRING" required="true"
	 * @generated
	 */
	String getGlobalId();

	/**
	 * Sets the value of the '{@link IFC2X3.IfcRoot#getGlobalId <em>Global Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Global Id</em>' attribute.
	 * @see #isSetGlobalId()
	 * @see #unsetGlobalId()
	 * @see #getGlobalId()
	 * @generated
	 */
	void setGlobalId(String value);

	/**
	 * Unsets the value of the '{@link IFC2X3.IfcRoot#getGlobalId <em>Global Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetGlobalId()
	 * @see #getGlobalId()
	 * @see #setGlobalId(String)
	 * @generated
	 */
	void unsetGlobalId();

	/**
	 * Returns whether the value of the '{@link IFC2X3.IfcRoot#getGlobalId <em>Global Id</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Global Id</em>' attribute is set.
	 * @see #unsetGlobalId()
	 * @see #getGlobalId()
	 * @see #setGlobalId(String)
	 * @generated
	 */
	boolean isSetGlobalId();

} // IfcRoot
