/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package IFC2X3;

import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;

import org.eclipse.emf.cdo.CDOObject;
import org.eclipse.emf.ecore.EObject;

import IFC2X3.jaxb.IfcRelaxationImplAdapter;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Ifc Relaxation</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link IFC2X3.IfcRelaxation#getRelaxationValue <em>Relaxation Value</em>}</li>
 *   <li>{@link IFC2X3.IfcRelaxation#getInitialStress <em>Initial Stress</em>}</li>
 * </ul>
 * </p>
 *
 * @see IFC2X3.IFC2X3Package#getIfcRelaxation()
 * @model
 * @extends CDOObject
 * @generated
 */
@XmlJavaTypeAdapter(IfcRelaxationImplAdapter.class)
public interface IfcRelaxation extends CDOObject {
	/**
	 * Returns the value of the '<em><b>Initial Stress</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Initial Stress</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Initial Stress</em>' attribute.
	 * @see #isSetInitialStress()
	 * @see #unsetInitialStress()
	 * @see #setInitialStress(Double)
	 * @see IFC2X3.IFC2X3Package#getIfcRelaxation_InitialStress()
	 * @model unsettable="true" dataType="IFC2X3.REAL" required="true"
	 * @generated
	 */
	Double getInitialStress();

	/**
	 * Sets the value of the '{@link IFC2X3.IfcRelaxation#getInitialStress <em>Initial Stress</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Initial Stress</em>' attribute.
	 * @see #isSetInitialStress()
	 * @see #unsetInitialStress()
	 * @see #getInitialStress()
	 * @generated
	 */
	void setInitialStress(Double value);

	/**
	 * Unsets the value of the '{@link IFC2X3.IfcRelaxation#getInitialStress <em>Initial Stress</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetInitialStress()
	 * @see #getInitialStress()
	 * @see #setInitialStress(Double)
	 * @generated
	 */
	void unsetInitialStress();

	/**
	 * Returns whether the value of the '{@link IFC2X3.IfcRelaxation#getInitialStress <em>Initial Stress</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Initial Stress</em>' attribute is set.
	 * @see #unsetInitialStress()
	 * @see #getInitialStress()
	 * @see #setInitialStress(Double)
	 * @generated
	 */
	boolean isSetInitialStress();

	/**
	 * Returns the value of the '<em><b>Relaxation Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Relaxation Value</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Relaxation Value</em>' attribute.
	 * @see #isSetRelaxationValue()
	 * @see #unsetRelaxationValue()
	 * @see #setRelaxationValue(Double)
	 * @see IFC2X3.IFC2X3Package#getIfcRelaxation_RelaxationValue()
	 * @model unsettable="true" dataType="IFC2X3.REAL" required="true"
	 * @generated
	 */
	Double getRelaxationValue();

	/**
	 * Sets the value of the '{@link IFC2X3.IfcRelaxation#getRelaxationValue <em>Relaxation Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Relaxation Value</em>' attribute.
	 * @see #isSetRelaxationValue()
	 * @see #unsetRelaxationValue()
	 * @see #getRelaxationValue()
	 * @generated
	 */
	void setRelaxationValue(Double value);

	/**
	 * Unsets the value of the '{@link IFC2X3.IfcRelaxation#getRelaxationValue <em>Relaxation Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetRelaxationValue()
	 * @see #getRelaxationValue()
	 * @see #setRelaxationValue(Double)
	 * @generated
	 */
	void unsetRelaxationValue();

	/**
	 * Returns whether the value of the '{@link IFC2X3.IfcRelaxation#getRelaxationValue <em>Relaxation Value</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Relaxation Value</em>' attribute is set.
	 * @see #unsetRelaxationValue()
	 * @see #getRelaxationValue()
	 * @see #setRelaxationValue(Double)
	 * @generated
	 */
	boolean isSetRelaxationValue();

} // IfcRelaxation
