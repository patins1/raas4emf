/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package IFC2X3;

import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;

import IFC2X3.jaxb.IfcElectricFlowStorageDeviceTypeImplAdapter;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Ifc Electric Flow Storage Device Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link IFC2X3.IfcElectricFlowStorageDeviceType#getPredefinedType <em>Predefined Type</em>}</li>
 * </ul>
 * </p>
 *
 * @see IFC2X3.IFC2X3Package#getIfcElectricFlowStorageDeviceType()
 * @model
 * @generated
 */
@XmlJavaTypeAdapter(IfcElectricFlowStorageDeviceTypeImplAdapter.class)
public interface IfcElectricFlowStorageDeviceType extends IfcFlowStorageDeviceType {
	/**
	 * Returns the value of the '<em><b>Predefined Type</b></em>' attribute.
	 * The literals are from the enumeration {@link IFC2X3.IfcElectricFlowStorageDeviceTypeEnum}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Predefined Type</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Predefined Type</em>' attribute.
	 * @see IFC2X3.IfcElectricFlowStorageDeviceTypeEnum
	 * @see #isSetPredefinedType()
	 * @see #unsetPredefinedType()
	 * @see #setPredefinedType(IfcElectricFlowStorageDeviceTypeEnum)
	 * @see IFC2X3.IFC2X3Package#getIfcElectricFlowStorageDeviceType_PredefinedType()
	 * @model unsettable="true" required="true"
	 * @generated
	 */
	IfcElectricFlowStorageDeviceTypeEnum getPredefinedType();

	/**
	 * Sets the value of the '{@link IFC2X3.IfcElectricFlowStorageDeviceType#getPredefinedType <em>Predefined Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Predefined Type</em>' attribute.
	 * @see IFC2X3.IfcElectricFlowStorageDeviceTypeEnum
	 * @see #isSetPredefinedType()
	 * @see #unsetPredefinedType()
	 * @see #getPredefinedType()
	 * @generated
	 */
	void setPredefinedType(IfcElectricFlowStorageDeviceTypeEnum value);

	/**
	 * Unsets the value of the '{@link IFC2X3.IfcElectricFlowStorageDeviceType#getPredefinedType <em>Predefined Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetPredefinedType()
	 * @see #getPredefinedType()
	 * @see #setPredefinedType(IfcElectricFlowStorageDeviceTypeEnum)
	 * @generated
	 */
	void unsetPredefinedType();

	/**
	 * Returns whether the value of the '{@link IFC2X3.IfcElectricFlowStorageDeviceType#getPredefinedType <em>Predefined Type</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Predefined Type</em>' attribute is set.
	 * @see #unsetPredefinedType()
	 * @see #getPredefinedType()
	 * @see #setPredefinedType(IfcElectricFlowStorageDeviceTypeEnum)
	 * @generated
	 */
	boolean isSetPredefinedType();

} // IfcElectricFlowStorageDeviceType
