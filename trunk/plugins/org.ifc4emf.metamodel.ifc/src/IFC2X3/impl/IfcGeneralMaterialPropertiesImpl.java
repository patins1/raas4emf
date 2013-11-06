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
import IFC2X3.IfcGeneralMaterialProperties;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Ifc General Material Properties</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link IFC2X3.impl.IfcGeneralMaterialPropertiesImpl#getMolecularWeight <em>Molecular Weight</em>}</li>
 *   <li>{@link IFC2X3.impl.IfcGeneralMaterialPropertiesImpl#getPorosity <em>Porosity</em>}</li>
 *   <li>{@link IFC2X3.impl.IfcGeneralMaterialPropertiesImpl#getMassDensity <em>Mass Density</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
@XmlType(name = "IfcGeneralMaterialProperties")
@XmlRootElement(name = "IfcGeneralMaterialPropertiesElement")
public class IfcGeneralMaterialPropertiesImpl extends IfcMaterialPropertiesImpl implements IfcGeneralMaterialProperties {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected IfcGeneralMaterialPropertiesImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return IFC2X3Package.eINSTANCE.getIfcGeneralMaterialProperties();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Double getMassDensity() {
		return (Double)eGet(IFC2X3Package.eINSTANCE.getIfcGeneralMaterialProperties_MassDensity(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMassDensity(Double newMassDensity) {
		eSet(IFC2X3Package.eINSTANCE.getIfcGeneralMaterialProperties_MassDensity(), newMassDensity);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetMassDensity() {
		eUnset(IFC2X3Package.eINSTANCE.getIfcGeneralMaterialProperties_MassDensity());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetMassDensity() {
		return eIsSet(IFC2X3Package.eINSTANCE.getIfcGeneralMaterialProperties_MassDensity());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Double getPorosity() {
		return (Double)eGet(IFC2X3Package.eINSTANCE.getIfcGeneralMaterialProperties_Porosity(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPorosity(Double newPorosity) {
		eSet(IFC2X3Package.eINSTANCE.getIfcGeneralMaterialProperties_Porosity(), newPorosity);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetPorosity() {
		eUnset(IFC2X3Package.eINSTANCE.getIfcGeneralMaterialProperties_Porosity());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetPorosity() {
		return eIsSet(IFC2X3Package.eINSTANCE.getIfcGeneralMaterialProperties_Porosity());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Double getMolecularWeight() {
		return (Double)eGet(IFC2X3Package.eINSTANCE.getIfcGeneralMaterialProperties_MolecularWeight(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMolecularWeight(Double newMolecularWeight) {
		eSet(IFC2X3Package.eINSTANCE.getIfcGeneralMaterialProperties_MolecularWeight(), newMolecularWeight);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetMolecularWeight() {
		eUnset(IFC2X3Package.eINSTANCE.getIfcGeneralMaterialProperties_MolecularWeight());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetMolecularWeight() {
		return eIsSet(IFC2X3Package.eINSTANCE.getIfcGeneralMaterialProperties_MolecularWeight());
	}

} //IfcGeneralMaterialPropertiesImpl
