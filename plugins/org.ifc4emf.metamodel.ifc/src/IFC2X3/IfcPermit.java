/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package IFC2X3;

import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;

import IFC2X3.jaxb.IfcPermitImplAdapter;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Ifc Permit</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link IFC2X3.IfcPermit#getPermitID <em>Permit ID</em>}</li>
 * </ul>
 * </p>
 *
 * @see IFC2X3.IFC2X3Package#getIfcPermit()
 * @model
 * @generated
 */
@XmlJavaTypeAdapter(IfcPermitImplAdapter.class)
public interface IfcPermit extends IfcControl {
	/**
	 * Returns the value of the '<em><b>Permit ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Permit ID</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Permit ID</em>' attribute.
	 * @see #isSetPermitID()
	 * @see #unsetPermitID()
	 * @see #setPermitID(String)
	 * @see IFC2X3.IFC2X3Package#getIfcPermit_PermitID()
	 * @model unsettable="true" dataType="IFC2X3.STRING" required="true"
	 * @generated
	 */
	String getPermitID();

	/**
	 * Sets the value of the '{@link IFC2X3.IfcPermit#getPermitID <em>Permit ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Permit ID</em>' attribute.
	 * @see #isSetPermitID()
	 * @see #unsetPermitID()
	 * @see #getPermitID()
	 * @generated
	 */
	void setPermitID(String value);

	/**
	 * Unsets the value of the '{@link IFC2X3.IfcPermit#getPermitID <em>Permit ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetPermitID()
	 * @see #getPermitID()
	 * @see #setPermitID(String)
	 * @generated
	 */
	void unsetPermitID();

	/**
	 * Returns whether the value of the '{@link IFC2X3.IfcPermit#getPermitID <em>Permit ID</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Permit ID</em>' attribute is set.
	 * @see #unsetPermitID()
	 * @see #getPermitID()
	 * @see #setPermitID(String)
	 * @generated
	 */
	boolean isSetPermitID();

} // IfcPermit
