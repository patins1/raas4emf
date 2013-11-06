/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package IFC2X3.impl;

import IFC2X3.IFC2X3Package;
import IFC2X3.IfcRegularTimeSeries;
import IFC2X3.IfcTimeSeriesValue;

import java.util.Collection;

import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Ifc Regular Time Series</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link IFC2X3.impl.IfcRegularTimeSeriesImpl#getTimeStep <em>Time Step</em>}</li>
 *   <li>{@link IFC2X3.impl.IfcRegularTimeSeriesImpl#getValues <em>Values</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
@XmlType(name = "IfcRegularTimeSeries")
@XmlRootElement(name = "IfcRegularTimeSeriesElement")
public class IfcRegularTimeSeriesImpl extends IfcTimeSeriesImpl implements IfcRegularTimeSeries {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected IfcRegularTimeSeriesImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return IFC2X3Package.eINSTANCE.getIfcRegularTimeSeries();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public EList<IfcTimeSeriesValue> getValues() {
		return (EList<IfcTimeSeriesValue>)eGet(IFC2X3Package.eINSTANCE.getIfcRegularTimeSeries_Values(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Double getTimeStep() {
		return (Double)eGet(IFC2X3Package.eINSTANCE.getIfcRegularTimeSeries_TimeStep(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTimeStep(Double newTimeStep) {
		eSet(IFC2X3Package.eINSTANCE.getIfcRegularTimeSeries_TimeStep(), newTimeStep);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetTimeStep() {
		eUnset(IFC2X3Package.eINSTANCE.getIfcRegularTimeSeries_TimeStep());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetTimeStep() {
		return eIsSet(IFC2X3Package.eINSTANCE.getIfcRegularTimeSeries_TimeStep());
	}

} //IfcRegularTimeSeriesImpl
