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
import IFC2X3.IfcDerivedMeasureValue;
import IFC2X3.IfcFluidFlowProperties;
import IFC2X3.IfcMaterial;
import IFC2X3.IfcPropertySourceEnum;
import IFC2X3.IfcTimeSeries;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Ifc Fluid Flow Properties</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link IFC2X3.impl.IfcFluidFlowPropertiesImpl#getPropertySource <em>Property Source</em>}</li>
 *   <li>{@link IFC2X3.impl.IfcFluidFlowPropertiesImpl#getFlowConditionTimeSeries <em>Flow Condition Time Series</em>}</li>
 *   <li>{@link IFC2X3.impl.IfcFluidFlowPropertiesImpl#getVelocityTimeSeries <em>Velocity Time Series</em>}</li>
 *   <li>{@link IFC2X3.impl.IfcFluidFlowPropertiesImpl#getFlowrateTimeSeries <em>Flowrate Time Series</em>}</li>
 *   <li>{@link IFC2X3.impl.IfcFluidFlowPropertiesImpl#getFluid <em>Fluid</em>}</li>
 *   <li>{@link IFC2X3.impl.IfcFluidFlowPropertiesImpl#getPressureTimeSeries <em>Pressure Time Series</em>}</li>
 *   <li>{@link IFC2X3.impl.IfcFluidFlowPropertiesImpl#getUserDefinedPropertySource <em>User Defined Property Source</em>}</li>
 *   <li>{@link IFC2X3.impl.IfcFluidFlowPropertiesImpl#getTemperatureSingleValue <em>Temperature Single Value</em>}</li>
 *   <li>{@link IFC2X3.impl.IfcFluidFlowPropertiesImpl#getWetBulbTemperatureSingleValue <em>Wet Bulb Temperature Single Value</em>}</li>
 *   <li>{@link IFC2X3.impl.IfcFluidFlowPropertiesImpl#getWetBulbTemperatureTimeSeries <em>Wet Bulb Temperature Time Series</em>}</li>
 *   <li>{@link IFC2X3.impl.IfcFluidFlowPropertiesImpl#getTemperatureTimeSeries <em>Temperature Time Series</em>}</li>
 *   <li>{@link IFC2X3.impl.IfcFluidFlowPropertiesImpl#getFlowrateSingleValue <em>Flowrate Single Value</em>}</li>
 *   <li>{@link IFC2X3.impl.IfcFluidFlowPropertiesImpl#getFlowConditionSingleValue <em>Flow Condition Single Value</em>}</li>
 *   <li>{@link IFC2X3.impl.IfcFluidFlowPropertiesImpl#getVelocitySingleValue <em>Velocity Single Value</em>}</li>
 *   <li>{@link IFC2X3.impl.IfcFluidFlowPropertiesImpl#getPressureSingleValue <em>Pressure Single Value</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
@XmlType(name = "IfcFluidFlowProperties")
@XmlRootElement(name = "IfcFluidFlowPropertiesElement")
public class IfcFluidFlowPropertiesImpl extends IfcPropertySetDefinitionImpl implements IfcFluidFlowProperties {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected IfcFluidFlowPropertiesImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return IFC2X3Package.eINSTANCE.getIfcFluidFlowProperties();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcDerivedMeasureValue getFlowrateSingleValue() {
		return (IfcDerivedMeasureValue)eGet(IFC2X3Package.eINSTANCE.getIfcFluidFlowProperties_FlowrateSingleValue(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFlowrateSingleValue(IfcDerivedMeasureValue newFlowrateSingleValue) {
		eSet(IFC2X3Package.eINSTANCE.getIfcFluidFlowProperties_FlowrateSingleValue(), newFlowrateSingleValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcTimeSeries getWetBulbTemperatureTimeSeries() {
		return (IfcTimeSeries)eGet(IFC2X3Package.eINSTANCE.getIfcFluidFlowProperties_WetBulbTemperatureTimeSeries(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setWetBulbTemperatureTimeSeries(IfcTimeSeries newWetBulbTemperatureTimeSeries) {
		eSet(IFC2X3Package.eINSTANCE.getIfcFluidFlowProperties_WetBulbTemperatureTimeSeries(), newWetBulbTemperatureTimeSeries);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcTimeSeries getTemperatureTimeSeries() {
		return (IfcTimeSeries)eGet(IFC2X3Package.eINSTANCE.getIfcFluidFlowProperties_TemperatureTimeSeries(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTemperatureTimeSeries(IfcTimeSeries newTemperatureTimeSeries) {
		eSet(IFC2X3Package.eINSTANCE.getIfcFluidFlowProperties_TemperatureTimeSeries(), newTemperatureTimeSeries);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcTimeSeries getFlowConditionTimeSeries() {
		return (IfcTimeSeries)eGet(IFC2X3Package.eINSTANCE.getIfcFluidFlowProperties_FlowConditionTimeSeries(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFlowConditionTimeSeries(IfcTimeSeries newFlowConditionTimeSeries) {
		eSet(IFC2X3Package.eINSTANCE.getIfcFluidFlowProperties_FlowConditionTimeSeries(), newFlowConditionTimeSeries);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcMaterial getFluid() {
		return (IfcMaterial)eGet(IFC2X3Package.eINSTANCE.getIfcFluidFlowProperties_Fluid(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFluid(IfcMaterial newFluid) {
		eSet(IFC2X3Package.eINSTANCE.getIfcFluidFlowProperties_Fluid(), newFluid);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcTimeSeries getPressureTimeSeries() {
		return (IfcTimeSeries)eGet(IFC2X3Package.eINSTANCE.getIfcFluidFlowProperties_PressureTimeSeries(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPressureTimeSeries(IfcTimeSeries newPressureTimeSeries) {
		eSet(IFC2X3Package.eINSTANCE.getIfcFluidFlowProperties_PressureTimeSeries(), newPressureTimeSeries);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcTimeSeries getVelocityTimeSeries() {
		return (IfcTimeSeries)eGet(IFC2X3Package.eINSTANCE.getIfcFluidFlowProperties_VelocityTimeSeries(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setVelocityTimeSeries(IfcTimeSeries newVelocityTimeSeries) {
		eSet(IFC2X3Package.eINSTANCE.getIfcFluidFlowProperties_VelocityTimeSeries(), newVelocityTimeSeries);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcTimeSeries getFlowrateTimeSeries() {
		return (IfcTimeSeries)eGet(IFC2X3Package.eINSTANCE.getIfcFluidFlowProperties_FlowrateTimeSeries(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFlowrateTimeSeries(IfcTimeSeries newFlowrateTimeSeries) {
		eSet(IFC2X3Package.eINSTANCE.getIfcFluidFlowProperties_FlowrateTimeSeries(), newFlowrateTimeSeries);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Double getPressureSingleValue() {
		return (Double)eGet(IFC2X3Package.eINSTANCE.getIfcFluidFlowProperties_PressureSingleValue(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPressureSingleValue(Double newPressureSingleValue) {
		eSet(IFC2X3Package.eINSTANCE.getIfcFluidFlowProperties_PressureSingleValue(), newPressureSingleValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetPressureSingleValue() {
		eUnset(IFC2X3Package.eINSTANCE.getIfcFluidFlowProperties_PressureSingleValue());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetPressureSingleValue() {
		return eIsSet(IFC2X3Package.eINSTANCE.getIfcFluidFlowProperties_PressureSingleValue());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Double getVelocitySingleValue() {
		return (Double)eGet(IFC2X3Package.eINSTANCE.getIfcFluidFlowProperties_VelocitySingleValue(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setVelocitySingleValue(Double newVelocitySingleValue) {
		eSet(IFC2X3Package.eINSTANCE.getIfcFluidFlowProperties_VelocitySingleValue(), newVelocitySingleValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetVelocitySingleValue() {
		eUnset(IFC2X3Package.eINSTANCE.getIfcFluidFlowProperties_VelocitySingleValue());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetVelocitySingleValue() {
		return eIsSet(IFC2X3Package.eINSTANCE.getIfcFluidFlowProperties_VelocitySingleValue());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Double getFlowConditionSingleValue() {
		return (Double)eGet(IFC2X3Package.eINSTANCE.getIfcFluidFlowProperties_FlowConditionSingleValue(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFlowConditionSingleValue(Double newFlowConditionSingleValue) {
		eSet(IFC2X3Package.eINSTANCE.getIfcFluidFlowProperties_FlowConditionSingleValue(), newFlowConditionSingleValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetFlowConditionSingleValue() {
		eUnset(IFC2X3Package.eINSTANCE.getIfcFluidFlowProperties_FlowConditionSingleValue());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetFlowConditionSingleValue() {
		return eIsSet(IFC2X3Package.eINSTANCE.getIfcFluidFlowProperties_FlowConditionSingleValue());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Double getWetBulbTemperatureSingleValue() {
		return (Double)eGet(IFC2X3Package.eINSTANCE.getIfcFluidFlowProperties_WetBulbTemperatureSingleValue(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setWetBulbTemperatureSingleValue(Double newWetBulbTemperatureSingleValue) {
		eSet(IFC2X3Package.eINSTANCE.getIfcFluidFlowProperties_WetBulbTemperatureSingleValue(), newWetBulbTemperatureSingleValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetWetBulbTemperatureSingleValue() {
		eUnset(IFC2X3Package.eINSTANCE.getIfcFluidFlowProperties_WetBulbTemperatureSingleValue());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetWetBulbTemperatureSingleValue() {
		return eIsSet(IFC2X3Package.eINSTANCE.getIfcFluidFlowProperties_WetBulbTemperatureSingleValue());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Double getTemperatureSingleValue() {
		return (Double)eGet(IFC2X3Package.eINSTANCE.getIfcFluidFlowProperties_TemperatureSingleValue(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTemperatureSingleValue(Double newTemperatureSingleValue) {
		eSet(IFC2X3Package.eINSTANCE.getIfcFluidFlowProperties_TemperatureSingleValue(), newTemperatureSingleValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetTemperatureSingleValue() {
		eUnset(IFC2X3Package.eINSTANCE.getIfcFluidFlowProperties_TemperatureSingleValue());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetTemperatureSingleValue() {
		return eIsSet(IFC2X3Package.eINSTANCE.getIfcFluidFlowProperties_TemperatureSingleValue());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getUserDefinedPropertySource() {
		return (String)eGet(IFC2X3Package.eINSTANCE.getIfcFluidFlowProperties_UserDefinedPropertySource(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setUserDefinedPropertySource(String newUserDefinedPropertySource) {
		eSet(IFC2X3Package.eINSTANCE.getIfcFluidFlowProperties_UserDefinedPropertySource(), newUserDefinedPropertySource);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetUserDefinedPropertySource() {
		eUnset(IFC2X3Package.eINSTANCE.getIfcFluidFlowProperties_UserDefinedPropertySource());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetUserDefinedPropertySource() {
		return eIsSet(IFC2X3Package.eINSTANCE.getIfcFluidFlowProperties_UserDefinedPropertySource());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcPropertySourceEnum getPropertySource() {
		return (IfcPropertySourceEnum)eGet(IFC2X3Package.eINSTANCE.getIfcFluidFlowProperties_PropertySource(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPropertySource(IfcPropertySourceEnum newPropertySource) {
		eSet(IFC2X3Package.eINSTANCE.getIfcFluidFlowProperties_PropertySource(), newPropertySource);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetPropertySource() {
		eUnset(IFC2X3Package.eINSTANCE.getIfcFluidFlowProperties_PropertySource());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetPropertySource() {
		return eIsSet(IFC2X3Package.eINSTANCE.getIfcFluidFlowProperties_PropertySource());
	}

} //IfcFluidFlowPropertiesImpl
