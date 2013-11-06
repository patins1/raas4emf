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
import IFC2X3.IfcBoundaryNodeConditionWarping;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Ifc Boundary Node Condition Warping</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link IFC2X3.impl.IfcBoundaryNodeConditionWarpingImpl#getWarpingStiffness <em>Warping Stiffness</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
@XmlType(name = "IfcBoundaryNodeConditionWarping")
@XmlRootElement(name = "IfcBoundaryNodeConditionWarpingElement")
public class IfcBoundaryNodeConditionWarpingImpl extends IfcBoundaryNodeConditionImpl implements IfcBoundaryNodeConditionWarping {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected IfcBoundaryNodeConditionWarpingImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return IFC2X3Package.eINSTANCE.getIfcBoundaryNodeConditionWarping();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Double getWarpingStiffness() {
		return (Double)eGet(IFC2X3Package.eINSTANCE.getIfcBoundaryNodeConditionWarping_WarpingStiffness(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setWarpingStiffness(Double newWarpingStiffness) {
		eSet(IFC2X3Package.eINSTANCE.getIfcBoundaryNodeConditionWarping_WarpingStiffness(), newWarpingStiffness);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetWarpingStiffness() {
		eUnset(IFC2X3Package.eINSTANCE.getIfcBoundaryNodeConditionWarping_WarpingStiffness());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetWarpingStiffness() {
		return eIsSet(IFC2X3Package.eINSTANCE.getIfcBoundaryNodeConditionWarping_WarpingStiffness());
	}

} //IfcBoundaryNodeConditionWarpingImpl
