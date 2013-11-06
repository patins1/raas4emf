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
import IFC2X3.IfcSizeSelect;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.internal.cdo.CDOObjectImpl;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Ifc Size Select</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link IFC2X3.impl.IfcSizeSelectImpl#getIfcPositiveRatioMeasurevalue <em>Ifc Positive Ratio Measurevalue</em>}</li>
 *   <li>{@link IFC2X3.impl.IfcSizeSelectImpl#getIfcNormalisedRatioMeasurevalue <em>Ifc Normalised Ratio Measurevalue</em>}</li>
 *   <li>{@link IFC2X3.impl.IfcSizeSelectImpl#getIfcPositiveLengthMeasurevalue <em>Ifc Positive Length Measurevalue</em>}</li>
 *   <li>{@link IFC2X3.impl.IfcSizeSelectImpl#getIfcDescriptiveMeasurevalue <em>Ifc Descriptive Measurevalue</em>}</li>
 *   <li>{@link IFC2X3.impl.IfcSizeSelectImpl#getIfcLengthMeasurevalue <em>Ifc Length Measurevalue</em>}</li>
 *   <li>{@link IFC2X3.impl.IfcSizeSelectImpl#getIfcRatioMeasurevalue <em>Ifc Ratio Measurevalue</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
@XmlType(name = "IfcSizeSelect")
@XmlRootElement(name = "IfcSizeSelectElement")
public class IfcSizeSelectImpl extends CDOObjectImpl implements IfcSizeSelect {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected IfcSizeSelectImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return IFC2X3Package.eINSTANCE.getIfcSizeSelect();
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
	public Double getIfcPositiveRatioMeasurevalue() {
		return (Double)eGet(IFC2X3Package.eINSTANCE.getIfcSizeSelect_IfcPositiveRatioMeasurevalue(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIfcPositiveRatioMeasurevalue(Double newIfcPositiveRatioMeasurevalue) {
		eSet(IFC2X3Package.eINSTANCE.getIfcSizeSelect_IfcPositiveRatioMeasurevalue(), newIfcPositiveRatioMeasurevalue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetIfcPositiveRatioMeasurevalue() {
		eUnset(IFC2X3Package.eINSTANCE.getIfcSizeSelect_IfcPositiveRatioMeasurevalue());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetIfcPositiveRatioMeasurevalue() {
		return eIsSet(IFC2X3Package.eINSTANCE.getIfcSizeSelect_IfcPositiveRatioMeasurevalue());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Double getIfcNormalisedRatioMeasurevalue() {
		return (Double)eGet(IFC2X3Package.eINSTANCE.getIfcSizeSelect_IfcNormalisedRatioMeasurevalue(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIfcNormalisedRatioMeasurevalue(Double newIfcNormalisedRatioMeasurevalue) {
		eSet(IFC2X3Package.eINSTANCE.getIfcSizeSelect_IfcNormalisedRatioMeasurevalue(), newIfcNormalisedRatioMeasurevalue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetIfcNormalisedRatioMeasurevalue() {
		eUnset(IFC2X3Package.eINSTANCE.getIfcSizeSelect_IfcNormalisedRatioMeasurevalue());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetIfcNormalisedRatioMeasurevalue() {
		return eIsSet(IFC2X3Package.eINSTANCE.getIfcSizeSelect_IfcNormalisedRatioMeasurevalue());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Double getIfcPositiveLengthMeasurevalue() {
		return (Double)eGet(IFC2X3Package.eINSTANCE.getIfcSizeSelect_IfcPositiveLengthMeasurevalue(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIfcPositiveLengthMeasurevalue(Double newIfcPositiveLengthMeasurevalue) {
		eSet(IFC2X3Package.eINSTANCE.getIfcSizeSelect_IfcPositiveLengthMeasurevalue(), newIfcPositiveLengthMeasurevalue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetIfcPositiveLengthMeasurevalue() {
		eUnset(IFC2X3Package.eINSTANCE.getIfcSizeSelect_IfcPositiveLengthMeasurevalue());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetIfcPositiveLengthMeasurevalue() {
		return eIsSet(IFC2X3Package.eINSTANCE.getIfcSizeSelect_IfcPositiveLengthMeasurevalue());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getIfcDescriptiveMeasurevalue() {
		return (String)eGet(IFC2X3Package.eINSTANCE.getIfcSizeSelect_IfcDescriptiveMeasurevalue(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIfcDescriptiveMeasurevalue(String newIfcDescriptiveMeasurevalue) {
		eSet(IFC2X3Package.eINSTANCE.getIfcSizeSelect_IfcDescriptiveMeasurevalue(), newIfcDescriptiveMeasurevalue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetIfcDescriptiveMeasurevalue() {
		eUnset(IFC2X3Package.eINSTANCE.getIfcSizeSelect_IfcDescriptiveMeasurevalue());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetIfcDescriptiveMeasurevalue() {
		return eIsSet(IFC2X3Package.eINSTANCE.getIfcSizeSelect_IfcDescriptiveMeasurevalue());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Double getIfcLengthMeasurevalue() {
		return (Double)eGet(IFC2X3Package.eINSTANCE.getIfcSizeSelect_IfcLengthMeasurevalue(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIfcLengthMeasurevalue(Double newIfcLengthMeasurevalue) {
		eSet(IFC2X3Package.eINSTANCE.getIfcSizeSelect_IfcLengthMeasurevalue(), newIfcLengthMeasurevalue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetIfcLengthMeasurevalue() {
		eUnset(IFC2X3Package.eINSTANCE.getIfcSizeSelect_IfcLengthMeasurevalue());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetIfcLengthMeasurevalue() {
		return eIsSet(IFC2X3Package.eINSTANCE.getIfcSizeSelect_IfcLengthMeasurevalue());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Double getIfcRatioMeasurevalue() {
		return (Double)eGet(IFC2X3Package.eINSTANCE.getIfcSizeSelect_IfcRatioMeasurevalue(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIfcRatioMeasurevalue(Double newIfcRatioMeasurevalue) {
		eSet(IFC2X3Package.eINSTANCE.getIfcSizeSelect_IfcRatioMeasurevalue(), newIfcRatioMeasurevalue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetIfcRatioMeasurevalue() {
		eUnset(IFC2X3Package.eINSTANCE.getIfcSizeSelect_IfcRatioMeasurevalue());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetIfcRatioMeasurevalue() {
		return eIsSet(IFC2X3Package.eINSTANCE.getIfcSizeSelect_IfcRatioMeasurevalue());
	}

} //IfcSizeSelectImpl
