/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package IFC2X3;

import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;

import IFC2X3.jaxb.IfcConditionCriterionImplAdapter;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Ifc Condition Criterion</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link IFC2X3.IfcConditionCriterion#getCriterion <em>Criterion</em>}</li>
 *   <li>{@link IFC2X3.IfcConditionCriterion#getCriterionDateTime <em>Criterion Date Time</em>}</li>
 * </ul>
 * </p>
 *
 * @see IFC2X3.IFC2X3Package#getIfcConditionCriterion()
 * @model
 * @generated
 */
@XmlJavaTypeAdapter(IfcConditionCriterionImplAdapter.class)
public interface IfcConditionCriterion extends IfcControl {
	/**
	 * Returns the value of the '<em><b>Criterion</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Criterion</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Criterion</em>' containment reference.
	 * @see #setCriterion(IfcConditionCriterionSelect)
	 * @see IFC2X3.IFC2X3Package#getIfcConditionCriterion_Criterion()
	 * @model containment="true" required="true"
	 * @generated
	 */
	IfcConditionCriterionSelect getCriterion();

	/**
	 * Sets the value of the '{@link IFC2X3.IfcConditionCriterion#getCriterion <em>Criterion</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Criterion</em>' containment reference.
	 * @see #getCriterion()
	 * @generated
	 */
	void setCriterion(IfcConditionCriterionSelect value);

	/**
	 * Returns the value of the '<em><b>Criterion Date Time</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Criterion Date Time</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Criterion Date Time</em>' reference.
	 * @see #setCriterionDateTime(IfcDateTimeSelect)
	 * @see IFC2X3.IFC2X3Package#getIfcConditionCriterion_CriterionDateTime()
	 * @model required="true"
	 * @generated
	 */
	IfcDateTimeSelect getCriterionDateTime();

	/**
	 * Sets the value of the '{@link IFC2X3.IfcConditionCriterion#getCriterionDateTime <em>Criterion Date Time</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Criterion Date Time</em>' reference.
	 * @see #getCriterionDateTime()
	 * @generated
	 */
	void setCriterionDateTime(IfcDateTimeSelect value);

} // IfcConditionCriterion
