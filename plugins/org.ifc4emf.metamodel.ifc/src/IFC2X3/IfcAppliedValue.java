/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package IFC2X3;

import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;

import org.eclipse.emf.common.util.EList;

import IFC2X3.jaxb.IfcAppliedValueImplAdapter;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Ifc Applied Value</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link IFC2X3.IfcAppliedValue#getName <em>Name</em>}</li>
 *   <li>{@link IFC2X3.IfcAppliedValue#getDescription <em>Description</em>}</li>
 *   <li>{@link IFC2X3.IfcAppliedValue#getAppliedValue <em>Applied Value</em>}</li>
 *   <li>{@link IFC2X3.IfcAppliedValue#getUnitBasis <em>Unit Basis</em>}</li>
 *   <li>{@link IFC2X3.IfcAppliedValue#getApplicableDate <em>Applicable Date</em>}</li>
 *   <li>{@link IFC2X3.IfcAppliedValue#getFixedUntilDate <em>Fixed Until Date</em>}</li>
 *   <li>{@link IFC2X3.IfcAppliedValue#getValuesReferenced <em>Values Referenced</em>}</li>
 *   <li>{@link IFC2X3.IfcAppliedValue#getValueOfComponents <em>Value Of Components</em>}</li>
 *   <li>{@link IFC2X3.IfcAppliedValue#getIsComponentIn <em>Is Component In</em>}</li>
 * </ul>
 * </p>
 *
 * @see IFC2X3.IFC2X3Package#getIfcAppliedValue()
 * @model
 * @generated
 */
@XmlJavaTypeAdapter(IfcAppliedValueImplAdapter.class)
public interface IfcAppliedValue extends IfcObjectReferenceSelect {
	/**
	 * Returns the value of the '<em><b>Applied Value</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Applied Value</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Applied Value</em>' containment reference.
	 * @see #setAppliedValue(IfcAppliedValueSelect)
	 * @see IFC2X3.IFC2X3Package#getIfcAppliedValue_AppliedValue()
	 * @model containment="true"
	 * @generated
	 */
	IfcAppliedValueSelect getAppliedValue();

	/**
	 * Sets the value of the '{@link IFC2X3.IfcAppliedValue#getAppliedValue <em>Applied Value</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Applied Value</em>' containment reference.
	 * @see #getAppliedValue()
	 * @generated
	 */
	void setAppliedValue(IfcAppliedValueSelect value);

	/**
	 * Returns the value of the '<em><b>Values Referenced</b></em>' reference list.
	 * The list contents are of type {@link IFC2X3.IfcReferencesValueDocument}.
	 * It is bidirectional and its opposite is '{@link IFC2X3.IfcReferencesValueDocument#getReferencingValues <em>Referencing Values</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Values Referenced</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Values Referenced</em>' reference list.
	 * @see IFC2X3.IFC2X3Package#getIfcAppliedValue_ValuesReferenced()
	 * @see IFC2X3.IfcReferencesValueDocument#getReferencingValues
	 * @model opposite="ReferencingValues" ordered="false"
	 * @generated
	 */
	EList<IfcReferencesValueDocument> getValuesReferenced();

	/**
	 * Returns the value of the '<em><b>Value Of Components</b></em>' reference list.
	 * The list contents are of type {@link IFC2X3.IfcAppliedValueRelationship}.
	 * It is bidirectional and its opposite is '{@link IFC2X3.IfcAppliedValueRelationship#getComponentOfTotal <em>Component Of Total</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Value Of Components</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Value Of Components</em>' reference list.
	 * @see IFC2X3.IFC2X3Package#getIfcAppliedValue_ValueOfComponents()
	 * @see IFC2X3.IfcAppliedValueRelationship#getComponentOfTotal
	 * @model opposite="ComponentOfTotal" ordered="false"
	 * @generated
	 */
	EList<IfcAppliedValueRelationship> getValueOfComponents();

	/**
	 * Returns the value of the '<em><b>Is Component In</b></em>' reference list.
	 * The list contents are of type {@link IFC2X3.IfcAppliedValueRelationship}.
	 * It is bidirectional and its opposite is '{@link IFC2X3.IfcAppliedValueRelationship#getComponents <em>Components</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Is Component In</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Is Component In</em>' reference list.
	 * @see IFC2X3.IFC2X3Package#getIfcAppliedValue_IsComponentIn()
	 * @see IFC2X3.IfcAppliedValueRelationship#getComponents
	 * @model opposite="Components" ordered="false"
	 * @generated
	 */
	EList<IfcAppliedValueRelationship> getIsComponentIn();

	/**
	 * Returns the value of the '<em><b>Fixed Until Date</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Fixed Until Date</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Fixed Until Date</em>' reference.
	 * @see #setFixedUntilDate(IfcDateTimeSelect)
	 * @see IFC2X3.IFC2X3Package#getIfcAppliedValue_FixedUntilDate()
	 * @model
	 * @generated
	 */
	IfcDateTimeSelect getFixedUntilDate();

	/**
	 * Sets the value of the '{@link IFC2X3.IfcAppliedValue#getFixedUntilDate <em>Fixed Until Date</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Fixed Until Date</em>' reference.
	 * @see #getFixedUntilDate()
	 * @generated
	 */
	void setFixedUntilDate(IfcDateTimeSelect value);

	/**
	 * Returns the value of the '<em><b>Applicable Date</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Applicable Date</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Applicable Date</em>' reference.
	 * @see #setApplicableDate(IfcDateTimeSelect)
	 * @see IFC2X3.IFC2X3Package#getIfcAppliedValue_ApplicableDate()
	 * @model
	 * @generated
	 */
	IfcDateTimeSelect getApplicableDate();

	/**
	 * Sets the value of the '{@link IFC2X3.IfcAppliedValue#getApplicableDate <em>Applicable Date</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Applicable Date</em>' reference.
	 * @see #getApplicableDate()
	 * @generated
	 */
	void setApplicableDate(IfcDateTimeSelect value);

	/**
	 * Returns the value of the '<em><b>Unit Basis</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Unit Basis</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Unit Basis</em>' reference.
	 * @see #setUnitBasis(IfcMeasureWithUnit)
	 * @see IFC2X3.IFC2X3Package#getIfcAppliedValue_UnitBasis()
	 * @model
	 * @generated
	 */
	IfcMeasureWithUnit getUnitBasis();

	/**
	 * Sets the value of the '{@link IFC2X3.IfcAppliedValue#getUnitBasis <em>Unit Basis</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Unit Basis</em>' reference.
	 * @see #getUnitBasis()
	 * @generated
	 */
	void setUnitBasis(IfcMeasureWithUnit value);

	/**
	 * Returns the value of the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Description</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Description</em>' attribute.
	 * @see #isSetDescription()
	 * @see #unsetDescription()
	 * @see #setDescription(String)
	 * @see IFC2X3.IFC2X3Package#getIfcAppliedValue_Description()
	 * @model unsettable="true" dataType="IFC2X3.STRING"
	 * @generated
	 */
	String getDescription();

	/**
	 * Sets the value of the '{@link IFC2X3.IfcAppliedValue#getDescription <em>Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Description</em>' attribute.
	 * @see #isSetDescription()
	 * @see #unsetDescription()
	 * @see #getDescription()
	 * @generated
	 */
	void setDescription(String value);

	/**
	 * Unsets the value of the '{@link IFC2X3.IfcAppliedValue#getDescription <em>Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetDescription()
	 * @see #getDescription()
	 * @see #setDescription(String)
	 * @generated
	 */
	void unsetDescription();

	/**
	 * Returns whether the value of the '{@link IFC2X3.IfcAppliedValue#getDescription <em>Description</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Description</em>' attribute is set.
	 * @see #unsetDescription()
	 * @see #getDescription()
	 * @see #setDescription(String)
	 * @generated
	 */
	boolean isSetDescription();

	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #isSetName()
	 * @see #unsetName()
	 * @see #setName(String)
	 * @see IFC2X3.IFC2X3Package#getIfcAppliedValue_Name()
	 * @model unsettable="true" dataType="IFC2X3.STRING"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link IFC2X3.IfcAppliedValue#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #isSetName()
	 * @see #unsetName()
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Unsets the value of the '{@link IFC2X3.IfcAppliedValue#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetName()
	 * @see #getName()
	 * @see #setName(String)
	 * @generated
	 */
	void unsetName();

	/**
	 * Returns whether the value of the '{@link IFC2X3.IfcAppliedValue#getName <em>Name</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Name</em>' attribute is set.
	 * @see #unsetName()
	 * @see #getName()
	 * @see #setName(String)
	 * @generated
	 */
	boolean isSetName();

} // IfcAppliedValue
