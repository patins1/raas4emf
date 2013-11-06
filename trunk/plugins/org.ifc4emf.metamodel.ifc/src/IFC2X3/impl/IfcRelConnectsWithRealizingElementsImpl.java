/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package IFC2X3.impl;

import IFC2X3.IFC2X3Package;
import IFC2X3.IfcElement;
import IFC2X3.IfcRelConnectsWithRealizingElements;

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
 * An implementation of the model object '<em><b>Ifc Rel Connects With Realizing Elements</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link IFC2X3.impl.IfcRelConnectsWithRealizingElementsImpl#getRealizingElements <em>Realizing Elements</em>}</li>
 *   <li>{@link IFC2X3.impl.IfcRelConnectsWithRealizingElementsImpl#getConnectionType <em>Connection Type</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
@XmlType(name = "IfcRelConnectsWithRealizingElements")
@XmlRootElement(name = "IfcRelConnectsWithRealizingElementsElement")
public class IfcRelConnectsWithRealizingElementsImpl extends IfcRelConnectsElementsImpl implements IfcRelConnectsWithRealizingElements {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected IfcRelConnectsWithRealizingElementsImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return IFC2X3Package.eINSTANCE.getIfcRelConnectsWithRealizingElements();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public EList<IfcElement> getRealizingElements() {
		return (EList<IfcElement>)eGet(IFC2X3Package.eINSTANCE.getIfcRelConnectsWithRealizingElements_RealizingElements(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getConnectionType() {
		return (String)eGet(IFC2X3Package.eINSTANCE.getIfcRelConnectsWithRealizingElements_ConnectionType(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setConnectionType(String newConnectionType) {
		eSet(IFC2X3Package.eINSTANCE.getIfcRelConnectsWithRealizingElements_ConnectionType(), newConnectionType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetConnectionType() {
		eUnset(IFC2X3Package.eINSTANCE.getIfcRelConnectsWithRealizingElements_ConnectionType());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetConnectionType() {
		return eIsSet(IFC2X3Package.eINSTANCE.getIfcRelConnectsWithRealizingElements_ConnectionType());
	}

} //IfcRelConnectsWithRealizingElementsImpl
