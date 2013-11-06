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
import IFC2X3.IfcConditionCriterionSelect;
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
 * An implementation of the model object '<em><b>Ifc Condition Criterion Select</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link IFC2X3.impl.IfcConditionCriterionSelectImpl#getIfcLabelvalue <em>Ifc Labelvalue</em>}</li>
 *   <li>{@link IFC2X3.impl.IfcConditionCriterionSelectImpl#getIfcMeasureWithUnitvalue <em>Ifc Measure With Unitvalue</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
@XmlType(name = "IfcConditionCriterionSelect")
@XmlRootElement(name = "IfcConditionCriterionSelectElement")
public class IfcConditionCriterionSelectImpl extends CDOObjectImpl implements IfcConditionCriterionSelect {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected IfcConditionCriterionSelectImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return IFC2X3Package.eINSTANCE.getIfcConditionCriterionSelect();
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
	public String getIfcLabelvalue() {
		return (String)eGet(IFC2X3Package.eINSTANCE.getIfcConditionCriterionSelect_IfcLabelvalue(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIfcLabelvalue(String newIfcLabelvalue) {
		eSet(IFC2X3Package.eINSTANCE.getIfcConditionCriterionSelect_IfcLabelvalue(), newIfcLabelvalue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetIfcLabelvalue() {
		eUnset(IFC2X3Package.eINSTANCE.getIfcConditionCriterionSelect_IfcLabelvalue());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetIfcLabelvalue() {
		return eIsSet(IFC2X3Package.eINSTANCE.getIfcConditionCriterionSelect_IfcLabelvalue());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcMeasureWithUnit getIfcMeasureWithUnitvalue() {
		return (IfcMeasureWithUnit)eGet(IFC2X3Package.eINSTANCE.getIfcConditionCriterionSelect_IfcMeasureWithUnitvalue(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIfcMeasureWithUnitvalue(IfcMeasureWithUnit newIfcMeasureWithUnitvalue) {
		eSet(IFC2X3Package.eINSTANCE.getIfcConditionCriterionSelect_IfcMeasureWithUnitvalue(), newIfcMeasureWithUnitvalue);
	}

} //IfcConditionCriterionSelectImpl
