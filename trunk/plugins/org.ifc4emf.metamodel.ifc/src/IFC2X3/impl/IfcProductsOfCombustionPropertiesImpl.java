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
import IFC2X3.IfcProductsOfCombustionProperties;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Ifc Products Of Combustion Properties</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link IFC2X3.impl.IfcProductsOfCombustionPropertiesImpl#getSpecificHeatCapacity <em>Specific Heat Capacity</em>}</li>
 *   <li>{@link IFC2X3.impl.IfcProductsOfCombustionPropertiesImpl#getN20Content <em>N20 Content</em>}</li>
 *   <li>{@link IFC2X3.impl.IfcProductsOfCombustionPropertiesImpl#getCOContent <em>CO Content</em>}</li>
 *   <li>{@link IFC2X3.impl.IfcProductsOfCombustionPropertiesImpl#getCO2Content <em>CO2 Content</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
@XmlType(name = "IfcProductsOfCombustionProperties")
@XmlRootElement(name = "IfcProductsOfCombustionPropertiesElement")
public class IfcProductsOfCombustionPropertiesImpl extends IfcMaterialPropertiesImpl implements IfcProductsOfCombustionProperties {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected IfcProductsOfCombustionPropertiesImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return IFC2X3Package.eINSTANCE.getIfcProductsOfCombustionProperties();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Double getCO2Content() {
		return (Double)eGet(IFC2X3Package.eINSTANCE.getIfcProductsOfCombustionProperties_CO2Content(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCO2Content(Double newCO2Content) {
		eSet(IFC2X3Package.eINSTANCE.getIfcProductsOfCombustionProperties_CO2Content(), newCO2Content);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetCO2Content() {
		eUnset(IFC2X3Package.eINSTANCE.getIfcProductsOfCombustionProperties_CO2Content());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetCO2Content() {
		return eIsSet(IFC2X3Package.eINSTANCE.getIfcProductsOfCombustionProperties_CO2Content());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Double getCOContent() {
		return (Double)eGet(IFC2X3Package.eINSTANCE.getIfcProductsOfCombustionProperties_COContent(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCOContent(Double newCOContent) {
		eSet(IFC2X3Package.eINSTANCE.getIfcProductsOfCombustionProperties_COContent(), newCOContent);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetCOContent() {
		eUnset(IFC2X3Package.eINSTANCE.getIfcProductsOfCombustionProperties_COContent());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetCOContent() {
		return eIsSet(IFC2X3Package.eINSTANCE.getIfcProductsOfCombustionProperties_COContent());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Double getN20Content() {
		return (Double)eGet(IFC2X3Package.eINSTANCE.getIfcProductsOfCombustionProperties_N20Content(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setN20Content(Double newN20Content) {
		eSet(IFC2X3Package.eINSTANCE.getIfcProductsOfCombustionProperties_N20Content(), newN20Content);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetN20Content() {
		eUnset(IFC2X3Package.eINSTANCE.getIfcProductsOfCombustionProperties_N20Content());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetN20Content() {
		return eIsSet(IFC2X3Package.eINSTANCE.getIfcProductsOfCombustionProperties_N20Content());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Double getSpecificHeatCapacity() {
		return (Double)eGet(IFC2X3Package.eINSTANCE.getIfcProductsOfCombustionProperties_SpecificHeatCapacity(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSpecificHeatCapacity(Double newSpecificHeatCapacity) {
		eSet(IFC2X3Package.eINSTANCE.getIfcProductsOfCombustionProperties_SpecificHeatCapacity(), newSpecificHeatCapacity);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetSpecificHeatCapacity() {
		eUnset(IFC2X3Package.eINSTANCE.getIfcProductsOfCombustionProperties_SpecificHeatCapacity());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetSpecificHeatCapacity() {
		return eIsSet(IFC2X3Package.eINSTANCE.getIfcProductsOfCombustionProperties_SpecificHeatCapacity());
	}

} //IfcProductsOfCombustionPropertiesImpl
