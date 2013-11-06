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

import IFC2X3.jaxb.IfcMeasureWithUnitImplAdapter;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Ifc Measure With Unit</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link IFC2X3.IfcMeasureWithUnit#getValueComponent <em>Value Component</em>}</li>
 *   <li>{@link IFC2X3.IfcMeasureWithUnit#getUnitComponent <em>Unit Component</em>}</li>
 * </ul>
 * </p>
 *
 * @see IFC2X3.IFC2X3Package#getIfcMeasureWithUnit()
 * @model
 * @extends CDOObject
 * @generated
 */
@XmlJavaTypeAdapter(IfcMeasureWithUnitImplAdapter.class)
public interface IfcMeasureWithUnit extends CDOObject {
	/**
	 * Returns the value of the '<em><b>Value Component</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Value Component</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Value Component</em>' containment reference.
	 * @see #setValueComponent(IfcValue)
	 * @see IFC2X3.IFC2X3Package#getIfcMeasureWithUnit_ValueComponent()
	 * @model containment="true" required="true"
	 * @generated
	 */
	IfcValue getValueComponent();

	/**
	 * Sets the value of the '{@link IFC2X3.IfcMeasureWithUnit#getValueComponent <em>Value Component</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Value Component</em>' containment reference.
	 * @see #getValueComponent()
	 * @generated
	 */
	void setValueComponent(IfcValue value);

	/**
	 * Returns the value of the '<em><b>Unit Component</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Unit Component</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Unit Component</em>' reference.
	 * @see #setUnitComponent(IfcUnit)
	 * @see IFC2X3.IFC2X3Package#getIfcMeasureWithUnit_UnitComponent()
	 * @model required="true"
	 * @generated
	 */
	IfcUnit getUnitComponent();

	/**
	 * Sets the value of the '{@link IFC2X3.IfcMeasureWithUnit#getUnitComponent <em>Unit Component</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Unit Component</em>' reference.
	 * @see #getUnitComponent()
	 * @generated
	 */
	void setUnitComponent(IfcUnit value);

} // IfcMeasureWithUnit
