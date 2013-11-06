/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package IFC2X3;

import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;

import org.eclipse.emf.common.util.EList;

import IFC2X3.jaxb.IfcLightIntensityDistributionImplAdapter;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Ifc Light Intensity Distribution</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link IFC2X3.IfcLightIntensityDistribution#getLightDistributionCurve <em>Light Distribution Curve</em>}</li>
 *   <li>{@link IFC2X3.IfcLightIntensityDistribution#getDistributionData <em>Distribution Data</em>}</li>
 * </ul>
 * </p>
 *
 * @see IFC2X3.IFC2X3Package#getIfcLightIntensityDistribution()
 * @model
 * @generated
 */
@XmlJavaTypeAdapter(IfcLightIntensityDistributionImplAdapter.class)
public interface IfcLightIntensityDistribution extends IfcLightDistributionDataSourceSelect {
	/**
	 * Returns the value of the '<em><b>Distribution Data</b></em>' reference list.
	 * The list contents are of type {@link IFC2X3.IfcLightDistributionData}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Distribution Data</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Distribution Data</em>' reference list.
	 * @see IFC2X3.IFC2X3Package#getIfcLightIntensityDistribution_DistributionData()
	 * @model required="true"
	 * @generated
	 */
	EList<IfcLightDistributionData> getDistributionData();

	/**
	 * Returns the value of the '<em><b>Light Distribution Curve</b></em>' attribute.
	 * The literals are from the enumeration {@link IFC2X3.IfcLightDistributionCurveEnum}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Light Distribution Curve</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Light Distribution Curve</em>' attribute.
	 * @see IFC2X3.IfcLightDistributionCurveEnum
	 * @see #isSetLightDistributionCurve()
	 * @see #unsetLightDistributionCurve()
	 * @see #setLightDistributionCurve(IfcLightDistributionCurveEnum)
	 * @see IFC2X3.IFC2X3Package#getIfcLightIntensityDistribution_LightDistributionCurve()
	 * @model unsettable="true" required="true"
	 * @generated
	 */
	IfcLightDistributionCurveEnum getLightDistributionCurve();

	/**
	 * Sets the value of the '{@link IFC2X3.IfcLightIntensityDistribution#getLightDistributionCurve <em>Light Distribution Curve</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Light Distribution Curve</em>' attribute.
	 * @see IFC2X3.IfcLightDistributionCurveEnum
	 * @see #isSetLightDistributionCurve()
	 * @see #unsetLightDistributionCurve()
	 * @see #getLightDistributionCurve()
	 * @generated
	 */
	void setLightDistributionCurve(IfcLightDistributionCurveEnum value);

	/**
	 * Unsets the value of the '{@link IFC2X3.IfcLightIntensityDistribution#getLightDistributionCurve <em>Light Distribution Curve</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetLightDistributionCurve()
	 * @see #getLightDistributionCurve()
	 * @see #setLightDistributionCurve(IfcLightDistributionCurveEnum)
	 * @generated
	 */
	void unsetLightDistributionCurve();

	/**
	 * Returns whether the value of the '{@link IFC2X3.IfcLightIntensityDistribution#getLightDistributionCurve <em>Light Distribution Curve</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Light Distribution Curve</em>' attribute is set.
	 * @see #unsetLightDistributionCurve()
	 * @see #getLightDistributionCurve()
	 * @see #setLightDistributionCurve(IfcLightDistributionCurveEnum)
	 * @generated
	 */
	boolean isSetLightDistributionCurve();

} // IfcLightIntensityDistribution
