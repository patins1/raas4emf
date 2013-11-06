/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package IFC2X3.impl;

import IFC2X3.IFC2X3Package;
import IFC2X3.IfcComplexProperty;
import IFC2X3.IfcProperty;

import java.util.Collection;

import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectWithInverseResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Ifc Complex Property</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link IFC2X3.impl.IfcComplexPropertyImpl#getUsageName <em>Usage Name</em>}</li>
 *   <li>{@link IFC2X3.impl.IfcComplexPropertyImpl#getHasProperties <em>Has Properties</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
@XmlType(name = "IfcComplexProperty")
@XmlRootElement(name = "IfcComplexPropertyElement")
public class IfcComplexPropertyImpl extends IfcPropertyImpl implements IfcComplexProperty {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected IfcComplexPropertyImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return IFC2X3Package.eINSTANCE.getIfcComplexProperty();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public EList<IfcProperty> getHasProperties() {
		return (EList<IfcProperty>)eGet(IFC2X3Package.eINSTANCE.getIfcComplexProperty_HasProperties(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getUsageName() {
		return (String)eGet(IFC2X3Package.eINSTANCE.getIfcComplexProperty_UsageName(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setUsageName(String newUsageName) {
		eSet(IFC2X3Package.eINSTANCE.getIfcComplexProperty_UsageName(), newUsageName);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetUsageName() {
		eUnset(IFC2X3Package.eINSTANCE.getIfcComplexProperty_UsageName());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetUsageName() {
		return eIsSet(IFC2X3Package.eINSTANCE.getIfcComplexProperty_UsageName());
	}

} //IfcComplexPropertyImpl
