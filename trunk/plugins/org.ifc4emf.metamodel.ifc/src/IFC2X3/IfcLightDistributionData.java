/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package IFC2X3;

import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;

import org.eclipse.emf.cdo.CDOObject;
import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

import IFC2X3.jaxb.IfcLightDistributionDataImplAdapter;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Ifc Light Distribution Data</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link IFC2X3.IfcLightDistributionData#getMainPlaneAngle <em>Main Plane Angle</em>}</li>
 *   <li>{@link IFC2X3.IfcLightDistributionData#getSecondaryPlaneAngle <em>Secondary Plane Angle</em>}</li>
 *   <li>{@link IFC2X3.IfcLightDistributionData#getLuminousIntensity <em>Luminous Intensity</em>}</li>
 * </ul>
 * </p>
 *
 * @see IFC2X3.IFC2X3Package#getIfcLightDistributionData()
 * @model
 * @extends CDOObject
 * @generated
 */
@XmlJavaTypeAdapter(IfcLightDistributionDataImplAdapter.class)
public interface IfcLightDistributionData extends CDOObject {
	/**
	 * Returns the value of the '<em><b>Luminous Intensity</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.Double}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Luminous Intensity</em>' attribute list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Luminous Intensity</em>' attribute list.
	 * @see IFC2X3.IFC2X3Package#getIfcLightDistributionData_LuminousIntensity()
	 * @model unique="false" dataType="IFC2X3.REAL" required="true"
	 * @generated
	 */
	EList<Double> getLuminousIntensity();

	/**
	 * Returns the value of the '<em><b>Secondary Plane Angle</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.Double}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Secondary Plane Angle</em>' attribute list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Secondary Plane Angle</em>' attribute list.
	 * @see IFC2X3.IFC2X3Package#getIfcLightDistributionData_SecondaryPlaneAngle()
	 * @model unique="false" dataType="IFC2X3.REAL" required="true"
	 * @generated
	 */
	EList<Double> getSecondaryPlaneAngle();

	/**
	 * Returns the value of the '<em><b>Main Plane Angle</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Main Plane Angle</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Main Plane Angle</em>' attribute.
	 * @see #isSetMainPlaneAngle()
	 * @see #unsetMainPlaneAngle()
	 * @see #setMainPlaneAngle(Double)
	 * @see IFC2X3.IFC2X3Package#getIfcLightDistributionData_MainPlaneAngle()
	 * @model unsettable="true" dataType="IFC2X3.REAL" required="true"
	 * @generated
	 */
	Double getMainPlaneAngle();

	/**
	 * Sets the value of the '{@link IFC2X3.IfcLightDistributionData#getMainPlaneAngle <em>Main Plane Angle</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Main Plane Angle</em>' attribute.
	 * @see #isSetMainPlaneAngle()
	 * @see #unsetMainPlaneAngle()
	 * @see #getMainPlaneAngle()
	 * @generated
	 */
	void setMainPlaneAngle(Double value);

	/**
	 * Unsets the value of the '{@link IFC2X3.IfcLightDistributionData#getMainPlaneAngle <em>Main Plane Angle</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetMainPlaneAngle()
	 * @see #getMainPlaneAngle()
	 * @see #setMainPlaneAngle(Double)
	 * @generated
	 */
	void unsetMainPlaneAngle();

	/**
	 * Returns whether the value of the '{@link IFC2X3.IfcLightDistributionData#getMainPlaneAngle <em>Main Plane Angle</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Main Plane Angle</em>' attribute is set.
	 * @see #unsetMainPlaneAngle()
	 * @see #getMainPlaneAngle()
	 * @see #setMainPlaneAngle(Double)
	 * @generated
	 */
	boolean isSetMainPlaneAngle();

} // IfcLightDistributionData
