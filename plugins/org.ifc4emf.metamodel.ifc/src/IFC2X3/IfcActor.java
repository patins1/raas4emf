/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package IFC2X3;

import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;

import org.eclipse.emf.common.util.EList;

import IFC2X3.jaxb.IfcActorImplAdapter;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Ifc Actor</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link IFC2X3.IfcActor#getTheActor <em>The Actor</em>}</li>
 *   <li>{@link IFC2X3.IfcActor#getIsActingUpon <em>Is Acting Upon</em>}</li>
 * </ul>
 * </p>
 *
 * @see IFC2X3.IFC2X3Package#getIfcActor()
 * @model
 * @generated
 */
@XmlJavaTypeAdapter(IfcActorImplAdapter.class)
public interface IfcActor extends IfcObject {
	/**
	 * Returns the value of the '<em><b>Is Acting Upon</b></em>' reference list.
	 * The list contents are of type {@link IFC2X3.IfcRelAssignsToActor}.
	 * It is bidirectional and its opposite is '{@link IFC2X3.IfcRelAssignsToActor#getRelatingActor <em>Relating Actor</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Is Acting Upon</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Is Acting Upon</em>' reference list.
	 * @see IFC2X3.IFC2X3Package#getIfcActor_IsActingUpon()
	 * @see IFC2X3.IfcRelAssignsToActor#getRelatingActor
	 * @model opposite="RelatingActor" ordered="false"
	 * @generated
	 */
	EList<IfcRelAssignsToActor> getIsActingUpon();

	/**
	 * Returns the value of the '<em><b>The Actor</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>The Actor</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>The Actor</em>' reference.
	 * @see #setTheActor(IfcActorSelect)
	 * @see IFC2X3.IFC2X3Package#getIfcActor_TheActor()
	 * @model required="true"
	 * @generated
	 */
	IfcActorSelect getTheActor();

	/**
	 * Sets the value of the '{@link IFC2X3.IfcActor#getTheActor <em>The Actor</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>The Actor</em>' reference.
	 * @see #getTheActor()
	 * @generated
	 */
	void setTheActor(IfcActorSelect value);

} // IfcActor
