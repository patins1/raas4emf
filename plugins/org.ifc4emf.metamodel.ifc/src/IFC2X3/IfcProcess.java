/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package IFC2X3;

import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;

import org.eclipse.emf.common.util.EList;

import IFC2X3.jaxb.IfcProcessImplAdapter;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Ifc Process</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link IFC2X3.IfcProcess#getOperatesOn <em>Operates On</em>}</li>
 *   <li>{@link IFC2X3.IfcProcess#getIsSuccessorFrom <em>Is Successor From</em>}</li>
 *   <li>{@link IFC2X3.IfcProcess#getIsPredecessorTo <em>Is Predecessor To</em>}</li>
 * </ul>
 * </p>
 *
 * @see IFC2X3.IFC2X3Package#getIfcProcess()
 * @model
 * @generated
 */
@XmlJavaTypeAdapter(IfcProcessImplAdapter.class)
public interface IfcProcess extends IfcObject {
	/**
	 * Returns the value of the '<em><b>Operates On</b></em>' reference list.
	 * The list contents are of type {@link IFC2X3.IfcRelAssignsToProcess}.
	 * It is bidirectional and its opposite is '{@link IFC2X3.IfcRelAssignsToProcess#getRelatingProcess <em>Relating Process</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Operates On</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Operates On</em>' reference list.
	 * @see IFC2X3.IFC2X3Package#getIfcProcess_OperatesOn()
	 * @see IFC2X3.IfcRelAssignsToProcess#getRelatingProcess
	 * @model opposite="RelatingProcess" ordered="false"
	 * @generated
	 */
	EList<IfcRelAssignsToProcess> getOperatesOn();

	/**
	 * Returns the value of the '<em><b>Is Successor From</b></em>' reference list.
	 * The list contents are of type {@link IFC2X3.IfcRelSequence}.
	 * It is bidirectional and its opposite is '{@link IFC2X3.IfcRelSequence#getRelatedProcess <em>Related Process</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Is Successor From</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Is Successor From</em>' reference list.
	 * @see IFC2X3.IFC2X3Package#getIfcProcess_IsSuccessorFrom()
	 * @see IFC2X3.IfcRelSequence#getRelatedProcess
	 * @model opposite="RelatedProcess" ordered="false"
	 * @generated
	 */
	EList<IfcRelSequence> getIsSuccessorFrom();

	/**
	 * Returns the value of the '<em><b>Is Predecessor To</b></em>' reference list.
	 * The list contents are of type {@link IFC2X3.IfcRelSequence}.
	 * It is bidirectional and its opposite is '{@link IFC2X3.IfcRelSequence#getRelatingProcess <em>Relating Process</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Is Predecessor To</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Is Predecessor To</em>' reference list.
	 * @see IFC2X3.IFC2X3Package#getIfcProcess_IsPredecessorTo()
	 * @see IFC2X3.IfcRelSequence#getRelatingProcess
	 * @model opposite="RelatingProcess" ordered="false"
	 * @generated
	 */
	EList<IfcRelSequence> getIsPredecessorTo();

} // IfcProcess
