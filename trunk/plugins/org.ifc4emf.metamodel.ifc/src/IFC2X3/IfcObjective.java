/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package IFC2X3;

import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;

import IFC2X3.jaxb.IfcObjectiveImplAdapter;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Ifc Objective</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link IFC2X3.IfcObjective#getBenchmarkValues <em>Benchmark Values</em>}</li>
 *   <li>{@link IFC2X3.IfcObjective#getResultValues <em>Result Values</em>}</li>
 *   <li>{@link IFC2X3.IfcObjective#getObjectiveQualifier <em>Objective Qualifier</em>}</li>
 *   <li>{@link IFC2X3.IfcObjective#getUserDefinedQualifier <em>User Defined Qualifier</em>}</li>
 * </ul>
 * </p>
 *
 * @see IFC2X3.IFC2X3Package#getIfcObjective()
 * @model
 * @generated
 */
@XmlJavaTypeAdapter(IfcObjectiveImplAdapter.class)
public interface IfcObjective extends IfcConstraint {
	/**
	 * Returns the value of the '<em><b>Benchmark Values</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Benchmark Values</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Benchmark Values</em>' reference.
	 * @see #setBenchmarkValues(IfcMetric)
	 * @see IFC2X3.IFC2X3Package#getIfcObjective_BenchmarkValues()
	 * @model
	 * @generated
	 */
	IfcMetric getBenchmarkValues();

	/**
	 * Sets the value of the '{@link IFC2X3.IfcObjective#getBenchmarkValues <em>Benchmark Values</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Benchmark Values</em>' reference.
	 * @see #getBenchmarkValues()
	 * @generated
	 */
	void setBenchmarkValues(IfcMetric value);

	/**
	 * Returns the value of the '<em><b>Result Values</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Result Values</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Result Values</em>' reference.
	 * @see #setResultValues(IfcMetric)
	 * @see IFC2X3.IFC2X3Package#getIfcObjective_ResultValues()
	 * @model
	 * @generated
	 */
	IfcMetric getResultValues();

	/**
	 * Sets the value of the '{@link IFC2X3.IfcObjective#getResultValues <em>Result Values</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Result Values</em>' reference.
	 * @see #getResultValues()
	 * @generated
	 */
	void setResultValues(IfcMetric value);

	/**
	 * Returns the value of the '<em><b>User Defined Qualifier</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>User Defined Qualifier</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>User Defined Qualifier</em>' attribute.
	 * @see #isSetUserDefinedQualifier()
	 * @see #unsetUserDefinedQualifier()
	 * @see #setUserDefinedQualifier(String)
	 * @see IFC2X3.IFC2X3Package#getIfcObjective_UserDefinedQualifier()
	 * @model unsettable="true" dataType="IFC2X3.STRING"
	 * @generated
	 */
	String getUserDefinedQualifier();

	/**
	 * Sets the value of the '{@link IFC2X3.IfcObjective#getUserDefinedQualifier <em>User Defined Qualifier</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>User Defined Qualifier</em>' attribute.
	 * @see #isSetUserDefinedQualifier()
	 * @see #unsetUserDefinedQualifier()
	 * @see #getUserDefinedQualifier()
	 * @generated
	 */
	void setUserDefinedQualifier(String value);

	/**
	 * Unsets the value of the '{@link IFC2X3.IfcObjective#getUserDefinedQualifier <em>User Defined Qualifier</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetUserDefinedQualifier()
	 * @see #getUserDefinedQualifier()
	 * @see #setUserDefinedQualifier(String)
	 * @generated
	 */
	void unsetUserDefinedQualifier();

	/**
	 * Returns whether the value of the '{@link IFC2X3.IfcObjective#getUserDefinedQualifier <em>User Defined Qualifier</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>User Defined Qualifier</em>' attribute is set.
	 * @see #unsetUserDefinedQualifier()
	 * @see #getUserDefinedQualifier()
	 * @see #setUserDefinedQualifier(String)
	 * @generated
	 */
	boolean isSetUserDefinedQualifier();

	/**
	 * Returns the value of the '<em><b>Objective Qualifier</b></em>' attribute.
	 * The literals are from the enumeration {@link IFC2X3.IfcObjectiveEnum}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Objective Qualifier</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Objective Qualifier</em>' attribute.
	 * @see IFC2X3.IfcObjectiveEnum
	 * @see #isSetObjectiveQualifier()
	 * @see #unsetObjectiveQualifier()
	 * @see #setObjectiveQualifier(IfcObjectiveEnum)
	 * @see IFC2X3.IFC2X3Package#getIfcObjective_ObjectiveQualifier()
	 * @model unsettable="true" required="true"
	 * @generated
	 */
	IfcObjectiveEnum getObjectiveQualifier();

	/**
	 * Sets the value of the '{@link IFC2X3.IfcObjective#getObjectiveQualifier <em>Objective Qualifier</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Objective Qualifier</em>' attribute.
	 * @see IFC2X3.IfcObjectiveEnum
	 * @see #isSetObjectiveQualifier()
	 * @see #unsetObjectiveQualifier()
	 * @see #getObjectiveQualifier()
	 * @generated
	 */
	void setObjectiveQualifier(IfcObjectiveEnum value);

	/**
	 * Unsets the value of the '{@link IFC2X3.IfcObjective#getObjectiveQualifier <em>Objective Qualifier</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetObjectiveQualifier()
	 * @see #getObjectiveQualifier()
	 * @see #setObjectiveQualifier(IfcObjectiveEnum)
	 * @generated
	 */
	void unsetObjectiveQualifier();

	/**
	 * Returns whether the value of the '{@link IFC2X3.IfcObjective#getObjectiveQualifier <em>Objective Qualifier</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Objective Qualifier</em>' attribute is set.
	 * @see #unsetObjectiveQualifier()
	 * @see #getObjectiveQualifier()
	 * @see #setObjectiveQualifier(IfcObjectiveEnum)
	 * @generated
	 */
	boolean isSetObjectiveQualifier();

} // IfcObjective
