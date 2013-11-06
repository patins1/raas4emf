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
import IFC2X3.IfcReinforcingMesh;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Ifc Reinforcing Mesh</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link IFC2X3.impl.IfcReinforcingMeshImpl#getMeshLength <em>Mesh Length</em>}</li>
 *   <li>{@link IFC2X3.impl.IfcReinforcingMeshImpl#getMeshWidth <em>Mesh Width</em>}</li>
 *   <li>{@link IFC2X3.impl.IfcReinforcingMeshImpl#getLongitudinalBarNominalDiameter <em>Longitudinal Bar Nominal Diameter</em>}</li>
 *   <li>{@link IFC2X3.impl.IfcReinforcingMeshImpl#getTransverseBarNominalDiameter <em>Transverse Bar Nominal Diameter</em>}</li>
 *   <li>{@link IFC2X3.impl.IfcReinforcingMeshImpl#getLongitudinalBarCrossSectionArea <em>Longitudinal Bar Cross Section Area</em>}</li>
 *   <li>{@link IFC2X3.impl.IfcReinforcingMeshImpl#getTransverseBarCrossSectionArea <em>Transverse Bar Cross Section Area</em>}</li>
 *   <li>{@link IFC2X3.impl.IfcReinforcingMeshImpl#getLongitudinalBarSpacing <em>Longitudinal Bar Spacing</em>}</li>
 *   <li>{@link IFC2X3.impl.IfcReinforcingMeshImpl#getTransverseBarSpacing <em>Transverse Bar Spacing</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
@XmlType(name = "IfcReinforcingMesh")
@XmlRootElement(name = "IfcReinforcingMeshElement")
public class IfcReinforcingMeshImpl extends IfcReinforcingElementImpl implements IfcReinforcingMesh {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected IfcReinforcingMeshImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return IFC2X3Package.eINSTANCE.getIfcReinforcingMesh();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Double getTransverseBarSpacing() {
		return (Double)eGet(IFC2X3Package.eINSTANCE.getIfcReinforcingMesh_TransverseBarSpacing(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTransverseBarSpacing(Double newTransverseBarSpacing) {
		eSet(IFC2X3Package.eINSTANCE.getIfcReinforcingMesh_TransverseBarSpacing(), newTransverseBarSpacing);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetTransverseBarSpacing() {
		eUnset(IFC2X3Package.eINSTANCE.getIfcReinforcingMesh_TransverseBarSpacing());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetTransverseBarSpacing() {
		return eIsSet(IFC2X3Package.eINSTANCE.getIfcReinforcingMesh_TransverseBarSpacing());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Double getLongitudinalBarSpacing() {
		return (Double)eGet(IFC2X3Package.eINSTANCE.getIfcReinforcingMesh_LongitudinalBarSpacing(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLongitudinalBarSpacing(Double newLongitudinalBarSpacing) {
		eSet(IFC2X3Package.eINSTANCE.getIfcReinforcingMesh_LongitudinalBarSpacing(), newLongitudinalBarSpacing);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetLongitudinalBarSpacing() {
		eUnset(IFC2X3Package.eINSTANCE.getIfcReinforcingMesh_LongitudinalBarSpacing());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetLongitudinalBarSpacing() {
		return eIsSet(IFC2X3Package.eINSTANCE.getIfcReinforcingMesh_LongitudinalBarSpacing());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Double getTransverseBarCrossSectionArea() {
		return (Double)eGet(IFC2X3Package.eINSTANCE.getIfcReinforcingMesh_TransverseBarCrossSectionArea(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTransverseBarCrossSectionArea(Double newTransverseBarCrossSectionArea) {
		eSet(IFC2X3Package.eINSTANCE.getIfcReinforcingMesh_TransverseBarCrossSectionArea(), newTransverseBarCrossSectionArea);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetTransverseBarCrossSectionArea() {
		eUnset(IFC2X3Package.eINSTANCE.getIfcReinforcingMesh_TransverseBarCrossSectionArea());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetTransverseBarCrossSectionArea() {
		return eIsSet(IFC2X3Package.eINSTANCE.getIfcReinforcingMesh_TransverseBarCrossSectionArea());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Double getLongitudinalBarCrossSectionArea() {
		return (Double)eGet(IFC2X3Package.eINSTANCE.getIfcReinforcingMesh_LongitudinalBarCrossSectionArea(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLongitudinalBarCrossSectionArea(Double newLongitudinalBarCrossSectionArea) {
		eSet(IFC2X3Package.eINSTANCE.getIfcReinforcingMesh_LongitudinalBarCrossSectionArea(), newLongitudinalBarCrossSectionArea);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetLongitudinalBarCrossSectionArea() {
		eUnset(IFC2X3Package.eINSTANCE.getIfcReinforcingMesh_LongitudinalBarCrossSectionArea());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetLongitudinalBarCrossSectionArea() {
		return eIsSet(IFC2X3Package.eINSTANCE.getIfcReinforcingMesh_LongitudinalBarCrossSectionArea());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Double getTransverseBarNominalDiameter() {
		return (Double)eGet(IFC2X3Package.eINSTANCE.getIfcReinforcingMesh_TransverseBarNominalDiameter(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTransverseBarNominalDiameter(Double newTransverseBarNominalDiameter) {
		eSet(IFC2X3Package.eINSTANCE.getIfcReinforcingMesh_TransverseBarNominalDiameter(), newTransverseBarNominalDiameter);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetTransverseBarNominalDiameter() {
		eUnset(IFC2X3Package.eINSTANCE.getIfcReinforcingMesh_TransverseBarNominalDiameter());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetTransverseBarNominalDiameter() {
		return eIsSet(IFC2X3Package.eINSTANCE.getIfcReinforcingMesh_TransverseBarNominalDiameter());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Double getLongitudinalBarNominalDiameter() {
		return (Double)eGet(IFC2X3Package.eINSTANCE.getIfcReinforcingMesh_LongitudinalBarNominalDiameter(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLongitudinalBarNominalDiameter(Double newLongitudinalBarNominalDiameter) {
		eSet(IFC2X3Package.eINSTANCE.getIfcReinforcingMesh_LongitudinalBarNominalDiameter(), newLongitudinalBarNominalDiameter);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetLongitudinalBarNominalDiameter() {
		eUnset(IFC2X3Package.eINSTANCE.getIfcReinforcingMesh_LongitudinalBarNominalDiameter());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetLongitudinalBarNominalDiameter() {
		return eIsSet(IFC2X3Package.eINSTANCE.getIfcReinforcingMesh_LongitudinalBarNominalDiameter());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Double getMeshWidth() {
		return (Double)eGet(IFC2X3Package.eINSTANCE.getIfcReinforcingMesh_MeshWidth(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMeshWidth(Double newMeshWidth) {
		eSet(IFC2X3Package.eINSTANCE.getIfcReinforcingMesh_MeshWidth(), newMeshWidth);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetMeshWidth() {
		eUnset(IFC2X3Package.eINSTANCE.getIfcReinforcingMesh_MeshWidth());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetMeshWidth() {
		return eIsSet(IFC2X3Package.eINSTANCE.getIfcReinforcingMesh_MeshWidth());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Double getMeshLength() {
		return (Double)eGet(IFC2X3Package.eINSTANCE.getIfcReinforcingMesh_MeshLength(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMeshLength(Double newMeshLength) {
		eSet(IFC2X3Package.eINSTANCE.getIfcReinforcingMesh_MeshLength(), newMeshLength);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetMeshLength() {
		eUnset(IFC2X3Package.eINSTANCE.getIfcReinforcingMesh_MeshLength());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetMeshLength() {
		return eIsSet(IFC2X3Package.eINSTANCE.getIfcReinforcingMesh_MeshLength());
	}

} //IfcReinforcingMeshImpl
