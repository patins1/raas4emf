/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package IFC2X3.impl;

import IFC2X3.IFC2X3Package;
import IFC2X3.IfcMaterialLayer;
import IFC2X3.IfcMaterialLayerSet;

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
 * An implementation of the model object '<em><b>Ifc Material Layer Set</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link IFC2X3.impl.IfcMaterialLayerSetImpl#getMaterialLayers <em>Material Layers</em>}</li>
 *   <li>{@link IFC2X3.impl.IfcMaterialLayerSetImpl#getLayerSetName <em>Layer Set Name</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
@XmlType(name = "IfcMaterialLayerSet")
@XmlRootElement(name = "IfcMaterialLayerSetElement")
public class IfcMaterialLayerSetImpl extends IfcMaterialSelectImpl implements IfcMaterialLayerSet {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected IfcMaterialLayerSetImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return IFC2X3Package.eINSTANCE.getIfcMaterialLayerSet();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public EList<IfcMaterialLayer> getMaterialLayers() {
		return (EList<IfcMaterialLayer>)eGet(IFC2X3Package.eINSTANCE.getIfcMaterialLayerSet_MaterialLayers(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getLayerSetName() {
		return (String)eGet(IFC2X3Package.eINSTANCE.getIfcMaterialLayerSet_LayerSetName(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLayerSetName(String newLayerSetName) {
		eSet(IFC2X3Package.eINSTANCE.getIfcMaterialLayerSet_LayerSetName(), newLayerSetName);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetLayerSetName() {
		eUnset(IFC2X3Package.eINSTANCE.getIfcMaterialLayerSet_LayerSetName());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetLayerSetName() {
		return eIsSet(IFC2X3Package.eINSTANCE.getIfcMaterialLayerSet_LayerSetName());
	}

} //IfcMaterialLayerSetImpl
