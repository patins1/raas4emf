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
import IFC2X3.IfcDirectionSenseEnum;
import IFC2X3.IfcLayerSetDirectionEnum;
import IFC2X3.IfcMaterialLayerSet;
import IFC2X3.IfcMaterialLayerSetUsage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Ifc Material Layer Set Usage</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link IFC2X3.impl.IfcMaterialLayerSetUsageImpl#getForLayerSet <em>For Layer Set</em>}</li>
 *   <li>{@link IFC2X3.impl.IfcMaterialLayerSetUsageImpl#getLayerSetDirection <em>Layer Set Direction</em>}</li>
 *   <li>{@link IFC2X3.impl.IfcMaterialLayerSetUsageImpl#getDirectionSense <em>Direction Sense</em>}</li>
 *   <li>{@link IFC2X3.impl.IfcMaterialLayerSetUsageImpl#getOffsetFromReferenceLine <em>Offset From Reference Line</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
@XmlType(name = "IfcMaterialLayerSetUsage")
@XmlRootElement(name = "IfcMaterialLayerSetUsageElement")
public class IfcMaterialLayerSetUsageImpl extends IfcMaterialSelectImpl implements IfcMaterialLayerSetUsage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected IfcMaterialLayerSetUsageImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return IFC2X3Package.eINSTANCE.getIfcMaterialLayerSetUsage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcMaterialLayerSet getForLayerSet() {
		return (IfcMaterialLayerSet)eGet(IFC2X3Package.eINSTANCE.getIfcMaterialLayerSetUsage_ForLayerSet(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setForLayerSet(IfcMaterialLayerSet newForLayerSet) {
		eSet(IFC2X3Package.eINSTANCE.getIfcMaterialLayerSetUsage_ForLayerSet(), newForLayerSet);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Double getOffsetFromReferenceLine() {
		return (Double)eGet(IFC2X3Package.eINSTANCE.getIfcMaterialLayerSetUsage_OffsetFromReferenceLine(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOffsetFromReferenceLine(Double newOffsetFromReferenceLine) {
		eSet(IFC2X3Package.eINSTANCE.getIfcMaterialLayerSetUsage_OffsetFromReferenceLine(), newOffsetFromReferenceLine);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetOffsetFromReferenceLine() {
		eUnset(IFC2X3Package.eINSTANCE.getIfcMaterialLayerSetUsage_OffsetFromReferenceLine());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetOffsetFromReferenceLine() {
		return eIsSet(IFC2X3Package.eINSTANCE.getIfcMaterialLayerSetUsage_OffsetFromReferenceLine());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcDirectionSenseEnum getDirectionSense() {
		return (IfcDirectionSenseEnum)eGet(IFC2X3Package.eINSTANCE.getIfcMaterialLayerSetUsage_DirectionSense(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDirectionSense(IfcDirectionSenseEnum newDirectionSense) {
		eSet(IFC2X3Package.eINSTANCE.getIfcMaterialLayerSetUsage_DirectionSense(), newDirectionSense);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetDirectionSense() {
		eUnset(IFC2X3Package.eINSTANCE.getIfcMaterialLayerSetUsage_DirectionSense());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetDirectionSense() {
		return eIsSet(IFC2X3Package.eINSTANCE.getIfcMaterialLayerSetUsage_DirectionSense());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcLayerSetDirectionEnum getLayerSetDirection() {
		return (IfcLayerSetDirectionEnum)eGet(IFC2X3Package.eINSTANCE.getIfcMaterialLayerSetUsage_LayerSetDirection(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLayerSetDirection(IfcLayerSetDirectionEnum newLayerSetDirection) {
		eSet(IFC2X3Package.eINSTANCE.getIfcMaterialLayerSetUsage_LayerSetDirection(), newLayerSetDirection);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetLayerSetDirection() {
		eUnset(IFC2X3Package.eINSTANCE.getIfcMaterialLayerSetUsage_LayerSetDirection());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetLayerSetDirection() {
		return eIsSet(IFC2X3Package.eINSTANCE.getIfcMaterialLayerSetUsage_LayerSetDirection());
	}

} //IfcMaterialLayerSetUsageImpl
