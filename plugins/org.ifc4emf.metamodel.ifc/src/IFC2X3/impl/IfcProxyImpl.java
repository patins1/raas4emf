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
import IFC2X3.IfcObjectTypeEnum;
import IFC2X3.IfcProxy;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Ifc Proxy</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link IFC2X3.impl.IfcProxyImpl#getProxyType <em>Proxy Type</em>}</li>
 *   <li>{@link IFC2X3.impl.IfcProxyImpl#getTag <em>Tag</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
@XmlType(name = "IfcProxy")
@XmlRootElement(name = "IfcProxyElement")
public class IfcProxyImpl extends IfcProductImpl implements IfcProxy {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected IfcProxyImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return IFC2X3Package.eINSTANCE.getIfcProxy();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getTag() {
		return (String)eGet(IFC2X3Package.eINSTANCE.getIfcProxy_Tag(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTag(String newTag) {
		eSet(IFC2X3Package.eINSTANCE.getIfcProxy_Tag(), newTag);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetTag() {
		eUnset(IFC2X3Package.eINSTANCE.getIfcProxy_Tag());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetTag() {
		return eIsSet(IFC2X3Package.eINSTANCE.getIfcProxy_Tag());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcObjectTypeEnum getProxyType() {
		return (IfcObjectTypeEnum)eGet(IFC2X3Package.eINSTANCE.getIfcProxy_ProxyType(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setProxyType(IfcObjectTypeEnum newProxyType) {
		eSet(IFC2X3Package.eINSTANCE.getIfcProxy_ProxyType(), newProxyType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetProxyType() {
		eUnset(IFC2X3Package.eINSTANCE.getIfcProxy_ProxyType());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetProxyType() {
		return eIsSet(IFC2X3Package.eINSTANCE.getIfcProxy_ProxyType());
	}

} //IfcProxyImpl
