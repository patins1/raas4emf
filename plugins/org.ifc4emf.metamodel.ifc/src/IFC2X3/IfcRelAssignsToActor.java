/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package IFC2X3;

import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;

import IFC2X3.jaxb.IfcRelAssignsToActorImplAdapter;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Ifc Rel Assigns To Actor</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link IFC2X3.IfcRelAssignsToActor#getRelatingActor <em>Relating Actor</em>}</li>
 *   <li>{@link IFC2X3.IfcRelAssignsToActor#getActingRole <em>Acting Role</em>}</li>
 * </ul>
 * </p>
 *
 * @see IFC2X3.IFC2X3Package#getIfcRelAssignsToActor()
 * @model
 * @generated
 */
@XmlJavaTypeAdapter(IfcRelAssignsToActorImplAdapter.class)
public interface IfcRelAssignsToActor extends IfcRelAssigns {
	/**
	 * Returns the value of the '<em><b>Relating Actor</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link IFC2X3.IfcActor#getIsActingUpon <em>Is Acting Upon</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Relating Actor</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Relating Actor</em>' reference.
	 * @see #setRelatingActor(IfcActor)
	 * @see IFC2X3.IFC2X3Package#getIfcRelAssignsToActor_RelatingActor()
	 * @see IFC2X3.IfcActor#getIsActingUpon
	 * @model opposite="IsActingUpon" required="true"
	 * @generated
	 */
	IfcActor getRelatingActor();

	/**
	 * Sets the value of the '{@link IFC2X3.IfcRelAssignsToActor#getRelatingActor <em>Relating Actor</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Relating Actor</em>' reference.
	 * @see #getRelatingActor()
	 * @generated
	 */
	void setRelatingActor(IfcActor value);

	/**
	 * Returns the value of the '<em><b>Acting Role</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Acting Role</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Acting Role</em>' reference.
	 * @see #setActingRole(IfcActorRole)
	 * @see IFC2X3.IFC2X3Package#getIfcRelAssignsToActor_ActingRole()
	 * @model
	 * @generated
	 */
	IfcActorRole getActingRole();

	/**
	 * Sets the value of the '{@link IFC2X3.IfcRelAssignsToActor#getActingRole <em>Acting Role</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Acting Role</em>' reference.
	 * @see #getActingRole()
	 * @generated
	 */
	void setActingRole(IfcActorRole value);

} // IfcRelAssignsToActor
