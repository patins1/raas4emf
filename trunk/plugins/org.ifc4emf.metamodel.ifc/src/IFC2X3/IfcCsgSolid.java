/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package IFC2X3;

import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;

import IFC2X3.jaxb.IfcCsgSolidImplAdapter;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Ifc Csg Solid</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link IFC2X3.IfcCsgSolid#getTreeRootExpression <em>Tree Root Expression</em>}</li>
 * </ul>
 * </p>
 *
 * @see IFC2X3.IFC2X3Package#getIfcCsgSolid()
 * @model
 * @generated
 */
@XmlJavaTypeAdapter(IfcCsgSolidImplAdapter.class)
public interface IfcCsgSolid extends IfcSolidModel {
	/**
	 * Returns the value of the '<em><b>Tree Root Expression</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Tree Root Expression</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Tree Root Expression</em>' reference.
	 * @see #setTreeRootExpression(IfcCsgSelect)
	 * @see IFC2X3.IFC2X3Package#getIfcCsgSolid_TreeRootExpression()
	 * @model required="true"
	 * @generated
	 */
	IfcCsgSelect getTreeRootExpression();

	/**
	 * Sets the value of the '{@link IFC2X3.IfcCsgSolid#getTreeRootExpression <em>Tree Root Expression</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Tree Root Expression</em>' reference.
	 * @see #getTreeRootExpression()
	 * @generated
	 */
	void setTreeRootExpression(IfcCsgSelect value);

} // IfcCsgSolid
