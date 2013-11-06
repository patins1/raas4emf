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
import IFC2X3.IfcMaterial;
import IFC2X3.IfcMaterialLayer;
import IFC2X3.IfcMaterialLayerSet;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Ifc Material Layer</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link IFC2X3.impl.IfcMaterialLayerImpl#getMaterial <em>Material</em>}</li>
 *   <li>{@link IFC2X3.impl.IfcMaterialLayerImpl#getLayerThickness <em>Layer Thickness</em>}</li>
 *   <li>{@link IFC2X3.impl.IfcMaterialLayerImpl#getIsVentilated <em>Is Ventilated</em>}</li>
 *   <li>{@link IFC2X3.impl.IfcMaterialLayerImpl#getToMaterialLayerSet <em>To Material Layer Set</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
@XmlType(name = "IfcMaterialLayer")
@XmlRootElement(name = "IfcMaterialLayerElement")
public class IfcMaterialLayerImpl extends IfcMaterialSelectImpl implements IfcMaterialLayer {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected IfcMaterialLayerImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return IFC2X3Package.eINSTANCE.getIfcMaterialLayer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcMaterialLayerSet getToMaterialLayerSet() {
		return (IfcMaterialLayerSet)eGet(IFC2X3Package.eINSTANCE.getIfcMaterialLayer_ToMaterialLayerSet(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setToMaterialLayerSet(IfcMaterialLayerSet newToMaterialLayerSet) {
		eSet(IFC2X3Package.eINSTANCE.getIfcMaterialLayer_ToMaterialLayerSet(), newToMaterialLayerSet);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcMaterial getMaterial() {
		return (IfcMaterial)eGet(IFC2X3Package.eINSTANCE.getIfcMaterialLayer_Material(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMaterial(IfcMaterial newMaterial) {
		eSet(IFC2X3Package.eINSTANCE.getIfcMaterialLayer_Material(), newMaterial);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Boolean getIsVentilated() {
		return (Boolean)eGet(IFC2X3Package.eINSTANCE.getIfcMaterialLayer_IsVentilated(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIsVentilated(Boolean newIsVentilated) {
		eSet(IFC2X3Package.eINSTANCE.getIfcMaterialLayer_IsVentilated(), newIsVentilated);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetIsVentilated() {
		eUnset(IFC2X3Package.eINSTANCE.getIfcMaterialLayer_IsVentilated());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetIsVentilated() {
		return eIsSet(IFC2X3Package.eINSTANCE.getIfcMaterialLayer_IsVentilated());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Double getLayerThickness() {
		return (Double)eGet(IFC2X3Package.eINSTANCE.getIfcMaterialLayer_LayerThickness(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLayerThickness(Double newLayerThickness) {
		eSet(IFC2X3Package.eINSTANCE.getIfcMaterialLayer_LayerThickness(), newLayerThickness);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetLayerThickness() {
		eUnset(IFC2X3Package.eINSTANCE.getIfcMaterialLayer_LayerThickness());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetLayerThickness() {
		return eIsSet(IFC2X3Package.eINSTANCE.getIfcMaterialLayer_LayerThickness());
	}

} //IfcMaterialLayerImpl
