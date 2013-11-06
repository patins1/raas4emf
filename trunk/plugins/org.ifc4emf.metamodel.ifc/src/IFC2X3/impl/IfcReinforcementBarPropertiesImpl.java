/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package IFC2X3.impl;

import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

import IFC2X3.IFC2X3Package;
import IFC2X3.IfcReinforcementBarProperties;
import IFC2X3.IfcReinforcingBarSurfaceEnum;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.internal.cdo.CDOObjectImpl;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Ifc Reinforcement Bar Properties</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link IFC2X3.impl.IfcReinforcementBarPropertiesImpl#getTotalCrossSectionArea <em>Total Cross Section Area</em>}</li>
 *   <li>{@link IFC2X3.impl.IfcReinforcementBarPropertiesImpl#getSteelGrade <em>Steel Grade</em>}</li>
 *   <li>{@link IFC2X3.impl.IfcReinforcementBarPropertiesImpl#getBarSurface <em>Bar Surface</em>}</li>
 *   <li>{@link IFC2X3.impl.IfcReinforcementBarPropertiesImpl#getEffectiveDepth <em>Effective Depth</em>}</li>
 *   <li>{@link IFC2X3.impl.IfcReinforcementBarPropertiesImpl#getNominalBarDiameter <em>Nominal Bar Diameter</em>}</li>
 *   <li>{@link IFC2X3.impl.IfcReinforcementBarPropertiesImpl#getBarCount <em>Bar Count</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
@XmlType(name = "IfcReinforcementBarProperties")
@XmlRootElement(name = "IfcReinforcementBarPropertiesElement")
public class IfcReinforcementBarPropertiesImpl extends CDOObjectImpl implements IfcReinforcementBarProperties {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected IfcReinforcementBarPropertiesImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return IFC2X3Package.eINSTANCE.getIfcReinforcementBarProperties();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected int eStaticFeatureCount() {
		return 0;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Double getBarCount() {
		return (Double)eGet(IFC2X3Package.eINSTANCE.getIfcReinforcementBarProperties_BarCount(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBarCount(Double newBarCount) {
		eSet(IFC2X3Package.eINSTANCE.getIfcReinforcementBarProperties_BarCount(), newBarCount);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetBarCount() {
		eUnset(IFC2X3Package.eINSTANCE.getIfcReinforcementBarProperties_BarCount());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetBarCount() {
		return eIsSet(IFC2X3Package.eINSTANCE.getIfcReinforcementBarProperties_BarCount());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Double getNominalBarDiameter() {
		return (Double)eGet(IFC2X3Package.eINSTANCE.getIfcReinforcementBarProperties_NominalBarDiameter(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNominalBarDiameter(Double newNominalBarDiameter) {
		eSet(IFC2X3Package.eINSTANCE.getIfcReinforcementBarProperties_NominalBarDiameter(), newNominalBarDiameter);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetNominalBarDiameter() {
		eUnset(IFC2X3Package.eINSTANCE.getIfcReinforcementBarProperties_NominalBarDiameter());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetNominalBarDiameter() {
		return eIsSet(IFC2X3Package.eINSTANCE.getIfcReinforcementBarProperties_NominalBarDiameter());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Double getEffectiveDepth() {
		return (Double)eGet(IFC2X3Package.eINSTANCE.getIfcReinforcementBarProperties_EffectiveDepth(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEffectiveDepth(Double newEffectiveDepth) {
		eSet(IFC2X3Package.eINSTANCE.getIfcReinforcementBarProperties_EffectiveDepth(), newEffectiveDepth);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetEffectiveDepth() {
		eUnset(IFC2X3Package.eINSTANCE.getIfcReinforcementBarProperties_EffectiveDepth());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetEffectiveDepth() {
		return eIsSet(IFC2X3Package.eINSTANCE.getIfcReinforcementBarProperties_EffectiveDepth());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcReinforcingBarSurfaceEnum getBarSurface() {
		return (IfcReinforcingBarSurfaceEnum)eGet(IFC2X3Package.eINSTANCE.getIfcReinforcementBarProperties_BarSurface(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBarSurface(IfcReinforcingBarSurfaceEnum newBarSurface) {
		eSet(IFC2X3Package.eINSTANCE.getIfcReinforcementBarProperties_BarSurface(), newBarSurface);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetBarSurface() {
		eUnset(IFC2X3Package.eINSTANCE.getIfcReinforcementBarProperties_BarSurface());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetBarSurface() {
		return eIsSet(IFC2X3Package.eINSTANCE.getIfcReinforcementBarProperties_BarSurface());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getSteelGrade() {
		return (String)eGet(IFC2X3Package.eINSTANCE.getIfcReinforcementBarProperties_SteelGrade(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSteelGrade(String newSteelGrade) {
		eSet(IFC2X3Package.eINSTANCE.getIfcReinforcementBarProperties_SteelGrade(), newSteelGrade);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetSteelGrade() {
		eUnset(IFC2X3Package.eINSTANCE.getIfcReinforcementBarProperties_SteelGrade());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetSteelGrade() {
		return eIsSet(IFC2X3Package.eINSTANCE.getIfcReinforcementBarProperties_SteelGrade());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Double getTotalCrossSectionArea() {
		return (Double)eGet(IFC2X3Package.eINSTANCE.getIfcReinforcementBarProperties_TotalCrossSectionArea(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTotalCrossSectionArea(Double newTotalCrossSectionArea) {
		eSet(IFC2X3Package.eINSTANCE.getIfcReinforcementBarProperties_TotalCrossSectionArea(), newTotalCrossSectionArea);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetTotalCrossSectionArea() {
		eUnset(IFC2X3Package.eINSTANCE.getIfcReinforcementBarProperties_TotalCrossSectionArea());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetTotalCrossSectionArea() {
		return eIsSet(IFC2X3Package.eINSTANCE.getIfcReinforcementBarProperties_TotalCrossSectionArea());
	}

} //IfcReinforcementBarPropertiesImpl
