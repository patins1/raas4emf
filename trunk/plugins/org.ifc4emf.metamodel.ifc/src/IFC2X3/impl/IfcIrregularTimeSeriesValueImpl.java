/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package IFC2X3.impl;

import IFC2X3.IFC2X3Package;
import IFC2X3.IfcDateTimeSelect;
import IFC2X3.IfcIrregularTimeSeriesValue;
import IFC2X3.IfcValue;

import java.util.Collection;

import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.internal.cdo.CDOObjectImpl;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;
import org.eclipse.emf.ecore.util.EObjectResolvingEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Ifc Irregular Time Series Value</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link IFC2X3.impl.IfcIrregularTimeSeriesValueImpl#getTimeStamp <em>Time Stamp</em>}</li>
 *   <li>{@link IFC2X3.impl.IfcIrregularTimeSeriesValueImpl#getListValues <em>List Values</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
@XmlType(name = "IfcIrregularTimeSeriesValue")
@XmlRootElement(name = "IfcIrregularTimeSeriesValueElement")
public class IfcIrregularTimeSeriesValueImpl extends CDOObjectImpl implements IfcIrregularTimeSeriesValue {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected IfcIrregularTimeSeriesValueImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return IFC2X3Package.eINSTANCE.getIfcIrregularTimeSeriesValue();
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
	@SuppressWarnings("unchecked")
	public EList<IfcValue> getListValues() {
		return (EList<IfcValue>)eGet(IFC2X3Package.eINSTANCE.getIfcIrregularTimeSeriesValue_ListValues(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcDateTimeSelect getTimeStamp() {
		return (IfcDateTimeSelect)eGet(IFC2X3Package.eINSTANCE.getIfcIrregularTimeSeriesValue_TimeStamp(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTimeStamp(IfcDateTimeSelect newTimeStamp) {
		eSet(IFC2X3Package.eINSTANCE.getIfcIrregularTimeSeriesValue_TimeStamp(), newTimeStamp);
	}

} //IfcIrregularTimeSeriesValueImpl
