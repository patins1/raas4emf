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

import IFC2X3.jaxb.IfcClassificationItemRelationshipImplAdapter;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Ifc Classification Item Relationship</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link IFC2X3.IfcClassificationItemRelationship#getRelatingItem <em>Relating Item</em>}</li>
 *   <li>{@link IFC2X3.IfcClassificationItemRelationship#getRelatedItems <em>Related Items</em>}</li>
 * </ul>
 * </p>
 *
 * @see IFC2X3.IFC2X3Package#getIfcClassificationItemRelationship()
 * @model
 * @extends CDOObject
 * @generated
 */
@XmlJavaTypeAdapter(IfcClassificationItemRelationshipImplAdapter.class)
public interface IfcClassificationItemRelationship extends CDOObject {
	/**
	 * Returns the value of the '<em><b>Related Items</b></em>' reference list.
	 * The list contents are of type {@link IFC2X3.IfcClassificationItem}.
	 * It is bidirectional and its opposite is '{@link IFC2X3.IfcClassificationItem#getIsClassifiedItemIn <em>Is Classified Item In</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Related Items</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Related Items</em>' reference list.
	 * @see IFC2X3.IFC2X3Package#getIfcClassificationItemRelationship_RelatedItems()
	 * @see IFC2X3.IfcClassificationItem#getIsClassifiedItemIn
	 * @model opposite="IsClassifiedItemIn" required="true" ordered="false"
	 * @generated
	 */
	EList<IfcClassificationItem> getRelatedItems();

	/**
	 * Returns the value of the '<em><b>Relating Item</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link IFC2X3.IfcClassificationItem#getIsClassifyingItemIn <em>Is Classifying Item In</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Relating Item</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Relating Item</em>' reference.
	 * @see #setRelatingItem(IfcClassificationItem)
	 * @see IFC2X3.IFC2X3Package#getIfcClassificationItemRelationship_RelatingItem()
	 * @see IFC2X3.IfcClassificationItem#getIsClassifyingItemIn
	 * @model opposite="IsClassifyingItemIn" required="true"
	 * @generated
	 */
	IfcClassificationItem getRelatingItem();

	/**
	 * Sets the value of the '{@link IFC2X3.IfcClassificationItemRelationship#getRelatingItem <em>Relating Item</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Relating Item</em>' reference.
	 * @see #getRelatingItem()
	 * @generated
	 */
	void setRelatingItem(IfcClassificationItem value);

} // IfcClassificationItemRelationship
