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
import IFC2X3.IfcDoorLiningProperties;
import IFC2X3.IfcShapeAspect;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Ifc Door Lining Properties</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link IFC2X3.impl.IfcDoorLiningPropertiesImpl#getLiningDepth <em>Lining Depth</em>}</li>
 *   <li>{@link IFC2X3.impl.IfcDoorLiningPropertiesImpl#getLiningThickness <em>Lining Thickness</em>}</li>
 *   <li>{@link IFC2X3.impl.IfcDoorLiningPropertiesImpl#getThresholdDepth <em>Threshold Depth</em>}</li>
 *   <li>{@link IFC2X3.impl.IfcDoorLiningPropertiesImpl#getThresholdThickness <em>Threshold Thickness</em>}</li>
 *   <li>{@link IFC2X3.impl.IfcDoorLiningPropertiesImpl#getTransomThickness <em>Transom Thickness</em>}</li>
 *   <li>{@link IFC2X3.impl.IfcDoorLiningPropertiesImpl#getTransomOffset <em>Transom Offset</em>}</li>
 *   <li>{@link IFC2X3.impl.IfcDoorLiningPropertiesImpl#getLiningOffset <em>Lining Offset</em>}</li>
 *   <li>{@link IFC2X3.impl.IfcDoorLiningPropertiesImpl#getThresholdOffset <em>Threshold Offset</em>}</li>
 *   <li>{@link IFC2X3.impl.IfcDoorLiningPropertiesImpl#getCasingThickness <em>Casing Thickness</em>}</li>
 *   <li>{@link IFC2X3.impl.IfcDoorLiningPropertiesImpl#getCasingDepth <em>Casing Depth</em>}</li>
 *   <li>{@link IFC2X3.impl.IfcDoorLiningPropertiesImpl#getShapeAspectStyle <em>Shape Aspect Style</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
@XmlType(name = "IfcDoorLiningProperties")
@XmlRootElement(name = "IfcDoorLiningPropertiesElement")
public class IfcDoorLiningPropertiesImpl extends IfcPropertySetDefinitionImpl implements IfcDoorLiningProperties {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected IfcDoorLiningPropertiesImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return IFC2X3Package.eINSTANCE.getIfcDoorLiningProperties();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcShapeAspect getShapeAspectStyle() {
		return (IfcShapeAspect)eGet(IFC2X3Package.eINSTANCE.getIfcDoorLiningProperties_ShapeAspectStyle(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setShapeAspectStyle(IfcShapeAspect newShapeAspectStyle) {
		eSet(IFC2X3Package.eINSTANCE.getIfcDoorLiningProperties_ShapeAspectStyle(), newShapeAspectStyle);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Double getCasingDepth() {
		return (Double)eGet(IFC2X3Package.eINSTANCE.getIfcDoorLiningProperties_CasingDepth(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCasingDepth(Double newCasingDepth) {
		eSet(IFC2X3Package.eINSTANCE.getIfcDoorLiningProperties_CasingDepth(), newCasingDepth);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetCasingDepth() {
		eUnset(IFC2X3Package.eINSTANCE.getIfcDoorLiningProperties_CasingDepth());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetCasingDepth() {
		return eIsSet(IFC2X3Package.eINSTANCE.getIfcDoorLiningProperties_CasingDepth());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Double getCasingThickness() {
		return (Double)eGet(IFC2X3Package.eINSTANCE.getIfcDoorLiningProperties_CasingThickness(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCasingThickness(Double newCasingThickness) {
		eSet(IFC2X3Package.eINSTANCE.getIfcDoorLiningProperties_CasingThickness(), newCasingThickness);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetCasingThickness() {
		eUnset(IFC2X3Package.eINSTANCE.getIfcDoorLiningProperties_CasingThickness());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetCasingThickness() {
		return eIsSet(IFC2X3Package.eINSTANCE.getIfcDoorLiningProperties_CasingThickness());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Double getThresholdOffset() {
		return (Double)eGet(IFC2X3Package.eINSTANCE.getIfcDoorLiningProperties_ThresholdOffset(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setThresholdOffset(Double newThresholdOffset) {
		eSet(IFC2X3Package.eINSTANCE.getIfcDoorLiningProperties_ThresholdOffset(), newThresholdOffset);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetThresholdOffset() {
		eUnset(IFC2X3Package.eINSTANCE.getIfcDoorLiningProperties_ThresholdOffset());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetThresholdOffset() {
		return eIsSet(IFC2X3Package.eINSTANCE.getIfcDoorLiningProperties_ThresholdOffset());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Double getLiningOffset() {
		return (Double)eGet(IFC2X3Package.eINSTANCE.getIfcDoorLiningProperties_LiningOffset(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLiningOffset(Double newLiningOffset) {
		eSet(IFC2X3Package.eINSTANCE.getIfcDoorLiningProperties_LiningOffset(), newLiningOffset);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetLiningOffset() {
		eUnset(IFC2X3Package.eINSTANCE.getIfcDoorLiningProperties_LiningOffset());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetLiningOffset() {
		return eIsSet(IFC2X3Package.eINSTANCE.getIfcDoorLiningProperties_LiningOffset());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Double getTransomOffset() {
		return (Double)eGet(IFC2X3Package.eINSTANCE.getIfcDoorLiningProperties_TransomOffset(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTransomOffset(Double newTransomOffset) {
		eSet(IFC2X3Package.eINSTANCE.getIfcDoorLiningProperties_TransomOffset(), newTransomOffset);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetTransomOffset() {
		eUnset(IFC2X3Package.eINSTANCE.getIfcDoorLiningProperties_TransomOffset());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetTransomOffset() {
		return eIsSet(IFC2X3Package.eINSTANCE.getIfcDoorLiningProperties_TransomOffset());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Double getTransomThickness() {
		return (Double)eGet(IFC2X3Package.eINSTANCE.getIfcDoorLiningProperties_TransomThickness(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTransomThickness(Double newTransomThickness) {
		eSet(IFC2X3Package.eINSTANCE.getIfcDoorLiningProperties_TransomThickness(), newTransomThickness);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetTransomThickness() {
		eUnset(IFC2X3Package.eINSTANCE.getIfcDoorLiningProperties_TransomThickness());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetTransomThickness() {
		return eIsSet(IFC2X3Package.eINSTANCE.getIfcDoorLiningProperties_TransomThickness());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Double getThresholdThickness() {
		return (Double)eGet(IFC2X3Package.eINSTANCE.getIfcDoorLiningProperties_ThresholdThickness(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setThresholdThickness(Double newThresholdThickness) {
		eSet(IFC2X3Package.eINSTANCE.getIfcDoorLiningProperties_ThresholdThickness(), newThresholdThickness);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetThresholdThickness() {
		eUnset(IFC2X3Package.eINSTANCE.getIfcDoorLiningProperties_ThresholdThickness());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetThresholdThickness() {
		return eIsSet(IFC2X3Package.eINSTANCE.getIfcDoorLiningProperties_ThresholdThickness());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Double getThresholdDepth() {
		return (Double)eGet(IFC2X3Package.eINSTANCE.getIfcDoorLiningProperties_ThresholdDepth(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setThresholdDepth(Double newThresholdDepth) {
		eSet(IFC2X3Package.eINSTANCE.getIfcDoorLiningProperties_ThresholdDepth(), newThresholdDepth);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetThresholdDepth() {
		eUnset(IFC2X3Package.eINSTANCE.getIfcDoorLiningProperties_ThresholdDepth());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetThresholdDepth() {
		return eIsSet(IFC2X3Package.eINSTANCE.getIfcDoorLiningProperties_ThresholdDepth());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Double getLiningThickness() {
		return (Double)eGet(IFC2X3Package.eINSTANCE.getIfcDoorLiningProperties_LiningThickness(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLiningThickness(Double newLiningThickness) {
		eSet(IFC2X3Package.eINSTANCE.getIfcDoorLiningProperties_LiningThickness(), newLiningThickness);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetLiningThickness() {
		eUnset(IFC2X3Package.eINSTANCE.getIfcDoorLiningProperties_LiningThickness());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetLiningThickness() {
		return eIsSet(IFC2X3Package.eINSTANCE.getIfcDoorLiningProperties_LiningThickness());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Double getLiningDepth() {
		return (Double)eGet(IFC2X3Package.eINSTANCE.getIfcDoorLiningProperties_LiningDepth(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLiningDepth(Double newLiningDepth) {
		eSet(IFC2X3Package.eINSTANCE.getIfcDoorLiningProperties_LiningDepth(), newLiningDepth);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetLiningDepth() {
		eUnset(IFC2X3Package.eINSTANCE.getIfcDoorLiningProperties_LiningDepth());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetLiningDepth() {
		return eIsSet(IFC2X3Package.eINSTANCE.getIfcDoorLiningProperties_LiningDepth());
	}

} //IfcDoorLiningPropertiesImpl
