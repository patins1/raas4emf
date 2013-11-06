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
import IFC2X3.IfcPropertySourceEnum;
import IFC2X3.IfcSpaceThermalLoadProperties;
import IFC2X3.IfcThermalLoadSourceEnum;
import IFC2X3.IfcThermalLoadTypeEnum;
import IFC2X3.IfcTimeSeries;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Ifc Space Thermal Load Properties</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link IFC2X3.impl.IfcSpaceThermalLoadPropertiesImpl#getApplicableValueRatio <em>Applicable Value Ratio</em>}</li>
 *   <li>{@link IFC2X3.impl.IfcSpaceThermalLoadPropertiesImpl#getThermalLoadSource <em>Thermal Load Source</em>}</li>
 *   <li>{@link IFC2X3.impl.IfcSpaceThermalLoadPropertiesImpl#getPropertySource <em>Property Source</em>}</li>
 *   <li>{@link IFC2X3.impl.IfcSpaceThermalLoadPropertiesImpl#getSourceDescription <em>Source Description</em>}</li>
 *   <li>{@link IFC2X3.impl.IfcSpaceThermalLoadPropertiesImpl#getMaximumValue <em>Maximum Value</em>}</li>
 *   <li>{@link IFC2X3.impl.IfcSpaceThermalLoadPropertiesImpl#getMinimumValue <em>Minimum Value</em>}</li>
 *   <li>{@link IFC2X3.impl.IfcSpaceThermalLoadPropertiesImpl#getThermalLoadTimeSeriesValues <em>Thermal Load Time Series Values</em>}</li>
 *   <li>{@link IFC2X3.impl.IfcSpaceThermalLoadPropertiesImpl#getUserDefinedThermalLoadSource <em>User Defined Thermal Load Source</em>}</li>
 *   <li>{@link IFC2X3.impl.IfcSpaceThermalLoadPropertiesImpl#getUserDefinedPropertySource <em>User Defined Property Source</em>}</li>
 *   <li>{@link IFC2X3.impl.IfcSpaceThermalLoadPropertiesImpl#getThermalLoadType <em>Thermal Load Type</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
@XmlType(name = "IfcSpaceThermalLoadProperties")
@XmlRootElement(name = "IfcSpaceThermalLoadPropertiesElement")
public class IfcSpaceThermalLoadPropertiesImpl extends IfcPropertySetDefinitionImpl implements IfcSpaceThermalLoadProperties {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected IfcSpaceThermalLoadPropertiesImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return IFC2X3Package.eINSTANCE.getIfcSpaceThermalLoadProperties();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcTimeSeries getThermalLoadTimeSeriesValues() {
		return (IfcTimeSeries)eGet(IFC2X3Package.eINSTANCE.getIfcSpaceThermalLoadProperties_ThermalLoadTimeSeriesValues(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setThermalLoadTimeSeriesValues(IfcTimeSeries newThermalLoadTimeSeriesValues) {
		eSet(IFC2X3Package.eINSTANCE.getIfcSpaceThermalLoadProperties_ThermalLoadTimeSeriesValues(), newThermalLoadTimeSeriesValues);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcThermalLoadTypeEnum getThermalLoadType() {
		return (IfcThermalLoadTypeEnum)eGet(IFC2X3Package.eINSTANCE.getIfcSpaceThermalLoadProperties_ThermalLoadType(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setThermalLoadType(IfcThermalLoadTypeEnum newThermalLoadType) {
		eSet(IFC2X3Package.eINSTANCE.getIfcSpaceThermalLoadProperties_ThermalLoadType(), newThermalLoadType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetThermalLoadType() {
		eUnset(IFC2X3Package.eINSTANCE.getIfcSpaceThermalLoadProperties_ThermalLoadType());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetThermalLoadType() {
		return eIsSet(IFC2X3Package.eINSTANCE.getIfcSpaceThermalLoadProperties_ThermalLoadType());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getUserDefinedPropertySource() {
		return (String)eGet(IFC2X3Package.eINSTANCE.getIfcSpaceThermalLoadProperties_UserDefinedPropertySource(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setUserDefinedPropertySource(String newUserDefinedPropertySource) {
		eSet(IFC2X3Package.eINSTANCE.getIfcSpaceThermalLoadProperties_UserDefinedPropertySource(), newUserDefinedPropertySource);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetUserDefinedPropertySource() {
		eUnset(IFC2X3Package.eINSTANCE.getIfcSpaceThermalLoadProperties_UserDefinedPropertySource());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetUserDefinedPropertySource() {
		return eIsSet(IFC2X3Package.eINSTANCE.getIfcSpaceThermalLoadProperties_UserDefinedPropertySource());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getUserDefinedThermalLoadSource() {
		return (String)eGet(IFC2X3Package.eINSTANCE.getIfcSpaceThermalLoadProperties_UserDefinedThermalLoadSource(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setUserDefinedThermalLoadSource(String newUserDefinedThermalLoadSource) {
		eSet(IFC2X3Package.eINSTANCE.getIfcSpaceThermalLoadProperties_UserDefinedThermalLoadSource(), newUserDefinedThermalLoadSource);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetUserDefinedThermalLoadSource() {
		eUnset(IFC2X3Package.eINSTANCE.getIfcSpaceThermalLoadProperties_UserDefinedThermalLoadSource());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetUserDefinedThermalLoadSource() {
		return eIsSet(IFC2X3Package.eINSTANCE.getIfcSpaceThermalLoadProperties_UserDefinedThermalLoadSource());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Double getMinimumValue() {
		return (Double)eGet(IFC2X3Package.eINSTANCE.getIfcSpaceThermalLoadProperties_MinimumValue(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMinimumValue(Double newMinimumValue) {
		eSet(IFC2X3Package.eINSTANCE.getIfcSpaceThermalLoadProperties_MinimumValue(), newMinimumValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetMinimumValue() {
		eUnset(IFC2X3Package.eINSTANCE.getIfcSpaceThermalLoadProperties_MinimumValue());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetMinimumValue() {
		return eIsSet(IFC2X3Package.eINSTANCE.getIfcSpaceThermalLoadProperties_MinimumValue());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Double getMaximumValue() {
		return (Double)eGet(IFC2X3Package.eINSTANCE.getIfcSpaceThermalLoadProperties_MaximumValue(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMaximumValue(Double newMaximumValue) {
		eSet(IFC2X3Package.eINSTANCE.getIfcSpaceThermalLoadProperties_MaximumValue(), newMaximumValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetMaximumValue() {
		eUnset(IFC2X3Package.eINSTANCE.getIfcSpaceThermalLoadProperties_MaximumValue());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetMaximumValue() {
		return eIsSet(IFC2X3Package.eINSTANCE.getIfcSpaceThermalLoadProperties_MaximumValue());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getSourceDescription() {
		return (String)eGet(IFC2X3Package.eINSTANCE.getIfcSpaceThermalLoadProperties_SourceDescription(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSourceDescription(String newSourceDescription) {
		eSet(IFC2X3Package.eINSTANCE.getIfcSpaceThermalLoadProperties_SourceDescription(), newSourceDescription);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetSourceDescription() {
		eUnset(IFC2X3Package.eINSTANCE.getIfcSpaceThermalLoadProperties_SourceDescription());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetSourceDescription() {
		return eIsSet(IFC2X3Package.eINSTANCE.getIfcSpaceThermalLoadProperties_SourceDescription());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcPropertySourceEnum getPropertySource() {
		return (IfcPropertySourceEnum)eGet(IFC2X3Package.eINSTANCE.getIfcSpaceThermalLoadProperties_PropertySource(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPropertySource(IfcPropertySourceEnum newPropertySource) {
		eSet(IFC2X3Package.eINSTANCE.getIfcSpaceThermalLoadProperties_PropertySource(), newPropertySource);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetPropertySource() {
		eUnset(IFC2X3Package.eINSTANCE.getIfcSpaceThermalLoadProperties_PropertySource());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetPropertySource() {
		return eIsSet(IFC2X3Package.eINSTANCE.getIfcSpaceThermalLoadProperties_PropertySource());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcThermalLoadSourceEnum getThermalLoadSource() {
		return (IfcThermalLoadSourceEnum)eGet(IFC2X3Package.eINSTANCE.getIfcSpaceThermalLoadProperties_ThermalLoadSource(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setThermalLoadSource(IfcThermalLoadSourceEnum newThermalLoadSource) {
		eSet(IFC2X3Package.eINSTANCE.getIfcSpaceThermalLoadProperties_ThermalLoadSource(), newThermalLoadSource);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetThermalLoadSource() {
		eUnset(IFC2X3Package.eINSTANCE.getIfcSpaceThermalLoadProperties_ThermalLoadSource());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetThermalLoadSource() {
		return eIsSet(IFC2X3Package.eINSTANCE.getIfcSpaceThermalLoadProperties_ThermalLoadSource());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Double getApplicableValueRatio() {
		return (Double)eGet(IFC2X3Package.eINSTANCE.getIfcSpaceThermalLoadProperties_ApplicableValueRatio(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setApplicableValueRatio(Double newApplicableValueRatio) {
		eSet(IFC2X3Package.eINSTANCE.getIfcSpaceThermalLoadProperties_ApplicableValueRatio(), newApplicableValueRatio);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetApplicableValueRatio() {
		eUnset(IFC2X3Package.eINSTANCE.getIfcSpaceThermalLoadProperties_ApplicableValueRatio());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetApplicableValueRatio() {
		return eIsSet(IFC2X3Package.eINSTANCE.getIfcSpaceThermalLoadProperties_ApplicableValueRatio());
	}

} //IfcSpaceThermalLoadPropertiesImpl
