/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package IFC2X3.impl;

import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;

import IFC2X3.IFC2X3Package;
import IFC2X3.IfcMaterial;
import IFC2X3.IfcMaterialProperties;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.internal.cdo.CDOObjectImpl;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Ifc Material Properties</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link IFC2X3.impl.IfcMaterialPropertiesImpl#getMaterial <em>Material</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
@XmlType(name = "IfcMaterialProperties")
@XmlSeeAlso({ IfcMechanicalSteelMaterialPropertiesImpl.class, IfcOpticalMaterialPropertiesImpl.class, IfcGeneralMaterialPropertiesImpl.class, IfcThermalMaterialPropertiesImpl.class, IfcMechanicalConcreteMaterialPropertiesImpl.class, IfcHygroscopicMaterialPropertiesImpl.class,
		IfcWaterPropertiesImpl.class, IfcFuelPropertiesImpl.class, IfcMechanicalMaterialPropertiesImpl.class, IfcProductsOfCombustionPropertiesImpl.class, IfcExtendedMaterialPropertiesImpl.class })
@XmlRootElement(name = "IfcMaterialPropertiesElement")
public class IfcMaterialPropertiesImpl extends CDOObjectImpl implements IfcMaterialProperties {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected IfcMaterialPropertiesImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return IFC2X3Package.eINSTANCE.getIfcMaterialProperties();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected int eStaticFeatureCount() {
		return 0;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcMaterial getMaterial() {
		return (IfcMaterial)eGet(IFC2X3Package.eINSTANCE.getIfcMaterialProperties_Material(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMaterial(IfcMaterial newMaterial) {
		eSet(IFC2X3Package.eINSTANCE.getIfcMaterialProperties_Material(), newMaterial);
	}

} //IfcMaterialPropertiesImpl
