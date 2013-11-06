/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package IFC2X3;

import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;

import org.eclipse.emf.common.util.EList;

import IFC2X3.jaxb.IfcProjectOrderRecordImplAdapter;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Ifc Project Order Record</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link IFC2X3.IfcProjectOrderRecord#getRecords <em>Records</em>}</li>
 *   <li>{@link IFC2X3.IfcProjectOrderRecord#getPredefinedType <em>Predefined Type</em>}</li>
 * </ul>
 * </p>
 *
 * @see IFC2X3.IFC2X3Package#getIfcProjectOrderRecord()
 * @model
 * @generated
 */
@XmlJavaTypeAdapter(IfcProjectOrderRecordImplAdapter.class)
public interface IfcProjectOrderRecord extends IfcControl {
	/**
	 * Returns the value of the '<em><b>Records</b></em>' reference list.
	 * The list contents are of type {@link IFC2X3.IfcRelAssignsToProjectOrder}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Records</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Records</em>' reference list.
	 * @see IFC2X3.IFC2X3Package#getIfcProjectOrderRecord_Records()
	 * @model required="true"
	 * @generated
	 */
	EList<IfcRelAssignsToProjectOrder> getRecords();

	/**
	 * Returns the value of the '<em><b>Predefined Type</b></em>' attribute.
	 * The literals are from the enumeration {@link IFC2X3.IfcProjectOrderRecordTypeEnum}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Predefined Type</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Predefined Type</em>' attribute.
	 * @see IFC2X3.IfcProjectOrderRecordTypeEnum
	 * @see #isSetPredefinedType()
	 * @see #unsetPredefinedType()
	 * @see #setPredefinedType(IfcProjectOrderRecordTypeEnum)
	 * @see IFC2X3.IFC2X3Package#getIfcProjectOrderRecord_PredefinedType()
	 * @model unsettable="true" required="true"
	 * @generated
	 */
	IfcProjectOrderRecordTypeEnum getPredefinedType();

	/**
	 * Sets the value of the '{@link IFC2X3.IfcProjectOrderRecord#getPredefinedType <em>Predefined Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Predefined Type</em>' attribute.
	 * @see IFC2X3.IfcProjectOrderRecordTypeEnum
	 * @see #isSetPredefinedType()
	 * @see #unsetPredefinedType()
	 * @see #getPredefinedType()
	 * @generated
	 */
	void setPredefinedType(IfcProjectOrderRecordTypeEnum value);

	/**
	 * Unsets the value of the '{@link IFC2X3.IfcProjectOrderRecord#getPredefinedType <em>Predefined Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetPredefinedType()
	 * @see #getPredefinedType()
	 * @see #setPredefinedType(IfcProjectOrderRecordTypeEnum)
	 * @generated
	 */
	void unsetPredefinedType();

	/**
	 * Returns whether the value of the '{@link IFC2X3.IfcProjectOrderRecord#getPredefinedType <em>Predefined Type</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Predefined Type</em>' attribute is set.
	 * @see #unsetPredefinedType()
	 * @see #getPredefinedType()
	 * @see #setPredefinedType(IfcProjectOrderRecordTypeEnum)
	 * @generated
	 */
	boolean isSetPredefinedType();

} // IfcProjectOrderRecord
