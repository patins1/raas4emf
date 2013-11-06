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
import IFC2X3.IfcWaterProperties;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Ifc Water Properties</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link IFC2X3.impl.IfcWaterPropertiesImpl#getIsPotable <em>Is Potable</em>}</li>
 *   <li>{@link IFC2X3.impl.IfcWaterPropertiesImpl#getHardness <em>Hardness</em>}</li>
 *   <li>{@link IFC2X3.impl.IfcWaterPropertiesImpl#getAlkalinityConcentration <em>Alkalinity Concentration</em>}</li>
 *   <li>{@link IFC2X3.impl.IfcWaterPropertiesImpl#getAcidityConcentration <em>Acidity Concentration</em>}</li>
 *   <li>{@link IFC2X3.impl.IfcWaterPropertiesImpl#getImpuritiesContent <em>Impurities Content</em>}</li>
 *   <li>{@link IFC2X3.impl.IfcWaterPropertiesImpl#getPHLevel <em>PH Level</em>}</li>
 *   <li>{@link IFC2X3.impl.IfcWaterPropertiesImpl#getDissolvedSolidsContent <em>Dissolved Solids Content</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
@XmlType(name = "IfcWaterProperties")
@XmlRootElement(name = "IfcWaterPropertiesElement")
public class IfcWaterPropertiesImpl extends IfcMaterialPropertiesImpl implements IfcWaterProperties {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected IfcWaterPropertiesImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return IFC2X3Package.eINSTANCE.getIfcWaterProperties();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Double getDissolvedSolidsContent() {
		return (Double)eGet(IFC2X3Package.eINSTANCE.getIfcWaterProperties_DissolvedSolidsContent(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDissolvedSolidsContent(Double newDissolvedSolidsContent) {
		eSet(IFC2X3Package.eINSTANCE.getIfcWaterProperties_DissolvedSolidsContent(), newDissolvedSolidsContent);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetDissolvedSolidsContent() {
		eUnset(IFC2X3Package.eINSTANCE.getIfcWaterProperties_DissolvedSolidsContent());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetDissolvedSolidsContent() {
		return eIsSet(IFC2X3Package.eINSTANCE.getIfcWaterProperties_DissolvedSolidsContent());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Double getPHLevel() {
		return (Double)eGet(IFC2X3Package.eINSTANCE.getIfcWaterProperties_PHLevel(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPHLevel(Double newPHLevel) {
		eSet(IFC2X3Package.eINSTANCE.getIfcWaterProperties_PHLevel(), newPHLevel);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetPHLevel() {
		eUnset(IFC2X3Package.eINSTANCE.getIfcWaterProperties_PHLevel());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetPHLevel() {
		return eIsSet(IFC2X3Package.eINSTANCE.getIfcWaterProperties_PHLevel());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Double getImpuritiesContent() {
		return (Double)eGet(IFC2X3Package.eINSTANCE.getIfcWaterProperties_ImpuritiesContent(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setImpuritiesContent(Double newImpuritiesContent) {
		eSet(IFC2X3Package.eINSTANCE.getIfcWaterProperties_ImpuritiesContent(), newImpuritiesContent);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetImpuritiesContent() {
		eUnset(IFC2X3Package.eINSTANCE.getIfcWaterProperties_ImpuritiesContent());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetImpuritiesContent() {
		return eIsSet(IFC2X3Package.eINSTANCE.getIfcWaterProperties_ImpuritiesContent());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Double getAcidityConcentration() {
		return (Double)eGet(IFC2X3Package.eINSTANCE.getIfcWaterProperties_AcidityConcentration(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAcidityConcentration(Double newAcidityConcentration) {
		eSet(IFC2X3Package.eINSTANCE.getIfcWaterProperties_AcidityConcentration(), newAcidityConcentration);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetAcidityConcentration() {
		eUnset(IFC2X3Package.eINSTANCE.getIfcWaterProperties_AcidityConcentration());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetAcidityConcentration() {
		return eIsSet(IFC2X3Package.eINSTANCE.getIfcWaterProperties_AcidityConcentration());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Double getAlkalinityConcentration() {
		return (Double)eGet(IFC2X3Package.eINSTANCE.getIfcWaterProperties_AlkalinityConcentration(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAlkalinityConcentration(Double newAlkalinityConcentration) {
		eSet(IFC2X3Package.eINSTANCE.getIfcWaterProperties_AlkalinityConcentration(), newAlkalinityConcentration);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetAlkalinityConcentration() {
		eUnset(IFC2X3Package.eINSTANCE.getIfcWaterProperties_AlkalinityConcentration());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetAlkalinityConcentration() {
		return eIsSet(IFC2X3Package.eINSTANCE.getIfcWaterProperties_AlkalinityConcentration());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Double getHardness() {
		return (Double)eGet(IFC2X3Package.eINSTANCE.getIfcWaterProperties_Hardness(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setHardness(Double newHardness) {
		eSet(IFC2X3Package.eINSTANCE.getIfcWaterProperties_Hardness(), newHardness);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetHardness() {
		eUnset(IFC2X3Package.eINSTANCE.getIfcWaterProperties_Hardness());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetHardness() {
		return eIsSet(IFC2X3Package.eINSTANCE.getIfcWaterProperties_Hardness());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Boolean getIsPotable() {
		return (Boolean)eGet(IFC2X3Package.eINSTANCE.getIfcWaterProperties_IsPotable(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIsPotable(Boolean newIsPotable) {
		eSet(IFC2X3Package.eINSTANCE.getIfcWaterProperties_IsPotable(), newIsPotable);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetIsPotable() {
		eUnset(IFC2X3Package.eINSTANCE.getIfcWaterProperties_IsPotable());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetIsPotable() {
		return eIsSet(IFC2X3Package.eINSTANCE.getIfcWaterProperties_IsPotable());
	}

} //IfcWaterPropertiesImpl
