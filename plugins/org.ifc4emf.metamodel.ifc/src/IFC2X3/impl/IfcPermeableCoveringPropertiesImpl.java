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
import IFC2X3.IfcPermeableCoveringOperationEnum;
import IFC2X3.IfcPermeableCoveringProperties;
import IFC2X3.IfcShapeAspect;
import IFC2X3.IfcWindowPanelPositionEnum;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Ifc Permeable Covering Properties</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link IFC2X3.impl.IfcPermeableCoveringPropertiesImpl#getOperationType <em>Operation Type</em>}</li>
 *   <li>{@link IFC2X3.impl.IfcPermeableCoveringPropertiesImpl#getPanelPosition <em>Panel Position</em>}</li>
 *   <li>{@link IFC2X3.impl.IfcPermeableCoveringPropertiesImpl#getFrameDepth <em>Frame Depth</em>}</li>
 *   <li>{@link IFC2X3.impl.IfcPermeableCoveringPropertiesImpl#getFrameThickness <em>Frame Thickness</em>}</li>
 *   <li>{@link IFC2X3.impl.IfcPermeableCoveringPropertiesImpl#getShapeAspectStyle <em>Shape Aspect Style</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
@XmlType(name = "IfcPermeableCoveringProperties")
@XmlRootElement(name = "IfcPermeableCoveringPropertiesElement")
public class IfcPermeableCoveringPropertiesImpl extends IfcPropertySetDefinitionImpl implements IfcPermeableCoveringProperties {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected IfcPermeableCoveringPropertiesImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return IFC2X3Package.eINSTANCE.getIfcPermeableCoveringProperties();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcShapeAspect getShapeAspectStyle() {
		return (IfcShapeAspect)eGet(IFC2X3Package.eINSTANCE.getIfcPermeableCoveringProperties_ShapeAspectStyle(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setShapeAspectStyle(IfcShapeAspect newShapeAspectStyle) {
		eSet(IFC2X3Package.eINSTANCE.getIfcPermeableCoveringProperties_ShapeAspectStyle(), newShapeAspectStyle);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Double getFrameThickness() {
		return (Double)eGet(IFC2X3Package.eINSTANCE.getIfcPermeableCoveringProperties_FrameThickness(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFrameThickness(Double newFrameThickness) {
		eSet(IFC2X3Package.eINSTANCE.getIfcPermeableCoveringProperties_FrameThickness(), newFrameThickness);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetFrameThickness() {
		eUnset(IFC2X3Package.eINSTANCE.getIfcPermeableCoveringProperties_FrameThickness());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetFrameThickness() {
		return eIsSet(IFC2X3Package.eINSTANCE.getIfcPermeableCoveringProperties_FrameThickness());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Double getFrameDepth() {
		return (Double)eGet(IFC2X3Package.eINSTANCE.getIfcPermeableCoveringProperties_FrameDepth(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFrameDepth(Double newFrameDepth) {
		eSet(IFC2X3Package.eINSTANCE.getIfcPermeableCoveringProperties_FrameDepth(), newFrameDepth);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetFrameDepth() {
		eUnset(IFC2X3Package.eINSTANCE.getIfcPermeableCoveringProperties_FrameDepth());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetFrameDepth() {
		return eIsSet(IFC2X3Package.eINSTANCE.getIfcPermeableCoveringProperties_FrameDepth());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcWindowPanelPositionEnum getPanelPosition() {
		return (IfcWindowPanelPositionEnum)eGet(IFC2X3Package.eINSTANCE.getIfcPermeableCoveringProperties_PanelPosition(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPanelPosition(IfcWindowPanelPositionEnum newPanelPosition) {
		eSet(IFC2X3Package.eINSTANCE.getIfcPermeableCoveringProperties_PanelPosition(), newPanelPosition);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetPanelPosition() {
		eUnset(IFC2X3Package.eINSTANCE.getIfcPermeableCoveringProperties_PanelPosition());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetPanelPosition() {
		return eIsSet(IFC2X3Package.eINSTANCE.getIfcPermeableCoveringProperties_PanelPosition());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcPermeableCoveringOperationEnum getOperationType() {
		return (IfcPermeableCoveringOperationEnum)eGet(IFC2X3Package.eINSTANCE.getIfcPermeableCoveringProperties_OperationType(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOperationType(IfcPermeableCoveringOperationEnum newOperationType) {
		eSet(IFC2X3Package.eINSTANCE.getIfcPermeableCoveringProperties_OperationType(), newOperationType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetOperationType() {
		eUnset(IFC2X3Package.eINSTANCE.getIfcPermeableCoveringProperties_OperationType());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetOperationType() {
		return eIsSet(IFC2X3Package.eINSTANCE.getIfcPermeableCoveringProperties_OperationType());
	}

} //IfcPermeableCoveringPropertiesImpl
