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
import IFC2X3.IfcBuildingElementProxy;
import IFC2X3.IfcElementCompositionEnum;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Ifc Building Element Proxy</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link IFC2X3.impl.IfcBuildingElementProxyImpl#getCompositionType <em>Composition Type</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
@XmlType(name = "IfcBuildingElementProxy")
@XmlRootElement(name = "IfcBuildingElementProxyElement")
public class IfcBuildingElementProxyImpl extends IfcBuildingElementImpl implements IfcBuildingElementProxy {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected IfcBuildingElementProxyImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return IFC2X3Package.eINSTANCE.getIfcBuildingElementProxy();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcElementCompositionEnum getCompositionType() {
		return (IfcElementCompositionEnum)eGet(IFC2X3Package.eINSTANCE.getIfcBuildingElementProxy_CompositionType(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCompositionType(IfcElementCompositionEnum newCompositionType) {
		eSet(IFC2X3Package.eINSTANCE.getIfcBuildingElementProxy_CompositionType(), newCompositionType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetCompositionType() {
		eUnset(IFC2X3Package.eINSTANCE.getIfcBuildingElementProxy_CompositionType());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetCompositionType() {
		return eIsSet(IFC2X3Package.eINSTANCE.getIfcBuildingElementProxy_CompositionType());
	}

} //IfcBuildingElementProxyImpl
