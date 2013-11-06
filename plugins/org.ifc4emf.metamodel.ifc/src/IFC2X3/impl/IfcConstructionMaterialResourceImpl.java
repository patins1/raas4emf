/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package IFC2X3.impl;

import IFC2X3.IFC2X3Package;
import IFC2X3.IfcActorSelect;
import IFC2X3.IfcConstructionMaterialResource;

import java.util.Collection;

import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Ifc Construction Material Resource</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link IFC2X3.impl.IfcConstructionMaterialResourceImpl#getSuppliers <em>Suppliers</em>}</li>
 *   <li>{@link IFC2X3.impl.IfcConstructionMaterialResourceImpl#getUsageRatio <em>Usage Ratio</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
@XmlType(name = "IfcConstructionMaterialResource")
@XmlRootElement(name = "IfcConstructionMaterialResourceElement")
public class IfcConstructionMaterialResourceImpl extends IfcConstructionResourceImpl implements IfcConstructionMaterialResource {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected IfcConstructionMaterialResourceImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return IFC2X3Package.eINSTANCE.getIfcConstructionMaterialResource();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public EList<IfcActorSelect> getSuppliers() {
		return (EList<IfcActorSelect>)eGet(IFC2X3Package.eINSTANCE.getIfcConstructionMaterialResource_Suppliers(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Double getUsageRatio() {
		return (Double)eGet(IFC2X3Package.eINSTANCE.getIfcConstructionMaterialResource_UsageRatio(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setUsageRatio(Double newUsageRatio) {
		eSet(IFC2X3Package.eINSTANCE.getIfcConstructionMaterialResource_UsageRatio(), newUsageRatio);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetUsageRatio() {
		eUnset(IFC2X3Package.eINSTANCE.getIfcConstructionMaterialResource_UsageRatio());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetUsageRatio() {
		return eIsSet(IFC2X3Package.eINSTANCE.getIfcConstructionMaterialResource_UsageRatio());
	}

} //IfcConstructionMaterialResourceImpl
