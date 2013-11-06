/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package IFC2X3.impl;

import IFC2X3.IFC2X3Package;
import IFC2X3.IfcPropertyEnumeratedValue;
import IFC2X3.IfcPropertyEnumeration;
import IFC2X3.IfcValue;

import java.util.Collection;

import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;
import org.eclipse.emf.ecore.util.EObjectResolvingEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Ifc Property Enumerated Value</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link IFC2X3.impl.IfcPropertyEnumeratedValueImpl#getEnumerationValues <em>Enumeration Values</em>}</li>
 *   <li>{@link IFC2X3.impl.IfcPropertyEnumeratedValueImpl#getEnumerationReference <em>Enumeration Reference</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
@XmlType(name = "IfcPropertyEnumeratedValue")
@XmlRootElement(name = "IfcPropertyEnumeratedValueElement")
public class IfcPropertyEnumeratedValueImpl extends IfcSimplePropertyImpl implements IfcPropertyEnumeratedValue {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected IfcPropertyEnumeratedValueImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return IFC2X3Package.eINSTANCE.getIfcPropertyEnumeratedValue();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public EList<IfcValue> getEnumerationValues() {
		return (EList<IfcValue>)eGet(IFC2X3Package.eINSTANCE.getIfcPropertyEnumeratedValue_EnumerationValues(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcPropertyEnumeration getEnumerationReference() {
		return (IfcPropertyEnumeration)eGet(IFC2X3Package.eINSTANCE.getIfcPropertyEnumeratedValue_EnumerationReference(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEnumerationReference(IfcPropertyEnumeration newEnumerationReference) {
		eSet(IFC2X3Package.eINSTANCE.getIfcPropertyEnumeratedValue_EnumerationReference(), newEnumerationReference);
	}

} //IfcPropertyEnumeratedValueImpl
