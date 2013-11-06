/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package IFC2X3;

import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;

import IFC2X3.jaxb.IfcSubedgeImplAdapter;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Ifc Subedge</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link IFC2X3.IfcSubedge#getParentEdge <em>Parent Edge</em>}</li>
 * </ul>
 * </p>
 *
 * @see IFC2X3.IFC2X3Package#getIfcSubedge()
 * @model
 * @generated
 */
@XmlJavaTypeAdapter(IfcSubedgeImplAdapter.class)
public interface IfcSubedge extends IfcEdge {
	/**
	 * Returns the value of the '<em><b>Parent Edge</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Parent Edge</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Parent Edge</em>' reference.
	 * @see #setParentEdge(IfcEdge)
	 * @see IFC2X3.IFC2X3Package#getIfcSubedge_ParentEdge()
	 * @model required="true"
	 * @generated
	 */
	IfcEdge getParentEdge();

	/**
	 * Sets the value of the '{@link IFC2X3.IfcSubedge#getParentEdge <em>Parent Edge</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Parent Edge</em>' reference.
	 * @see #getParentEdge()
	 * @generated
	 */
	void setParentEdge(IfcEdge value);

} // IfcSubedge
