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
import IFC2X3.IfcBenchmarkEnum;
import IFC2X3.IfcMetric;
import IFC2X3.IfcMetricValueSelect;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Ifc Metric</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link IFC2X3.impl.IfcMetricImpl#getBenchmark <em>Benchmark</em>}</li>
 *   <li>{@link IFC2X3.impl.IfcMetricImpl#getValueSource <em>Value Source</em>}</li>
 *   <li>{@link IFC2X3.impl.IfcMetricImpl#getDataValue <em>Data Value</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
@XmlType(name = "IfcMetric")
@XmlRootElement(name = "IfcMetricElement")
public class IfcMetricImpl extends IfcConstraintImpl implements IfcMetric {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected IfcMetricImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return IFC2X3Package.eINSTANCE.getIfcMetric();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcMetricValueSelect getDataValue() {
		return (IfcMetricValueSelect)eGet(IFC2X3Package.eINSTANCE.getIfcMetric_DataValue(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDataValue(IfcMetricValueSelect newDataValue) {
		eSet(IFC2X3Package.eINSTANCE.getIfcMetric_DataValue(), newDataValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getValueSource() {
		return (String)eGet(IFC2X3Package.eINSTANCE.getIfcMetric_ValueSource(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setValueSource(String newValueSource) {
		eSet(IFC2X3Package.eINSTANCE.getIfcMetric_ValueSource(), newValueSource);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetValueSource() {
		eUnset(IFC2X3Package.eINSTANCE.getIfcMetric_ValueSource());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetValueSource() {
		return eIsSet(IFC2X3Package.eINSTANCE.getIfcMetric_ValueSource());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcBenchmarkEnum getBenchmark() {
		return (IfcBenchmarkEnum)eGet(IFC2X3Package.eINSTANCE.getIfcMetric_Benchmark(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBenchmark(IfcBenchmarkEnum newBenchmark) {
		eSet(IFC2X3Package.eINSTANCE.getIfcMetric_Benchmark(), newBenchmark);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetBenchmark() {
		eUnset(IFC2X3Package.eINSTANCE.getIfcMetric_Benchmark());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetBenchmark() {
		return eIsSet(IFC2X3Package.eINSTANCE.getIfcMetric_Benchmark());
	}

} //IfcMetricImpl
