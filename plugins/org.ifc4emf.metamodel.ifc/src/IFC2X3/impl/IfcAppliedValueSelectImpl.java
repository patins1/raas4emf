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
import IFC2X3.IfcAppliedValueSelect;
import IFC2X3.IfcMeasureWithUnit;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.internal.cdo.CDOObjectImpl;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Ifc Applied Value Select</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link IFC2X3.impl.IfcAppliedValueSelectImpl#getIfcMonetaryMeasurevalue <em>Ifc Monetary Measurevalue</em>}</li>
 *   <li>{@link IFC2X3.impl.IfcAppliedValueSelectImpl#getIfcRatioMeasurevalue <em>Ifc Ratio Measurevalue</em>}</li>
 *   <li>{@link IFC2X3.impl.IfcAppliedValueSelectImpl#getIfcMeasureWithUnitvalue <em>Ifc Measure With Unitvalue</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
@XmlType(name = "IfcAppliedValueSelect")
@XmlRootElement(name = "IfcAppliedValueSelectElement")
public class IfcAppliedValueSelectImpl extends CDOObjectImpl implements IfcAppliedValueSelect {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected IfcAppliedValueSelectImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return IFC2X3Package.eINSTANCE.getIfcAppliedValueSelect();
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
	public Double getIfcMonetaryMeasurevalue() {
		return (Double)eGet(IFC2X3Package.eINSTANCE.getIfcAppliedValueSelect_IfcMonetaryMeasurevalue(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIfcMonetaryMeasurevalue(Double newIfcMonetaryMeasurevalue) {
		eSet(IFC2X3Package.eINSTANCE.getIfcAppliedValueSelect_IfcMonetaryMeasurevalue(), newIfcMonetaryMeasurevalue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetIfcMonetaryMeasurevalue() {
		eUnset(IFC2X3Package.eINSTANCE.getIfcAppliedValueSelect_IfcMonetaryMeasurevalue());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetIfcMonetaryMeasurevalue() {
		return eIsSet(IFC2X3Package.eINSTANCE.getIfcAppliedValueSelect_IfcMonetaryMeasurevalue());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Double getIfcRatioMeasurevalue() {
		return (Double)eGet(IFC2X3Package.eINSTANCE.getIfcAppliedValueSelect_IfcRatioMeasurevalue(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIfcRatioMeasurevalue(Double newIfcRatioMeasurevalue) {
		eSet(IFC2X3Package.eINSTANCE.getIfcAppliedValueSelect_IfcRatioMeasurevalue(), newIfcRatioMeasurevalue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetIfcRatioMeasurevalue() {
		eUnset(IFC2X3Package.eINSTANCE.getIfcAppliedValueSelect_IfcRatioMeasurevalue());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetIfcRatioMeasurevalue() {
		return eIsSet(IFC2X3Package.eINSTANCE.getIfcAppliedValueSelect_IfcRatioMeasurevalue());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcMeasureWithUnit getIfcMeasureWithUnitvalue() {
		return (IfcMeasureWithUnit)eGet(IFC2X3Package.eINSTANCE.getIfcAppliedValueSelect_IfcMeasureWithUnitvalue(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIfcMeasureWithUnitvalue(IfcMeasureWithUnit newIfcMeasureWithUnitvalue) {
		eSet(IFC2X3Package.eINSTANCE.getIfcAppliedValueSelect_IfcMeasureWithUnitvalue(), newIfcMeasureWithUnitvalue);
	}

} //IfcAppliedValueSelectImpl
