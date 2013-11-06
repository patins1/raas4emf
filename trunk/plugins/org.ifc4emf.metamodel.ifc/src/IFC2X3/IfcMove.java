/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package IFC2X3;

import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;

import org.eclipse.emf.common.util.EList;

import IFC2X3.jaxb.IfcMoveImplAdapter;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Ifc Move</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link IFC2X3.IfcMove#getMoveFrom <em>Move From</em>}</li>
 *   <li>{@link IFC2X3.IfcMove#getMoveTo <em>Move To</em>}</li>
 *   <li>{@link IFC2X3.IfcMove#getPunchList <em>Punch List</em>}</li>
 * </ul>
 * </p>
 *
 * @see IFC2X3.IFC2X3Package#getIfcMove()
 * @model
 * @generated
 */
@XmlJavaTypeAdapter(IfcMoveImplAdapter.class)
public interface IfcMove extends IfcTask {
	/**
	 * Returns the value of the '<em><b>Move To</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Move To</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Move To</em>' reference.
	 * @see #setMoveTo(IfcSpatialStructureElement)
	 * @see IFC2X3.IFC2X3Package#getIfcMove_MoveTo()
	 * @model required="true"
	 * @generated
	 */
	IfcSpatialStructureElement getMoveTo();

	/**
	 * Sets the value of the '{@link IFC2X3.IfcMove#getMoveTo <em>Move To</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Move To</em>' reference.
	 * @see #getMoveTo()
	 * @generated
	 */
	void setMoveTo(IfcSpatialStructureElement value);

	/**
	 * Returns the value of the '<em><b>Move From</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Move From</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Move From</em>' reference.
	 * @see #setMoveFrom(IfcSpatialStructureElement)
	 * @see IFC2X3.IFC2X3Package#getIfcMove_MoveFrom()
	 * @model required="true"
	 * @generated
	 */
	IfcSpatialStructureElement getMoveFrom();

	/**
	 * Sets the value of the '{@link IFC2X3.IfcMove#getMoveFrom <em>Move From</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Move From</em>' reference.
	 * @see #getMoveFrom()
	 * @generated
	 */
	void setMoveFrom(IfcSpatialStructureElement value);

	/**
	 * Returns the value of the '<em><b>Punch List</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.String}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Punch List</em>' attribute list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Punch List</em>' attribute list.
	 * @see IFC2X3.IFC2X3Package#getIfcMove_PunchList()
	 * @model unique="false" dataType="IFC2X3.STRING"
	 * @generated
	 */
	EList<String> getPunchList();

} // IfcMove
