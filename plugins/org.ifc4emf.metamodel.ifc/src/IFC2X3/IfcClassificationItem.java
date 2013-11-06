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

import IFC2X3.jaxb.IfcClassificationItemImplAdapter;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Ifc Classification Item</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link IFC2X3.IfcClassificationItem#getNotation <em>Notation</em>}</li>
 *   <li>{@link IFC2X3.IfcClassificationItem#getItemOf <em>Item Of</em>}</li>
 *   <li>{@link IFC2X3.IfcClassificationItem#getTitle <em>Title</em>}</li>
 *   <li>{@link IFC2X3.IfcClassificationItem#getIsClassifiedItemIn <em>Is Classified Item In</em>}</li>
 *   <li>{@link IFC2X3.IfcClassificationItem#getIsClassifyingItemIn <em>Is Classifying Item In</em>}</li>
 * </ul>
 * </p>
 *
 * @see IFC2X3.IFC2X3Package#getIfcClassificationItem()
 * @model
 * @extends CDOObject
 * @generated
 */
@XmlJavaTypeAdapter(IfcClassificationItemImplAdapter.class)
public interface IfcClassificationItem extends CDOObject {
	/**
	 * Returns the value of the '<em><b>Is Classified Item In</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link IFC2X3.IfcClassificationItemRelationship#getRelatedItems <em>Related Items</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Is Classified Item In</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Is Classified Item In</em>' reference.
	 * @see #setIsClassifiedItemIn(IfcClassificationItemRelationship)
	 * @see IFC2X3.IFC2X3Package#getIfcClassificationItem_IsClassifiedItemIn()
	 * @see IFC2X3.IfcClassificationItemRelationship#getRelatedItems
	 * @model opposite="RelatedItems" ordered="false"
	 * @generated
	 */
	IfcClassificationItemRelationship getIsClassifiedItemIn();

	/**
	 * Sets the value of the '{@link IFC2X3.IfcClassificationItem#getIsClassifiedItemIn <em>Is Classified Item In</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Is Classified Item In</em>' reference.
	 * @see #getIsClassifiedItemIn()
	 * @generated
	 */
	void setIsClassifiedItemIn(IfcClassificationItemRelationship value);

	/**
	 * Returns the value of the '<em><b>Is Classifying Item In</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link IFC2X3.IfcClassificationItemRelationship#getRelatingItem <em>Relating Item</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Is Classifying Item In</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Is Classifying Item In</em>' reference.
	 * @see #setIsClassifyingItemIn(IfcClassificationItemRelationship)
	 * @see IFC2X3.IFC2X3Package#getIfcClassificationItem_IsClassifyingItemIn()
	 * @see IFC2X3.IfcClassificationItemRelationship#getRelatingItem
	 * @model opposite="RelatingItem" ordered="false"
	 * @generated
	 */
	IfcClassificationItemRelationship getIsClassifyingItemIn();

	/**
	 * Sets the value of the '{@link IFC2X3.IfcClassificationItem#getIsClassifyingItemIn <em>Is Classifying Item In</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Is Classifying Item In</em>' reference.
	 * @see #getIsClassifyingItemIn()
	 * @generated
	 */
	void setIsClassifyingItemIn(IfcClassificationItemRelationship value);

	/**
	 * Returns the value of the '<em><b>Item Of</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link IFC2X3.IfcClassification#getContains <em>Contains</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Item Of</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Item Of</em>' reference.
	 * @see #setItemOf(IfcClassification)
	 * @see IFC2X3.IFC2X3Package#getIfcClassificationItem_ItemOf()
	 * @see IFC2X3.IfcClassification#getContains
	 * @model opposite="Contains"
	 * @generated
	 */
	IfcClassification getItemOf();

	/**
	 * Sets the value of the '{@link IFC2X3.IfcClassificationItem#getItemOf <em>Item Of</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Item Of</em>' reference.
	 * @see #getItemOf()
	 * @generated
	 */
	void setItemOf(IfcClassification value);

	/**
	 * Returns the value of the '<em><b>Notation</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Notation</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Notation</em>' reference.
	 * @see #setNotation(IfcClassificationNotationFacet)
	 * @see IFC2X3.IFC2X3Package#getIfcClassificationItem_Notation()
	 * @model required="true"
	 * @generated
	 */
	IfcClassificationNotationFacet getNotation();

	/**
	 * Sets the value of the '{@link IFC2X3.IfcClassificationItem#getNotation <em>Notation</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Notation</em>' reference.
	 * @see #getNotation()
	 * @generated
	 */
	void setNotation(IfcClassificationNotationFacet value);

	/**
	 * Returns the value of the '<em><b>Title</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Title</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Title</em>' attribute.
	 * @see #isSetTitle()
	 * @see #unsetTitle()
	 * @see #setTitle(String)
	 * @see IFC2X3.IFC2X3Package#getIfcClassificationItem_Title()
	 * @model unsettable="true" dataType="IFC2X3.STRING" required="true"
	 * @generated
	 */
	String getTitle();

	/**
	 * Sets the value of the '{@link IFC2X3.IfcClassificationItem#getTitle <em>Title</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Title</em>' attribute.
	 * @see #isSetTitle()
	 * @see #unsetTitle()
	 * @see #getTitle()
	 * @generated
	 */
	void setTitle(String value);

	/**
	 * Unsets the value of the '{@link IFC2X3.IfcClassificationItem#getTitle <em>Title</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetTitle()
	 * @see #getTitle()
	 * @see #setTitle(String)
	 * @generated
	 */
	void unsetTitle();

	/**
	 * Returns whether the value of the '{@link IFC2X3.IfcClassificationItem#getTitle <em>Title</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Title</em>' attribute is set.
	 * @see #unsetTitle()
	 * @see #getTitle()
	 * @see #setTitle(String)
	 * @generated
	 */
	boolean isSetTitle();

} // IfcClassificationItem
