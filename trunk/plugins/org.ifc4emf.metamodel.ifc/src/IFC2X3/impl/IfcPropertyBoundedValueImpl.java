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
import IFC2X3.IfcPropertyBoundedValue;
import IFC2X3.IfcUnit;
import IFC2X3.IfcValue;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Ifc Property Bounded Value</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link IFC2X3.impl.IfcPropertyBoundedValueImpl#getUpperBoundValue <em>Upper Bound Value</em>}</li>
 *   <li>{@link IFC2X3.impl.IfcPropertyBoundedValueImpl#getLowerBoundValue <em>Lower Bound Value</em>}</li>
 *   <li>{@link IFC2X3.impl.IfcPropertyBoundedValueImpl#getUnit <em>Unit</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
@XmlType(name = "IfcPropertyBoundedValue")
@XmlRootElement(name = "IfcPropertyBoundedValueElement")
public class IfcPropertyBoundedValueImpl extends IfcSimplePropertyImpl implements IfcPropertyBoundedValue {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected IfcPropertyBoundedValueImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return IFC2X3Package.eINSTANCE.getIfcPropertyBoundedValue();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcValue getUpperBoundValue() {
		return (IfcValue)eGet(IFC2X3Package.eINSTANCE.getIfcPropertyBoundedValue_UpperBoundValue(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setUpperBoundValue(IfcValue newUpperBoundValue) {
		eSet(IFC2X3Package.eINSTANCE.getIfcPropertyBoundedValue_UpperBoundValue(), newUpperBoundValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcValue getLowerBoundValue() {
		return (IfcValue)eGet(IFC2X3Package.eINSTANCE.getIfcPropertyBoundedValue_LowerBoundValue(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLowerBoundValue(IfcValue newLowerBoundValue) {
		eSet(IFC2X3Package.eINSTANCE.getIfcPropertyBoundedValue_LowerBoundValue(), newLowerBoundValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcUnit getUnit() {
		return (IfcUnit)eGet(IFC2X3Package.eINSTANCE.getIfcPropertyBoundedValue_Unit(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setUnit(IfcUnit newUnit) {
		eSet(IFC2X3Package.eINSTANCE.getIfcPropertyBoundedValue_Unit(), newUnit);
	}

} //IfcPropertyBoundedValueImpl
