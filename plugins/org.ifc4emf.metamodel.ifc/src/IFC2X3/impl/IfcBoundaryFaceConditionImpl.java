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
import IFC2X3.IfcBoundaryFaceCondition;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Ifc Boundary Face Condition</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link IFC2X3.impl.IfcBoundaryFaceConditionImpl#getLinearStiffnessByAreaX <em>Linear Stiffness By Area X</em>}</li>
 *   <li>{@link IFC2X3.impl.IfcBoundaryFaceConditionImpl#getLinearStiffnessByAreaY <em>Linear Stiffness By Area Y</em>}</li>
 *   <li>{@link IFC2X3.impl.IfcBoundaryFaceConditionImpl#getLinearStiffnessByAreaZ <em>Linear Stiffness By Area Z</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
@XmlType(name = "IfcBoundaryFaceCondition")
@XmlRootElement(name = "IfcBoundaryFaceConditionElement")
public class IfcBoundaryFaceConditionImpl extends IfcBoundaryConditionImpl implements IfcBoundaryFaceCondition {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected IfcBoundaryFaceConditionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return IFC2X3Package.eINSTANCE.getIfcBoundaryFaceCondition();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Double getLinearStiffnessByAreaZ() {
		return (Double)eGet(IFC2X3Package.eINSTANCE.getIfcBoundaryFaceCondition_LinearStiffnessByAreaZ(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLinearStiffnessByAreaZ(Double newLinearStiffnessByAreaZ) {
		eSet(IFC2X3Package.eINSTANCE.getIfcBoundaryFaceCondition_LinearStiffnessByAreaZ(), newLinearStiffnessByAreaZ);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetLinearStiffnessByAreaZ() {
		eUnset(IFC2X3Package.eINSTANCE.getIfcBoundaryFaceCondition_LinearStiffnessByAreaZ());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetLinearStiffnessByAreaZ() {
		return eIsSet(IFC2X3Package.eINSTANCE.getIfcBoundaryFaceCondition_LinearStiffnessByAreaZ());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Double getLinearStiffnessByAreaY() {
		return (Double)eGet(IFC2X3Package.eINSTANCE.getIfcBoundaryFaceCondition_LinearStiffnessByAreaY(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLinearStiffnessByAreaY(Double newLinearStiffnessByAreaY) {
		eSet(IFC2X3Package.eINSTANCE.getIfcBoundaryFaceCondition_LinearStiffnessByAreaY(), newLinearStiffnessByAreaY);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetLinearStiffnessByAreaY() {
		eUnset(IFC2X3Package.eINSTANCE.getIfcBoundaryFaceCondition_LinearStiffnessByAreaY());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetLinearStiffnessByAreaY() {
		return eIsSet(IFC2X3Package.eINSTANCE.getIfcBoundaryFaceCondition_LinearStiffnessByAreaY());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Double getLinearStiffnessByAreaX() {
		return (Double)eGet(IFC2X3Package.eINSTANCE.getIfcBoundaryFaceCondition_LinearStiffnessByAreaX(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLinearStiffnessByAreaX(Double newLinearStiffnessByAreaX) {
		eSet(IFC2X3Package.eINSTANCE.getIfcBoundaryFaceCondition_LinearStiffnessByAreaX(), newLinearStiffnessByAreaX);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetLinearStiffnessByAreaX() {
		eUnset(IFC2X3Package.eINSTANCE.getIfcBoundaryFaceCondition_LinearStiffnessByAreaX());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetLinearStiffnessByAreaX() {
		return eIsSet(IFC2X3Package.eINSTANCE.getIfcBoundaryFaceCondition_LinearStiffnessByAreaX());
	}

} //IfcBoundaryFaceConditionImpl
