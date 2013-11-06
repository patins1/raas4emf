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
import IFC2X3.IfcPerformanceHistory;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Ifc Performance History</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link IFC2X3.impl.IfcPerformanceHistoryImpl#getLifeCyclePhase <em>Life Cycle Phase</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
@XmlType(name = "IfcPerformanceHistory")
@XmlRootElement(name = "IfcPerformanceHistoryElement")
public class IfcPerformanceHistoryImpl extends IfcControlImpl implements IfcPerformanceHistory {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected IfcPerformanceHistoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return IFC2X3Package.eINSTANCE.getIfcPerformanceHistory();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getLifeCyclePhase() {
		return (String)eGet(IFC2X3Package.eINSTANCE.getIfcPerformanceHistory_LifeCyclePhase(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLifeCyclePhase(String newLifeCyclePhase) {
		eSet(IFC2X3Package.eINSTANCE.getIfcPerformanceHistory_LifeCyclePhase(), newLifeCyclePhase);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetLifeCyclePhase() {
		eUnset(IFC2X3Package.eINSTANCE.getIfcPerformanceHistory_LifeCyclePhase());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetLifeCyclePhase() {
		return eIsSet(IFC2X3Package.eINSTANCE.getIfcPerformanceHistory_LifeCyclePhase());
	}

} //IfcPerformanceHistoryImpl
