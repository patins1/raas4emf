/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package IFC2X3.impl;

import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;

import IFC2X3.IFC2X3Package;
import IFC2X3.IfcStructuralProfileProperties;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Ifc Structural Profile Properties</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link IFC2X3.impl.IfcStructuralProfilePropertiesImpl#getTorsionalConstantX <em>Torsional Constant X</em>}</li>
 *   <li>{@link IFC2X3.impl.IfcStructuralProfilePropertiesImpl#getMomentOfInertiaYZ <em>Moment Of Inertia YZ</em>}</li>
 *   <li>{@link IFC2X3.impl.IfcStructuralProfilePropertiesImpl#getMomentOfInertiaY <em>Moment Of Inertia Y</em>}</li>
 *   <li>{@link IFC2X3.impl.IfcStructuralProfilePropertiesImpl#getMomentOfInertiaZ <em>Moment Of Inertia Z</em>}</li>
 *   <li>{@link IFC2X3.impl.IfcStructuralProfilePropertiesImpl#getWarpingConstant <em>Warping Constant</em>}</li>
 *   <li>{@link IFC2X3.impl.IfcStructuralProfilePropertiesImpl#getShearCentreZ <em>Shear Centre Z</em>}</li>
 *   <li>{@link IFC2X3.impl.IfcStructuralProfilePropertiesImpl#getShearCentreY <em>Shear Centre Y</em>}</li>
 *   <li>{@link IFC2X3.impl.IfcStructuralProfilePropertiesImpl#getShearDeformationAreaZ <em>Shear Deformation Area Z</em>}</li>
 *   <li>{@link IFC2X3.impl.IfcStructuralProfilePropertiesImpl#getShearDeformationAreaY <em>Shear Deformation Area Y</em>}</li>
 *   <li>{@link IFC2X3.impl.IfcStructuralProfilePropertiesImpl#getMaximumSectionModulusY <em>Maximum Section Modulus Y</em>}</li>
 *   <li>{@link IFC2X3.impl.IfcStructuralProfilePropertiesImpl#getMinimumSectionModulusY <em>Minimum Section Modulus Y</em>}</li>
 *   <li>{@link IFC2X3.impl.IfcStructuralProfilePropertiesImpl#getMaximumSectionModulusZ <em>Maximum Section Modulus Z</em>}</li>
 *   <li>{@link IFC2X3.impl.IfcStructuralProfilePropertiesImpl#getMinimumSectionModulusZ <em>Minimum Section Modulus Z</em>}</li>
 *   <li>{@link IFC2X3.impl.IfcStructuralProfilePropertiesImpl#getTorsionalSectionModulus <em>Torsional Section Modulus</em>}</li>
 *   <li>{@link IFC2X3.impl.IfcStructuralProfilePropertiesImpl#getCentreOfGravityInX <em>Centre Of Gravity In X</em>}</li>
 *   <li>{@link IFC2X3.impl.IfcStructuralProfilePropertiesImpl#getCentreOfGravityInY <em>Centre Of Gravity In Y</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
@XmlType(name = "IfcStructuralProfileProperties")
@XmlSeeAlso({ IfcStructuralSteelProfilePropertiesImpl.class })
@XmlRootElement(name = "IfcStructuralProfilePropertiesElement")
public class IfcStructuralProfilePropertiesImpl extends IfcGeneralProfilePropertiesImpl implements IfcStructuralProfileProperties {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected IfcStructuralProfilePropertiesImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return IFC2X3Package.eINSTANCE.getIfcStructuralProfileProperties();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Double getCentreOfGravityInY() {
		return (Double)eGet(IFC2X3Package.eINSTANCE.getIfcStructuralProfileProperties_CentreOfGravityInY(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCentreOfGravityInY(Double newCentreOfGravityInY) {
		eSet(IFC2X3Package.eINSTANCE.getIfcStructuralProfileProperties_CentreOfGravityInY(), newCentreOfGravityInY);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetCentreOfGravityInY() {
		eUnset(IFC2X3Package.eINSTANCE.getIfcStructuralProfileProperties_CentreOfGravityInY());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetCentreOfGravityInY() {
		return eIsSet(IFC2X3Package.eINSTANCE.getIfcStructuralProfileProperties_CentreOfGravityInY());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Double getCentreOfGravityInX() {
		return (Double)eGet(IFC2X3Package.eINSTANCE.getIfcStructuralProfileProperties_CentreOfGravityInX(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCentreOfGravityInX(Double newCentreOfGravityInX) {
		eSet(IFC2X3Package.eINSTANCE.getIfcStructuralProfileProperties_CentreOfGravityInX(), newCentreOfGravityInX);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetCentreOfGravityInX() {
		eUnset(IFC2X3Package.eINSTANCE.getIfcStructuralProfileProperties_CentreOfGravityInX());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetCentreOfGravityInX() {
		return eIsSet(IFC2X3Package.eINSTANCE.getIfcStructuralProfileProperties_CentreOfGravityInX());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Double getTorsionalSectionModulus() {
		return (Double)eGet(IFC2X3Package.eINSTANCE.getIfcStructuralProfileProperties_TorsionalSectionModulus(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTorsionalSectionModulus(Double newTorsionalSectionModulus) {
		eSet(IFC2X3Package.eINSTANCE.getIfcStructuralProfileProperties_TorsionalSectionModulus(), newTorsionalSectionModulus);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetTorsionalSectionModulus() {
		eUnset(IFC2X3Package.eINSTANCE.getIfcStructuralProfileProperties_TorsionalSectionModulus());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetTorsionalSectionModulus() {
		return eIsSet(IFC2X3Package.eINSTANCE.getIfcStructuralProfileProperties_TorsionalSectionModulus());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Double getMinimumSectionModulusZ() {
		return (Double)eGet(IFC2X3Package.eINSTANCE.getIfcStructuralProfileProperties_MinimumSectionModulusZ(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMinimumSectionModulusZ(Double newMinimumSectionModulusZ) {
		eSet(IFC2X3Package.eINSTANCE.getIfcStructuralProfileProperties_MinimumSectionModulusZ(), newMinimumSectionModulusZ);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetMinimumSectionModulusZ() {
		eUnset(IFC2X3Package.eINSTANCE.getIfcStructuralProfileProperties_MinimumSectionModulusZ());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetMinimumSectionModulusZ() {
		return eIsSet(IFC2X3Package.eINSTANCE.getIfcStructuralProfileProperties_MinimumSectionModulusZ());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Double getMaximumSectionModulusZ() {
		return (Double)eGet(IFC2X3Package.eINSTANCE.getIfcStructuralProfileProperties_MaximumSectionModulusZ(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMaximumSectionModulusZ(Double newMaximumSectionModulusZ) {
		eSet(IFC2X3Package.eINSTANCE.getIfcStructuralProfileProperties_MaximumSectionModulusZ(), newMaximumSectionModulusZ);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetMaximumSectionModulusZ() {
		eUnset(IFC2X3Package.eINSTANCE.getIfcStructuralProfileProperties_MaximumSectionModulusZ());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetMaximumSectionModulusZ() {
		return eIsSet(IFC2X3Package.eINSTANCE.getIfcStructuralProfileProperties_MaximumSectionModulusZ());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Double getMinimumSectionModulusY() {
		return (Double)eGet(IFC2X3Package.eINSTANCE.getIfcStructuralProfileProperties_MinimumSectionModulusY(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMinimumSectionModulusY(Double newMinimumSectionModulusY) {
		eSet(IFC2X3Package.eINSTANCE.getIfcStructuralProfileProperties_MinimumSectionModulusY(), newMinimumSectionModulusY);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetMinimumSectionModulusY() {
		eUnset(IFC2X3Package.eINSTANCE.getIfcStructuralProfileProperties_MinimumSectionModulusY());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetMinimumSectionModulusY() {
		return eIsSet(IFC2X3Package.eINSTANCE.getIfcStructuralProfileProperties_MinimumSectionModulusY());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Double getMaximumSectionModulusY() {
		return (Double)eGet(IFC2X3Package.eINSTANCE.getIfcStructuralProfileProperties_MaximumSectionModulusY(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMaximumSectionModulusY(Double newMaximumSectionModulusY) {
		eSet(IFC2X3Package.eINSTANCE.getIfcStructuralProfileProperties_MaximumSectionModulusY(), newMaximumSectionModulusY);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetMaximumSectionModulusY() {
		eUnset(IFC2X3Package.eINSTANCE.getIfcStructuralProfileProperties_MaximumSectionModulusY());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetMaximumSectionModulusY() {
		return eIsSet(IFC2X3Package.eINSTANCE.getIfcStructuralProfileProperties_MaximumSectionModulusY());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Double getShearDeformationAreaY() {
		return (Double)eGet(IFC2X3Package.eINSTANCE.getIfcStructuralProfileProperties_ShearDeformationAreaY(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setShearDeformationAreaY(Double newShearDeformationAreaY) {
		eSet(IFC2X3Package.eINSTANCE.getIfcStructuralProfileProperties_ShearDeformationAreaY(), newShearDeformationAreaY);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetShearDeformationAreaY() {
		eUnset(IFC2X3Package.eINSTANCE.getIfcStructuralProfileProperties_ShearDeformationAreaY());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetShearDeformationAreaY() {
		return eIsSet(IFC2X3Package.eINSTANCE.getIfcStructuralProfileProperties_ShearDeformationAreaY());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Double getShearDeformationAreaZ() {
		return (Double)eGet(IFC2X3Package.eINSTANCE.getIfcStructuralProfileProperties_ShearDeformationAreaZ(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setShearDeformationAreaZ(Double newShearDeformationAreaZ) {
		eSet(IFC2X3Package.eINSTANCE.getIfcStructuralProfileProperties_ShearDeformationAreaZ(), newShearDeformationAreaZ);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetShearDeformationAreaZ() {
		eUnset(IFC2X3Package.eINSTANCE.getIfcStructuralProfileProperties_ShearDeformationAreaZ());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetShearDeformationAreaZ() {
		return eIsSet(IFC2X3Package.eINSTANCE.getIfcStructuralProfileProperties_ShearDeformationAreaZ());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Double getShearCentreY() {
		return (Double)eGet(IFC2X3Package.eINSTANCE.getIfcStructuralProfileProperties_ShearCentreY(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setShearCentreY(Double newShearCentreY) {
		eSet(IFC2X3Package.eINSTANCE.getIfcStructuralProfileProperties_ShearCentreY(), newShearCentreY);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetShearCentreY() {
		eUnset(IFC2X3Package.eINSTANCE.getIfcStructuralProfileProperties_ShearCentreY());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetShearCentreY() {
		return eIsSet(IFC2X3Package.eINSTANCE.getIfcStructuralProfileProperties_ShearCentreY());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Double getShearCentreZ() {
		return (Double)eGet(IFC2X3Package.eINSTANCE.getIfcStructuralProfileProperties_ShearCentreZ(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setShearCentreZ(Double newShearCentreZ) {
		eSet(IFC2X3Package.eINSTANCE.getIfcStructuralProfileProperties_ShearCentreZ(), newShearCentreZ);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetShearCentreZ() {
		eUnset(IFC2X3Package.eINSTANCE.getIfcStructuralProfileProperties_ShearCentreZ());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetShearCentreZ() {
		return eIsSet(IFC2X3Package.eINSTANCE.getIfcStructuralProfileProperties_ShearCentreZ());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Double getWarpingConstant() {
		return (Double)eGet(IFC2X3Package.eINSTANCE.getIfcStructuralProfileProperties_WarpingConstant(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setWarpingConstant(Double newWarpingConstant) {
		eSet(IFC2X3Package.eINSTANCE.getIfcStructuralProfileProperties_WarpingConstant(), newWarpingConstant);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetWarpingConstant() {
		eUnset(IFC2X3Package.eINSTANCE.getIfcStructuralProfileProperties_WarpingConstant());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetWarpingConstant() {
		return eIsSet(IFC2X3Package.eINSTANCE.getIfcStructuralProfileProperties_WarpingConstant());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Double getMomentOfInertiaZ() {
		return (Double)eGet(IFC2X3Package.eINSTANCE.getIfcStructuralProfileProperties_MomentOfInertiaZ(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMomentOfInertiaZ(Double newMomentOfInertiaZ) {
		eSet(IFC2X3Package.eINSTANCE.getIfcStructuralProfileProperties_MomentOfInertiaZ(), newMomentOfInertiaZ);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetMomentOfInertiaZ() {
		eUnset(IFC2X3Package.eINSTANCE.getIfcStructuralProfileProperties_MomentOfInertiaZ());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetMomentOfInertiaZ() {
		return eIsSet(IFC2X3Package.eINSTANCE.getIfcStructuralProfileProperties_MomentOfInertiaZ());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Double getMomentOfInertiaY() {
		return (Double)eGet(IFC2X3Package.eINSTANCE.getIfcStructuralProfileProperties_MomentOfInertiaY(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMomentOfInertiaY(Double newMomentOfInertiaY) {
		eSet(IFC2X3Package.eINSTANCE.getIfcStructuralProfileProperties_MomentOfInertiaY(), newMomentOfInertiaY);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetMomentOfInertiaY() {
		eUnset(IFC2X3Package.eINSTANCE.getIfcStructuralProfileProperties_MomentOfInertiaY());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetMomentOfInertiaY() {
		return eIsSet(IFC2X3Package.eINSTANCE.getIfcStructuralProfileProperties_MomentOfInertiaY());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Double getMomentOfInertiaYZ() {
		return (Double)eGet(IFC2X3Package.eINSTANCE.getIfcStructuralProfileProperties_MomentOfInertiaYZ(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMomentOfInertiaYZ(Double newMomentOfInertiaYZ) {
		eSet(IFC2X3Package.eINSTANCE.getIfcStructuralProfileProperties_MomentOfInertiaYZ(), newMomentOfInertiaYZ);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetMomentOfInertiaYZ() {
		eUnset(IFC2X3Package.eINSTANCE.getIfcStructuralProfileProperties_MomentOfInertiaYZ());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetMomentOfInertiaYZ() {
		return eIsSet(IFC2X3Package.eINSTANCE.getIfcStructuralProfileProperties_MomentOfInertiaYZ());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Double getTorsionalConstantX() {
		return (Double)eGet(IFC2X3Package.eINSTANCE.getIfcStructuralProfileProperties_TorsionalConstantX(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTorsionalConstantX(Double newTorsionalConstantX) {
		eSet(IFC2X3Package.eINSTANCE.getIfcStructuralProfileProperties_TorsionalConstantX(), newTorsionalConstantX);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetTorsionalConstantX() {
		eUnset(IFC2X3Package.eINSTANCE.getIfcStructuralProfileProperties_TorsionalConstantX());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetTorsionalConstantX() {
		return eIsSet(IFC2X3Package.eINSTANCE.getIfcStructuralProfileProperties_TorsionalConstantX());
	}

} //IfcStructuralProfilePropertiesImpl
