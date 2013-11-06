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
import IFC2X3.IfcShapeAspect;
import IFC2X3.IfcWindowPanelOperationEnum;
import IFC2X3.IfcWindowPanelPositionEnum;
import IFC2X3.IfcWindowPanelProperties;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Ifc Window Panel Properties</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link IFC2X3.impl.IfcWindowPanelPropertiesImpl#getOperationType <em>Operation Type</em>}</li>
 *   <li>{@link IFC2X3.impl.IfcWindowPanelPropertiesImpl#getPanelPosition <em>Panel Position</em>}</li>
 *   <li>{@link IFC2X3.impl.IfcWindowPanelPropertiesImpl#getFrameDepth <em>Frame Depth</em>}</li>
 *   <li>{@link IFC2X3.impl.IfcWindowPanelPropertiesImpl#getFrameThickness <em>Frame Thickness</em>}</li>
 *   <li>{@link IFC2X3.impl.IfcWindowPanelPropertiesImpl#getShapeAspectStyle <em>Shape Aspect Style</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
@XmlType(name = "IfcWindowPanelProperties")
@XmlRootElement(name = "IfcWindowPanelPropertiesElement")
public class IfcWindowPanelPropertiesImpl extends IfcPropertySetDefinitionImpl implements IfcWindowPanelProperties {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected IfcWindowPanelPropertiesImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return IFC2X3Package.eINSTANCE.getIfcWindowPanelProperties();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcShapeAspect getShapeAspectStyle() {
		return (IfcShapeAspect)eGet(IFC2X3Package.eINSTANCE.getIfcWindowPanelProperties_ShapeAspectStyle(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setShapeAspectStyle(IfcShapeAspect newShapeAspectStyle) {
		eSet(IFC2X3Package.eINSTANCE.getIfcWindowPanelProperties_ShapeAspectStyle(), newShapeAspectStyle);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Double getFrameThickness() {
		return (Double)eGet(IFC2X3Package.eINSTANCE.getIfcWindowPanelProperties_FrameThickness(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFrameThickness(Double newFrameThickness) {
		eSet(IFC2X3Package.eINSTANCE.getIfcWindowPanelProperties_FrameThickness(), newFrameThickness);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetFrameThickness() {
		eUnset(IFC2X3Package.eINSTANCE.getIfcWindowPanelProperties_FrameThickness());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetFrameThickness() {
		return eIsSet(IFC2X3Package.eINSTANCE.getIfcWindowPanelProperties_FrameThickness());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Double getFrameDepth() {
		return (Double)eGet(IFC2X3Package.eINSTANCE.getIfcWindowPanelProperties_FrameDepth(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFrameDepth(Double newFrameDepth) {
		eSet(IFC2X3Package.eINSTANCE.getIfcWindowPanelProperties_FrameDepth(), newFrameDepth);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetFrameDepth() {
		eUnset(IFC2X3Package.eINSTANCE.getIfcWindowPanelProperties_FrameDepth());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetFrameDepth() {
		return eIsSet(IFC2X3Package.eINSTANCE.getIfcWindowPanelProperties_FrameDepth());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcWindowPanelPositionEnum getPanelPosition() {
		return (IfcWindowPanelPositionEnum)eGet(IFC2X3Package.eINSTANCE.getIfcWindowPanelProperties_PanelPosition(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPanelPosition(IfcWindowPanelPositionEnum newPanelPosition) {
		eSet(IFC2X3Package.eINSTANCE.getIfcWindowPanelProperties_PanelPosition(), newPanelPosition);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetPanelPosition() {
		eUnset(IFC2X3Package.eINSTANCE.getIfcWindowPanelProperties_PanelPosition());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetPanelPosition() {
		return eIsSet(IFC2X3Package.eINSTANCE.getIfcWindowPanelProperties_PanelPosition());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcWindowPanelOperationEnum getOperationType() {
		return (IfcWindowPanelOperationEnum)eGet(IFC2X3Package.eINSTANCE.getIfcWindowPanelProperties_OperationType(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOperationType(IfcWindowPanelOperationEnum newOperationType) {
		eSet(IFC2X3Package.eINSTANCE.getIfcWindowPanelProperties_OperationType(), newOperationType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetOperationType() {
		eUnset(IFC2X3Package.eINSTANCE.getIfcWindowPanelProperties_OperationType());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetOperationType() {
		return eIsSet(IFC2X3Package.eINSTANCE.getIfcWindowPanelProperties_OperationType());
	}

} //IfcWindowPanelPropertiesImpl
