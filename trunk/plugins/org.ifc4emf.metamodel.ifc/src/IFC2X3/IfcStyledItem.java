/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package IFC2X3;

import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;

import org.eclipse.emf.common.util.EList;

import IFC2X3.jaxb.IfcStyledItemImplAdapter;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Ifc Styled Item</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link IFC2X3.IfcStyledItem#getItem <em>Item</em>}</li>
 *   <li>{@link IFC2X3.IfcStyledItem#getStyles <em>Styles</em>}</li>
 *   <li>{@link IFC2X3.IfcStyledItem#getName <em>Name</em>}</li>
 * </ul>
 * </p>
 *
 * @see IFC2X3.IFC2X3Package#getIfcStyledItem()
 * @model
 * @generated
 */
@XmlJavaTypeAdapter(IfcStyledItemImplAdapter.class)
public interface IfcStyledItem extends IfcRepresentationItem {
	/**
	 * Returns the value of the '<em><b>Styles</b></em>' reference list.
	 * The list contents are of type {@link IFC2X3.IfcPresentationStyleAssignment}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Styles</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Styles</em>' reference list.
	 * @see IFC2X3.IFC2X3Package#getIfcStyledItem_Styles()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	EList<IfcPresentationStyleAssignment> getStyles();

	/**
	 * Returns the value of the '<em><b>Item</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link IFC2X3.IfcRepresentationItem#getStyledByItem <em>Styled By Item</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Item</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Item</em>' reference.
	 * @see #setItem(IfcRepresentationItem)
	 * @see IFC2X3.IFC2X3Package#getIfcStyledItem_Item()
	 * @see IFC2X3.IfcRepresentationItem#getStyledByItem
	 * @model opposite="StyledByItem"
	 * @generated
	 */
	IfcRepresentationItem getItem();

	/**
	 * Sets the value of the '{@link IFC2X3.IfcStyledItem#getItem <em>Item</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Item</em>' reference.
	 * @see #getItem()
	 * @generated
	 */
	void setItem(IfcRepresentationItem value);

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
	 * @see IFC2X3.IFC2X3Package#getIfcStyledItem_Name()
	 * @model unsettable="true" dataType="IFC2X3.STRING"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link IFC2X3.IfcStyledItem#getName <em>Name</em>}' attribute.
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
	 * Unsets the value of the '{@link IFC2X3.IfcStyledItem#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetName()
	 * @see #getName()
	 * @see #setName(String)
	 * @generated
	 */
	void unsetName();

	/**
	 * Returns whether the value of the '{@link IFC2X3.IfcStyledItem#getName <em>Name</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Name</em>' attribute is set.
	 * @see #unsetName()
	 * @see #getName()
	 * @see #setName(String)
	 * @generated
	 */
	boolean isSetName();

} // IfcStyledItem
