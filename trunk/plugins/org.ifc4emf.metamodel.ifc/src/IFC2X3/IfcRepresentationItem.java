/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package IFC2X3;

import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;

import IFC2X3.jaxb.IfcRepresentationItemImplAdapter;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Ifc Representation Item</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link IFC2X3.IfcRepresentationItem#getStyledByItem <em>Styled By Item</em>}</li>
 * </ul>
 * </p>
 *
 * @see IFC2X3.IFC2X3Package#getIfcRepresentationItem()
 * @model
 * @generated
 */
@XmlJavaTypeAdapter(IfcRepresentationItemImplAdapter.class)
public interface IfcRepresentationItem extends IfcLayeredItem {
	/**
	 * Returns the value of the '<em><b>Styled By Item</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link IFC2X3.IfcStyledItem#getItem <em>Item</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Styled By Item</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Styled By Item</em>' reference.
	 * @see #setStyledByItem(IfcStyledItem)
	 * @see IFC2X3.IFC2X3Package#getIfcRepresentationItem_StyledByItem()
	 * @see IFC2X3.IfcStyledItem#getItem
	 * @model opposite="Item" ordered="false"
	 * @generated
	 */
	IfcStyledItem getStyledByItem();

	/**
	 * Sets the value of the '{@link IFC2X3.IfcRepresentationItem#getStyledByItem <em>Styled By Item</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Styled By Item</em>' reference.
	 * @see #getStyledByItem()
	 * @generated
	 */
	void setStyledByItem(IfcStyledItem value);

} // IfcRepresentationItem
