/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package IFC2X3.impl;

import IFC2X3.IFC2X3Package;
import IFC2X3.IfcPresentationLayerWithStyle;
import IFC2X3.IfcPresentationStyleSelect;

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
 * An implementation of the model object '<em><b>Ifc Presentation Layer With Style</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link IFC2X3.impl.IfcPresentationLayerWithStyleImpl#getLayerOn <em>Layer On</em>}</li>
 *   <li>{@link IFC2X3.impl.IfcPresentationLayerWithStyleImpl#getLayerFrozen <em>Layer Frozen</em>}</li>
 *   <li>{@link IFC2X3.impl.IfcPresentationLayerWithStyleImpl#getLayerBlocked <em>Layer Blocked</em>}</li>
 *   <li>{@link IFC2X3.impl.IfcPresentationLayerWithStyleImpl#getLayerStyles <em>Layer Styles</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
@XmlType(name = "IfcPresentationLayerWithStyle")
@XmlRootElement(name = "IfcPresentationLayerWithStyleElement")
public class IfcPresentationLayerWithStyleImpl extends IfcPresentationLayerAssignmentImpl implements IfcPresentationLayerWithStyle {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected IfcPresentationLayerWithStyleImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return IFC2X3Package.eINSTANCE.getIfcPresentationLayerWithStyle();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public EList<IfcPresentationStyleSelect> getLayerStyles() {
		return (EList<IfcPresentationStyleSelect>)eGet(IFC2X3Package.eINSTANCE.getIfcPresentationLayerWithStyle_LayerStyles(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Boolean getLayerBlocked() {
		return (Boolean)eGet(IFC2X3Package.eINSTANCE.getIfcPresentationLayerWithStyle_LayerBlocked(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLayerBlocked(Boolean newLayerBlocked) {
		eSet(IFC2X3Package.eINSTANCE.getIfcPresentationLayerWithStyle_LayerBlocked(), newLayerBlocked);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetLayerBlocked() {
		eUnset(IFC2X3Package.eINSTANCE.getIfcPresentationLayerWithStyle_LayerBlocked());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetLayerBlocked() {
		return eIsSet(IFC2X3Package.eINSTANCE.getIfcPresentationLayerWithStyle_LayerBlocked());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Boolean getLayerFrozen() {
		return (Boolean)eGet(IFC2X3Package.eINSTANCE.getIfcPresentationLayerWithStyle_LayerFrozen(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLayerFrozen(Boolean newLayerFrozen) {
		eSet(IFC2X3Package.eINSTANCE.getIfcPresentationLayerWithStyle_LayerFrozen(), newLayerFrozen);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetLayerFrozen() {
		eUnset(IFC2X3Package.eINSTANCE.getIfcPresentationLayerWithStyle_LayerFrozen());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetLayerFrozen() {
		return eIsSet(IFC2X3Package.eINSTANCE.getIfcPresentationLayerWithStyle_LayerFrozen());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Boolean getLayerOn() {
		return (Boolean)eGet(IFC2X3Package.eINSTANCE.getIfcPresentationLayerWithStyle_LayerOn(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLayerOn(Boolean newLayerOn) {
		eSet(IFC2X3Package.eINSTANCE.getIfcPresentationLayerWithStyle_LayerOn(), newLayerOn);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetLayerOn() {
		eUnset(IFC2X3Package.eINSTANCE.getIfcPresentationLayerWithStyle_LayerOn());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetLayerOn() {
		return eIsSet(IFC2X3Package.eINSTANCE.getIfcPresentationLayerWithStyle_LayerOn());
	}

} //IfcPresentationLayerWithStyleImpl
