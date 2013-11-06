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
import IFC2X3.IfcQuantityCount;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Ifc Quantity Count</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link IFC2X3.impl.IfcQuantityCountImpl#getCountValue <em>Count Value</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
@XmlType(name = "IfcQuantityCount")
@XmlRootElement(name = "IfcQuantityCountElement")
public class IfcQuantityCountImpl extends IfcPhysicalSimpleQuantityImpl implements IfcQuantityCount {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected IfcQuantityCountImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return IFC2X3Package.eINSTANCE.getIfcQuantityCount();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Double getCountValue() {
		return (Double)eGet(IFC2X3Package.eINSTANCE.getIfcQuantityCount_CountValue(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCountValue(Double newCountValue) {
		eSet(IFC2X3Package.eINSTANCE.getIfcQuantityCount_CountValue(), newCountValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetCountValue() {
		eUnset(IFC2X3Package.eINSTANCE.getIfcQuantityCount_CountValue());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetCountValue() {
		return eIsSet(IFC2X3Package.eINSTANCE.getIfcQuantityCount_CountValue());
	}

} //IfcQuantityCountImpl
