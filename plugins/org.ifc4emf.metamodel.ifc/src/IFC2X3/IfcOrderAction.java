/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package IFC2X3;

import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;

import IFC2X3.jaxb.IfcOrderActionImplAdapter;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Ifc Order Action</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link IFC2X3.IfcOrderAction#getActionID <em>Action ID</em>}</li>
 * </ul>
 * </p>
 *
 * @see IFC2X3.IFC2X3Package#getIfcOrderAction()
 * @model
 * @generated
 */
@XmlJavaTypeAdapter(IfcOrderActionImplAdapter.class)
public interface IfcOrderAction extends IfcTask {
	/**
	 * Returns the value of the '<em><b>Action ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Action ID</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Action ID</em>' attribute.
	 * @see #isSetActionID()
	 * @see #unsetActionID()
	 * @see #setActionID(String)
	 * @see IFC2X3.IFC2X3Package#getIfcOrderAction_ActionID()
	 * @model unsettable="true" dataType="IFC2X3.STRING" required="true"
	 * @generated
	 */
	String getActionID();

	/**
	 * Sets the value of the '{@link IFC2X3.IfcOrderAction#getActionID <em>Action ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Action ID</em>' attribute.
	 * @see #isSetActionID()
	 * @see #unsetActionID()
	 * @see #getActionID()
	 * @generated
	 */
	void setActionID(String value);

	/**
	 * Unsets the value of the '{@link IFC2X3.IfcOrderAction#getActionID <em>Action ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetActionID()
	 * @see #getActionID()
	 * @see #setActionID(String)
	 * @generated
	 */
	void unsetActionID();

	/**
	 * Returns whether the value of the '{@link IFC2X3.IfcOrderAction#getActionID <em>Action ID</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Action ID</em>' attribute is set.
	 * @see #unsetActionID()
	 * @see #getActionID()
	 * @see #setActionID(String)
	 * @generated
	 */
	boolean isSetActionID();

} // IfcOrderAction
