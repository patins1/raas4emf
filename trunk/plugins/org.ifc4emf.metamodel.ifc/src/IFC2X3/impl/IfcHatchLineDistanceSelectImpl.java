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
import IFC2X3.IfcHatchLineDistanceSelect;
import IFC2X3.IfcOneDirectionRepeatFactor;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.internal.cdo.CDOObjectImpl;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Ifc Hatch Line Distance Select</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link IFC2X3.impl.IfcHatchLineDistanceSelectImpl#getIfcPositiveLengthMeasurevalue <em>Ifc Positive Length Measurevalue</em>}</li>
 *   <li>{@link IFC2X3.impl.IfcHatchLineDistanceSelectImpl#getIfcOneDirectionRepeatFactorvalue <em>Ifc One Direction Repeat Factorvalue</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
@XmlType(name = "IfcHatchLineDistanceSelect")
@XmlRootElement(name = "IfcHatchLineDistanceSelectElement")
public class IfcHatchLineDistanceSelectImpl extends CDOObjectImpl implements IfcHatchLineDistanceSelect {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected IfcHatchLineDistanceSelectImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return IFC2X3Package.eINSTANCE.getIfcHatchLineDistanceSelect();
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
	public Double getIfcPositiveLengthMeasurevalue() {
		return (Double)eGet(IFC2X3Package.eINSTANCE.getIfcHatchLineDistanceSelect_IfcPositiveLengthMeasurevalue(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIfcPositiveLengthMeasurevalue(Double newIfcPositiveLengthMeasurevalue) {
		eSet(IFC2X3Package.eINSTANCE.getIfcHatchLineDistanceSelect_IfcPositiveLengthMeasurevalue(), newIfcPositiveLengthMeasurevalue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetIfcPositiveLengthMeasurevalue() {
		eUnset(IFC2X3Package.eINSTANCE.getIfcHatchLineDistanceSelect_IfcPositiveLengthMeasurevalue());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetIfcPositiveLengthMeasurevalue() {
		return eIsSet(IFC2X3Package.eINSTANCE.getIfcHatchLineDistanceSelect_IfcPositiveLengthMeasurevalue());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcOneDirectionRepeatFactor getIfcOneDirectionRepeatFactorvalue() {
		return (IfcOneDirectionRepeatFactor)eGet(IFC2X3Package.eINSTANCE.getIfcHatchLineDistanceSelect_IfcOneDirectionRepeatFactorvalue(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIfcOneDirectionRepeatFactorvalue(IfcOneDirectionRepeatFactor newIfcOneDirectionRepeatFactorvalue) {
		eSet(IFC2X3Package.eINSTANCE.getIfcHatchLineDistanceSelect_IfcOneDirectionRepeatFactorvalue(), newIfcOneDirectionRepeatFactorvalue);
	}

} //IfcHatchLineDistanceSelectImpl
