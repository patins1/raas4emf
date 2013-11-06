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
import IFC2X3.IfcTendon;
import IFC2X3.IfcTendonTypeEnum;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Ifc Tendon</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link IFC2X3.impl.IfcTendonImpl#getPredefinedType <em>Predefined Type</em>}</li>
 *   <li>{@link IFC2X3.impl.IfcTendonImpl#getNominalDiameter <em>Nominal Diameter</em>}</li>
 *   <li>{@link IFC2X3.impl.IfcTendonImpl#getCrossSectionArea <em>Cross Section Area</em>}</li>
 *   <li>{@link IFC2X3.impl.IfcTendonImpl#getTensionForce <em>Tension Force</em>}</li>
 *   <li>{@link IFC2X3.impl.IfcTendonImpl#getPreStress <em>Pre Stress</em>}</li>
 *   <li>{@link IFC2X3.impl.IfcTendonImpl#getFrictionCoefficient <em>Friction Coefficient</em>}</li>
 *   <li>{@link IFC2X3.impl.IfcTendonImpl#getAnchorageSlip <em>Anchorage Slip</em>}</li>
 *   <li>{@link IFC2X3.impl.IfcTendonImpl#getMinCurvatureRadius <em>Min Curvature Radius</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
@XmlType(name = "IfcTendon")
@XmlRootElement(name = "IfcTendonElement")
public class IfcTendonImpl extends IfcReinforcingElementImpl implements IfcTendon {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected IfcTendonImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return IFC2X3Package.eINSTANCE.getIfcTendon();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Double getMinCurvatureRadius() {
		return (Double)eGet(IFC2X3Package.eINSTANCE.getIfcTendon_MinCurvatureRadius(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMinCurvatureRadius(Double newMinCurvatureRadius) {
		eSet(IFC2X3Package.eINSTANCE.getIfcTendon_MinCurvatureRadius(), newMinCurvatureRadius);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetMinCurvatureRadius() {
		eUnset(IFC2X3Package.eINSTANCE.getIfcTendon_MinCurvatureRadius());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetMinCurvatureRadius() {
		return eIsSet(IFC2X3Package.eINSTANCE.getIfcTendon_MinCurvatureRadius());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Double getAnchorageSlip() {
		return (Double)eGet(IFC2X3Package.eINSTANCE.getIfcTendon_AnchorageSlip(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAnchorageSlip(Double newAnchorageSlip) {
		eSet(IFC2X3Package.eINSTANCE.getIfcTendon_AnchorageSlip(), newAnchorageSlip);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetAnchorageSlip() {
		eUnset(IFC2X3Package.eINSTANCE.getIfcTendon_AnchorageSlip());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetAnchorageSlip() {
		return eIsSet(IFC2X3Package.eINSTANCE.getIfcTendon_AnchorageSlip());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Double getFrictionCoefficient() {
		return (Double)eGet(IFC2X3Package.eINSTANCE.getIfcTendon_FrictionCoefficient(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFrictionCoefficient(Double newFrictionCoefficient) {
		eSet(IFC2X3Package.eINSTANCE.getIfcTendon_FrictionCoefficient(), newFrictionCoefficient);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetFrictionCoefficient() {
		eUnset(IFC2X3Package.eINSTANCE.getIfcTendon_FrictionCoefficient());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetFrictionCoefficient() {
		return eIsSet(IFC2X3Package.eINSTANCE.getIfcTendon_FrictionCoefficient());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Double getPreStress() {
		return (Double)eGet(IFC2X3Package.eINSTANCE.getIfcTendon_PreStress(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPreStress(Double newPreStress) {
		eSet(IFC2X3Package.eINSTANCE.getIfcTendon_PreStress(), newPreStress);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetPreStress() {
		eUnset(IFC2X3Package.eINSTANCE.getIfcTendon_PreStress());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetPreStress() {
		return eIsSet(IFC2X3Package.eINSTANCE.getIfcTendon_PreStress());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Double getTensionForce() {
		return (Double)eGet(IFC2X3Package.eINSTANCE.getIfcTendon_TensionForce(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTensionForce(Double newTensionForce) {
		eSet(IFC2X3Package.eINSTANCE.getIfcTendon_TensionForce(), newTensionForce);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetTensionForce() {
		eUnset(IFC2X3Package.eINSTANCE.getIfcTendon_TensionForce());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetTensionForce() {
		return eIsSet(IFC2X3Package.eINSTANCE.getIfcTendon_TensionForce());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Double getCrossSectionArea() {
		return (Double)eGet(IFC2X3Package.eINSTANCE.getIfcTendon_CrossSectionArea(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCrossSectionArea(Double newCrossSectionArea) {
		eSet(IFC2X3Package.eINSTANCE.getIfcTendon_CrossSectionArea(), newCrossSectionArea);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetCrossSectionArea() {
		eUnset(IFC2X3Package.eINSTANCE.getIfcTendon_CrossSectionArea());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetCrossSectionArea() {
		return eIsSet(IFC2X3Package.eINSTANCE.getIfcTendon_CrossSectionArea());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Double getNominalDiameter() {
		return (Double)eGet(IFC2X3Package.eINSTANCE.getIfcTendon_NominalDiameter(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNominalDiameter(Double newNominalDiameter) {
		eSet(IFC2X3Package.eINSTANCE.getIfcTendon_NominalDiameter(), newNominalDiameter);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetNominalDiameter() {
		eUnset(IFC2X3Package.eINSTANCE.getIfcTendon_NominalDiameter());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetNominalDiameter() {
		return eIsSet(IFC2X3Package.eINSTANCE.getIfcTendon_NominalDiameter());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcTendonTypeEnum getPredefinedType() {
		return (IfcTendonTypeEnum)eGet(IFC2X3Package.eINSTANCE.getIfcTendon_PredefinedType(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPredefinedType(IfcTendonTypeEnum newPredefinedType) {
		eSet(IFC2X3Package.eINSTANCE.getIfcTendon_PredefinedType(), newPredefinedType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetPredefinedType() {
		eUnset(IFC2X3Package.eINSTANCE.getIfcTendon_PredefinedType());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetPredefinedType() {
		return eIsSet(IFC2X3Package.eINSTANCE.getIfcTendon_PredefinedType());
	}

} //IfcTendonImpl
