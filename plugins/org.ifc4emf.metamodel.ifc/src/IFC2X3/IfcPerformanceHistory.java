/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package IFC2X3;

import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;

import IFC2X3.jaxb.IfcPerformanceHistoryImplAdapter;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Ifc Performance History</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link IFC2X3.IfcPerformanceHistory#getLifeCyclePhase <em>Life Cycle Phase</em>}</li>
 * </ul>
 * </p>
 *
 * @see IFC2X3.IFC2X3Package#getIfcPerformanceHistory()
 * @model
 * @generated
 */
@XmlJavaTypeAdapter(IfcPerformanceHistoryImplAdapter.class)
public interface IfcPerformanceHistory extends IfcControl {
	/**
	 * Returns the value of the '<em><b>Life Cycle Phase</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Life Cycle Phase</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Life Cycle Phase</em>' attribute.
	 * @see #isSetLifeCyclePhase()
	 * @see #unsetLifeCyclePhase()
	 * @see #setLifeCyclePhase(String)
	 * @see IFC2X3.IFC2X3Package#getIfcPerformanceHistory_LifeCyclePhase()
	 * @model unsettable="true" dataType="IFC2X3.STRING" required="true"
	 * @generated
	 */
	String getLifeCyclePhase();

	/**
	 * Sets the value of the '{@link IFC2X3.IfcPerformanceHistory#getLifeCyclePhase <em>Life Cycle Phase</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Life Cycle Phase</em>' attribute.
	 * @see #isSetLifeCyclePhase()
	 * @see #unsetLifeCyclePhase()
	 * @see #getLifeCyclePhase()
	 * @generated
	 */
	void setLifeCyclePhase(String value);

	/**
	 * Unsets the value of the '{@link IFC2X3.IfcPerformanceHistory#getLifeCyclePhase <em>Life Cycle Phase</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetLifeCyclePhase()
	 * @see #getLifeCyclePhase()
	 * @see #setLifeCyclePhase(String)
	 * @generated
	 */
	void unsetLifeCyclePhase();

	/**
	 * Returns whether the value of the '{@link IFC2X3.IfcPerformanceHistory#getLifeCyclePhase <em>Life Cycle Phase</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Life Cycle Phase</em>' attribute is set.
	 * @see #unsetLifeCyclePhase()
	 * @see #getLifeCyclePhase()
	 * @see #setLifeCyclePhase(String)
	 * @generated
	 */
	boolean isSetLifeCyclePhase();

} // IfcPerformanceHistory
