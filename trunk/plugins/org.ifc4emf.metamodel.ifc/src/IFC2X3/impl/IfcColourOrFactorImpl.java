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
import IFC2X3.IfcColourOrFactor;
import IFC2X3.IfcColourRgb;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.internal.cdo.CDOObjectImpl;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Ifc Colour Or Factor</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link IFC2X3.impl.IfcColourOrFactorImpl#getIfcNormalisedRatioMeasurevalue <em>Ifc Normalised Ratio Measurevalue</em>}</li>
 *   <li>{@link IFC2X3.impl.IfcColourOrFactorImpl#getIfcColourRgbvalue <em>Ifc Colour Rgbvalue</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
@XmlType(name = "IfcColourOrFactor")
@XmlRootElement(name = "IfcColourOrFactorElement")
public class IfcColourOrFactorImpl extends CDOObjectImpl implements IfcColourOrFactor {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected IfcColourOrFactorImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return IFC2X3Package.eINSTANCE.getIfcColourOrFactor();
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
	public Double getIfcNormalisedRatioMeasurevalue() {
		return (Double)eGet(IFC2X3Package.eINSTANCE.getIfcColourOrFactor_IfcNormalisedRatioMeasurevalue(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIfcNormalisedRatioMeasurevalue(Double newIfcNormalisedRatioMeasurevalue) {
		eSet(IFC2X3Package.eINSTANCE.getIfcColourOrFactor_IfcNormalisedRatioMeasurevalue(), newIfcNormalisedRatioMeasurevalue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetIfcNormalisedRatioMeasurevalue() {
		eUnset(IFC2X3Package.eINSTANCE.getIfcColourOrFactor_IfcNormalisedRatioMeasurevalue());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetIfcNormalisedRatioMeasurevalue() {
		return eIsSet(IFC2X3Package.eINSTANCE.getIfcColourOrFactor_IfcNormalisedRatioMeasurevalue());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcColourRgb getIfcColourRgbvalue() {
		return (IfcColourRgb)eGet(IFC2X3Package.eINSTANCE.getIfcColourOrFactor_IfcColourRgbvalue(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIfcColourRgbvalue(IfcColourRgb newIfcColourRgbvalue) {
		eSet(IFC2X3Package.eINSTANCE.getIfcColourOrFactor_IfcColourRgbvalue(), newIfcColourRgbvalue);
	}

} //IfcColourOrFactorImpl
