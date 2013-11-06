/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package IFC2X3;

import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;

import IFC2X3.jaxb.IfcTendonImplAdapter;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Ifc Tendon</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link IFC2X3.IfcTendon#getPredefinedType <em>Predefined Type</em>}</li>
 *   <li>{@link IFC2X3.IfcTendon#getNominalDiameter <em>Nominal Diameter</em>}</li>
 *   <li>{@link IFC2X3.IfcTendon#getCrossSectionArea <em>Cross Section Area</em>}</li>
 *   <li>{@link IFC2X3.IfcTendon#getTensionForce <em>Tension Force</em>}</li>
 *   <li>{@link IFC2X3.IfcTendon#getPreStress <em>Pre Stress</em>}</li>
 *   <li>{@link IFC2X3.IfcTendon#getFrictionCoefficient <em>Friction Coefficient</em>}</li>
 *   <li>{@link IFC2X3.IfcTendon#getAnchorageSlip <em>Anchorage Slip</em>}</li>
 *   <li>{@link IFC2X3.IfcTendon#getMinCurvatureRadius <em>Min Curvature Radius</em>}</li>
 * </ul>
 * </p>
 *
 * @see IFC2X3.IFC2X3Package#getIfcTendon()
 * @model
 * @generated
 */
@XmlJavaTypeAdapter(IfcTendonImplAdapter.class)
public interface IfcTendon extends IfcReinforcingElement {
	/**
	 * Returns the value of the '<em><b>Min Curvature Radius</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Min Curvature Radius</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Min Curvature Radius</em>' attribute.
	 * @see #isSetMinCurvatureRadius()
	 * @see #unsetMinCurvatureRadius()
	 * @see #setMinCurvatureRadius(Double)
	 * @see IFC2X3.IFC2X3Package#getIfcTendon_MinCurvatureRadius()
	 * @model unsettable="true" dataType="IFC2X3.REAL"
	 * @generated
	 */
	Double getMinCurvatureRadius();

	/**
	 * Sets the value of the '{@link IFC2X3.IfcTendon#getMinCurvatureRadius <em>Min Curvature Radius</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Min Curvature Radius</em>' attribute.
	 * @see #isSetMinCurvatureRadius()
	 * @see #unsetMinCurvatureRadius()
	 * @see #getMinCurvatureRadius()
	 * @generated
	 */
	void setMinCurvatureRadius(Double value);

	/**
	 * Unsets the value of the '{@link IFC2X3.IfcTendon#getMinCurvatureRadius <em>Min Curvature Radius</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetMinCurvatureRadius()
	 * @see #getMinCurvatureRadius()
	 * @see #setMinCurvatureRadius(Double)
	 * @generated
	 */
	void unsetMinCurvatureRadius();

	/**
	 * Returns whether the value of the '{@link IFC2X3.IfcTendon#getMinCurvatureRadius <em>Min Curvature Radius</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Min Curvature Radius</em>' attribute is set.
	 * @see #unsetMinCurvatureRadius()
	 * @see #getMinCurvatureRadius()
	 * @see #setMinCurvatureRadius(Double)
	 * @generated
	 */
	boolean isSetMinCurvatureRadius();

	/**
	 * Returns the value of the '<em><b>Anchorage Slip</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Anchorage Slip</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Anchorage Slip</em>' attribute.
	 * @see #isSetAnchorageSlip()
	 * @see #unsetAnchorageSlip()
	 * @see #setAnchorageSlip(Double)
	 * @see IFC2X3.IFC2X3Package#getIfcTendon_AnchorageSlip()
	 * @model unsettable="true" dataType="IFC2X3.REAL"
	 * @generated
	 */
	Double getAnchorageSlip();

	/**
	 * Sets the value of the '{@link IFC2X3.IfcTendon#getAnchorageSlip <em>Anchorage Slip</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Anchorage Slip</em>' attribute.
	 * @see #isSetAnchorageSlip()
	 * @see #unsetAnchorageSlip()
	 * @see #getAnchorageSlip()
	 * @generated
	 */
	void setAnchorageSlip(Double value);

	/**
	 * Unsets the value of the '{@link IFC2X3.IfcTendon#getAnchorageSlip <em>Anchorage Slip</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetAnchorageSlip()
	 * @see #getAnchorageSlip()
	 * @see #setAnchorageSlip(Double)
	 * @generated
	 */
	void unsetAnchorageSlip();

	/**
	 * Returns whether the value of the '{@link IFC2X3.IfcTendon#getAnchorageSlip <em>Anchorage Slip</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Anchorage Slip</em>' attribute is set.
	 * @see #unsetAnchorageSlip()
	 * @see #getAnchorageSlip()
	 * @see #setAnchorageSlip(Double)
	 * @generated
	 */
	boolean isSetAnchorageSlip();

	/**
	 * Returns the value of the '<em><b>Friction Coefficient</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Friction Coefficient</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Friction Coefficient</em>' attribute.
	 * @see #isSetFrictionCoefficient()
	 * @see #unsetFrictionCoefficient()
	 * @see #setFrictionCoefficient(Double)
	 * @see IFC2X3.IFC2X3Package#getIfcTendon_FrictionCoefficient()
	 * @model unsettable="true" dataType="IFC2X3.REAL"
	 * @generated
	 */
	Double getFrictionCoefficient();

	/**
	 * Sets the value of the '{@link IFC2X3.IfcTendon#getFrictionCoefficient <em>Friction Coefficient</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Friction Coefficient</em>' attribute.
	 * @see #isSetFrictionCoefficient()
	 * @see #unsetFrictionCoefficient()
	 * @see #getFrictionCoefficient()
	 * @generated
	 */
	void setFrictionCoefficient(Double value);

	/**
	 * Unsets the value of the '{@link IFC2X3.IfcTendon#getFrictionCoefficient <em>Friction Coefficient</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetFrictionCoefficient()
	 * @see #getFrictionCoefficient()
	 * @see #setFrictionCoefficient(Double)
	 * @generated
	 */
	void unsetFrictionCoefficient();

	/**
	 * Returns whether the value of the '{@link IFC2X3.IfcTendon#getFrictionCoefficient <em>Friction Coefficient</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Friction Coefficient</em>' attribute is set.
	 * @see #unsetFrictionCoefficient()
	 * @see #getFrictionCoefficient()
	 * @see #setFrictionCoefficient(Double)
	 * @generated
	 */
	boolean isSetFrictionCoefficient();

	/**
	 * Returns the value of the '<em><b>Pre Stress</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Pre Stress</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Pre Stress</em>' attribute.
	 * @see #isSetPreStress()
	 * @see #unsetPreStress()
	 * @see #setPreStress(Double)
	 * @see IFC2X3.IFC2X3Package#getIfcTendon_PreStress()
	 * @model unsettable="true" dataType="IFC2X3.REAL"
	 * @generated
	 */
	Double getPreStress();

	/**
	 * Sets the value of the '{@link IFC2X3.IfcTendon#getPreStress <em>Pre Stress</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Pre Stress</em>' attribute.
	 * @see #isSetPreStress()
	 * @see #unsetPreStress()
	 * @see #getPreStress()
	 * @generated
	 */
	void setPreStress(Double value);

	/**
	 * Unsets the value of the '{@link IFC2X3.IfcTendon#getPreStress <em>Pre Stress</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetPreStress()
	 * @see #getPreStress()
	 * @see #setPreStress(Double)
	 * @generated
	 */
	void unsetPreStress();

	/**
	 * Returns whether the value of the '{@link IFC2X3.IfcTendon#getPreStress <em>Pre Stress</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Pre Stress</em>' attribute is set.
	 * @see #unsetPreStress()
	 * @see #getPreStress()
	 * @see #setPreStress(Double)
	 * @generated
	 */
	boolean isSetPreStress();

	/**
	 * Returns the value of the '<em><b>Tension Force</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Tension Force</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Tension Force</em>' attribute.
	 * @see #isSetTensionForce()
	 * @see #unsetTensionForce()
	 * @see #setTensionForce(Double)
	 * @see IFC2X3.IFC2X3Package#getIfcTendon_TensionForce()
	 * @model unsettable="true" dataType="IFC2X3.REAL"
	 * @generated
	 */
	Double getTensionForce();

	/**
	 * Sets the value of the '{@link IFC2X3.IfcTendon#getTensionForce <em>Tension Force</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Tension Force</em>' attribute.
	 * @see #isSetTensionForce()
	 * @see #unsetTensionForce()
	 * @see #getTensionForce()
	 * @generated
	 */
	void setTensionForce(Double value);

	/**
	 * Unsets the value of the '{@link IFC2X3.IfcTendon#getTensionForce <em>Tension Force</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetTensionForce()
	 * @see #getTensionForce()
	 * @see #setTensionForce(Double)
	 * @generated
	 */
	void unsetTensionForce();

	/**
	 * Returns whether the value of the '{@link IFC2X3.IfcTendon#getTensionForce <em>Tension Force</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Tension Force</em>' attribute is set.
	 * @see #unsetTensionForce()
	 * @see #getTensionForce()
	 * @see #setTensionForce(Double)
	 * @generated
	 */
	boolean isSetTensionForce();

	/**
	 * Returns the value of the '<em><b>Cross Section Area</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Cross Section Area</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Cross Section Area</em>' attribute.
	 * @see #isSetCrossSectionArea()
	 * @see #unsetCrossSectionArea()
	 * @see #setCrossSectionArea(Double)
	 * @see IFC2X3.IFC2X3Package#getIfcTendon_CrossSectionArea()
	 * @model unsettable="true" dataType="IFC2X3.REAL" required="true"
	 * @generated
	 */
	Double getCrossSectionArea();

	/**
	 * Sets the value of the '{@link IFC2X3.IfcTendon#getCrossSectionArea <em>Cross Section Area</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Cross Section Area</em>' attribute.
	 * @see #isSetCrossSectionArea()
	 * @see #unsetCrossSectionArea()
	 * @see #getCrossSectionArea()
	 * @generated
	 */
	void setCrossSectionArea(Double value);

	/**
	 * Unsets the value of the '{@link IFC2X3.IfcTendon#getCrossSectionArea <em>Cross Section Area</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetCrossSectionArea()
	 * @see #getCrossSectionArea()
	 * @see #setCrossSectionArea(Double)
	 * @generated
	 */
	void unsetCrossSectionArea();

	/**
	 * Returns whether the value of the '{@link IFC2X3.IfcTendon#getCrossSectionArea <em>Cross Section Area</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Cross Section Area</em>' attribute is set.
	 * @see #unsetCrossSectionArea()
	 * @see #getCrossSectionArea()
	 * @see #setCrossSectionArea(Double)
	 * @generated
	 */
	boolean isSetCrossSectionArea();

	/**
	 * Returns the value of the '<em><b>Nominal Diameter</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Nominal Diameter</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Nominal Diameter</em>' attribute.
	 * @see #isSetNominalDiameter()
	 * @see #unsetNominalDiameter()
	 * @see #setNominalDiameter(Double)
	 * @see IFC2X3.IFC2X3Package#getIfcTendon_NominalDiameter()
	 * @model unsettable="true" dataType="IFC2X3.REAL" required="true"
	 * @generated
	 */
	Double getNominalDiameter();

	/**
	 * Sets the value of the '{@link IFC2X3.IfcTendon#getNominalDiameter <em>Nominal Diameter</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Nominal Diameter</em>' attribute.
	 * @see #isSetNominalDiameter()
	 * @see #unsetNominalDiameter()
	 * @see #getNominalDiameter()
	 * @generated
	 */
	void setNominalDiameter(Double value);

	/**
	 * Unsets the value of the '{@link IFC2X3.IfcTendon#getNominalDiameter <em>Nominal Diameter</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetNominalDiameter()
	 * @see #getNominalDiameter()
	 * @see #setNominalDiameter(Double)
	 * @generated
	 */
	void unsetNominalDiameter();

	/**
	 * Returns whether the value of the '{@link IFC2X3.IfcTendon#getNominalDiameter <em>Nominal Diameter</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Nominal Diameter</em>' attribute is set.
	 * @see #unsetNominalDiameter()
	 * @see #getNominalDiameter()
	 * @see #setNominalDiameter(Double)
	 * @generated
	 */
	boolean isSetNominalDiameter();

	/**
	 * Returns the value of the '<em><b>Predefined Type</b></em>' attribute.
	 * The literals are from the enumeration {@link IFC2X3.IfcTendonTypeEnum}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Predefined Type</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Predefined Type</em>' attribute.
	 * @see IFC2X3.IfcTendonTypeEnum
	 * @see #isSetPredefinedType()
	 * @see #unsetPredefinedType()
	 * @see #setPredefinedType(IfcTendonTypeEnum)
	 * @see IFC2X3.IFC2X3Package#getIfcTendon_PredefinedType()
	 * @model unsettable="true" required="true"
	 * @generated
	 */
	IfcTendonTypeEnum getPredefinedType();

	/**
	 * Sets the value of the '{@link IFC2X3.IfcTendon#getPredefinedType <em>Predefined Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Predefined Type</em>' attribute.
	 * @see IFC2X3.IfcTendonTypeEnum
	 * @see #isSetPredefinedType()
	 * @see #unsetPredefinedType()
	 * @see #getPredefinedType()
	 * @generated
	 */
	void setPredefinedType(IfcTendonTypeEnum value);

	/**
	 * Unsets the value of the '{@link IFC2X3.IfcTendon#getPredefinedType <em>Predefined Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetPredefinedType()
	 * @see #getPredefinedType()
	 * @see #setPredefinedType(IfcTendonTypeEnum)
	 * @generated
	 */
	void unsetPredefinedType();

	/**
	 * Returns whether the value of the '{@link IFC2X3.IfcTendon#getPredefinedType <em>Predefined Type</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Predefined Type</em>' attribute is set.
	 * @see #unsetPredefinedType()
	 * @see #getPredefinedType()
	 * @see #setPredefinedType(IfcTendonTypeEnum)
	 * @generated
	 */
	boolean isSetPredefinedType();

} // IfcTendon
