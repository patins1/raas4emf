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
import IFC2X3.IfcMechanicalConcreteMaterialProperties;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Ifc Mechanical Concrete Material Properties</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link IFC2X3.impl.IfcMechanicalConcreteMaterialPropertiesImpl#getCompressiveStrength <em>Compressive Strength</em>}</li>
 *   <li>{@link IFC2X3.impl.IfcMechanicalConcreteMaterialPropertiesImpl#getMaxAggregateSize <em>Max Aggregate Size</em>}</li>
 *   <li>{@link IFC2X3.impl.IfcMechanicalConcreteMaterialPropertiesImpl#getAdmixturesDescription <em>Admixtures Description</em>}</li>
 *   <li>{@link IFC2X3.impl.IfcMechanicalConcreteMaterialPropertiesImpl#getWorkability <em>Workability</em>}</li>
 *   <li>{@link IFC2X3.impl.IfcMechanicalConcreteMaterialPropertiesImpl#getProtectivePoreRatio <em>Protective Pore Ratio</em>}</li>
 *   <li>{@link IFC2X3.impl.IfcMechanicalConcreteMaterialPropertiesImpl#getWaterImpermeability <em>Water Impermeability</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
@XmlType(name = "IfcMechanicalConcreteMaterialProperties")
@XmlRootElement(name = "IfcMechanicalConcreteMaterialPropertiesElement")
public class IfcMechanicalConcreteMaterialPropertiesImpl extends IfcMechanicalMaterialPropertiesImpl implements IfcMechanicalConcreteMaterialProperties {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected IfcMechanicalConcreteMaterialPropertiesImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return IFC2X3Package.eINSTANCE.getIfcMechanicalConcreteMaterialProperties();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getWaterImpermeability() {
		return (String)eGet(IFC2X3Package.eINSTANCE.getIfcMechanicalConcreteMaterialProperties_WaterImpermeability(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setWaterImpermeability(String newWaterImpermeability) {
		eSet(IFC2X3Package.eINSTANCE.getIfcMechanicalConcreteMaterialProperties_WaterImpermeability(), newWaterImpermeability);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetWaterImpermeability() {
		eUnset(IFC2X3Package.eINSTANCE.getIfcMechanicalConcreteMaterialProperties_WaterImpermeability());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetWaterImpermeability() {
		return eIsSet(IFC2X3Package.eINSTANCE.getIfcMechanicalConcreteMaterialProperties_WaterImpermeability());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Double getProtectivePoreRatio() {
		return (Double)eGet(IFC2X3Package.eINSTANCE.getIfcMechanicalConcreteMaterialProperties_ProtectivePoreRatio(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setProtectivePoreRatio(Double newProtectivePoreRatio) {
		eSet(IFC2X3Package.eINSTANCE.getIfcMechanicalConcreteMaterialProperties_ProtectivePoreRatio(), newProtectivePoreRatio);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetProtectivePoreRatio() {
		eUnset(IFC2X3Package.eINSTANCE.getIfcMechanicalConcreteMaterialProperties_ProtectivePoreRatio());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetProtectivePoreRatio() {
		return eIsSet(IFC2X3Package.eINSTANCE.getIfcMechanicalConcreteMaterialProperties_ProtectivePoreRatio());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getWorkability() {
		return (String)eGet(IFC2X3Package.eINSTANCE.getIfcMechanicalConcreteMaterialProperties_Workability(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setWorkability(String newWorkability) {
		eSet(IFC2X3Package.eINSTANCE.getIfcMechanicalConcreteMaterialProperties_Workability(), newWorkability);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetWorkability() {
		eUnset(IFC2X3Package.eINSTANCE.getIfcMechanicalConcreteMaterialProperties_Workability());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetWorkability() {
		return eIsSet(IFC2X3Package.eINSTANCE.getIfcMechanicalConcreteMaterialProperties_Workability());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getAdmixturesDescription() {
		return (String)eGet(IFC2X3Package.eINSTANCE.getIfcMechanicalConcreteMaterialProperties_AdmixturesDescription(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAdmixturesDescription(String newAdmixturesDescription) {
		eSet(IFC2X3Package.eINSTANCE.getIfcMechanicalConcreteMaterialProperties_AdmixturesDescription(), newAdmixturesDescription);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetAdmixturesDescription() {
		eUnset(IFC2X3Package.eINSTANCE.getIfcMechanicalConcreteMaterialProperties_AdmixturesDescription());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetAdmixturesDescription() {
		return eIsSet(IFC2X3Package.eINSTANCE.getIfcMechanicalConcreteMaterialProperties_AdmixturesDescription());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Double getMaxAggregateSize() {
		return (Double)eGet(IFC2X3Package.eINSTANCE.getIfcMechanicalConcreteMaterialProperties_MaxAggregateSize(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMaxAggregateSize(Double newMaxAggregateSize) {
		eSet(IFC2X3Package.eINSTANCE.getIfcMechanicalConcreteMaterialProperties_MaxAggregateSize(), newMaxAggregateSize);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetMaxAggregateSize() {
		eUnset(IFC2X3Package.eINSTANCE.getIfcMechanicalConcreteMaterialProperties_MaxAggregateSize());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetMaxAggregateSize() {
		return eIsSet(IFC2X3Package.eINSTANCE.getIfcMechanicalConcreteMaterialProperties_MaxAggregateSize());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Double getCompressiveStrength() {
		return (Double)eGet(IFC2X3Package.eINSTANCE.getIfcMechanicalConcreteMaterialProperties_CompressiveStrength(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCompressiveStrength(Double newCompressiveStrength) {
		eSet(IFC2X3Package.eINSTANCE.getIfcMechanicalConcreteMaterialProperties_CompressiveStrength(), newCompressiveStrength);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetCompressiveStrength() {
		eUnset(IFC2X3Package.eINSTANCE.getIfcMechanicalConcreteMaterialProperties_CompressiveStrength());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetCompressiveStrength() {
		return eIsSet(IFC2X3Package.eINSTANCE.getIfcMechanicalConcreteMaterialProperties_CompressiveStrength());
	}

} //IfcMechanicalConcreteMaterialPropertiesImpl
