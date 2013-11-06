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

import IFC2X3.jaxb.IfcReinforcementBarPropertiesImplAdapter;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Ifc Reinforcement Bar Properties</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link IFC2X3.IfcReinforcementBarProperties#getTotalCrossSectionArea <em>Total Cross Section Area</em>}</li>
 *   <li>{@link IFC2X3.IfcReinforcementBarProperties#getSteelGrade <em>Steel Grade</em>}</li>
 *   <li>{@link IFC2X3.IfcReinforcementBarProperties#getBarSurface <em>Bar Surface</em>}</li>
 *   <li>{@link IFC2X3.IfcReinforcementBarProperties#getEffectiveDepth <em>Effective Depth</em>}</li>
 *   <li>{@link IFC2X3.IfcReinforcementBarProperties#getNominalBarDiameter <em>Nominal Bar Diameter</em>}</li>
 *   <li>{@link IFC2X3.IfcReinforcementBarProperties#getBarCount <em>Bar Count</em>}</li>
 * </ul>
 * </p>
 *
 * @see IFC2X3.IFC2X3Package#getIfcReinforcementBarProperties()
 * @model
 * @extends CDOObject
 * @generated
 */
@XmlJavaTypeAdapter(IfcReinforcementBarPropertiesImplAdapter.class)
public interface IfcReinforcementBarProperties extends CDOObject {
	/**
	 * Returns the value of the '<em><b>Bar Count</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Bar Count</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Bar Count</em>' attribute.
	 * @see #isSetBarCount()
	 * @see #unsetBarCount()
	 * @see #setBarCount(Double)
	 * @see IFC2X3.IFC2X3Package#getIfcReinforcementBarProperties_BarCount()
	 * @model unsettable="true" dataType="IFC2X3.NUMBER"
	 * @generated
	 */
	Double getBarCount();

	/**
	 * Sets the value of the '{@link IFC2X3.IfcReinforcementBarProperties#getBarCount <em>Bar Count</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Bar Count</em>' attribute.
	 * @see #isSetBarCount()
	 * @see #unsetBarCount()
	 * @see #getBarCount()
	 * @generated
	 */
	void setBarCount(Double value);

	/**
	 * Unsets the value of the '{@link IFC2X3.IfcReinforcementBarProperties#getBarCount <em>Bar Count</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetBarCount()
	 * @see #getBarCount()
	 * @see #setBarCount(Double)
	 * @generated
	 */
	void unsetBarCount();

	/**
	 * Returns whether the value of the '{@link IFC2X3.IfcReinforcementBarProperties#getBarCount <em>Bar Count</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Bar Count</em>' attribute is set.
	 * @see #unsetBarCount()
	 * @see #getBarCount()
	 * @see #setBarCount(Double)
	 * @generated
	 */
	boolean isSetBarCount();

	/**
	 * Returns the value of the '<em><b>Nominal Bar Diameter</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Nominal Bar Diameter</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Nominal Bar Diameter</em>' attribute.
	 * @see #isSetNominalBarDiameter()
	 * @see #unsetNominalBarDiameter()
	 * @see #setNominalBarDiameter(Double)
	 * @see IFC2X3.IFC2X3Package#getIfcReinforcementBarProperties_NominalBarDiameter()
	 * @model unsettable="true" dataType="IFC2X3.REAL"
	 * @generated
	 */
	Double getNominalBarDiameter();

	/**
	 * Sets the value of the '{@link IFC2X3.IfcReinforcementBarProperties#getNominalBarDiameter <em>Nominal Bar Diameter</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Nominal Bar Diameter</em>' attribute.
	 * @see #isSetNominalBarDiameter()
	 * @see #unsetNominalBarDiameter()
	 * @see #getNominalBarDiameter()
	 * @generated
	 */
	void setNominalBarDiameter(Double value);

	/**
	 * Unsets the value of the '{@link IFC2X3.IfcReinforcementBarProperties#getNominalBarDiameter <em>Nominal Bar Diameter</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetNominalBarDiameter()
	 * @see #getNominalBarDiameter()
	 * @see #setNominalBarDiameter(Double)
	 * @generated
	 */
	void unsetNominalBarDiameter();

	/**
	 * Returns whether the value of the '{@link IFC2X3.IfcReinforcementBarProperties#getNominalBarDiameter <em>Nominal Bar Diameter</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Nominal Bar Diameter</em>' attribute is set.
	 * @see #unsetNominalBarDiameter()
	 * @see #getNominalBarDiameter()
	 * @see #setNominalBarDiameter(Double)
	 * @generated
	 */
	boolean isSetNominalBarDiameter();

	/**
	 * Returns the value of the '<em><b>Effective Depth</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Effective Depth</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Effective Depth</em>' attribute.
	 * @see #isSetEffectiveDepth()
	 * @see #unsetEffectiveDepth()
	 * @see #setEffectiveDepth(Double)
	 * @see IFC2X3.IFC2X3Package#getIfcReinforcementBarProperties_EffectiveDepth()
	 * @model unsettable="true" dataType="IFC2X3.REAL"
	 * @generated
	 */
	Double getEffectiveDepth();

	/**
	 * Sets the value of the '{@link IFC2X3.IfcReinforcementBarProperties#getEffectiveDepth <em>Effective Depth</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Effective Depth</em>' attribute.
	 * @see #isSetEffectiveDepth()
	 * @see #unsetEffectiveDepth()
	 * @see #getEffectiveDepth()
	 * @generated
	 */
	void setEffectiveDepth(Double value);

	/**
	 * Unsets the value of the '{@link IFC2X3.IfcReinforcementBarProperties#getEffectiveDepth <em>Effective Depth</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetEffectiveDepth()
	 * @see #getEffectiveDepth()
	 * @see #setEffectiveDepth(Double)
	 * @generated
	 */
	void unsetEffectiveDepth();

	/**
	 * Returns whether the value of the '{@link IFC2X3.IfcReinforcementBarProperties#getEffectiveDepth <em>Effective Depth</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Effective Depth</em>' attribute is set.
	 * @see #unsetEffectiveDepth()
	 * @see #getEffectiveDepth()
	 * @see #setEffectiveDepth(Double)
	 * @generated
	 */
	boolean isSetEffectiveDepth();

	/**
	 * Returns the value of the '<em><b>Bar Surface</b></em>' attribute.
	 * The literals are from the enumeration {@link IFC2X3.IfcReinforcingBarSurfaceEnum}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Bar Surface</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Bar Surface</em>' attribute.
	 * @see IFC2X3.IfcReinforcingBarSurfaceEnum
	 * @see #isSetBarSurface()
	 * @see #unsetBarSurface()
	 * @see #setBarSurface(IfcReinforcingBarSurfaceEnum)
	 * @see IFC2X3.IFC2X3Package#getIfcReinforcementBarProperties_BarSurface()
	 * @model unsettable="true"
	 * @generated
	 */
	IfcReinforcingBarSurfaceEnum getBarSurface();

	/**
	 * Sets the value of the '{@link IFC2X3.IfcReinforcementBarProperties#getBarSurface <em>Bar Surface</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Bar Surface</em>' attribute.
	 * @see IFC2X3.IfcReinforcingBarSurfaceEnum
	 * @see #isSetBarSurface()
	 * @see #unsetBarSurface()
	 * @see #getBarSurface()
	 * @generated
	 */
	void setBarSurface(IfcReinforcingBarSurfaceEnum value);

	/**
	 * Unsets the value of the '{@link IFC2X3.IfcReinforcementBarProperties#getBarSurface <em>Bar Surface</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetBarSurface()
	 * @see #getBarSurface()
	 * @see #setBarSurface(IfcReinforcingBarSurfaceEnum)
	 * @generated
	 */
	void unsetBarSurface();

	/**
	 * Returns whether the value of the '{@link IFC2X3.IfcReinforcementBarProperties#getBarSurface <em>Bar Surface</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Bar Surface</em>' attribute is set.
	 * @see #unsetBarSurface()
	 * @see #getBarSurface()
	 * @see #setBarSurface(IfcReinforcingBarSurfaceEnum)
	 * @generated
	 */
	boolean isSetBarSurface();

	/**
	 * Returns the value of the '<em><b>Steel Grade</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Steel Grade</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Steel Grade</em>' attribute.
	 * @see #isSetSteelGrade()
	 * @see #unsetSteelGrade()
	 * @see #setSteelGrade(String)
	 * @see IFC2X3.IFC2X3Package#getIfcReinforcementBarProperties_SteelGrade()
	 * @model unsettable="true" dataType="IFC2X3.STRING" required="true"
	 * @generated
	 */
	String getSteelGrade();

	/**
	 * Sets the value of the '{@link IFC2X3.IfcReinforcementBarProperties#getSteelGrade <em>Steel Grade</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Steel Grade</em>' attribute.
	 * @see #isSetSteelGrade()
	 * @see #unsetSteelGrade()
	 * @see #getSteelGrade()
	 * @generated
	 */
	void setSteelGrade(String value);

	/**
	 * Unsets the value of the '{@link IFC2X3.IfcReinforcementBarProperties#getSteelGrade <em>Steel Grade</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetSteelGrade()
	 * @see #getSteelGrade()
	 * @see #setSteelGrade(String)
	 * @generated
	 */
	void unsetSteelGrade();

	/**
	 * Returns whether the value of the '{@link IFC2X3.IfcReinforcementBarProperties#getSteelGrade <em>Steel Grade</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Steel Grade</em>' attribute is set.
	 * @see #unsetSteelGrade()
	 * @see #getSteelGrade()
	 * @see #setSteelGrade(String)
	 * @generated
	 */
	boolean isSetSteelGrade();

	/**
	 * Returns the value of the '<em><b>Total Cross Section Area</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Total Cross Section Area</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Total Cross Section Area</em>' attribute.
	 * @see #isSetTotalCrossSectionArea()
	 * @see #unsetTotalCrossSectionArea()
	 * @see #setTotalCrossSectionArea(Double)
	 * @see IFC2X3.IFC2X3Package#getIfcReinforcementBarProperties_TotalCrossSectionArea()
	 * @model unsettable="true" dataType="IFC2X3.REAL" required="true"
	 * @generated
	 */
	Double getTotalCrossSectionArea();

	/**
	 * Sets the value of the '{@link IFC2X3.IfcReinforcementBarProperties#getTotalCrossSectionArea <em>Total Cross Section Area</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Total Cross Section Area</em>' attribute.
	 * @see #isSetTotalCrossSectionArea()
	 * @see #unsetTotalCrossSectionArea()
	 * @see #getTotalCrossSectionArea()
	 * @generated
	 */
	void setTotalCrossSectionArea(Double value);

	/**
	 * Unsets the value of the '{@link IFC2X3.IfcReinforcementBarProperties#getTotalCrossSectionArea <em>Total Cross Section Area</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetTotalCrossSectionArea()
	 * @see #getTotalCrossSectionArea()
	 * @see #setTotalCrossSectionArea(Double)
	 * @generated
	 */
	void unsetTotalCrossSectionArea();

	/**
	 * Returns whether the value of the '{@link IFC2X3.IfcReinforcementBarProperties#getTotalCrossSectionArea <em>Total Cross Section Area</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Total Cross Section Area</em>' attribute is set.
	 * @see #unsetTotalCrossSectionArea()
	 * @see #getTotalCrossSectionArea()
	 * @see #setTotalCrossSectionArea(Double)
	 * @generated
	 */
	boolean isSetTotalCrossSectionArea();

} // IfcReinforcementBarProperties
