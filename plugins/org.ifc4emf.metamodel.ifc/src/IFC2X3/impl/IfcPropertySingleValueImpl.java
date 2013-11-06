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
import IFC2X3.IfcPropertySingleValue;
import IFC2X3.IfcUnit;
import IFC2X3.IfcValue;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Ifc Property Single Value</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link IFC2X3.impl.IfcPropertySingleValueImpl#getNominalValue <em>Nominal Value</em>}</li>
 *   <li>{@link IFC2X3.impl.IfcPropertySingleValueImpl#getUnit <em>Unit</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
@XmlType(name = "IfcPropertySingleValue")
@XmlRootElement(name = "IfcPropertySingleValueElement")
public class IfcPropertySingleValueImpl extends IfcSimplePropertyImpl implements IfcPropertySingleValue {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected IfcPropertySingleValueImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return IFC2X3Package.eINSTANCE.getIfcPropertySingleValue();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcValue getNominalValue() {
		return (IfcValue)eGet(IFC2X3Package.eINSTANCE.getIfcPropertySingleValue_NominalValue(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNominalValue(IfcValue newNominalValue) {
		eSet(IFC2X3Package.eINSTANCE.getIfcPropertySingleValue_NominalValue(), newNominalValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcUnit getUnit() {
		return (IfcUnit)eGet(IFC2X3Package.eINSTANCE.getIfcPropertySingleValue_Unit(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setUnit(IfcUnit newUnit) {
		eSet(IFC2X3Package.eINSTANCE.getIfcPropertySingleValue_Unit(), newUnit);
	}

} //IfcPropertySingleValueImpl
