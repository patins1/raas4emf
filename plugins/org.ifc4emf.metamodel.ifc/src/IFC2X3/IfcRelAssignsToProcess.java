/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package IFC2X3;

import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;

import IFC2X3.jaxb.IfcRelAssignsToProcessImplAdapter;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Ifc Rel Assigns To Process</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link IFC2X3.IfcRelAssignsToProcess#getRelatingProcess <em>Relating Process</em>}</li>
 *   <li>{@link IFC2X3.IfcRelAssignsToProcess#getQuantityInProcess <em>Quantity In Process</em>}</li>
 * </ul>
 * </p>
 *
 * @see IFC2X3.IFC2X3Package#getIfcRelAssignsToProcess()
 * @model
 * @generated
 */
@XmlJavaTypeAdapter(IfcRelAssignsToProcessImplAdapter.class)
public interface IfcRelAssignsToProcess extends IfcRelAssigns {
	/**
	 * Returns the value of the '<em><b>Relating Process</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link IFC2X3.IfcProcess#getOperatesOn <em>Operates On</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Relating Process</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Relating Process</em>' reference.
	 * @see #setRelatingProcess(IfcProcess)
	 * @see IFC2X3.IFC2X3Package#getIfcRelAssignsToProcess_RelatingProcess()
	 * @see IFC2X3.IfcProcess#getOperatesOn
	 * @model opposite="OperatesOn" required="true"
	 * @generated
	 */
	IfcProcess getRelatingProcess();

	/**
	 * Sets the value of the '{@link IFC2X3.IfcRelAssignsToProcess#getRelatingProcess <em>Relating Process</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Relating Process</em>' reference.
	 * @see #getRelatingProcess()
	 * @generated
	 */
	void setRelatingProcess(IfcProcess value);

	/**
	 * Returns the value of the '<em><b>Quantity In Process</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Quantity In Process</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Quantity In Process</em>' reference.
	 * @see #setQuantityInProcess(IfcMeasureWithUnit)
	 * @see IFC2X3.IFC2X3Package#getIfcRelAssignsToProcess_QuantityInProcess()
	 * @model
	 * @generated
	 */
	IfcMeasureWithUnit getQuantityInProcess();

	/**
	 * Sets the value of the '{@link IFC2X3.IfcRelAssignsToProcess#getQuantityInProcess <em>Quantity In Process</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Quantity In Process</em>' reference.
	 * @see #getQuantityInProcess()
	 * @generated
	 */
	void setQuantityInProcess(IfcMeasureWithUnit value);

} // IfcRelAssignsToProcess
