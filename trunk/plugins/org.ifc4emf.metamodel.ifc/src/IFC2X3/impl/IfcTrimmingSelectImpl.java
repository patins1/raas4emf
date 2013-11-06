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
import IFC2X3.IfcCartesianPoint;
import IFC2X3.IfcTrimmingSelect;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.internal.cdo.CDOObjectImpl;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Ifc Trimming Select</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link IFC2X3.impl.IfcTrimmingSelectImpl#getIfcParameterValuevalue <em>Ifc Parameter Valuevalue</em>}</li>
 *   <li>{@link IFC2X3.impl.IfcTrimmingSelectImpl#getIfcCartesianPointvalue <em>Ifc Cartesian Pointvalue</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
@XmlType(name = "IfcTrimmingSelect")
@XmlRootElement(name = "IfcTrimmingSelectElement")
public class IfcTrimmingSelectImpl extends CDOObjectImpl implements IfcTrimmingSelect {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected IfcTrimmingSelectImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return IFC2X3Package.eINSTANCE.getIfcTrimmingSelect();
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
	public Double getIfcParameterValuevalue() {
		return (Double)eGet(IFC2X3Package.eINSTANCE.getIfcTrimmingSelect_IfcParameterValuevalue(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIfcParameterValuevalue(Double newIfcParameterValuevalue) {
		eSet(IFC2X3Package.eINSTANCE.getIfcTrimmingSelect_IfcParameterValuevalue(), newIfcParameterValuevalue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetIfcParameterValuevalue() {
		eUnset(IFC2X3Package.eINSTANCE.getIfcTrimmingSelect_IfcParameterValuevalue());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetIfcParameterValuevalue() {
		return eIsSet(IFC2X3Package.eINSTANCE.getIfcTrimmingSelect_IfcParameterValuevalue());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcCartesianPoint getIfcCartesianPointvalue() {
		return (IfcCartesianPoint)eGet(IFC2X3Package.eINSTANCE.getIfcTrimmingSelect_IfcCartesianPointvalue(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIfcCartesianPointvalue(IfcCartesianPoint newIfcCartesianPointvalue) {
		eSet(IFC2X3Package.eINSTANCE.getIfcTrimmingSelect_IfcCartesianPointvalue(), newIfcCartesianPointvalue);
	}

} //IfcTrimmingSelectImpl
