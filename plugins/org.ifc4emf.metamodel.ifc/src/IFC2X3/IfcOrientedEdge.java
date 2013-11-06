/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package IFC2X3;

import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;

import IFC2X3.jaxb.IfcOrientedEdgeImplAdapter;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Ifc Oriented Edge</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link IFC2X3.IfcOrientedEdge#getEdgeElement <em>Edge Element</em>}</li>
 *   <li>{@link IFC2X3.IfcOrientedEdge#getOrientation <em>Orientation</em>}</li>
 * </ul>
 * </p>
 *
 * @see IFC2X3.IFC2X3Package#getIfcOrientedEdge()
 * @model
 * @generated
 */
@XmlJavaTypeAdapter(IfcOrientedEdgeImplAdapter.class)
public interface IfcOrientedEdge extends IfcEdge {
	/**
	 * Returns the value of the '<em><b>Edge Element</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Edge Element</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Edge Element</em>' reference.
	 * @see #setEdgeElement(IfcEdge)
	 * @see IFC2X3.IFC2X3Package#getIfcOrientedEdge_EdgeElement()
	 * @model required="true"
	 * @generated
	 */
	IfcEdge getEdgeElement();

	/**
	 * Sets the value of the '{@link IFC2X3.IfcOrientedEdge#getEdgeElement <em>Edge Element</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Edge Element</em>' reference.
	 * @see #getEdgeElement()
	 * @generated
	 */
	void setEdgeElement(IfcEdge value);

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
	 * @see IFC2X3.IFC2X3Package#getIfcOrientedEdge_Orientation()
	 * @model unsettable="true" dataType="IFC2X3.BOOLEAN" required="true"
	 * @generated
	 */
	Boolean getOrientation();

	/**
	 * Sets the value of the '{@link IFC2X3.IfcOrientedEdge#getOrientation <em>Orientation</em>}' attribute.
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
	 * Unsets the value of the '{@link IFC2X3.IfcOrientedEdge#getOrientation <em>Orientation</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetOrientation()
	 * @see #getOrientation()
	 * @see #setOrientation(Boolean)
	 * @generated
	 */
	void unsetOrientation();

	/**
	 * Returns whether the value of the '{@link IFC2X3.IfcOrientedEdge#getOrientation <em>Orientation</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Orientation</em>' attribute is set.
	 * @see #unsetOrientation()
	 * @see #getOrientation()
	 * @see #setOrientation(Boolean)
	 * @generated
	 */
	boolean isSetOrientation();

} // IfcOrientedEdge
