/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package IFC2X3;

import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;

import IFC2X3.jaxb.IfcRelSequenceImplAdapter;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Ifc Rel Sequence</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link IFC2X3.IfcRelSequence#getRelatingProcess <em>Relating Process</em>}</li>
 *   <li>{@link IFC2X3.IfcRelSequence#getRelatedProcess <em>Related Process</em>}</li>
 *   <li>{@link IFC2X3.IfcRelSequence#getTimeLag <em>Time Lag</em>}</li>
 *   <li>{@link IFC2X3.IfcRelSequence#getSequenceType <em>Sequence Type</em>}</li>
 * </ul>
 * </p>
 *
 * @see IFC2X3.IFC2X3Package#getIfcRelSequence()
 * @model
 * @generated
 */
@XmlJavaTypeAdapter(IfcRelSequenceImplAdapter.class)
public interface IfcRelSequence extends IfcRelConnects {
	/**
	 * Returns the value of the '<em><b>Related Process</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link IFC2X3.IfcProcess#getIsSuccessorFrom <em>Is Successor From</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Related Process</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Related Process</em>' reference.
	 * @see #setRelatedProcess(IfcProcess)
	 * @see IFC2X3.IFC2X3Package#getIfcRelSequence_RelatedProcess()
	 * @see IFC2X3.IfcProcess#getIsSuccessorFrom
	 * @model opposite="IsSuccessorFrom" required="true"
	 * @generated
	 */
	IfcProcess getRelatedProcess();

	/**
	 * Sets the value of the '{@link IFC2X3.IfcRelSequence#getRelatedProcess <em>Related Process</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Related Process</em>' reference.
	 * @see #getRelatedProcess()
	 * @generated
	 */
	void setRelatedProcess(IfcProcess value);

	/**
	 * Returns the value of the '<em><b>Relating Process</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link IFC2X3.IfcProcess#getIsPredecessorTo <em>Is Predecessor To</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Relating Process</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Relating Process</em>' reference.
	 * @see #setRelatingProcess(IfcProcess)
	 * @see IFC2X3.IFC2X3Package#getIfcRelSequence_RelatingProcess()
	 * @see IFC2X3.IfcProcess#getIsPredecessorTo
	 * @model opposite="IsPredecessorTo" required="true"
	 * @generated
	 */
	IfcProcess getRelatingProcess();

	/**
	 * Sets the value of the '{@link IFC2X3.IfcRelSequence#getRelatingProcess <em>Relating Process</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Relating Process</em>' reference.
	 * @see #getRelatingProcess()
	 * @generated
	 */
	void setRelatingProcess(IfcProcess value);

	/**
	 * Returns the value of the '<em><b>Sequence Type</b></em>' attribute.
	 * The literals are from the enumeration {@link IFC2X3.IfcSequenceEnum}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Sequence Type</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Sequence Type</em>' attribute.
	 * @see IFC2X3.IfcSequenceEnum
	 * @see #isSetSequenceType()
	 * @see #unsetSequenceType()
	 * @see #setSequenceType(IfcSequenceEnum)
	 * @see IFC2X3.IFC2X3Package#getIfcRelSequence_SequenceType()
	 * @model unsettable="true" required="true"
	 * @generated
	 */
	IfcSequenceEnum getSequenceType();

	/**
	 * Sets the value of the '{@link IFC2X3.IfcRelSequence#getSequenceType <em>Sequence Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Sequence Type</em>' attribute.
	 * @see IFC2X3.IfcSequenceEnum
	 * @see #isSetSequenceType()
	 * @see #unsetSequenceType()
	 * @see #getSequenceType()
	 * @generated
	 */
	void setSequenceType(IfcSequenceEnum value);

	/**
	 * Unsets the value of the '{@link IFC2X3.IfcRelSequence#getSequenceType <em>Sequence Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetSequenceType()
	 * @see #getSequenceType()
	 * @see #setSequenceType(IfcSequenceEnum)
	 * @generated
	 */
	void unsetSequenceType();

	/**
	 * Returns whether the value of the '{@link IFC2X3.IfcRelSequence#getSequenceType <em>Sequence Type</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Sequence Type</em>' attribute is set.
	 * @see #unsetSequenceType()
	 * @see #getSequenceType()
	 * @see #setSequenceType(IfcSequenceEnum)
	 * @generated
	 */
	boolean isSetSequenceType();

	/**
	 * Returns the value of the '<em><b>Time Lag</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Time Lag</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Time Lag</em>' attribute.
	 * @see #isSetTimeLag()
	 * @see #unsetTimeLag()
	 * @see #setTimeLag(Double)
	 * @see IFC2X3.IFC2X3Package#getIfcRelSequence_TimeLag()
	 * @model unsettable="true" dataType="IFC2X3.REAL" required="true"
	 * @generated
	 */
	Double getTimeLag();

	/**
	 * Sets the value of the '{@link IFC2X3.IfcRelSequence#getTimeLag <em>Time Lag</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Time Lag</em>' attribute.
	 * @see #isSetTimeLag()
	 * @see #unsetTimeLag()
	 * @see #getTimeLag()
	 * @generated
	 */
	void setTimeLag(Double value);

	/**
	 * Unsets the value of the '{@link IFC2X3.IfcRelSequence#getTimeLag <em>Time Lag</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetTimeLag()
	 * @see #getTimeLag()
	 * @see #setTimeLag(Double)
	 * @generated
	 */
	void unsetTimeLag();

	/**
	 * Returns whether the value of the '{@link IFC2X3.IfcRelSequence#getTimeLag <em>Time Lag</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Time Lag</em>' attribute is set.
	 * @see #unsetTimeLag()
	 * @see #getTimeLag()
	 * @see #setTimeLag(Double)
	 * @generated
	 */
	boolean isSetTimeLag();

} // IfcRelSequence
