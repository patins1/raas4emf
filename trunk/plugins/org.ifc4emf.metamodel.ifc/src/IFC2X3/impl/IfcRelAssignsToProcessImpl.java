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
import IFC2X3.IfcMeasureWithUnit;
import IFC2X3.IfcProcess;
import IFC2X3.IfcRelAssignsToProcess;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Ifc Rel Assigns To Process</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link IFC2X3.impl.IfcRelAssignsToProcessImpl#getRelatingProcess <em>Relating Process</em>}</li>
 *   <li>{@link IFC2X3.impl.IfcRelAssignsToProcessImpl#getQuantityInProcess <em>Quantity In Process</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
@XmlType(name = "IfcRelAssignsToProcess")
@XmlRootElement(name = "IfcRelAssignsToProcessElement")
public class IfcRelAssignsToProcessImpl extends IfcRelAssignsImpl implements IfcRelAssignsToProcess {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected IfcRelAssignsToProcessImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return IFC2X3Package.eINSTANCE.getIfcRelAssignsToProcess();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcProcess getRelatingProcess() {
		return (IfcProcess)eGet(IFC2X3Package.eINSTANCE.getIfcRelAssignsToProcess_RelatingProcess(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRelatingProcess(IfcProcess newRelatingProcess) {
		eSet(IFC2X3Package.eINSTANCE.getIfcRelAssignsToProcess_RelatingProcess(), newRelatingProcess);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcMeasureWithUnit getQuantityInProcess() {
		return (IfcMeasureWithUnit)eGet(IFC2X3Package.eINSTANCE.getIfcRelAssignsToProcess_QuantityInProcess(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setQuantityInProcess(IfcMeasureWithUnit newQuantityInProcess) {
		eSet(IFC2X3Package.eINSTANCE.getIfcRelAssignsToProcess_QuantityInProcess(), newQuantityInProcess);
	}

} //IfcRelAssignsToProcessImpl
