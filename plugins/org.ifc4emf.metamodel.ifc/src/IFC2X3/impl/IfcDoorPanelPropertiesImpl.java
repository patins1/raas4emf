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
import IFC2X3.IfcDoorPanelOperationEnum;
import IFC2X3.IfcDoorPanelPositionEnum;
import IFC2X3.IfcDoorPanelProperties;
import IFC2X3.IfcShapeAspect;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Ifc Door Panel Properties</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link IFC2X3.impl.IfcDoorPanelPropertiesImpl#getPanelDepth <em>Panel Depth</em>}</li>
 *   <li>{@link IFC2X3.impl.IfcDoorPanelPropertiesImpl#getPanelOperation <em>Panel Operation</em>}</li>
 *   <li>{@link IFC2X3.impl.IfcDoorPanelPropertiesImpl#getPanelWidth <em>Panel Width</em>}</li>
 *   <li>{@link IFC2X3.impl.IfcDoorPanelPropertiesImpl#getPanelPosition <em>Panel Position</em>}</li>
 *   <li>{@link IFC2X3.impl.IfcDoorPanelPropertiesImpl#getShapeAspectStyle <em>Shape Aspect Style</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
@XmlType(name = "IfcDoorPanelProperties")
@XmlRootElement(name = "IfcDoorPanelPropertiesElement")
public class IfcDoorPanelPropertiesImpl extends IfcPropertySetDefinitionImpl implements IfcDoorPanelProperties {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected IfcDoorPanelPropertiesImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return IFC2X3Package.eINSTANCE.getIfcDoorPanelProperties();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcShapeAspect getShapeAspectStyle() {
		return (IfcShapeAspect)eGet(IFC2X3Package.eINSTANCE.getIfcDoorPanelProperties_ShapeAspectStyle(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setShapeAspectStyle(IfcShapeAspect newShapeAspectStyle) {
		eSet(IFC2X3Package.eINSTANCE.getIfcDoorPanelProperties_ShapeAspectStyle(), newShapeAspectStyle);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcDoorPanelPositionEnum getPanelPosition() {
		return (IfcDoorPanelPositionEnum)eGet(IFC2X3Package.eINSTANCE.getIfcDoorPanelProperties_PanelPosition(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPanelPosition(IfcDoorPanelPositionEnum newPanelPosition) {
		eSet(IFC2X3Package.eINSTANCE.getIfcDoorPanelProperties_PanelPosition(), newPanelPosition);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetPanelPosition() {
		eUnset(IFC2X3Package.eINSTANCE.getIfcDoorPanelProperties_PanelPosition());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetPanelPosition() {
		return eIsSet(IFC2X3Package.eINSTANCE.getIfcDoorPanelProperties_PanelPosition());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Double getPanelWidth() {
		return (Double)eGet(IFC2X3Package.eINSTANCE.getIfcDoorPanelProperties_PanelWidth(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPanelWidth(Double newPanelWidth) {
		eSet(IFC2X3Package.eINSTANCE.getIfcDoorPanelProperties_PanelWidth(), newPanelWidth);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetPanelWidth() {
		eUnset(IFC2X3Package.eINSTANCE.getIfcDoorPanelProperties_PanelWidth());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetPanelWidth() {
		return eIsSet(IFC2X3Package.eINSTANCE.getIfcDoorPanelProperties_PanelWidth());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcDoorPanelOperationEnum getPanelOperation() {
		return (IfcDoorPanelOperationEnum)eGet(IFC2X3Package.eINSTANCE.getIfcDoorPanelProperties_PanelOperation(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPanelOperation(IfcDoorPanelOperationEnum newPanelOperation) {
		eSet(IFC2X3Package.eINSTANCE.getIfcDoorPanelProperties_PanelOperation(), newPanelOperation);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetPanelOperation() {
		eUnset(IFC2X3Package.eINSTANCE.getIfcDoorPanelProperties_PanelOperation());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetPanelOperation() {
		return eIsSet(IFC2X3Package.eINSTANCE.getIfcDoorPanelProperties_PanelOperation());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Double getPanelDepth() {
		return (Double)eGet(IFC2X3Package.eINSTANCE.getIfcDoorPanelProperties_PanelDepth(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPanelDepth(Double newPanelDepth) {
		eSet(IFC2X3Package.eINSTANCE.getIfcDoorPanelProperties_PanelDepth(), newPanelDepth);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetPanelDepth() {
		eUnset(IFC2X3Package.eINSTANCE.getIfcDoorPanelProperties_PanelDepth());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetPanelDepth() {
		return eIsSet(IFC2X3Package.eINSTANCE.getIfcDoorPanelProperties_PanelDepth());
	}

} //IfcDoorPanelPropertiesImpl
