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
import IFC2X3.IfcCostValue;
import IFC2X3.IfcDateTimeSelect;
import IFC2X3.IfcMeasureWithUnit;
import IFC2X3.IfcMetricValueSelect;
import IFC2X3.IfcTable;
import IFC2X3.IfcTimeSeries;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.internal.cdo.CDOObjectImpl;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Ifc Metric Value Select</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link IFC2X3.impl.IfcMetricValueSelectImpl#getIfcDateTimeSelectvalue <em>Ifc Date Time Selectvalue</em>}</li>
 *   <li>{@link IFC2X3.impl.IfcMetricValueSelectImpl#getIfcTextvalue <em>Ifc Textvalue</em>}</li>
 *   <li>{@link IFC2X3.impl.IfcMetricValueSelectImpl#getIfcCostValuevalue <em>Ifc Cost Valuevalue</em>}</li>
 *   <li>{@link IFC2X3.impl.IfcMetricValueSelectImpl#getIfcTimeSeriesvalue <em>Ifc Time Seriesvalue</em>}</li>
 *   <li>{@link IFC2X3.impl.IfcMetricValueSelectImpl#getIfcTablevalue <em>Ifc Tablevalue</em>}</li>
 *   <li>{@link IFC2X3.impl.IfcMetricValueSelectImpl#getIfcMeasureWithUnitvalue <em>Ifc Measure With Unitvalue</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
@XmlType(name = "IfcMetricValueSelect")
@XmlRootElement(name = "IfcMetricValueSelectElement")
public class IfcMetricValueSelectImpl extends CDOObjectImpl implements IfcMetricValueSelect {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected IfcMetricValueSelectImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return IFC2X3Package.eINSTANCE.getIfcMetricValueSelect();
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
	public IfcDateTimeSelect getIfcDateTimeSelectvalue() {
		return (IfcDateTimeSelect)eGet(IFC2X3Package.eINSTANCE.getIfcMetricValueSelect_IfcDateTimeSelectvalue(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIfcDateTimeSelectvalue(IfcDateTimeSelect newIfcDateTimeSelectvalue) {
		eSet(IFC2X3Package.eINSTANCE.getIfcMetricValueSelect_IfcDateTimeSelectvalue(), newIfcDateTimeSelectvalue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getIfcTextvalue() {
		return (String)eGet(IFC2X3Package.eINSTANCE.getIfcMetricValueSelect_IfcTextvalue(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIfcTextvalue(String newIfcTextvalue) {
		eSet(IFC2X3Package.eINSTANCE.getIfcMetricValueSelect_IfcTextvalue(), newIfcTextvalue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetIfcTextvalue() {
		eUnset(IFC2X3Package.eINSTANCE.getIfcMetricValueSelect_IfcTextvalue());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetIfcTextvalue() {
		return eIsSet(IFC2X3Package.eINSTANCE.getIfcMetricValueSelect_IfcTextvalue());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcTimeSeries getIfcTimeSeriesvalue() {
		return (IfcTimeSeries)eGet(IFC2X3Package.eINSTANCE.getIfcMetricValueSelect_IfcTimeSeriesvalue(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIfcTimeSeriesvalue(IfcTimeSeries newIfcTimeSeriesvalue) {
		eSet(IFC2X3Package.eINSTANCE.getIfcMetricValueSelect_IfcTimeSeriesvalue(), newIfcTimeSeriesvalue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcTable getIfcTablevalue() {
		return (IfcTable)eGet(IFC2X3Package.eINSTANCE.getIfcMetricValueSelect_IfcTablevalue(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIfcTablevalue(IfcTable newIfcTablevalue) {
		eSet(IFC2X3Package.eINSTANCE.getIfcMetricValueSelect_IfcTablevalue(), newIfcTablevalue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcCostValue getIfcCostValuevalue() {
		return (IfcCostValue)eGet(IFC2X3Package.eINSTANCE.getIfcMetricValueSelect_IfcCostValuevalue(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIfcCostValuevalue(IfcCostValue newIfcCostValuevalue) {
		eSet(IFC2X3Package.eINSTANCE.getIfcMetricValueSelect_IfcCostValuevalue(), newIfcCostValuevalue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcMeasureWithUnit getIfcMeasureWithUnitvalue() {
		return (IfcMeasureWithUnit)eGet(IFC2X3Package.eINSTANCE.getIfcMetricValueSelect_IfcMeasureWithUnitvalue(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIfcMeasureWithUnitvalue(IfcMeasureWithUnit newIfcMeasureWithUnitvalue) {
		eSet(IFC2X3Package.eINSTANCE.getIfcMetricValueSelect_IfcMeasureWithUnitvalue(), newIfcMeasureWithUnitvalue);
	}

} //IfcMetricValueSelectImpl
