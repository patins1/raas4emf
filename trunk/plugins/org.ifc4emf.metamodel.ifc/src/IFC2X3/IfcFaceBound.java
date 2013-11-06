/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package IFC2X3;

import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;

import IFC2X3.jaxb.IfcFaceBoundImplAdapter;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Ifc Face Bound</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link IFC2X3.IfcFaceBound#getBound <em>Bound</em>}</li>
 *   <li>{@link IFC2X3.IfcFaceBound#getOrientation <em>Orientation</em>}</li>
 * </ul>
 * </p>
 *
 * @see IFC2X3.IFC2X3Package#getIfcFaceBound()
 * @model
 * @generated
 */
@XmlJavaTypeAdapter(IfcFaceBoundImplAdapter.class)
public interface IfcFaceBound extends IfcTopologicalRepresentationItem {
	/**
	 * Returns the value of the '<em><b>Bound</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Bound</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Bound</em>' reference.
	 * @see #setBound(IfcLoop)
	 * @see IFC2X3.IFC2X3Package#getIfcFaceBound_Bound()
	 * @model required="true"
	 * @generated
	 */
	IfcLoop getBound();

	/**
	 * Sets the value of the '{@link IFC2X3.IfcFaceBound#getBound <em>Bound</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Bound</em>' reference.
	 * @see #getBound()
	 * @generated
	 */
	void setBound(IfcLoop value);

	/**
	 * Returns the value of the '<em><b>Orientation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Orientation</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Orientation</em>' attribute.
	 * @see #isSetOrientation()
	 * @see #unsetOrientation()
	 * @see #setOrientation(Boolean)
	 * @see IFC2X3.IFC2X3Package#getIfcFaceBound_Orientation()
	 * @model unsettable="true" dataType="IFC2X3.BOOLEAN" required="true"
	 * @generated
	 */
	Boolean getOrientation();

	/**
	 * Sets the value of the '{@link IFC2X3.IfcFaceBound#getOrientation <em>Orientation</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Orientation</em>' attribute.
	 * @see #isSetOrientation()
	 * @see #unsetOrientation()
	 * @see #getOrientation()
	 * @generated
	 */
	void setOrientation(Boolean value);

	/**
	 * Unsets the value of the '{@link IFC2X3.IfcFaceBound#getOrientation <em>Orientation</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetOrientation()
	 * @see #getOrientation()
	 * @see #setOrientation(Boolean)
	 * @generated
	 */
	void unsetOrientation();

	/**
	 * Returns whether the value of the '{@link IFC2X3.IfcFaceBound#getOrientation <em>Orientation</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Orientation</em>' attribute is set.
	 * @see #unsetOrientation()
	 * @see #getOrientation()
	 * @see #setOrientation(Boolean)
	 * @generated
	 */
	boolean isSetOrientation();

} // IfcFaceBound
